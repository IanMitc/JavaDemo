import React, { useState } from "react";
import "./register.css";

const Register = () => {
  const [user, setUser] = useState({
    username: '',
    email: '',
    password: '',
    country: '',
    gender: '',
    subscribe: true
  });

  const [errorMessage, setErrorMessage] = useState({
    userNameError: '',
    emailError: ''
  })

  const countries = ['USA', 'UK', 'China', 'Japan'];

  function onChangeHandler(event) {
    //console.log(event.target.name)
    setUser({ ...user, [event.target.name]: event.target.value });
  }

  function onSubmitHandler(e){
    e.preventDefault()
    if(validate()){
      console.log(user)
    }else{
      console.log('error')
    }
    
  }

  function validate(){
    if(user.username.length <= 0 ){
      setErrorMessage({
        ...errorMessage,
        userNameError: 'Name is required'
      })
      return false;
    }else{
      setErrorMessage({
        ...errorMessage,
        userNameError: ''
      })
      return true;
    }
      return true
  }

  return (
    <div className>
      <div className="row">
        <div className="col-lg-3"></div>
        <div className="col-lg-6">
          <div className="wrapper">
            <form onSubmit={ onSubmitHandler }>
              <div className="form-group">
                <label htmlFor="">Username</label>
                <input
                  type="text"
                  className="form-control"
                  name="username"
                  value={user.username}
                  onChange={onChangeHandler}
                />
                <small className="text-danger">{ errorMessage.userNameError }</small>
              </div>
              <div className="form-group">
                <label htmlFor="">Email</label>
                <input
                  type="text"
                  className="form-control"
                  name="email"
                  value={user.email}
                  onChange={onChangeHandler}
                />
              </div>
              <div className="form-group">
                <label htmlFor="">Password</label>
                <input
                  type="password"
                  className="form-control"
                  name="password"
                  value={user.password}
                  onChange={onChangeHandler}
                />
              </div>

              <div className="form-group">
                <label htmlFor="">Country</label>
                <select  className="form-control" name="country" onChange={onChangeHandler}>
                  {
                    countries.map(country => <option value={country} >{ country }</option>)
                  }
                </select>
              </div>

              <div className="form-group">
                <label htmlFor="">Gender</label>
                <div className="form-check">
                  <input type="radio" name="gender" onChange={onChangeHandler} className="form-check-input" value="male" />
                  <label htmlFor="" className="form-check-label">Male</label>
                </div>
                <div className="form-check">
                  <input type="radio" name="gender" onChange={onChangeHandler}  className="form-check-input" value="female" />
                  <label htmlFor="" className="form-check-label">Female</label>
                </div>
              </div>

              <div className="form-group">
                <div className="form-check">
                  <input type="checkbox" name="subscribe" onChange={onChangeHandler} className="form-check-input"  />
                  <label htmlFor="" className="form-check-label">Subscribe</label>
                </div>
              </div>

              <input
                type="submit"
                value="Register"
                className="btn btn-primary btn-block"
              />
            </form>
          </div>
          <h1>
            {user.username}, {user.email}, {user.password}
          </h1>
        </div>
        <div className="col-lg-"></div>
      </div>
    </div>
  );
};
export default Register;
