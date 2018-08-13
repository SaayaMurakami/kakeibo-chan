$(function(){
	var jsiModalDialog = $('#jsiModalDialog');
	var pencil = $('.pencil');
	var recordEditOverlay = $('.record-edit-overlay');
	var recordId;
	var categoryType;
	var defaultAccountItemId;
	
	pencil.click(function(){
		jsiModalDialog.show();
		
		var clickedPencil = $(this);
		recordId = clickedPencil.data('record-id');
		
		$.ajax({
			url:'/front/record/detail/' + recordId,
			type:'GET'
		})
		.done(function(result){
			categoryType = result.categoryType;
			defaultAccountItemId = result.accountItemId;
			console.log(result);
			$('#form-category').hide();
			$('#form-withdrawal-account').hide();
			$('#form-deposit-account').hide();
			
			if (categoryType == "INCOME" || categoryType == "SPEND") {
				var accountItemSelect = $('#record-edit-account-item');
				for (var i = 0; i < result.accountItemBeans.length; i++) {
				accountItemSelect.append('<option value="' + result.accountItemBeans[i].id + '">' + result.accountItemBeans[i].title + '</option>');
				}
				$('#form-category').show();
			}
			
			if (categoryType == "INCOME" || categoryType == "MOVE") {
				var depositAccountSelect = $('#record-edit-deposit-account');
				for (var i = 0; i < result.assetBeans.length; i++) {
				depositAccountSelect.append('<option value="' + result.assetBeans[i].id + '">' + result.assetBeans[i].name + '</option>');
				}
				$('#form-deposit-account').show();
			}

			if (categoryType == "SPEND" || categoryType == "MOVE") {
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
	
	$("#register-button").click(function(){
		//TODO 必要な値を取ってくる
		var date = $("#record-edit-date").val();
		var amount = $("#record-edit-amount").val();
		var withdrawalAcountId = $("#record-edit-withdrawal-account").val();
		var depositAccountId = $("#record-edit-deposit-account").val();
		var memo = $("#record-edit-memo").val();	
		var accountItemId;
		if (categoryType == "MOVE") {
			accountItemId = defaultAccountItemId;
		} else {
			accountItemId = $("#record-edit-account-item").val();
		}
		
		console.log(date);	
		
		$.ajax({
			url:'/front/record/update',
			type:'POST',
			data: {
				'categoryType' : categoryType,
				'id' : recordId,
				'date' : date,
				'accountItemId' : accountItemId,
				'amount' : amount,
				'withdrawalAcountId' : withdrawalAcountId,
				'depositAccountId' : depositAccountId,
				'memo' : memo
				},
		})
	});
	
	
});