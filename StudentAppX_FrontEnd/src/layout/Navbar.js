
import React from 'react'
import { Link } from 'react-router-dom'

export default function Navbar() {
  return (
   <div>
    <nav className="navbar navbar-expand-lg bg-body-tertiary navbar bg-dark border-bottom border-body data-bs-theme=dark ">
  <div className="container-fluid">
    <a className="navbar-brand" href="#">StudentAppX</a>
    
    <Link className='btn btn-outline-dark' to="/adduser">Add Student

    </Link>
   
  </div>
</nav>
   </div>
  )
}

