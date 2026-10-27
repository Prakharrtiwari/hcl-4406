import React, { useState } from 'react'

function Registration() {
  const [empid, setEmpid] = useState();
  const [name, setName] = useState();
  const [email, setEmail] = useState();
  const [designation, setDesignation] = useState();
  const [techstack, setTechstack] = useState();
  const [password, setPassword] = useState();

  async function sendData(e) {
    try {
      e.preventDefault();
      const server = await fetch("http://localhost:8080/v1/user/addemp", {
        method: "POST",
        // Agar backend model mein emp_id, emp_name, stack hai:
        body: JSON.stringify({
          emp_id: empid,
          emp_name: name,
          email: email,
          designation: designation,
          stack: techstack,
          password: password
        }),

        headers: {
          "Content-Type": "application/json"
        }

      });
      const status = await server.text();
      alert(status);

    } catch (e) {
      console.log(e);
    }

  }

  return (
    <div>
      <form onSubmit={sendData}>
        <div class="form-group">
          <label for="exampleInputEmail1">Empid</label>
          <input type="number" onChange={e => setEmpid(e.target.value)} class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter emp_id" required />

        </div>

        <div class="form-group">
          <label for="exampleInputEmail1">Name</label>
          <input type="text" onChange={e => setName(e.target.value)} class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter name" required />

        </div>

        <div class="form-group">
          <label for="exampleInputEmail1">Email address</label>
          <input type="text" onChange={e => setEmail(e.target.value)} class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email address" required />

          <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>

        <div class="form-group">
          <label for="exampleInputEmail1">Designations</label>
          <input type="text" onChange={e => setDesignation(e.target.value)} class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Designation" required />

        </div>

        <div class="form-group">
          <label for="exampleInputEmail1">Tech stack</label>
          <input type="text" onChange={e => setTechstack(e.target.value)} class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter tech stack" required />

        </div>

        <div class="form-group">
          <label for="exampleInputPassword1">Password</label>
          <input type="password" onChange={e => setPassword(e.target.value)} class="form-control" id="exampleInputPassword1" placeholder="Password" required />
        </div>

        <div class="form-group form-check">
          <input type="checkbox" class="form-check-input" id="exampleCheck1" />
          <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <button type="submit" class="btn btn-primary">Register</button>
      </form>
    </div>
  )
}

export default Registration