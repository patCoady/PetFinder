$.getScript("resources/json.min.js", function(){
//http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=petInfo
	$('#getRest').click(function() {
		var petURL ="http://api.petfinder.com/pet.getRandom?format=json&key=0bc49692373b89661b8746532bf5c75b&callback=randomPet";
		var infoURL ="http://api.petfinder.com/pet.get?format=json&key=0bc49692373b89661b8746532bf5c75b&id=29400959&callback=petInfo";
		$.loadScript(petURL);
		$.loadScript(infoURL);
	});
	
	jQuery.loadScript = function (url) {
	    jQuery.ajax({
	        url: url,
	        dataType: 'script',
	        async: true
	    });
	};
	randomPet = function(data){
		var dataString = JSON.stringify(data);
		$("#randomPet").val(dataString);
		//alert("GOT DATA");
		
		};
	petInfo = function(data){
		var dataString =JSON.stringify(data);
		$("#petInfo").val(dataString);
	};
});