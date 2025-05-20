<div class="container">
    <div class="row">
        <%-- Sidebar--%>
        <div class="col-md-3">

            <%@include file="./shared/sidebar.jsp" %>

        </div>

        <%--books --%>
        <div class="col-md-9">
            <%--      breadcrump--%>
            <div class="row">

                <div class="col-lg-12">

                    <c:if test="${userClickAllBooks == true}">
                        <ol class="breadcrumb">

                            <li><a href="${contextRoot}/home">Home</a></li>
                            <li class="active">All Books</li>

                        </ol>
                    </c:if>


                    <c:if test="${userClickCategoryBooks == true}">
                        <ol class="breadcrumb">

                            <li><a href="${contextRoot}/home">Home</a></li>
                            <li class="active">Category</li>
                            <li class="active">${category.name}</li>

                        </ol>
                    </c:if>
                </div>
            </div>

        </div>
    </div>
</div>