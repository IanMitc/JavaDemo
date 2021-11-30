import React,{ useState } from 'react';

const CounterOutput = (props) => {
    return(
        <div>
            <h1>Count: { props.data }</h1>
        </div>
    )
}

export default CounterOutput;
