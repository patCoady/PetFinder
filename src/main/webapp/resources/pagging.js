$.getScript("resources/quickpager.jquery.js", function(){
	$(document).ready(function() {
		$(".petList tbody").quickPager( {
			pageSize: 5,
			currentPage: 1,
			pagerLocation: "after"
		});
	});
});