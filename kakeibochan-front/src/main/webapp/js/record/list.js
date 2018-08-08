$(function(){
	var jsiModalDialog = $('#jsiModalDialog');
	var pencil = $('.pencil');
	var recordEditOverlay = $('.record-edit-overlay');
	
	pencil.click(function(){
		jsiModalDialog.show();
		
		var clickedPencil = $(this);
		var recordId = clickedPencil.data('record-id');
		
		$.ajax({
			url:'/front/record/detail/' + recordId,
			type:'GET'
		})
		.done(function(result){
			console.log(result);
			
			$('#record-edit-date').val(result.date);
			$('#record-edit-account-item').val(result.accountTitle);
			$('#record-edit-withdrawal-account').val(result.withdrawalAccount);
			$('#record-edit-amount').val(result.amount);
			$('#record-edit-memo').val(result.memo);
		});
	});
	
	recordEditOverlay.click(function(){
		jsiModalDialog.hide();
	});
	
});