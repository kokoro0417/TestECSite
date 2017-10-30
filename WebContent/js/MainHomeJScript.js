/**
 *
 */

$(function(){

	$("ul.CategoryMenu").hide();
	$("div.AM_topMenu").click(function(){
		$("ul.CategoryMenu").slideUp();
			if($("+ul",this).css("display")=="none"){
				$("+ul",this).slideDown();
			}
	});
	$('.slider').bxSlider();


});