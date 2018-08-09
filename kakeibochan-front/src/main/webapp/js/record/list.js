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
			$('#form-category').hide();
			$('#form-withdrawal-account').hide();
			$('#form-deposit-account').hide();
			
			if (result.categoryType == "INCOME" || result.categoryType == "SPEND") {
				var accountItemSelect = $('#record-edit-account-item');
				for (var i = 0; i < result.accountItemBeans.length; i++) {
				accountItemSelect.append('<option value="' + result.accountItemBeans[i].id + '">' + result.accountItemBeans[i].title + '</option>');
				}
				$('#form-category').show();
			}
			
			if (result.categoryType == "INCOME" || result.categoryType == "MOVE") {
				var depositAccountSelect = $('#record-edit-deposit-account');
				for (var i = 0; i < result.assetBeans.length; i++) {
				depositAccountSelect.append('<option value="' + result.assetBeans[i].id + '">' + result.assetBeans[i].name + '</option>');
				}
				$('#form-deposit-account').show();
			}

			if (result.categoryType == "SPEND" || result.categoryType == "MOVE") {
				var withdrawalAccountSelect = $('#record-edit-withdrawal-account');
				for (var i = 0; i < result.assetBeans.length; i++) {
				withdrawalAccountSelect.append('<option value="' + result.assetBeans[i].id + '">' + result.assetBeans[i].name + '</option>');
				}
				$('#form-withdrawal-account').show();
			}		
				
			$('#record-edit-date').val(result.date);
			$('#record-edit-account-item').val(result.accountItemId);
			$('#record-edit-withdrawal-account').val(result.withdrawalAccountId);
			$('#record-edit-deposit-account').val(result.depositAccountId);
			$('#record-edit-amount').val(result.amount);
			$('#record-edit-memo').val(result.memo);
			
			
			
		});
	});
	
	recordEditOverlay.click(function(){
		jsiModalDialog.hide();
	});
	
});