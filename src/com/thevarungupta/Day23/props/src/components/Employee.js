import React from 'react';

const Employee = (props) => {
    return <div>
        <h1>Id: {props.id}, Name: {props.name}, email: {props.email}</h1>
    </div>
}
export default Employee;