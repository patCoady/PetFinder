
package com.patrick.petfinder.entity.randompet;
import java.security.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.net.ssl.SSLEngineResult.Status;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"timestamp",
"status",
"version"
})
public class Header {

@JsonProperty("timestamp")
private Timestamp timestamp;
@JsonProperty("status")
private Status status;
@JsonProperty("version")
private Version version;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("timestamp")
public Timestamp getTimestamp() {
return timestamp;
}

@JsonProperty("timestamp")
public void setTimestamp(Timestamp timestamp) {
this.timestamp = timestamp;
}

@JsonProperty("status")
public Status getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(Status status) {
this.status = status;
}

@JsonProperty("version")
public Version getVersion() {
return version;
}

@JsonProperty("version")
public void setVersion(Version version) {
this.version = version;
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