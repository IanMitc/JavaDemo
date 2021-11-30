import React,{ useState}  from 'react';

import Child from "./Child";

const Parent  =() => {

    const [message, setMessage] = useState('default message')

    function onClickHandler(){
        setMessage('update message')
    }

    return(
        <div>
            <h1>Parent Component</h1>
            <h2>{ message }</h2>          
            <Child handler={ onClickHandler }  data="hi from parent" />
        </div>
    )
}
export default Parent;