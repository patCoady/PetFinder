$.getScript("resources/json.min.js", function(){
	var petId;
// http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=petInfo
//http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=cat&callback=randomPet
  $('#getRandom').click(function() { 
	  var petURL="http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=randomPet";
	  $.loadScript(petURL); 
  });
  $('#getRandomCat').click(function() { 
	  var petURL="http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&animal=cat&callback=randomPet";
	  $.loadScript(petURL); 
  });
 
	
	jQuery.loadScript = function (url) {
	    jQuery.ajax({
	        url: url,
	        dataType: 'script',
	        async: false
	    });
	};
	randomPet = function(data){
		petId=data.petfinder.petIds.id.$t;
		var infoURL ="http://api.petfinder.com/pet.get?format=json&key=0bc49692373b89661b8746532bf5c75b&id=".concat(petId).concat("&callback=petInfo");
		$.loadScript(infoURL);
		};
	petInfo = function(data){
		var dataString =JSON.stringify(data);
		$("#petInfo").val(dataString);
		$('#randomPet').submit();
	};
	
	jQuery(function($) {
		 $('#submitRandom').click(function() {
			 var petURL  ="http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=randomPet";
			 $.loadScript(petURL); 
		 });
	});
	

	


	
});