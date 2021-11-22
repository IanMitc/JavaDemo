import React, { useState } from "react";
const Customer = () => {
  const [isLoggedIn, setLoggedIn] = useState(false);

    return isLoggedIn && <button className="btn btn-danger">Logout</button>


//   return isLoggedIn ? (
//     <button className="btn btn-danger">Logout</button>
//   ) : (
//     <button className="btn btn-primary">Login</button>
//   );

  // let response;
  // if(isLoggedIn){
  //     response = <button className="btn btn-danger">Logout</button>
  // }else{
  //     response = <button className="btn btn-primary">Login</button>
  // }

  // return <div>
  //     { response }
  // </div>

  // if(isLoggedIn){
  //     return <button className="btn btn-danger">Logout</button>
  // }else{
  //     return <button className="btn btn-primary">Login</button>
  // }

  // return(
  //     <div>
  //         <button className="btn btn-primary">Login</button>
  //         <button className="btn btn-danger">Logout</button>
  //     </div>
  // )
};
export default Customer;
