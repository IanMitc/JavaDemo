import React,{ useState } from 'react';
import CounterButton from './CounterButton';
import CounterOutput from './CounterOutput';

const Counter = () => {

    let [count, setCount] = useState(0)

    function increment(){
      
        setCount(count+ 1)
    }

    function decrement(){
        setCount( count - 1)
    }

    return(
        <div className="container text-center">
            <CounterOutput data={ count }/>
            <CounterButton incrementHandle={ increment }  decrementHandler={decrement} />
        </div>
    )
}

export default Counter;
