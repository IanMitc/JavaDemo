# Components

- In React, a component represent a part of user interface
- whatever is visible on the web page is a component. we can put components together to make a bigger component
- components are reusable and make the application more modular

# Type of component
1. functional components
2. class components


# Function component
- functional components are also known as Stateless (data) component 
- they work like a javascript function which accept props as an argument
- they do not have their own state
- they return valid JSX / react element

# Class component
- class component are more complex component and conceptually behave as classes introduce in ES6
- are also know as statefull componments
- manage their own state


# Functional vs Class component
- usually created as statefull, but can be stateless as well
- require render() function to return React element 
- being stateful make use of life cycle method

- always stateless before v16
- do not require use of addtional render() function
- lifecycle method cannot be involved  with use of functional component as they are stateless


# React Props and State

# Props
- React props are like function arguments in javascript and attributes in HTML
- Props are the arguments passed in React components
- props are passes to components view HTML attribute

# State
- React components has built in state object
- the state object is where you store property values that belong to the components
- when the state object changes the components re-render




# State vs Props
Props
- Read only and immutable
- passing data from one component to another as an argument
- props can be accessed by child component
- stateless component can have props


State
- states are mutable
- state contain information regarding the component at given time
- state is managed with in the component
- stateless component cannot have state


# Events
An event is an action that could be triggered by user interaction or can be the result of system generated
event
-click
-mouseove
-change
etc






