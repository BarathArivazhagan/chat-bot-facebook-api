
package com.barath.chatbot.app.model.request;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "intentId",
    "webhookForSlotFillingUsed",
    "intentName",
    "webhookUsed"
})
public class Metadata {

    @JsonProperty("intentId")
    private String intentId;
    @JsonProperty("webhookForSlotFillingUsed")
    private String webhookForSlotFillingUsed;
    @JsonProperty("intentName")
    private String intentName;
    @JsonProperty("webhookUsed")
    private String webhookUsed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("intentId")
    public String getIntentId() {
        return intentId;
    }

    @JsonProperty("intentId")
    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    @JsonProperty("webhookForSlotFillingUsed")
    public String getWebhookForSlotFillingUsed() {
        return webhookForSlotFillingUsed;
    }

    @JsonProperty("webhookForSlotFillingUsed")
    public void setWebhookForSlotFillingUsed(String webhookForSlotFillingUsed) {
        this.webhookForSlotFillingUsed = webhookForSlotFillingUsed;
    }

    @JsonProperty("intentName")
    public String getIntentName() {
        return intentName;
    }

    @JsonProperty("intentName")
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    @JsonProperty("webhookUsed")
    public String getWebhookUsed() {
        return webhookUsed;
    }

    @JsonProperty("webhookUsed")
    public void setWebhookUsed(String webhookUsed) {
        this.webhookUsed = webhookUsed;
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
