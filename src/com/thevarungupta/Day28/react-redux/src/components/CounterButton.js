import React,{ useState } from 'react';
import { useDispatch } from 'react-redux';

const CounterButton = (props) => {

    const dispatch = useDispatch();

    const incrementHandler = () => {
        dispatch({type: 'increment'})
    }

    const decrementHander = () => {
        dispatch({type: 'decrement'})
    }

    return(
        <div>
            <button onClick={ incrementHandler } className="btn btn-primary">Increment</button>
            <button onClick={decrementHander}className="btn btn-danger">Decrement</button>
        </div>
    )
}

export default CounterButton;
