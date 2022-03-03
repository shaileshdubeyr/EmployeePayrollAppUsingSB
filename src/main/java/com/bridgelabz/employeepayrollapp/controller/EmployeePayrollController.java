package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/getemployee"})
    public ResponseEntity<String> getEmployeepayrollData(){
        System.out.println("kush ");
        return new ResponseEntity<String>("get call success", HttpStatus.OK);
    }

    @GetMapping("/get/{empid}")
    public ResponseEntity<String> getEmployepayrollData(@PathVariable("empid") int empid){

        return new ResponseEntity<String>("get call success for empid "+empid, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("create enmployee payroll data for "+employeePayrollDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("update enmployee payroll data for "+employeePayrollDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empid}")
    public  ResponseEntity<String> DeleteEmployeePayrollData(@PathVariable("empid") int empid){
        return new ResponseEntity<String>("delete enmployee payroll data for "+empid, HttpStatus.OK);
    }

}
