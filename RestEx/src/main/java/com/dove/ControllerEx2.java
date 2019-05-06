package com.dove;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Controller2")
public class ControllerEx2 {
	@RequestMapping
	public String method1() {
		return "Method 1";
	}

	@RequestMapping("/{dove_value}")
	public ResponseEntity<Employee> method2(@PathVariable("dove_value") Integer age) {
		Employee emp = new Employee();
		emp.setAge(age);
		emp.setName("SivaSri");
		return new ResponseEntity<Employee>(emp, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(value="/findAll",produces = {"application/json"})
	public List<Employee> allEmpl() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setAge(23);
		emp1.setName("SivaSri a");
		Employee emp2 = new Employee();
		emp2.setAge(25);
		emp2.setName("SivaSri k");
		list.add(emp2);
		list.add(emp1);
		return list;
	}

}
