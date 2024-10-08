/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubeapitest.binary.repo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.fabric8.kubeapitest.KubeAPITestException;
import io.fabric8.kubeapitest.binary.OSInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryRepo {

  private static final Logger log = LoggerFactory.getLogger(BinaryRepo.class);

  private static final String BINARY_INDEX_URL = "https://raw.githubusercontent.com/kubernetes-sigs/controller-tools/HEAD/envtest-releases.yaml";
  private static final ObjectMapper MAPPER = new ObjectMapper(new YAMLFactory());
  public static final String TAR_GZ_SUFFIX = ".tar.gz";

  private static List<ArchiveDescriptor> objectNames;

  private final OSInfo osInfo;

  public BinaryRepo(OSInfo osInfo) {
    this.osInfo = osInfo;
  }

  public synchronized Stream<ArchiveDescriptor> listObjectNames() {
    try {
      if (objectNames == null) {
        var index = MAPPER.readValue(new URL(BINARY_INDEX_URL), BinaryIndex.class);
        objectNames = index.getReleases().values().stream().flatMap(v -> v.values().stream()).map(
            a -> mapSelfLinkToArchiveDescriptor(a.getSelfLink()))
            .collect(Collectors.toList());
      }
      return objectNames.stream();
    } catch (IOException e) {
      throw new KubeAPITestException(e);
    }
  }

  static ArchiveDescriptor mapSelfLinkToArchiveDescriptor(String selfLink) {
    var versionOsArch = selfLink.split("/")[8]
        .replace("envtest-v", "")
        .replace(TAR_GZ_SUFFIX, "")
        .split("-");

    return new ArchiveDescriptor(versionOsArch[0], versionOsArch[2], versionOsArch[1]);
  }

  public File downloadVersionToTempFile(String version) {
    try {
      String url = "https://github.com/kubernetes-sigs/controller-tools/releases/download/envtest-v" + version +
          "/envtest-v" + version + "-" + osInfo.getOSName() + "-" + osInfo.getOSArch() + TAR_GZ_SUFFIX;

      File tempFile = File.createTempFile("kubebuilder-tools-" + version, TAR_GZ_SUFFIX);
      log.debug("Downloading binary from url: {} to Temp file: {}", url, tempFile.getPath());
      copyURLToFile(url, tempFile);
      return tempFile;
    } catch (IOException e) {
      throw new KubeAPITestException(e);
    }
  }

  private void copyURLToFile(String url, File tempFile) throws IOException {
    try (InputStream in = new URL(url).openStream()) {
      Files.copy(in, tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
  }
}
