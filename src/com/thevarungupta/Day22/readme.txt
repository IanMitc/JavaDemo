# React.js

# What is React?
- React is a Javascript library created by facebook
- React is used to build front end of the app / UI
- React is a tool for building UI components

# React is not a framework like angular it is just a javascript library used to build user interface


# About React
- JS library for building fast and interactive user interface
- Developed by facebook 2011
- Heart of react application is refered to as component
- The most primary component is conventionally names as App component
- App is the root component which represent the entire application and containing other child components
- Splitting the web application into independent and isolated components
- A component will have state and render method
- React use a virtual DOM element, which is cheaper and easier to create
- react essentially reacts to then state change and updates on Real DOM


# React features
- JSX
- components
- one way data binding
- virtual DOM
- simplicity
- performance


# Why we need React
- DOM is slow in its real form
- React uses virtual DOM, which significantly faster and more effiecient to update
- simple and easy to learn
- Reusability
- Robust re-rendenring with virtual DOM
- Native libraries
- Performace
- Easy testing


# Which one is better
1. Angular
2. React
3. Vuejs


React vs Angular
- react is a javascript library
- react can be used with other programming libraries
- one way data binding
- jsx - javascriptXML
- virtual DOM
- easier to learn
- fast performabce

- angular is a complete framework
- it is a complete solution which provide everything
- two way data binding
- Typescript
- Incremental DOM
- harder
- slower performace



# Installation
1. Nodejs
2. vscode


# create a project in react

> node --version
> npm --version
> npm i create-react-app -g
> create-react-app <project_name>
> cd <project_name>
> code .
> npm start


or

> npx create-react-app <project_name>
> cd <project_name>
> code .
> npm start




# Understand folder structure
- package.json : this is npm configuration file. it include details about your app along with dependencies
- package-lock.json: this is an auto-generated file and get modified whenever npm does an operation to node_module or
                      package.json
- Readme.md - it profice the documentation to read
- node_modules - this folder contain dependencies source code which are required in react app
- public - this folder cintain public assets of the application. it contain index.html where React will mount
		  application root component
- src - it contains the application source code where you mostly create files
.gitignore - this file used by git to ignore file and folder while publisging source copde into remote server


Root component
----------------
App.js
App.css
App.test.js


index.js - main entry point for react app
index.css - global css file


> npm install <package_name>
> npm install <package_name> -g
> npm install <package_name> --save
> npm install <package_name>@latest
> npm install <package_name>@<version>
> npm i <package_name>

> npm i bootstrap@4.6 --save


node_modules / bootstrap / dist / css / bootstrap.min.css


index.js

import '../node_modules/bootstrap/dist/css/bootstrap.min.css'










