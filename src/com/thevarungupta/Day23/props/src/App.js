import './App.css';
import Parent from './components/Parent';
import Hero from './components/Hero';
import Employee from './components/Employee';

function App() {
  return (
    <div className="container">
       
      {/* <Parent /> */}

      {/* <Hero name="Superman"/>
      <Hero name="Batman"/>
      <Hero name="Spiderman"/> */}

      <Employee id="101" name="Mark" email="m@gmail.com" />
      <Employee id="102" name="Paul" email="p@gmail.com" />
      <Employee id="103" name="Watson" email="w@gmail.com" />
      <Employee id="104" name="John" email="j@gmail.com" />
    </div>
  );
}

export default App;
