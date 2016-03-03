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
Use two Decorator(Front-end and Back-end) <br>
No decoration start with /login, /popup, /main URL <br>
Extracting multiple DIV tags and put into decorator  

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
