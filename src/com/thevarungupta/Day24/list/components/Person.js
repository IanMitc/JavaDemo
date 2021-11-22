import React from 'react';

const Person =() => {

    const names = ['Mark', 'Paul', 'Watson', 'John'];

    return(
        <div>
            <h1>List of Name</h1>
            <ul>
                {/* <li>{ names[0] }</li>
                <li>{ names[1] }</li>
                <li>{ names[2] }</li> */}
                {
                    names.map(item => <li>{ item} </li>)
                }
            </ul>
        </div>
    )
}
export default Person;