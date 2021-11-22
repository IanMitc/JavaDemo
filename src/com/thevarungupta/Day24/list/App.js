import Customer from "./components/Customer";
import Employee from "./components/Employee";
import Person from "./components/Person";
import Students from "./components/Students";
import User from "./components/User";

function App() {
  return (
    <div className="container">
     <h1>App Component</h1>
     <User name="Paul" />
     {/* <Employee /> */}
     {/* <Customer />
     <Person /> */}
     <Students />
    </div>
  );
}

export default App;
