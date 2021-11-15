# Servet

implement Servlet interface
init()
service()
destroy()
getServletConfig()
getServletInfo()


How to create a Servlet
- Servlet interface
- extends GenericServlet class
- extneds HttpServlet class


# Session Tracking 
> session simply means a particular interval of time
> session tracking is a way to maintain state (data) of a user.
> it is also known as session management in servlet

> Http protocol is a stateless so we need to maintain state using session tracking technique
> each time used request to the server, server treat tha request as the new request
> so we need to maintain the state of an user to recoganize to particular user

# Why use session tracking?
to recognize the user 

# Session tracking technique 
1. cookies
2. hidden form field
3. url rewritting
4. httpSession


# Cookies in servlet
A cookies is a small piece of information that is persisted between the multiple request
A cookie has a name, single value and optional attributes such as path and domain, maximum age and version number


# How cookies work?

- by default each request is considered as a new request
- cookies is a technique where we can add response from the server in cookie
- so cookie is stored in the cache of the browser
- after that if request is send by the user
- cookie is added with the request by default
- this way we recognized the user as the old user

# Type of cookies
1. non persistent cookie - valid for a single session only and will remove once session or browser is close
2. persistent cookie - valid for multiple session not remove when we close the browser only remove when we logout

# Advatnages of cookies
1. simplest technique of maintaining the state
2. cookies are maintaint at client side

# Disadvantage of cookies
1. it will not work if cookies is disables from the brower
2. only textual information can be set in cookies


# Methods
addCookie()
getCookies()


# RequestDispatcher in servlet
- It is an interafce which provides the facility of dispatching the request to another resources it may by html, jsp or servlet
- this interface can also be used to inclide the content of another resouces
- in simple way it is kind of collaboration between the servlet

# Methods of RequestDispatcher interface
there are two methods
1. forword() - forward a request from servlet to anoter resources (html, jsp, servelt) on the server
2. include() - include the content of a resource in the response


# Execise:
We will take the input forom the user and send the information to the validate servlet which will check the information and if
information is correct forward the request to welcome servlet else display the error message


Solution
1. index.html  -take the input from the user
2. loginServlet  -servlet responsable to check and forward the request accordingly
3. welcomeServlet - display welcome message
4. web.config - config


# Exercise 2: Login app with cookies
we will use cookies to maintain user status after login

Solution:
1. index.html
2. loginServlet
3. logoutServlet
4. ProfileServlet
5. web.xml


# SendRedirect in servlet
The sendRedirect() mehod of HttpServletResponse interface can be used to redirect response to another resource

it will accept relative as well as absoulte URL

it work at client side beacise it use URL bar of the prowser to make another request

# forward() vs sendRedirect() method

forward()
- it work at a server side
- it can work within server only
- it send the same request and response object to anoter servlet

sendRedirect()
- work at client side
- it can be used within and outside the server
- it always send a new request



# state management
1. cookies
2. hidden field
3. url rewriting
4. httpSession

















 







