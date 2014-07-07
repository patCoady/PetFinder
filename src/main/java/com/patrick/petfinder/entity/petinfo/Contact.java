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
"email",
"zip",
"city",
"fax",
"address1",
"phone",
"state",
"address2"
})
public class Contact {

@JsonProperty("email")
private Email email;
@JsonProperty("zip")
private Zip zip;
@JsonProperty("city")
private City city;
@JsonProperty("fax")
private Fax fax;
@JsonProperty("address1")
private Address1 address1;
@JsonProperty("phone")
private Phone phone;
@JsonProperty("state")
private State state;
@JsonProperty("address2")
private Address2 address2;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("email")
public Email getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(Email email) {
this.email = email;
}

@JsonProperty("zip")
public Zip getZip() {
return zip;
}

@JsonProperty("zip")
public void setZip(Zip zip) {
this.zip = zip;
}

@JsonProperty("city")
public City getCity() {
return city;
}

@JsonProperty("city")
public void setCity(City city) {
this.city = city;
}

@JsonProperty("fax")
public Fax getFax() {
return fax;
}

@JsonProperty("fax")
public void setFax(Fax fax) {
this.fax = fax;
}

@JsonProperty("address1")
public Address1 getAddress1() {
return address1;
}

@JsonProperty("address1")
public void setAddress1(Address1 address1) {
this.address1 = address1;
}

@JsonProperty("phone")
public Phone getPhone() {
return phone;
}

@JsonProperty("phone")
public void setPhone(Phone phone) {
this.phone = phone;
}

@JsonProperty("state")
public State getState() {
return state;
}

@JsonProperty("state")
public void setState(State state) {
this.state = state;
}

@JsonProperty("address2")
public Address2 getAddress2() {
return address2;
}

@JsonProperty("address2")
public void setAddress2(Address2 address2) {
this.address2 = address2;
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