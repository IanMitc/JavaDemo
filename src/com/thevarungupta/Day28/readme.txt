# Redux
- Redux is a javascript based library used for state management

State = Data

- The idea is to maintain the data centrally/ globally which can be accessed by any component irrespective
of the position and order of the component otherwise we have pass the data to each and every component
in the component tree


misconnception:
redux is a not a part f react library it can work with any project which is using javascript


# Redux architecture
it consist of theree main components
- store - A place where an entire state of the application is listed managing the status of the application
- action - a pure object contained within store having the information about the user event, the action is send from the react view to the reducer
- reducer - reducer is a pure function able to read the payload from the action and then execute updating the store


# Step
1. install 
> npm i redux
> npm i react-redux

2. create store/index.js

3. create initialState

4. create reducer

5. create store

6. configure store with react app

7. consume store in react compnent



