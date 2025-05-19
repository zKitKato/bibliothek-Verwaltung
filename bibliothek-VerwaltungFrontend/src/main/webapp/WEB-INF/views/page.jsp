<%--
  Created by IntelliJ IDEA.
  User: gian
  Date: 15.05.25
  Time: 10:07
  To change this template use File | Settings | File Templates.

  Template: https://web.archive.org/web/20170110170915/https://blackrockdigital.github.io/startbootstrap-shop-homepage/
--%>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<jsp:useBean id="locales" scope="application"
             class="net.kato.bibliothekVerwaltungFrontend.controller.PageController"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<html lang="en" style="--wm-toolbar-height: 1px;">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Apollo Bibliothek - ${title}</title>

        <script>
            window.menu = '${title}';
        </script>

        <!-- Bootstrap Core CSS -->
        <link href="${css}/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${css}/myapp.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>
    <body>
        <div class="wrapper">


            <!-- Navigation -->
            <%@include file="./shared/navbar.jsp" %>


            <!-- Page Content -->

            <div class="content">
                <%-- Loading the Home page--%>
                <c:if test="${userClickHome == true}">
                    <%@include file="home.jsp"%>
                </c:if>

                <%--Only when user click about--%>
                <c:if test="${userClickAbout == true}">
                    <%@include file="about.jsp"%>
                </c:if>

                <%--Only when user click contact--%>
                <c:if test="${userClickContact == true}">
                    <%@include file="contact.jsp"%>
                </c:if>

                <%--Only when user click profile--%>
                <c:if test="${userClickProfile == true}">
                    <%@include file="profile.jsp"%>
                </c:if>

                    <%--Only when user click contact--%>
                    <c:if test="${userClickShopItem == true}">
                        <%@include file="bibitem.jsp"%>
                    </c:if>
            </div>

            <div class="container">

                <!-- Footer -->
                <%@include file="./shared/footer.jsp"%>

            </div>

            <!-- /.container -->

            <!-- jQuery -->
            <script src="${js}/jquery.js"></script>

            <!-- Bootstrap Core JavaScript -->
            <script src="${js}/bootstrap.min.js"></script>

            <%-- Self coded js --%>
            <script src="${js}/myapp.js"></script>
        </div>

    </body>
</html>