<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button"
              class="navbar-toggle"
              data-toggle="collapse"
              data-target="#bs-example-navbar-collapse-1"
              data-mdb-collapse-init
              data-mdb-target="navbarSupportedContent"
              aria-controls="navbarSupportedContent"
              aria-expanded="false"
              aria-label="Toggle navigation">

        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${contextRoot}/home">Bibliothek Verwaltung</a>
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li id="about">
          <a href="${contextRoot}/about">About</a>
        </li>
        <li id="listBooks">
          <a href="${contextRoot}/show/all/books">View Books</a>
        </li>
        <li id="contact">
          <a href="${contextRoot}/contact">Contact</a>
        </li>
        <%-- User Profile --%>
        <li id="profile">
          <a href="${contextRoot}/profile"> Profile</a>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse -->
  </div>
  <!-- /.container -->
</nav>