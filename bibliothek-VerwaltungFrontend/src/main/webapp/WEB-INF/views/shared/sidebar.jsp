<p class="lead">Shop Name</p>

<div class="list-group">
    <c:if test="${not empty categories}">
        <c:forEach items="${categories}" var="category">
            <a href="${contextRoot}/show/category/${category.id}/books" class="list-group-item">${category.name}</a>
        </c:forEach>
    </c:if>

</div>
