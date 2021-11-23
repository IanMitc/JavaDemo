import React, { useState } from 'react';

const DemoOne = () => {
    const [name, setName]=useState('');

    function onChangeHandler(event){
        console.log(event.target.value)
        setName(event.target.value)
    }

    return(
        <div>
            <h1>Name: {name}</h1>
            <input type="text" value={ name } onChange={ onChangeHandler } />
            <button>Submit</button>
        </div>
    )
}
export default DemoOne