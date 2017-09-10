
package com.barath.chatbot.app.model.request;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parameters",
    "contexts",
    "resolvedQuery",
    "source",
    "score",
    "speech",
    "fulfillment",
    "actionIncomplete",
    "action",
    "metadata"
})
public class Result {

    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("contexts")
    private List<Object> contexts = null;
    @JsonProperty("resolvedQuery")
    private String resolvedQuery;
    @JsonProperty("source")
    private String source;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("speech")
    private String speech;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("actionIncomplete")
    private Boolean actionIncomplete;
    @JsonProperty("action")
    private String action;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("contexts")
    public List<Object> getContexts() {
        return contexts;
    }

    @JsonProperty("contexts")
    public void setContexts(List<Object> contexts) {
        this.contexts = contexts;
    }

    @JsonProperty("resolvedQuery")
    public String getResolvedQuery() {
        return resolvedQuery;
    }

    @JsonProperty("resolvedQuery")
    public void setResolvedQuery(String resolvedQuery) {
        this.resolvedQuery = resolvedQuery;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("speech")
    public String getSpeech() {
        return speech;
    }

    @JsonProperty("speech")
    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    @JsonProperty("actionIncomplete")
    public Boolean getActionIncomplete() {
        return actionIncomplete;
    }

    @JsonProperty("actionIncomplete")
    public void setActionIncomplete(Boolean actionIncomplete) {
        this.actionIncomplete = actionIncomplete;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
