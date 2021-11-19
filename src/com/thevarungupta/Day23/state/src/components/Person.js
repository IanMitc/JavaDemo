import React, { Component } from 'react';

class Person extends Component{

    constructor(){
        super()
        this.state = {
            firstName: 'Mark',
            lastName: 'Smith',
            age: 30,
            country: 'USA'
        }
    }

    onChange = () => {
        //this.state.country = 'China'
        this.setState({
            country: 'China'
        })
        console.log('clicked')
        console.log(this.state.country)
    }

    render(){
        return <div>
            <h1>Person component</h1>
            <h2>Name: { this.state.firstName } { this.state.lastName }</h2>
            <h2>I live in { this.state.country }</h2>
            <button onClick={ this.onChange } >Change</button>
        </div>
    }
}
export default Person;