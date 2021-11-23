import React, { useState } from "react";

const DemoTwo = () => {
  const [firstNumber, setFirstNumber] = useState();
  const [secondNumber, setSecondNumber] = useState();
  const [result, setResult] = useState();

  function onFirstChangeHandler(event) {
      setFirstNumber(event.target.value)
  }

  function onSecondChangeHandler(event) {
      setSecondNumber(event.target.value)
  }

  function onClickHandler() {
     let sum = Number(firstNumber) + Number(secondNumber);
     setResult(sum)
  }

  return (
    <div>
      <h1>Calculator</h1>
      <input type="text" value={firstNumber} onChange={onFirstChangeHandler} />
      <input
        type="text"
        value={secondNumber}
        onChange={onSecondChangeHandler}
      />
      <h1>{firstNumber} + {secondNumber} = {result}</h1>
      <button onClick={onClickHandler}>Add Number</button>
      <h1>Result: {result} </h1>
    </div>
  );
};

export default DemoTwo;
