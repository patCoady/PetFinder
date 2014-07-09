$.getScript("resources/quickpager.jquery.js", function(){
	/*$(document).ready(function() {
		$(".petList tbody").quickPager( {
			pageSize: 5,
			currentPage: 1,
			pagerLocation: "after"
		});
	});*/
	
	function setPagger(){
		$(".petList tbody").quickPager( {
			pageSize: $( "#numRowsPerPage" ).val(),
			currentPage: 1,
			pagerLocation: "after"
		});
	}
	function setRowsPerPage(){
		var select = document.getElementById("numRowsPerPage");
		var rowCount = $('#petList tr').length;
		for(var i =1; i<rowCount+1;i++){
			var option = document.createElement("option");
			option.text = i;
			select.add(option);
		}
	}
	  $('#numRowsPerPage').change(function() {
		  //Remove old page nav
		  $(".simplePagerNav").remove();
		  //Add new page nav
		  setPagger();
	  });
	//var x = document.getElementById("myTable").rows.length;
	
	$(document).ready(function(){
		setRowsPerPage();
		setPagger();
	});
});