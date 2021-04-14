package com.example.stock.ws;

import java.util.List;

import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.stock.bean.Amitie;
import com.example.stock.service.AmitieService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.transaction.Transactional;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("projet-mini-facebook/amitie")
@Api("Cette classe gère l'amitie")
public class AmitieRest {

	@Autowired
	private AmitieService amitieService;


	@Transactional
	@DeleteMapping("/deletebyid/id/{id}")
	public int deleteById(@PathVariable Long id) {
		return amitieService.deleteById(id);
	}

	@PostMapping("/amitie")
	public int save(@RequestBody Amitie amitie) {
		return amitieService.save(amitie);
	}


	@GetMapping("/amitie")
	public List<Amitie> findAll() {
		return amitieService.findAll();
	}
	@GetMapping("/trouverParDateValidation/date/{date}")
	public List<Amitie> findByDateValidation(@PathVariable String date) {
		return amitieService.findByDateValidation(date);
	}
}