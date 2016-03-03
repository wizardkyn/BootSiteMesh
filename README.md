# BootSiteMesh
Spring Boot Web with external Tomcat
<br>
JSP with SiteMesh3
# Environment
Spring Boot 1.4.0<br>
Maven<br>
JSTL & SiteMesh3<br>
Logback<br>
External Tomcat 8<br>
# How to
Use two Decorator <br>
Front-end : http://localhost:8080/BootSiteMesh/web/usermenu.do <br>
Back-end : http://localhost:8080/BootSiteMesh/backend/admin.do <br>
No decoration start with /login, /popup, /main URL <br>
ex : http://localhost:8080/BootSiteMesh/main/index.do <br><br>
Extracting multiple DIV tags and put into decorator  <br>

Decorator
<br>
&lt;h1>&lt;sitemesh:write property='div.contentH1'/>&lt;/h1>
<br>
&lt;h2>&lt;sitemesh:write property='div.contentH2'/>&lt;/h2>

From contents
<br>
&lt;div id="contentH1">User Area Heading 1&lt;/div>
<br>
&lt;div id="contentH2">User Area Heading 2&lt;/div>
