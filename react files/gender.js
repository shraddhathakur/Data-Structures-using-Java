import React from "react";
import logo from "./logo.svg";
import "./App.css";
// import Box from "./Box.js";
import Comment from './Comment';
import { Component } from "react";
class App extends Component {
  constructor() {
    super();
    this.state = {
      name: 'gender'
    };
  }
  setName=(event) => {
    console.log(this.state.name)
    this.setState({
      name: event.target.value
    })
  }
  checkGender=async() =>{
    console.log(this.state.name)
    const response=await fetch(`https://api.genderize.io/?name=${this.state.name}`);
    console.log(response);
    const myJson=await response.json();
    console.log(myJson);
    this.setState({
      gender: myJson.gender
    })
  }

  render() {
    return (
      <div>
      <h1>
        gender Api with fetch in React</h1>
        <input onChange={this.setName} value={this.state.name}/>
        <button onClick={this.checkGender}>what is the gender</button>
        <h1>{this.state.gender}</h1>
      </div>

    );
  }

}

export default App
