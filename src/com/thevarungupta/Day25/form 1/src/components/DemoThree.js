import React, { useState } from "react";

const DemoThree = () => {
  const [firstNumber, setFirstNumber] = useState();
  const [secondNumber, setSecondNumber] = useState();
  const [result, setResult] = useState();



  function onClickHandler() {
     let sum = Number(firstNumber) + Number(secondNumber);
     setResult(sum)
  }

  return (
    <div>
      <h1>Calculator</h1>
      <input 
        type="text" 
        value={firstNumber} 
        onChange={(event) => setFirstNumber(event.target.value) } />
      <input
        type="text"
        value={secondNumber}
        onChange={(e) => setSecondNumber(e.target.value) }
      />
      <h1>{firstNumber} + {secondNumber} = {result}</h1>
      <button onClick={onClickHandler}>Add Number</button>
      <h1>Result: {result} </h1>
    </div>
  );
};

export default DemoThree;
