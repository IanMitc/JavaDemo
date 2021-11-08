# JavaScript

JavaScript is the programing language used for build web application

Browser understand only 3 technologies
1. HTML - used for create a web page
2. CSS - use for designig a web page
3. JavaScript - use to add behaviour or logical thing into web page like adding some animation, form validation,
   image slider, model dialogues, overlay etc


# Type of web pages / site
1. static 
2. dynamic

JavaScript earlier consider as a client side scripting language which means the executin will happen on client side
JavaScript code can be executed on server side with the help of node.js

node.js is just runtime enviornment which we can use to exeute the JavaScript code outside the browser

# Where we can write JavaScript code
1. external JavaScript file
create a file and save with .js extension
JavaScript code in the external file can be reuse
and then we have to add external javascript file reference in html page </head> </body>

2. internal JavaScript 
any javascript code which is exclusive for a web page we can either use external or internal
we can write javascript code any where in the entire page

<head>
<script>
 // js code
</script>
</head>
<body>
<script>
 // js code
</script>
</body>


# Java vs JavaScript
1. Java is full fledge programming language which support all OOPs features but javascript consider to be a 
   scripting labguage which support few features of OOPs
2. Java can be use to build console, desktop (notepad) or web application but javascript can be use for web 
   development
3. java require JDK but no such tool are require for javascript


# Javascript can be use to add or remove style
# Javascript can be use to add or remove css class
# Javascript can be use to modify DOM elements

# How to get an output from javascript 
1. innherHTML   - write into an html element
2. document.write() - write directly on html document
3. alert() - write into alert dialogue
4. console.log() - write into browser console


# Variable
// java
int a;
String s;


// javascript
var a;

local variables
global variables

data type
1. primitive type
2. non primitive type / reference type


1. primitive
string
number
boolean
undefined
null

2. non primitive type
Object
Array
RegExp

# Opeartors
javascript operators are symbols that used to perform opeartions on operands
1. arithmetic - + - * / ++ --
2. relational - == === != >= <=
3. logical - && || !
4. assignment - = += -+ *=
5. Special - ?: in new typeof 

# Conditionl statement
if
if-else
switch

# Loops
for
for-each
while

# ECMAScript
ECMAScript stands for European Computer Manufacturers Association Script

It lays out the specification and basic rules of language on which Javascript is based
- ES6 / ECMAScript 2015 was the second major realease for javascript
- Also know as JavaScript 6 as it is majorily derived from Netscape javascript
- ECMAScript has laid out a core object oriented language to which objects of any particular domain can be added

# Let
ES6 provides a new way of declaring a variable by using let keyword
except that these variable are blovked-scope

# const
Es6 provide a new way of declaring constant by using const keyword
const keyword can't be reassigned
const keyword are immutable

# Deafult parameters
allow you to initialize named parameters with default values

# Reset parameters
Es6 provides a new kind of parameetrs that has a prefix of three dots
only last parameter can be rest parameter or rest parameter must appear at the end of argument list

# Spread Opeartor
Es6 provides a new opeartor called spread opeartor that consist of three dots(...)
the spread opeartor allows you to spread out elements of an iterable object such as an array, map, set etc
