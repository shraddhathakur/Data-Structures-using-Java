import React from "react";
import logo from "./logo.svg";
import "./App.css";

// import Box from "./Box.js";
import { Component } from "react";
class Comment extends Component {
  constructor(props) {
    super();
    this.state=
    {
      comment: " ",
      listOfComment: [],
      buttonValue: "Like"
    };
  }
  handleChangeOfComment = event =>
      {
        console.log(this.state.comment);
        this.setState(
        {
          comment: event.target.value
        });

      };
  addComment =() =>
  {
    this.setState({
      listOfComment: [...this.state.listOfComment,this.state.comment],
      comment:""
    })
    console.log(this.state.listOfComment);
    
  }
  l
likeMe = () =>
{
  if(this.state.buttonValue == "Like")
  {
    this.setState({ buttonValue: "Liked"})
  }
  else
    { this.setState({buttonValue: "Like"}) }
}

  render() {
    return (
      <div>
        <h1>Enter your comment</h1>
        
        {
          this.state.buttonValue != "Like" ? (<p>Post is Liked</p>) : (<p>Post is not Liked</p>)
        }
        <input
        type="text" 
        onChange=
        {
          event => this.handleChangeOfComment(event)
        }
        value=
        {
          this.state.comment
        }
        placeholder="Enter comment...."
      />

      <button onClick=
      { this.addComment}> Comment </button>


      <button onClick=
      { this.likeMe}> {this.state.buttonValue} </button>
      
      {
          this.state.listOfComment.map(eachElm => (
          <p style={{border: '2px solid dimgrey',padding: '5px'}}>{eachElm}</p>
          ))
      }
      
      </div>
      
    );
  }
}
export default Comment


