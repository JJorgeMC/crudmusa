package com.impetum.crudmusica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impetum.crudmusica.entity.Musica;
import com.impetum.crudmusica.service.MusicaService;

@RestController
@RequestMapping("/musica")
public class MusicaController {
	
	@Autowired
	private MusicaService service;
	
	@PostMapping("/add")
	public int create(@RequestBody Musica e) {
		return service.create(e);
	}
	
	@PutMapping("/{id}")
	public int update(@PathVariable int id, @RequestBody Musica e) {
		return service.update(e);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return service.delete(id);
	}
	
	@GetMapping("/{id}")
	public Musica read(@PathVariable int id) {
		return service.read(id);
	}
	
	@GetMapping("/read")
	public List<Musica> readAll(){
		return service.readAll();
	}
}
