# Servlet

# How to create a Servlet

1. Create a class and implment Servlet interface now we have to override 5 methods
init()
service()
destroy()
getServletConfig()
getServletInfo()


2. GenericServlet Class
GenericServlet class implements Servlet, ServletConfig and Serlization interface
It provide the implementation of all the methods of these interface except the service method
this class can handle any type of request so it is protocol independent
this is abstract class which has one abstract method which we need to implement
we can create servlet by extending with GenericServlet class also
we dont have to implement each and every method of the servlet interface
we just have to implement only one method ie service 

3. HttpServlet class
The HttpServlet class extend s from the GenricServlet class and implements Serilizable interface
it provides http specific method such as
- doGet()
- doPost()
- doPut()

void doGet(HttpServletRequet, HttpServletResponse)










