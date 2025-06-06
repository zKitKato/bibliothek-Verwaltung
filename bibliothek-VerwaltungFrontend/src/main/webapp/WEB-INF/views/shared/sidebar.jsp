<p class="lead"></p>

<div class="list-group">
    <c:if test="${not empty categories}">
        <c:forEach items="${categories}" var="category">
            <a href="${contextRoot}/show/category/${category.id}/books" class="list-group-item" id="a_${category.name}">${category.name}</a>
        </c:forEach>
    </c:if>
</div>