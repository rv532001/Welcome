package com.employee.Welcome.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Welcome.Service.myEmpService;

@RestController
public class myEmp {
	
	@Autowired
	private myEmpService myempService;
	
	
    @GetMapping("/home")
    public String getHome() {
    	return myempService.gepage();
    }
	
	

}
