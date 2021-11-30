import React,{ useState } from 'react';
import CounterButton from './CounterButton';
import CounterOutput from './CounterOutput';

const Counter = () => {

    return(
        <div className="container text-center">
            <CounterOutput />
            <CounterButton  />
        </div>
    )
}

export default Counter;
