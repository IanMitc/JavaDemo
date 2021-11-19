import React from 'react';

const Child  =(props) =>{
    console.log(props.name)
    return(
        <div>
            <h1>Child Component</h1>
            <h2>{ props.name }</h2>
        </div>
    )
}
export default Child;