
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
"@size",
"$t",
"@id"
})
public class Photo {

@JsonProperty("@size")
private String _size;
@JsonProperty("$t")
private String $t;
@JsonProperty("@id")
private String _id;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("@size")
public String get_size() {
return _size;
}

@JsonProperty("@size")
public void set_size(String _size) {
this._size = _size;
}

@JsonProperty("$t")
public String get$t() {
return $t;
}

@JsonProperty("$t")
public void set$t(String $t) {
this.$t = $t;
}

@JsonProperty("@id")
public String get_id() {
return _id;
}

@JsonProperty("@id")
public void set_id(String _id) {
this._id = _id;
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