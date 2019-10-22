$(function() {
	//solving the active problems
	switch(menu){
	case "ASHAbout Us":
		$('#about').addClass('active');
		break;
	case "AshContact":
		$('#contact').addClass('active');
		break;
	case "All Product":
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
	$('#a_'+menu).addClass('active');
		break;
		
		
	}
	
		
});