
$.getScript("resources/json.min.js", function(){

	var petId;
	var randomPetURL = "http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=randomPet";
	var randomCatURL = "http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=cat&callback=randomPet";
	var catBreedsURL = "http://api.petfinder.com/breed.list?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=cat&callback=catBreeds";
	var petInfoURL = "http://api.petfinder.com/pet.get?format=json&key=0bc49692373b89661b8746532bf5c75b&id=";
	

  findCatBreeds();
  function findCatBreeds(){
	  jQuery.ajax({
	        url: catBreedsURL,
	        dataType: 'script',
	        async: false
	    });
  }

  //Two button to find random pet/cat
  $('#getRandom').click(function() { 
	  $.loadScript(randomPetURL); 
  });
  $('#getRandomCat').click(function() { 
	  $.loadScript(randomCatURL); 
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
		var infoURL =petInfoURL.concat(petId).concat("&callback=petInfo");
		$.loadScript(infoURL);
		};
	//Callback function for info on a single pet
	petInfo = function(data){
		var dataString =JSON.stringify(data);
		$("#petInfo").val(dataString);
		$('#randomPet').submit();
	};
	//Call back function for list of cat breeds
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
	
/*	jQuery(function($) {
		 $('#submitRandom').click(function() {
			 var petURL  ="http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=randomPet";
			 $.loadScript(petURL); 
		 });
	});*/
	

	


	
});