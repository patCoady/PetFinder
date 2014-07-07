package com.patrick.petfinder.entity.randompet;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"message",
"code"
})
public class Status {

@JsonProperty("message")
private Message message;
@JsonProperty("code")
private Code code;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("message")
public Message getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(Message message) {
this.message = message;
}

@JsonProperty("code")
public Code getCode() {
return code;
}

@JsonProperty("code")
public void setCode(Code code) {
this.code = code;
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