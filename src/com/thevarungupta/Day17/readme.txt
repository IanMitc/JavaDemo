# Servlets

> Servlet technology is used to create a web application which resides at server side and generate a dynamic web page
> Servlet technology is robust and scalable because of java language, before the servlet CGI (common gateway interface)
scripting langauge which was common as a server side programming language
> THere are many interfaces and classes in the servlet API such as Servlet, GenericServlet, HttpServlet etc


# What is Servlet?
- servlet is a technology which is used to create a web application
- servlet is an API that provides many interfaces and classes
- servlet is an interface that must be implemented for creating any servlet
- servlet is a web component that is deployed on the server to create a dynamic web page


# Advantages of servlet
there are many advantages of servlet over CGI. The web container create thread for handling the multiple request to the
servlet. thread have many benifits over the process such as they share common memory, lightweight, cost of communication
etc
1. Better performace - as it create a thread for each request, not process
2. Protability - as it uses java language
3. Robust - JVM manages Servlet, so we dont need to worry about the memory leak, garbage collection etc
4. Secure - as uses java language


# Web terminology

HTTP - it is data communication protocol used to eastablish communication between server and client
Http Request - it is a request send by client computer to a web server that contain all information 
Http Response - it is response / reply by the web server to the request send by client computer
1. Get - get information
2. Post - create / send
3. Put - update
4. Delete - delete

# Servlet API
> javax.servlet and javax.servlet.http packages represent interface and classes for Servlet API

> javax.servlet package contain many interface and classes that are used by the servlet and these are not specified to any protocol
> javax.servlet.http contain interface and classes that are responsable for http request


# Javax.servlet packages
interface
1. servlet
2. servletRequest
3. ServletConfig
4. Request Dispatcher
etc


class
1. GenericServlet
2. ServleInput Stream
etc


# Servlet interface
it provide common behavior to all the servlet
it define method that all servlet must implement

servlet interface need to be implemented for creating any servlet (either directly or indirectly)
it provides 3 life cycle method that are used to initialize the servlet to service the request and to destroy and
there are 2 non life cycle methods

lifecycle methods
-----------------
1. init()
2. service()
3. destroy()

nonlifecycle methods
--------------------
4. getServletConfig()
5. getServletInfo()


1. init()
void init(servletConfig)
----------------------
this will initialize the servlet
it is life cycle method of servlet and invoked by the web container ONLY ONCE

2. Service()
void service(ServletREquest, ServletResponse)
---------------------------------------------
provides response for the incoming request,
it is invoked at each request by the web conmtainer

3. destroy()
void destroy()
-------------
is invoked only once and indicate that servlet is being destroyed


4. getServletConfig()
ServletConfig getServletConfig()
--------------------------------
this will return the object of servletConfig which contain all information about the servlet

5. getServletInfo()
String getServletInfo()
---------------------
this will return information avout the servlet such as write, version etc


# Install the apache tomcat


# crteate our first servlet project


























