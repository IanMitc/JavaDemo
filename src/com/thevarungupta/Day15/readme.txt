# JSON

- JSON stands for JavaScript Object Notation
- JSON is a format used for storing and transporting data
- JSON is easy to understand and self describing
- it is language independent
- it can be use to send data between component
- it can be use to send data from client and server and from server to client
- it is light weight

xml / json

Client--------> server

{} - JSON object - single object - it consist of keys and value
[] - JSON array - multiple object - it consist of multiple JSON object


json object
{
  "key": "value",
  "key": "value"
}

key - string
value - integer, string, boolean, decimal, date, object

employee json object
{
 "id": 1,
 "name": "mark",
 "status": true,
 "date": 2021-12-12,
 "salary": 5500.50
}

JSON Array
[
 {
 "id": 1,
 "name": "mark",
 "status": true,
 "date": 2021-12-12,
 "salary": 5500.50
},
{
 "id": 1,
 "name": "mark",
 "status": true,
 "date": 2021-12-12,
 "salary": 5500.50
},
{
 "roll": 1,
 "name": "mark",
 "status": true,
 "date": 2021-12-12,
 "salary": 5500.50
}
]


# why we use JSON?
- The JSON form is syntatically similar to the javascript code
- javascript program can easily convert JSON data into JavaScript object and vice versa

- JSON data can be easily send between computers by using any programming language
- JavaScript has built in function for converting JSON string into JavaScript object
- JavaScript has built in function for converting an object into a JSON String

JSON.parse() - JSON string -> JavaScript object
JSON.stringigy() - javascript object -> JSON String


# What is Ajax?
AJAX stands for Asynchronous JavaScript and XML
IT is not a programming language
it is a technology for developing dynamic web sites
it is a technology for developing better, faster and interactive web application using HTML, CSS, JavaScript and XML


HTML
CSS
JavaScript - it is used for making a web application interactive, interesting and user friendly
XML - Extensible Markup Language (XML) is a format to store and transport data from web server


# WHat is Asynchoronous in AJAX?
It means that the web application could send and receieve data from the web server without refreshing the page
this background process of sending and receiving the data from the server along with updating different section
of our web page is define as Asynchronous

# How AJAX Works
Ajax makes use of a browser built in XMLHttpRequest Object to request data from a web server and HTML DOM to display the 
changes ot data

XMLHttpRequest - make a request
HTML DOM - display the changes


XMLHttpRequest: It is an API in the frm of object whose methods help in tansfering of data between a web browser and web 
server

HTML DOM: when a web page is loaded the browser create a document object model of the page


Properties of XMLHttpRequest

readyState is a property of XMLHttpREquest object which holds the status of the XMLHttpRequest

0 - request not initialized
1 - server connection eastablished
2 - request recieved
3 - processing request
4 - request finished and response is ready


200 - ok - success
400 - bad request
500 - server error


# How AJAX Works
1. An event occurs in a web page (it can be any kind of page loaded evenmt or button clicked)
2. XMLHTTPREquest object is created by javascript
3. the XMLHttpRequest object sends a request to web server
4. the server process the request
5. the server send aq response back to the web aplication
6. the response reach by javascrit
7. display the outout or can take a actioj like page update by javascript


# Asynchoronous
> callback - in simple words I will call u back
A callback is a function passed as an argument to another fucntion this technique allows a function to call 
another function after it execute completly

# callback
A call back is a function passed as an argument to another function using a callback, 
you can vall any function with a callback
and that function run the callback after it got finished

# Promises
like in a real life we make some commitment which either get completed or break
either we get the data or not or in other words either resolve or rejected

Promises
- resolved
- fullfilled
- pending
- rejected


myPromise
 .then(response)
  .catch(error)


# Fetch API
No need to use XMLHtpREquest anymore
the fetch API interfac allows web browser to make HTPP request to web server
the fetch API will return promise

what ever we can do with XMLHttpRequest object the fetch API can perform all the task as the 
XMLHttpRequest object code

inn addition the fetch API is much simpler and clearner
it uses promises to deliver more flexible features to make request to server from web browser

the fetch() method is available in global scope that instruct the web browser to a request to a ur;

send a request

fetch()
 .then()
 .catch()

 fetch only require one parameter which is the URL of the resource that you want to handle

























