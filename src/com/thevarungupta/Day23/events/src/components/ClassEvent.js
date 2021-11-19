import React, { Component } from 'react';

class ClassEvent extends Component{

    constructor(){
        super()
        this.state = {
            name:'Guest'
        }
        // this.onClickHandler = this.onClickHandler.bind(this)
    }

    // onClickHandler(){
    //     console.log(this)   
    //     // this.setState({
    //     //     name: 'Mark'
    //     // })
    // }

    onClickHandler = () => {
        console.log(this)   
        this.setState({
            name: 'Mark'
        })
    }


    render(){
        return (
        <div>
            <h1>{ this.state.name }</h1>
            {/* first way */}
            {/* <button onClick={ this.onClickHandler.bind(this) }>Button</button> */}
            {/* // second */}
            {/* <button onClick={ this.onClickHandler } >Button</button> */}
            {/* // third */}
            {/* <button onClick={ () => this.onClickHandler() } >Button</button> */}
            {/* // forth */}
            <button onClick={ this.onClickHandler } >Button</button>
        </div>)
    }
}
export default ClassEvent;