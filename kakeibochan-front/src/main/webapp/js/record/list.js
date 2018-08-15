$(function(){
	var jsiModalDialog = $('#jsiModalDialog');
	var pencil = $('.pencil');
	var recordEditOverlay = $('.record-edit-overlay');
	var recordId;
	var categoryType;
	var defaultAccountItemId;
	var versionNo;
	
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
			versionNo = result.versionNo;
			$('#form-category').hide();
			$('#form-withdrawal-account').hide();
			$('#form-deposit-account').hide();
			
			var accountItemSelect = $('#record-edit-account-item');
			accountItemSelect.empty();
			for (var i = 0; i < result.accountItemBeans.length; i++) {
			accountItemSelect.append('<option value="' + result.accountItemBeans[i].id + '">' + result.accountItemBeans[i].title + '</option>');
			}
			
			var depositAccountSelect = $('#record-edit-deposit-account');
			depositAccountSelect.empty();
			for (var i = 0; i < result.assetBeans.length; i++) {
			depositAccountSelect.append('<option value="' + result.assetBeans[i].id + '">' + result.assetBeans[i].name + '</option>');
			}

			var withdrawalAccountSelect = $('#record-edit-withdrawal-account');
			withdrawalAccountSelect.empty();
			for (var i = 0; i < result.assetBeans.length; i++) {
			withdrawalAccountSelect.append('<option value="' + result.assetBeans[i].id + '">' + result.assetBeans[i].name + '</option>');
			}
			
			if (categoryType == "INCOME" || categoryType == "SPEND") {
				$('#form-category').show();
			}
			if (categoryType == "INCOME" || categoryType == "MOVE") {
				$('#form-deposit-account').show();
			}
			if (categoryType == "SPEND" || categoryType == "MOVE") {
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
		
		$.ajax({
			url:'/front/record/update',
			type:'POST',
			dataType: 'json',
			contentType: 'application/json',
			data: JSON.stringify({
				'categoryType' : categoryType,
				'id' : recordId,
				'date' : date,
				'accountItemId' : accountItemId,
				'amount' : amount,
				'withdrawalAcountId' : withdrawalAcountId,
				'depositAccountId' : depositAccountId,
				'memo' : memo,
				'versionNo' : versionNo
				}),
		}).done(function(result){
			jsiModalDialog.hide();
			
			$("#record-list-date-" + result.id).text(result.date);
			$("#record-list-categoryType-" + result.id).text(result.categoryTypeAlias);
			$("#record-list-accountTitle-" + result.id).text(result.accountTitle);
			$("#record-list-amount-" + result.id).text(result.amount);
			$("#record-list-memo-" + result.id).text(result.memo);
			$("#record-list-depositAccount-" + result.id).text("");
			$("#record-list-withdrawalAccount-" + result.id).text("");		

	        if (result.categoryType == "SPEND" || result.categoryType == "MOVE") {
				$("#record-list-withdrawalAccount-" + result.id).text(result.withdrawalAccount);
	        }
	        if (result.categoryType == "INCOME" || result.categoryType == "MOVE") {
				$("#record-list-depositAccount-" + result.id).text(result.depositAccount);
	        }
		});
	});
	
	
});