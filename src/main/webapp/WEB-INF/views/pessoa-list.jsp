<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>EXM01: Lista de Pessoas</title>
</head>

<body>
    <h1>EXM01: Lista de Pessoas</h1>
    <ul>
        <c:forEach var="pessoa" items="${galera}">
            <li value="${pessoa.nome}">${pessoa.nome} ${pessoa.anos} anos</li>
        </c:forEach>
    </ul>
</body>

</html>