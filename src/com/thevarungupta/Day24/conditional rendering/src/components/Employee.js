import React, { useState}  from 'react';

const Employee = () => {
    const [employee, setEmployee] = useState({id:1, name: 'mark', email: 'm@gmail.com'})
    return(
        <div>
            <h1>Employee Id: { employee.id }</h1>
            <h1>Employee Name: { employee.name }</h1>
            <h1>Employee Email: { employee.email }</h1>
        </div>
    )
}
export default Employee;