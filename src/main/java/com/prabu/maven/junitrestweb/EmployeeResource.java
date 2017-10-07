package com.prabu.maven.junitrestweb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employee")

public class EmployeeResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{empId}")
    public EmpClass getEmployee(@PathParam("id") final int empId) {
        final EmpClass emp = new EmpClass();
        emp.setEmpId(empId);
        emp.setName("Prabu");
        emp.setDesignation("System Analyst");
        emp.setSalary(50000);
        emp.setDepartment("DB");

        return emp;
    }
}
