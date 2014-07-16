<%@ page contentType="text/html; charset=Cp1252" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Cp1252"/>
        <title>jsf-title</title>
    </head>
    <body>
        <f:view>
            <h:form>
                 UserID: <h:inputText value="#{ cliente.usuario }"/>
                <br/>Password: <h:inputText value="#{ cliente.senha }"/>
                <br/><h:commandButton value="Login" action="#{ cliente.login }"/>
            </h:form>
        </f:view>
    </body>
</html>