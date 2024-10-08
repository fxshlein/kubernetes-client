
package io.fabric8.openclustermanagement.api.model.searchoperator.v1alpha1;

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
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nodeSelector",
    "pullpolicy",
    "pullsecret",
    "redisgraph_resource",
    "searchimageoverrides"
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
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("jsonschema2pojo")
public class SearchOperatorSpec implements Editable<SearchOperatorSpecBuilder> , KubernetesResource
{

    @JsonProperty("nodeSelector")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> nodeSelector = new LinkedHashMap<>();
    @JsonProperty("pullpolicy")
    private java.lang.String pullpolicy;
    @JsonProperty("pullsecret")
    private java.lang.String pullsecret;
    @JsonProperty("redisgraph_resource")
    private PodResource redisgraphResource;
    @JsonProperty("searchimageoverrides")
    private ImageOverrides searchimageoverrides;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new LinkedHashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchOperatorSpec() {
    }

    public SearchOperatorSpec(Map<String, String> nodeSelector, java.lang.String pullpolicy, java.lang.String pullsecret, PodResource redisgraphResource, ImageOverrides searchimageoverrides) {
        super();
        this.nodeSelector = nodeSelector;
        this.pullpolicy = pullpolicy;
        this.pullsecret = pullsecret;
        this.redisgraphResource = redisgraphResource;
        this.searchimageoverrides = searchimageoverrides;
    }

    @JsonProperty("nodeSelector")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    @JsonProperty("nodeSelector")
    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    @JsonProperty("pullpolicy")
    public java.lang.String getPullpolicy() {
        return pullpolicy;
    }

    @JsonProperty("pullpolicy")
    public void setPullpolicy(java.lang.String pullpolicy) {
        this.pullpolicy = pullpolicy;
    }

    @JsonProperty("pullsecret")
    public java.lang.String getPullsecret() {
        return pullsecret;
    }

    @JsonProperty("pullsecret")
    public void setPullsecret(java.lang.String pullsecret) {
        this.pullsecret = pullsecret;
    }

    @JsonProperty("redisgraph_resource")
    public PodResource getRedisgraphResource() {
        return redisgraphResource;
    }

    @JsonProperty("redisgraph_resource")
    public void setRedisgraphResource(PodResource redisgraphResource) {
        this.redisgraphResource = redisgraphResource;
    }

    @JsonProperty("searchimageoverrides")
    public ImageOverrides getSearchimageoverrides() {
        return searchimageoverrides;
    }

    @JsonProperty("searchimageoverrides")
    public void setSearchimageoverrides(ImageOverrides searchimageoverrides) {
        this.searchimageoverrides = searchimageoverrides;
    }

    @JsonIgnore
    public SearchOperatorSpecBuilder edit() {
        return new SearchOperatorSpecBuilder(this);
    }

    @JsonIgnore
    public SearchOperatorSpecBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<java.lang.String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
