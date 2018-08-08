$(function(){
	var jsiModalDialog = $('#jsiModalDialog');
	var pencil = $('.pencil');
	var recordEditOverlay = $('.record-edit-overlay');
	
	pencil.click(function(){
		jsiModalDialog.show();
	});
	
	recordEditOverlay.click(function(){
		jsiModalDialog.hide();
	});
	
});