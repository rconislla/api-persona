package taller.ninja.demodocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("health")
public class StatusController {

	@GetMapping
	public ResponseEntity<?> verificarToken(){
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
}
