<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>
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
                            <div class="container-fluid">

                                <!-- Page Heading -->
                                <h1 class="h3 mb-2 text-gray-800">Create Customer</h1>
                                <p class="mb-4">Please click the button to populate the list of customer!</p>

                                <a class="btn btn-primary btn-lg" href="/fetch-customer">Create Customer</a>
                            </div>
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

</body>

</html>
