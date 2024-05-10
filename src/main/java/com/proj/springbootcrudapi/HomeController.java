//package com.proj.springbootcrudapi;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.proj.springbootcrudapi.model.Employee;
//import com.proj.springbootcrudapi.service.EmployeeService;
//
//@Controller
//@RequestMapping("/")
//public class HomeController
//{
//	@Autowired
//	private EmployeeService employeeService;
//	
//	
//	int choice=0;
//	
//	@GetMapping("/employee")
//	public String home()
//	{
//		System.out.println("In homepage");
//		return "home.jsp";
//	}
//	
//	@GetMapping("/employee?choice=1")
//	public String showInsertPg() {
//		System.out.println("In insert");
//		return "insert.jsp";
//	}
//	
//	@PostMapping("/continueInsert")
//	public String save(@RequestBody Employee employeeObj){
//		
//		employeeService.save(employeeObj);
//		return "continue.jsp";
//		
//	}
//}