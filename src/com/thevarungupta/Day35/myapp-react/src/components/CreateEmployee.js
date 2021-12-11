import React, { useState, useEffect } from "react";
import axios from "axios";

const CreateEmployee = () => {
  const [employee, setEmployee] = useState({ name: "", email: "" });

  const onChangeHandler = (e) => {
    setEmployee({
        ...employee,
        [e.target.name]: e.target.value
    })
  }

  const onSubmitHandler =(e) => {
        e.preventDefault();
        axios.post('http://localhost:9001/employees', employee)
        .then(response => {
            console.log(response.data)
        })
        .catch(error => {
            console.error(error);
        })
  }

  return (
    <div className="container">
      <h1>Add Employee</h1>
      <h1>{ employee.name }, {employee.email}</h1>
      <form onSubmit={onSubmitHandler}>
        <div className="form-group">
          <label htmlFor="">Name</label>
          <input
            type="text"
            name="name"
            value={employee.name}
            onChange={onChangeHandler}
            className="form-control"
            placeholder="Enter Name"
          />
        </div>

        <div className="form-group">
          <label htmlFor="">Email</label>
          <input
            type="text"
            name="email"
            value={employee.email}
            onChange={onChangeHandler}
            className="form-control"
            placeholder="Enter Name"
          />
        </div>

        <input type="submit" value="Save" className="btn btn-primary" />
      </form>
    </div>
  );
};
export default CreateEmployee;