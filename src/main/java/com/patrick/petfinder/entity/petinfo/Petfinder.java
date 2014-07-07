package com.patrick.petfinder.entity.petinfo;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"pet",
"@xmlns:xsi",
"header",
"@xsi:noNamespaceSchemaLocation"
})
public class Petfinder {

@JsonProperty("pet")
private Pet pet;
@JsonProperty("@xmlns:xsi")
private String _xmlns_xsi;
@JsonProperty("header")
private Header header;
@JsonProperty("@xsi:noNamespaceSchemaLocation")
private String _xsi_noNamespaceSchemaLocation;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("pet")
public Pet getPet() {
return pet;
}

@JsonProperty("pet")
public void setPet(Pet pet) {
this.pet = pet;
}

@JsonProperty("@xmlns:xsi")
public String get_xmlns_xsi() {
return _xmlns_xsi;
}

@JsonProperty("@xmlns:xsi")
public void set_xmlns_xsi(String _xmlns_xsi) {
this._xmlns_xsi = _xmlns_xsi;
}

@JsonProperty("header")
public Header getHeader() {
return header;
}

@JsonProperty("header")
public void setHeader(Header header) {
this.header = header;
}

@JsonProperty("@xsi:noNamespaceSchemaLocation")
public String get_xsi_noNamespaceSchemaLocation() {
return _xsi_noNamespaceSchemaLocation;
}

@JsonProperty("@xsi:noNamespaceSchemaLocation")
public void set_xsi_noNamespaceSchemaLocation(String _xsi_noNamespaceSchemaLocation) {
this._xsi_noNamespaceSchemaLocation = _xsi_noNamespaceSchemaLocation;
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