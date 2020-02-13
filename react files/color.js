import React from "react";
import logo from "./logo.svg";
import "./App.css";
// import Box from "./Box.js";
import Comment from './Comment';
import { Component } from "react";
class App extends Component {
  constructor(props) {
    super();
    this.state=
    {
      name: "React",
      fontSize: 36,
      fontColor: "red"
    };
  }

  changeColor = (value) =>
  {
    this.setState({
      fontColor:value
    })
  }
  increaseFont = () =>
  {
    this.setState({
      fontSize: this.state.fontSize+1
    })
  }
   decreaseFont = () =>
  {
    this.setState({
      fontSize: this.state.fontSize-1
    })
  }
  render() {
    return (
      <div>
     <p style={{color: `${this.state.fontColor}`,fontSize:`${this.state.fontSize}px`}}>
            Start editing to see magic happen :)
     </p> 
     <button onClick = {()=> this.changeColor('red')}>Red</button>
     <button onClick = {()=> this.changeColor('blue')}>Blue</button>
     <button onClick = {()=> this.changeColor('Yellow')}>Yellow</button>
     <button onClick = {()=> this.changeColor('Green')}>Green</button>
       
     <button onClick = {this.increaseFont}>Size++</button>
     <button onClick = {this.decreaseFont}>Size--</button> 
    
       
      
      </div>
      
    );
  }
}
export default App


