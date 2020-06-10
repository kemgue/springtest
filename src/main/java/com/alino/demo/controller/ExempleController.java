package com.alino.demo.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExempleController
 * 
 * @author kemgue
 * Pour tester taper dans le navigateur : http://localhost:8080/api/example/hello-world
 *
 */
@RestController
@RequestMapping("/api/example")
public class ExempleController {
	
	@GetMapping("/hello-world")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Bonjour spring boot ok");
	}
}

