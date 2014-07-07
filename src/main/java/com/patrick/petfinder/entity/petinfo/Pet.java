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
"options",
"breeds",
"shelterPetId",
"status",
"name",
"contact",
"description",
"sex",
"age",
"size",
"mix",
"shelterId",
"lastUpdate",
"media",
"id",
"animal"
})
public class Pet {

/*@JsonProperty("options")
private Options options;*/
@JsonProperty("breeds")
private Breeds breeds;
@JsonProperty("shelterPetId")
private ShelterPetId shelterPetId;
@JsonProperty("status")
private Status status;
@JsonProperty("name")
private Name name;
@JsonProperty("contact")
private Contact contact;
@JsonProperty("description")
private Description description;
@JsonProperty("sex")
private Sex sex;
@JsonProperty("age")
private Age age;
@JsonProperty("size")
private Size size;
@JsonProperty("mix")
private Mix mix;
@JsonProperty("shelterId")
private ShelterId shelterId;
/*@JsonProperty("lastUpdate")
private LastUpdate lastUpdate;*/
@JsonProperty("media")
private Media media;
@JsonProperty("id")
private Id id;
@JsonProperty("animal")
private Animal animal;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/*@JsonProperty("options")
public Options getOptions() {
return options;
}

@JsonProperty("options")
public void setOptions(Options options) {
this.options = options;
}
*/
@JsonProperty("breeds")
public Breeds getBreeds() {
return breeds;
}

@JsonProperty("breeds")
public void setBreeds(Breeds breeds) {
this.breeds = breeds;
}

@JsonProperty("shelterPetId")
public ShelterPetId getShelterPetId() {
return shelterPetId;
}

@JsonProperty("shelterPetId")
public void setShelterPetId(ShelterPetId shelterPetId) {
this.shelterPetId = shelterPetId;
}

@JsonProperty("status")
public Status getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(Status status) {
this.status = status;
}

@JsonProperty("name")
public Name getName() {
return name;
}

@JsonProperty("name")
public void setName(Name name) {
this.name = name;
}

@JsonProperty("contact")
public Contact getContact() {
return contact;
}

@JsonProperty("contact")
public void setContact(Contact contact) {
this.contact = contact;
}

@JsonProperty("description")
public Description getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(Description description) {
this.description = description;
}

@JsonProperty("sex")
public Sex getSex() {
return sex;
}

@JsonProperty("sex")
public void setSex(Sex sex) {
this.sex = sex;
}

@JsonProperty("age")
public Age getAge() {
return age;
}

@JsonProperty("age")
public void setAge(Age age) {
this.age = age;
}

@JsonProperty("size")
public Size getSize() {
return size;
}

@JsonProperty("size")
public void setSize(Size size) {
this.size = size;
}

@JsonProperty("mix")
public Mix getMix() {
return mix;
}

@JsonProperty("mix")
public void setMix(Mix mix) {
this.mix = mix;
}

@JsonProperty("shelterId")
public ShelterId getShelterId() {
return shelterId;
}

@JsonProperty("shelterId")
public void setShelterId(ShelterId shelterId) {
this.shelterId = shelterId;
}

/*@JsonProperty("lastUpdate")
public LastUpdate getLastUpdate() {
return lastUpdate;
}

@JsonProperty("lastUpdate")
public void setLastUpdate(LastUpdate lastUpdate) {
this.lastUpdate = lastUpdate;
}
*/
@JsonProperty("media")
public Media getMedia() {
return media;
}

@JsonProperty("media")
public void setMedia(Media media) {
this.media = media;
}

@JsonProperty("id")
public Id getId() {
return id;
}

@JsonProperty("id")
public void setId(Id id) {
this.id = id;
}

@JsonProperty("animal")
public Animal getAnimal() {
return animal;
}

@JsonProperty("animal")
public void setAnimal(Animal animal) {
this.animal = animal;
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