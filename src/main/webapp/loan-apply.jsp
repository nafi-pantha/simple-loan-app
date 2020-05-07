<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="${_csrf.parameterName}" content="${_csrf.token}"/>
    <%@include file="common/header.jsp" %>
</head>

<body id="page-top">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
        
        <div id="wrapper">
            <%@include file="common/sidebar.jsp" %>
                <div id="content-wrapper" class="d-flex flex-column">
                    <div id="content">
                        <%@include file="common/topbar.jsp" %>

                            <!-- Begin Page Content -->
                            <form method="POST" id="applicationFrom">
                            <div class="container-fluid">

                                <!-- Page Heading -->
                                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                                    <h1 class="h3 mb-0 text-gray-800">Loan Application</h1>
                                </div>


                                <div class="card shadow mb-4">
                                    <a href="#collapseCardCustomerInfo" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseCardCustomerInfo">
                                        <h6 class="m-0 font-weight-bold text-primary">Customer Information</h6>
                                    </a>
                                    <div class="collapse show" id="collapseCardCustomerInfo">
                                        <div class="card-body">
                                            
                                                <div class="form-group row">
                                                    <label for="customerID" class="col-sm-2 col-form-label">Customer ID</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" name="customerId" id="customerId" placeholder="Customer ID">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="customerName" class="col-sm-2 col-form-label">Customer Name</label>
                                                    <div class="col-sm-4">
                                                        <p id="customerName"></p>
                                                    </div>
                                                    <label for="customerAddress" class="col-sm-2 col-form-label">Customer Address</label>
                                                    <div class="col-sm-4">
                                                        <p id="customerAddress"></p>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="birthdate" class="col-sm-2 col-form-label">Birthdate</label>
                                                    <div class="col-sm-2">
                                                        <p id="birthdate"></p>
                                                    </div>
                                                    <label for="nid" class="col-sm-2 col-form-label">NID</label>
                                                    <div class="col-sm-2">
                                                        <p id="nid"></p>
                                                    </div>
                                                    <label for="contactNo" class="col-sm-2 col-form-label">Contact No</label>
                                                    <div class="col-sm-2">
                                                        <p id="contactNo"></p>
                                                    </div>
                                                </div>
                                            
                                        </div>
                                    </div>
                                </div>

                                <div class="card shadow mb-4">
                                    <a href="#collapseCardLoanInfo" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseCardLoanInfo">
                                        <h6 class="m-0 font-weight-bold text-primary">Loan Product Selection</h6>
                                    </a>
                                    <div class="collapse show" id="collapseCardLoanInfo">
                                        <div class="card-body">
                                            
                                                <div class="form-group row">
                                                    <label for="loanProduct" class="col-sm-2 col-form-label">Loan Product</label>
                                                    <div class="col-sm-4">
                                                        <select class="form-control" id="loanProduct" name="productId"> 
                                                     		<option value="0">---Please Select---</option>
                                                     		<c:forEach items="${productList}" var="item" varStatus="count">
     														<option value="${item.getProductId()}">${item.getProductId()}: ${item.getProductName()}</option>
        													</c:forEach>
                                                		</select>

                                                    </div>  	
                                                </div>
                                                <div class="form-group row">
                                                    <label for="minAmt" class="col-sm-2 col-form-label">Min Amount (BDT)</label>
                                                    <div class="col-sm-2">
                                                        <p id="minAmt"></p>
                                                    </div>
                                                    <label for="maxAmt" class="col-sm-2 col-form-label">Min Amount (BDT)</label>
                                                    <div class="col-sm-2">
                                                        <p id="maxAmt"></p>
                                                    </div>
                                                    <label for="tenure" class="col-sm-2 col-form-label">Tenure (Months)</label>
                                                    <div class="col-sm-2">
                                                        <p id="tenure"></p>
                                                    </div>
                                                </div>
                                            
                                        </div>
                                    </div>
                                </div>
                                <div class="card shadow mb-4">
                                    <a href="#collapseEmploymentInfo" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseEmploymentInfo">
                                        <h6 class="m-0 font-weight-bold text-primary">Employment Information</h6>
                                    </a>
                                    <div class="collapse show" id="collapseEmploymentInfo">
                                        <div class="card-body">
                                            
                                                <div class="form-group row">
                                                    <label for="occupation" class="col-sm-2 col-form-label">Occupation</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="occupation" name="occupation" placeholder="Occupation">
                                                    </div>
                                                    <label for="presentEmployer" class="col-sm-2 col-form-label">Present Employer</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="presentEmployer" name="presentEmployer" placeholder="Present Employer">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="designation" class="col-sm-2 col-form-label">Designation</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="designation" name="designation" placeholder="Designation">
                                                    </div>
                                                    <label for="yearsExp" class="col-sm-2 col-form-label">Years of Experience</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="yearsOfExp" name="yearsOfExp" placeholder="Years of Experience">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="monthlyIncome" class="col-sm-2 col-form-label">Monthly Income</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="grossMonthlySalary" name="grossMonthlySalary" placeholder="Gross Monthly Income">
                                                    </div>
                                                </div>
                                            
                                        </div>
                                    </div>
                                </div>
                                <div class="card shadow mb-4">
                                    <a href="#collapseAppliedLoanInfo" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseAppliedLoanInfo">
                                        <h6 class="m-0 font-weight-bold text-primary">Customer Loan Information</h6>
                                    </a>
                                    <div class="collapse show" id="collapseAppliedLoanInfo">
                                        <div class="card-body">
                                            
                                                <div class="form-group row">
                                                    <label for="desiredAmt" class="col-sm-2 col-form-label">Desired Amount (BDT)</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="desiredLoanAmt" name="desiredLoanAmt" placeholder="Desired Loan Amount">
                                                    </div>
                                                    <label for="desiredTenure" class="col-sm-2 col-form-label">Desired Tenure (Months)</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="desiredTenure" name="desiredTenure" placeholder="Desired Loan Tenure">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="purpose" class="col-sm-2 col-form-label">Purpose</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="loanPurpose" name="loanPurpose" placeholder="Purpose">
                                                    </div>
                                                    <label for="remarks" class="col-sm-2 col-form-label">Remarks</label>
                                                    <div class="col-sm-4">
                                                        <input type="text" class="form-control" id="remarks" name="remarks" placeholder="Remarks">
                                                    </div>
                                                </div>
                                            
                                        </div>
                                    </div>
                                </div>

                                <div class="col-sm-12 text-center">
                                    <button class="btn btn-danger" id="loanReset">Reset</button>
                                    <button class="btn btn-primary" id="loanSubmit">Submit</button>
                                </div>
                            </div>
                            </form>
                            <!-- /.container-fluid -->

                    </div>
                    <!-- End of Main Content -->

                    <%@include file="common/footer.jsp" %>
                        <!-- End of Footer -->

                </div>
                <!-- End of Content Wrapper -->
        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <button class="btn btn-primary" onclick="document.forms['logoutForm'].submit()">Logout</button>
                    </div>
                </div>
            </div>
        </div>
    </c:if>
    <%@include file="common/scripts.jsp" %>
	<script src="js/loan-apply.js"></script>
</body>

</html>

