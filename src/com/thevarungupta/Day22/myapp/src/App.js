import logo from './logo.svg';
import './App.css';
import Navbar from './components/Navbar';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import Main from './components/Main';
import Footer from './components/Footer';


function App() {
  return (
    <div className="container-fluid">
        <Navbar />
        <Header />
        <div className="row"> 
          <div className="col-lg-3">
            <Sidebar />
          </div>
          <div className="col-lg-9">
               <Main />
          </div>
        </div>
        
     
        <Footer />
      
    </div>
  );
}

export default App;
