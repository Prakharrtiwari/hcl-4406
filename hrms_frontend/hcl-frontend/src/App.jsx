
import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Home from './component/Home'
import Login from './component/Login'
import Registeration from './component/Registeration'
import Dashboard from './component/Dashboard'


function App() {

  return (

    <>
      <div>
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/login" element={<Login />} />
            <Route path="/registeration" element={<Registeration />} />
            <Route path="/dashboard" element={<Dashboard />} />
          </Routes>
        </BrowserRouter>


      </div>
    </>
  )
}

export default App
