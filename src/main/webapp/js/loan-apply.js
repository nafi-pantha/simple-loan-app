$(document).ready(function(){
    $('#customerId').on('blur',function(){
        $.ajax({
            url: "/get-customer-info",
            data:{'customerID':$('#customerId').val()},
            type: "GET",
            dataType:"JSON",
            success: function(response) {
            	if (!$.trim(response)){   
            		swal("Error!", "Customer Not Found!", "error");
            	}
            	else{   
            	    $("#customerName").html(response.firstName+" "+response.lastName);
            	    $("#customerAddress").html(response.address);
            	    $("#birthdate").html(response.birthDate);
            	    $("#nid").html(response.nid);
            	    $("#contactNo").html(response.contactNo);
            	}
            }
            ,
            error: function (XMLHttpRequest, textStatus, errorThrown) {
            	swal("Unexpected Problem!", "Not Found!", "error");
            }
        });
    });
    
    $('#loanProduct').on('change',function(){
    	$.ajax({
            url: "/get-product-info",
            data:{'loanProductID':$('#loanProduct').val()},
            type: "GET",
            dataType:"JSON",
            success: function(response) {
            	if (!$.trim(response)){   
            		swal("Error!", "Not Found!", "error");
            	}
            	else{   
            	    $("#minAmt").html(response.minAmount);
            	    $("#maxAmt").html(response.maxAmount);
            	    $("#tenure").html(response.tenureInMonth);
            	}
            }
        });
    });
    
    $('#loanSubmit').on('click', function(){
	    $("#applicationFrom").validate({
	        onkeyup: false,
	        submitHandler: function(form) {
	            var customerLoanInfo = new Object;
	            var customerId = $('#customerId').val();
	            var productId = $('#loanProduct').val();
	            var occupation = $('#occupation').val();
	            var presentEmployer = $('#presentEmployer').val();
	            var yearsOfExp = $('#yearsOfExp').val();
	            var designation = $('#designation').val();
	            var grossMonthlySalary = $('#grossMonthlySalary').val();
	            var desiredLoanAmt = $('#desiredLoanAmt').val();
	            var desiredTenure = $('#desiredTenure').val();
	            var loanPurpose = $('#loanPurpose').val();
	            var remarks = $('#remarks').val();
	            customerLoanInfo.customerId = customerId;
	            customerLoanInfo.productId = productId;
	            customerLoanInfo.occupation = occupation;
	            customerLoanInfo.presentEmployer = presentEmployer;
	            customerLoanInfo.yearsOfExp = yearsOfExp;
	            customerLoanInfo.designation = designation;
	            customerLoanInfo.grossMonthlySalary = grossMonthlySalary;
	            customerLoanInfo.desiredLoanAmt = desiredLoanAmt;
	            customerLoanInfo.desiredTenure = desiredTenure;
	            customerLoanInfo.loanPurpose = loanPurpose;
	            customerLoanInfo.remarks = remarks;
	            console.log(customerLoanInfo);
	        	var token = $("meta[name='_csrf']").attr("content");
	            $.ajax({
	            	type : "POST",
	            	contentType : 'application/json',
					url : "/loan-application-submit",
					headers: {"X-CSRF-TOKEN": token},
					data : JSON.stringify(customerLoanInfo),
					dataType : 'json',
	                success: function (data, textStatus, xhr) {
	                    swal("Success!", xhr.responseText, "success");
	                }
	            }).fail(function(xhr, status, error){
	                swal("Error!", xhr.responseText, "error");
	            });
	        }
	    });
    });
});