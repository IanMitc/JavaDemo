import React, { useState}  from 'react';
import './register.css'

const Register = () => {

    const [user, setUser] = useState({
        username: '',
        email: '',
        password: ''
    })

    function onChangeHandler(event){
        //console.log(event.target.name)
        setUser({...user,
            [event.target.name]: event.target.value
        })
    }

    return(<div className>
        <div className="row">
            <div className="col-lg-3"></div>
            <div className="col-lg-6">
                <div className="wrapper">
                <form>
                    <div className="form-group">
                        <label htmlFor="">Username</label>
                        <input type="text" className="form-control" name="username" value={user.username} onChange={onChangeHandler} />
                    </div>
                    <div className="form-group">
                        <label htmlFor="">Email</label>
                        <input type="text" className="form-control" name="email" value={user.email} onChange={onChangeHandler} />
                    </div>
                    <div className="form-group">
                        <label htmlFor="">Password</label>
                        <input type="text" className="form-control" name="password" value={user.password} onChange={onChangeHandler} />
                    </div>
                    <input type="submit" value="Register" className="btn btn-primary btn-block" />
                </form>
                </div>
                <h1>{ user.username }, {user.email}, {user.password}</h1>
            </div>
            <div className="col-lg-"></div>
        </div>

    </div>)
}
export default Register;
