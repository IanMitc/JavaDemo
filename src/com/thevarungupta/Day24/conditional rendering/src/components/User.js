import React, { useState } from 'react';

const User = () => {

    const [ name, setName ] = useState('Mark')
    
    function onClickHandler(){
        console.log('clicked')
        setName('Update Mark')
    }
    return(
        <div>
           <h1>Welcome { name }</h1>
           <button onClick={ onClickHandler }>Change</button>
        </div> 
    )
}
export default User;