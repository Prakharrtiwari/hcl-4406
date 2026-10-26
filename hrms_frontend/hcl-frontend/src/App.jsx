import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import SampleCode from './component/SampleCode'
import { UseFetchApi } from './component/UseFetchApi'

function App() {
  // const employee = [{
  //   empid: "76356747",
  //   ename: "Deepak"
  // }, {
  //   empid: "76357888",
  //   ename: "Aashish"
  // },
  // {
  //   empid: "78999947",
  //   ename: "Ravi"
  // }
  //]

  return (

    <>
      <h2>Welcome to HCL HRMS Application</h2>
      <div>
        {


          /* <SampleCode empdata={employee[2]} /> */
          // employee.map(emp => (

          //   <h2>
          //     <SampleCode empdata={emp} />
          //   </h2>
          // ))





          <UseFetchApi />
        }
      </div>
    </>
  )
}

export default App
