# URL Rewitting
In URL rewrting we append a token or identifier to the url of the next servlet or the next resource
we can send parameter name/value pair using special syntex

http://www.abc.com?id=1&name=a&mobie=999

id=1
name=a

this is the data which we want to pass to our servlet
& is use to add multiple parameters
= is use to assign a value

Advantages
1. it will always work wheather cookies is disable or not
2. extra form submission is not required

Disadvantage
1. it will work only with links
2. it can send only textual information
3. data will be visible in the browser



# HttpSession interface
in this case container create a session id for each user
the container uses this id to identity the particular user
an object of HttpSession can be used to perform task

1. bind object
2. view and manipulate information about a session such as session id, creation time etc

HttpServletRequest interface provides two method to get the object of httpSession
1. getSession() - return the current session associated with the request or if request does not have a session it will create one
2. getSession(boolean create)

common methods of HttpSessionInterface
getId() - return string containing unique identifier
getCreationTime() - return the time when the session was created
getLastAccessedTime() - return last time the client send a request
invalidate() - invalidate this session then unbind anu object


# Exercise 3: Login app with HttpSession
we will use the httpSession to maintain iser statis after login

solution
1. index.html
2. loginServlet
3. logoutServlet
4. ProfileServlet
5. web.xml















