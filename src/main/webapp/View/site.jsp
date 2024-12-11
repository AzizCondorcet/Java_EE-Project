<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="be.project.pojo.Site" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Site Information</title>
</head>
<body>

<h2>Afficher les informations du site</h2>

<form action="site" method="get">
    <button type="submit">Afficher le Site</button>
</form>

<%-- Afficher le résultat si le site existe --%>
<%
    Site site = (Site) request.getAttribute("site");
    String errorMessage = (String) request.getAttribute("errorMessage");

    if (site != null) {
%>
        <h3>Site trouvé :</h3>
        <p>Ville : <%= site.getCity() %></p>
        <p>ID Site : <%= site.getIdSite() %></p>
<%
    } else if (errorMessage != null) {
%>
        <p><%= errorMessage %></p>
<%
    }
%>

</body>
</html>
