# Html

Hyper text markup language, which is mostly used language for web page development

# Browser only understrand 3 main technologies
1. HTML - provide structure and content to a web page
2. CSS - styling web page
3. JavaScript - used to add business login or adding behaviour to a web page

# HTML is all about html tags or element

<> - opening tag
</> = closing tag

for example
<h1></h1> - opening and closing tags
<br /> - self closing / empty tags


# Simple HTML Page / Document
<!DOCTYPE html>
<html>
 <head>
	<title></title>
 </head>
 <body>
	<h1></h1>
	<p></p>
</body>
</html>

<!DOCTYPE html> - declaration which define that this document is of html 5
<html> - root element of an html page
<head> - contain meta data or information about the html page
<title> - specifies a title for the HTML page (browser tab)
<body> - contain the document body, which means all visible content such as text, images, table etc
<h1> - define the most important text or large heading
<p> - define the paragraph or content ofd the web page




<tagname></tagname>

HTML is case insencetive

<HTML>
<html> - recomandation
<Html>



# VS Code

open the folder from cmd / gitbash
> code .


# HTML Version
v1 - 1992
v2 - 1995
v3
v4 - 1997
v5 - 2009 - it was one of the most awaited and successfull release

In HTML5 lot of new features amd API was introduced


# HTML Typography
HTML provides various tag which you can use to write content in your web page
<h1> - heading
<p> - paragraph
<span< - inline
<hr> - horizontal rule / line
<br> - break rule / line
<pre> 0 presever formatting

HTML heading
<h1>---<h6>

HTML heading are define with <h1> to <h6> tags
<h1> define the most important heading
<h6> define the least important heading

It automatically format your text into bold and bigger font which is also usefull to understamd visuallu
SEO purpose heading tag is important becasue all web crawler read these tags

HTML paragraph
<p>
HTML paragraph are define with <p> tag
if we want to split out content in paragraph we can use <p> tag
it automatcally add a line break and space

not like any word document you can manage intend by pressing space or tab key
as the browser will remove any extra space and extra line when page is displayed

# <br> = break rule / line
whenever we use <br> tag anythinh following will start from next line
this tag is an example of an empty element where we do not need opening and closing tag
as there is nothing to go in between them


# <hr>
horizontal rule / line
it is use to visually break a section of a document
the <hr> tag create a line from current position in the document to the right margin anmd break the line accordingly
again <hr> is also example of the empty element where we do not need any opening and closing


<pre>
Preserve formatting
some time we want that our text to follow the extra format of how it is written in the html document in
that we can use pre tag

any text between the opening <pre> tag and closing will preserve the formatting of the source
document


# HTML Links
HTML links are define with <a> tag or anchor tag which basically use for navigation purpose
so we can refer to any page inside our root folder or any external url

example:
<a href="">Click Me</a>

# HTML image
HTML images are define with <img> tag
this is also one of the self closing tag or empty element
img tag has some attributes
- src - source of the image / location
- title - tooltip
- alt - alternative text
- width
- height

<img src="" alt="" title="" />

# Html List
list are used to display the item as a list
there are two type of list 
- unordered list - <ul>
- ordered list  - <ol>

list item - <li>

# HTML Tables
<table> - root element of tanle
<tr> - table row
<td> - table data 
<th> - table head

colspan - to merge column

rowspan - to merge row

# HTML forms
forms are esential for any app to take input from the user
textbox
dropdown
checkbox
radio
button
textarea

# HTML5
> Semantic elements / tags
A semantic elements clearly descrie your HTML document1

Web form 2.0

# Html5 new API
- Geolocation
- Drag and Drop
- Web Storage
- Multimedia
- SVG and Canvas
- web worker


# Geolocation
It is used to locate the user position but since this is the matter of user privacy the position
is not available unless the user approve it

the getCurrentPosition() which is used to return the user position
this return the latitude and longitude of user position

Steps
1. check if geolocation api is supported or not by browser
2. if supported run the getCurrentPosition() method
3. if successfull it returns coordinates
4. display or can use cordinate to find user location


# Web Storage
Web storage can be use to save data at client side
this is consider to be better then cookies
because unlike cookies the storage is far larger at least (5 MB) and the information is store 
before local storage we store the data in cookies
we can have local storage as er domain


Type of web storage
1. local storage - data with no expire data
2. session storage - data for one session (data will lost when browser tab is closed)

// store data
localstorage.setItem(key, value)
localstorage.key = 'value'

// retrive the data
localstorage.getItem(key)
localstorage.key

// remove
localstorage.clear()
localstorage.removeItem(key)

# Multimedia 
in this we can add audio and video into our web page

<audio>
<video>

# Drag and drop

