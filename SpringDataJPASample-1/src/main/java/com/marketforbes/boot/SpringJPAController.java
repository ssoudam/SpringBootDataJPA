package com.marketforbes.boot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value={"/emp"})
public class SpringJPAController {

	@Autowired
	SpringJPAService service;
	
	 @GetMapping(value = "/hi")
	public String sayHi() {
		
		return "Hello!";
	}
	
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		
		List<Employee> emps=service.getAllEmployees();
		
		for(Employee empList: emps) {
			System.out.println(empList.getEmpName());
			
		}
		return emps;
		
	}
	
	
	@GetMapping("/getEmployee/{id}")
	public String getEmployee(@PathVariable int id){
		
		Optional<Employee> emps=service.findById(id);
		
		return emps.get().getEmpName();
		
	}
	
}
