import React from 'react';

function clickHandler(){
    console.log('clicked')
}

const FunctionEvent = () => {


    return (
        <button onClick={clickHandler} >Click</button>
    )
}

export default FunctionEvent;