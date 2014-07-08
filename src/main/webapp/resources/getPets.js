
$.getScript("resources/json.min.js", function(){
	
	//Used for Random dog/cat/animal calls 
	var petId;
	//url for data on a single pet (needs id of pet)
	var petInfoURL = "http://api.petfinder.com/pet.get?format=json&key=0bc49692373b89661b8746532bf5c75b&id=";
	
	//URLS for random cat/dog/pet
	var randomPetURL = "http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=randomPet";
	var randomCatURL = "http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=cat&callback=randomPet";
	var randomDogURL = "http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=dog&callback=randomPet";
	//URLS for list of breeds for cats/dogs
	var catBreedsURL = "http://api.petfinder.com/breed.list?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=cat&callback=catBreeds";
	var dogBreedsURL = "http://api.petfinder.com/breed.list?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=dog&callback=dogBreeds";
	//URLS for list of cats/dogs of a certin breed
	var catBreedListURL ="http://api.petfinder.com/pet.find?format=json&key=0bc49692373b89661b8746532bf5c75b&location=10025&animal=cat&breed=";
	var dogBreedListURL ="http://api.petfinder.com/pet.find?format=json&key=0bc49692373b89661b8746532bf5c75b&location=10025&animal=dog&breed=";
	//URL for general list
	var petListURL = "http://api.petfinder.com/pet.find?format=json&key=0bc49692373b89661b8746532bf5c75b";

	//Call back functions to list cat/dog/single pet info
	var listPetsCallBack = "&callback=petListInfo";
	var listCatsCallBack = "&callback=catListInfo";
	var listDogsCallBack = "&callback=dogListInfo";
	var singlePetsCallBack ="&callback=petInfo";

//Run on startup to populate 2 dropdown list with cat and dog breeds
  findCatBreeds();
  findDogBreeds();
  function findCatBreeds(){
	  jQuery.ajax({
	        url: dogBreedsURL,
	        dataType: 'script',
	        async: false
	    });
  }
  function findDogBreeds(){
	  jQuery.ajax({
	        url: catBreedsURL,
	        dataType: 'script',
	        async: false
	    });
  }
  $('#animalSelect').change(function() {
	  if($(this).find('option:selected').val() == "other"){
          $("#other").show();
        }else{
          $("#other").hide();
        }
  });
  //Find custom search
  $('#getPetList').click(function(){
	  var select = document.getElementById("animalSelect");
	  var animal = select.options[select.selectedIndex].value;
	  if(animal == "other"){
		  animal = $('#other').val();
	  }
	  alert(animal);
	  var zipCode = $('#zipCode').val();
	  $.loadScript(petListURL.concat("&animal=").concat(animal).concat("&location=").concat(zipCode).concat(listPetsCallBack));
  });

  //Find cats/dogs by breed
  $('#getCatList').click(function(){
	  var select = document.getElementById("catBreedSelect");
	  var catBreed = select.options[select.selectedIndex].value;
	  $.loadScript(catBreedListURL.concat(catBreed).concat(listCatsCallBack));
  });
  $('#getDogList').click(function(){
	  var select = document.getElementById("dogBreedSelect");
	  var dogBreed = select.options[select.selectedIndex].value;
	  $.loadScript(dogBreedListURL.concat(dogBreed).concat(listDogsCallBack));
  });
  
  //3 button to find random pet/cat/dog
  $('#getRandom').click(function() { 
	  $.loadScript(randomPetURL); 
  });
  $('#getRandomCat').click(function() { 
	  $.loadScript(randomCatURL); 
  });
  $('#getRandomDog').click(function() { 
	  $.loadScript(randomDogURL); 
  });
  
  //ajax call to fetch JSNOP for pet
	jQuery.loadScript = function (url) {
	    jQuery.ajax({
	        url: url,
	        dataType: 'script',
	        async: false
	    });
	};
	//Call back function for random pet/cat
	randomPet = function(data){
		petId=data.petfinder.petIds.id.$t;
		var infoURL =petInfoURL.concat(petId).concat(singlePetsCallBack);
		$.loadScript(infoURL);
		};
	//Callback function for info on a single pet
	petInfo = function(data){
		var dataString =JSON.stringify(data);
		$("#petInfo").val(dataString);
		$('#randomPet').submit();
	};
	//Callback function to get data on multiple dogs/cats
	catListInfo = function(data){
		var dataString =JSON.stringify(data);
		$("#catListInfo").val(dataString);
		$('#catList').submit();
	};
	dogListInfo = function(data){
		var dataString =JSON.stringify(data);
		$("#dogListInfo").val(dataString);
		$('#dogList').submit();
	};
	//Call back function for list of cat/dog breeds
	catBreeds = function(data){
		var breeds = data.petfinder.breeds.breed;
		var select = document.getElementById("catBreedSelect");
		//Loop though breeds and add to list
		for(var i =0; i<breeds.length;i++){
			var option = document.createElement("option");
			option.text = breeds[i].$t;
			select.add(option);
		}
	};
	dogBreeds = function(data){
		var breeds = data.petfinder.breeds.breed;
		var select = document.getElementById("dogBreedSelect");
		//Loop though breeds and add to list
		for(var i =0; i<breeds.length;i++){
			var option = document.createElement("option");
			option.text = breeds[i].$t;
			select.add(option);
		}
	};
	//call back for multiple pets
	petListInfo = function(data){
		var dataString =JSON.stringify(data);
		$("#petListInfo").val(dataString);
		$('#petList').submit();
	};
});