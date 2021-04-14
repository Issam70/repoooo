package com.example.stock.ws;

import com.example.stock.bean.Ville;
import com.example.stock.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("projet-mini-facebook/ville")
public class VilleRest {
    @Autowired
    VilleService villeService;
    @GetMapping("/")
    public List<Ville> findAll() {
        return villeService.findAll();
    }

    @GetMapping("/code/{code}")
    public Ville findByCode(@PathVariable String code) {
    	return villeService.findByCode(code);
    }

    public void update(@RequestBody Ville ville) {
    	villeService.update(ville);
    }

	@PostMapping("/")
    public int save(@RequestBody Ville ville) {
        return villeService.save(ville);
    }
}
