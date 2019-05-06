package com.dove;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Controller")
public class ControllerEx {
	@RequestMapping
	public String method1() {
		return "Method 1";
	}

	@RequestMapping("/{dove_value}")
	public String method2(@PathVariable("dove_value") Integer age) {
		System.out.println("Dove age is : "+age);
		return "Method 2";
	}
	
	@RequestMapping("/method3")
	public String method3(@RequestParam("value1") Integer age) {
		System.out.println("Dove age is : "+age);
		return "Method 3";
	}
	
	@RequestMapping("/method4")
	public String method3(@RequestParam("value1") Integer age,@RequestParam("value2") String name ) {
		System.out.println("Dove age is : "+age);
		return "Method 4";
	}
}
