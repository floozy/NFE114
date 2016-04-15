 <%--inclusion du header --%>
 <%@ include file="header.jsp" %>

<title>authentification</title>
  <body>

    <div class="container">

      <form action="${pageContext.request.contextPath}/CtrIndex" method="post" class="form-signin">
        <h2 class="form-signin-heading">Veuillez vous identifier</h2>
        <label for="inputEmail" class="sr-only">Adresse mail</label>
        <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Adresse mail" required autofocus>
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" name="passwd" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">envoyer</button>
      </form>
 
   <%--inclusion du footer --%>
     <%@ include file="footer.jsp" %>
