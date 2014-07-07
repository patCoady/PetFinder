
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
"@encoding",
"@version",
"petfinder"
})
public class RandomPet {

@JsonProperty("@encoding")
private String _encoding;
@JsonProperty("@version")
private String _version;
@JsonProperty("petfinder")
private Petfinder petfinder;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("@encoding")
public String get_encoding() {
return _encoding;
}

@JsonProperty("@encoding")
public void set_encoding(String _encoding) {
this._encoding = _encoding;
}

@JsonProperty("@version")
public String get_version() {
return _version;
}

@JsonProperty("@version")
public void set_version(String _version) {
this._version = _version;
}

@JsonProperty("petfinder")
public Petfinder getPetfinder() {
return petfinder;
}

@JsonProperty("petfinder")
public void setPetfinder(Petfinder petfinder) {
this.petfinder = petfinder;
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
