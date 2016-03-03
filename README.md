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
Extracting multiple DIV tags and put into decorator  

Ex:
Decorator
<h1><sitemesh:write property='div.contentH1'/></h1>
<h2><sitemesh:write property='div.contentH2'/></h2>

From contents
<div id="contentH1">User Area Heading 1</div>
<div id="contentH2">User Area Heading 2</div>