
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


private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}