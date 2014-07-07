
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
"@xmlns:xsi",
"petIds",
"header",
"@xsi:noNamespaceSchemaLocation"
})
public class Petfinder {

@JsonProperty("@xmlns:xsi")
private String _xmlns_xsi;
@JsonProperty("petIds")
private PetIds petIds;
@JsonProperty("header")
private Header header;
@JsonProperty("@xsi:noNamespaceSchemaLocation")
private String _xsi_noNamespaceSchemaLocation;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("@xmlns:xsi")
public String get_xmlns_xsi() {
return _xmlns_xsi;
}

@JsonProperty("@xmlns:xsi")
public void set_xmlns_xsi(String _xmlns_xsi) {
this._xmlns_xsi = _xmlns_xsi;
}

@JsonProperty("petIds")
public PetIds getPetIds() {
return petIds;
}

@JsonProperty("petIds")
public void setPetIds(PetIds petIds) {
this.petIds = petIds;
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