
package io.fabric8.openshift.api.model.operatorhub.v1alpha1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exec",
    "failureThreshold",
    "grpc",
    "httpGet",
    "initialDelaySeconds",
    "periodSeconds",
    "successThreshold",
    "tcpSocket",
    "terminationGracePeriodSeconds",
    "timeoutSeconds"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class ClusterServiceVersionSpecISpecDSpecTSpecICStartupProbe implements Editable<ClusterServiceVersionSpecISpecDSpecTSpecICStartupProbeBuilder> , KubernetesResource
{

    @JsonProperty("exec")
    private ClusterServiceVersionSpecISpecDSpecTSpecICSPExec exec;
    @JsonProperty("failureThreshold")
    private Integer failureThreshold;
    @JsonProperty("grpc")
    private ClusterServiceVersionSpecISpecDSpecTSpecICSPGrpc grpc;
    @JsonProperty("httpGet")
    private ClusterServiceVersionSpecISpecDSpecTSpecICSPHttpGet httpGet;
    @JsonProperty("initialDelaySeconds")
    private Integer initialDelaySeconds;
    @JsonProperty("periodSeconds")
    private Integer periodSeconds;
    @JsonProperty("successThreshold")
    private Integer successThreshold;
    @JsonProperty("tcpSocket")
    private ClusterServiceVersionSpecISpecDSpecTSpecICSPTcpSocket tcpSocket;
    @JsonProperty("terminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;
    @JsonProperty("timeoutSeconds")
    private Integer timeoutSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClusterServiceVersionSpecISpecDSpecTSpecICStartupProbe() {
    }

    public ClusterServiceVersionSpecISpecDSpecTSpecICStartupProbe(ClusterServiceVersionSpecISpecDSpecTSpecICSPExec exec, Integer failureThreshold, ClusterServiceVersionSpecISpecDSpecTSpecICSPGrpc grpc, ClusterServiceVersionSpecISpecDSpecTSpecICSPHttpGet httpGet, Integer initialDelaySeconds, Integer periodSeconds, Integer successThreshold, ClusterServiceVersionSpecISpecDSpecTSpecICSPTcpSocket tcpSocket, Long terminationGracePeriodSeconds, Integer timeoutSeconds) {
        super();
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.grpc = grpc;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.timeoutSeconds = timeoutSeconds;
    }

    @JsonProperty("exec")
    public ClusterServiceVersionSpecISpecDSpecTSpecICSPExec getExec() {
        return exec;
    }

    @JsonProperty("exec")
    public void setExec(ClusterServiceVersionSpecISpecDSpecTSpecICSPExec exec) {
        this.exec = exec;
    }

    @JsonProperty("failureThreshold")
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    @JsonProperty("failureThreshold")
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    @JsonProperty("grpc")
    public ClusterServiceVersionSpecISpecDSpecTSpecICSPGrpc getGrpc() {
        return grpc;
    }

    @JsonProperty("grpc")
    public void setGrpc(ClusterServiceVersionSpecISpecDSpecTSpecICSPGrpc grpc) {
        this.grpc = grpc;
    }

    @JsonProperty("httpGet")
    public ClusterServiceVersionSpecISpecDSpecTSpecICSPHttpGet getHttpGet() {
        return httpGet;
    }

    @JsonProperty("httpGet")
    public void setHttpGet(ClusterServiceVersionSpecISpecDSpecTSpecICSPHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    @JsonProperty("initialDelaySeconds")
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    @JsonProperty("initialDelaySeconds")
    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    @JsonProperty("periodSeconds")
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    @JsonProperty("periodSeconds")
    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    @JsonProperty("successThreshold")
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    @JsonProperty("successThreshold")
    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    @JsonProperty("tcpSocket")
    public ClusterServiceVersionSpecISpecDSpecTSpecICSPTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    @JsonProperty("tcpSocket")
    public void setTcpSocket(ClusterServiceVersionSpecISpecDSpecTSpecICSPTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @JsonProperty("terminationGracePeriodSeconds")
    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    @JsonProperty("terminationGracePeriodSeconds")
    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    @JsonProperty("timeoutSeconds")
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @JsonIgnore
    public ClusterServiceVersionSpecISpecDSpecTSpecICStartupProbeBuilder edit() {
        return new ClusterServiceVersionSpecISpecDSpecTSpecICStartupProbeBuilder(this);
    }

    @JsonIgnore
    public ClusterServiceVersionSpecISpecDSpecTSpecICStartupProbeBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
