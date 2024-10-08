
package io.fabric8.openshift.api.model.operator.v1;

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
    "hostNetwork",
    "loadBalancer",
    "nodePort",
    "private",
    "type"
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
public class IngressControllerStatusEndpointPublishingStrategy implements Editable<IngressControllerStatusEndpointPublishingStrategyBuilder> , KubernetesResource
{

    @JsonProperty("hostNetwork")
    private IngressControllerStatusEPSHostNetwork hostNetwork;
    @JsonProperty("loadBalancer")
    private IngressControllerStatusEPSLoadBalancer loadBalancer;
    @JsonProperty("nodePort")
    private IngressControllerStatusEPSNodePort nodePort;
    @JsonProperty("private")
    private IngressControllerStatusEPSPrivate _private;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IngressControllerStatusEndpointPublishingStrategy() {
    }

    public IngressControllerStatusEndpointPublishingStrategy(IngressControllerStatusEPSHostNetwork hostNetwork, IngressControllerStatusEPSLoadBalancer loadBalancer, IngressControllerStatusEPSNodePort nodePort, IngressControllerStatusEPSPrivate _private, String type) {
        super();
        this.hostNetwork = hostNetwork;
        this.loadBalancer = loadBalancer;
        this.nodePort = nodePort;
        this._private = _private;
        this.type = type;
    }

    @JsonProperty("hostNetwork")
    public IngressControllerStatusEPSHostNetwork getHostNetwork() {
        return hostNetwork;
    }

    @JsonProperty("hostNetwork")
    public void setHostNetwork(IngressControllerStatusEPSHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    @JsonProperty("loadBalancer")
    public IngressControllerStatusEPSLoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    @JsonProperty("loadBalancer")
    public void setLoadBalancer(IngressControllerStatusEPSLoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    @JsonProperty("nodePort")
    public IngressControllerStatusEPSNodePort getNodePort() {
        return nodePort;
    }

    @JsonProperty("nodePort")
    public void setNodePort(IngressControllerStatusEPSNodePort nodePort) {
        this.nodePort = nodePort;
    }

    @JsonProperty("private")
    public IngressControllerStatusEPSPrivate getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(IngressControllerStatusEPSPrivate _private) {
        this._private = _private;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonIgnore
    public IngressControllerStatusEndpointPublishingStrategyBuilder edit() {
        return new IngressControllerStatusEndpointPublishingStrategyBuilder(this);
    }

    @JsonIgnore
    public IngressControllerStatusEndpointPublishingStrategyBuilder toBuilder() {
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
