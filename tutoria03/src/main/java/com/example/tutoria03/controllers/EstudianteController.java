package com.example.tutoria03.controllers;

import java.util.ArrayList;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.tutoria03.models.Estudiante;
import com.example.tutoria03.services.EstudianteService;


@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;
    
    @GetMapping
    public ResponseEntity<ArrayList<Estudiante>> getAll(){
        return ResponseEntity.ok(estudianteService.GetAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getStudentById(@PathVariable("id") int id) {
        return ResponseEntity.ok(estudianteService.GetStudentById(id));
    }

    @PostMapping
    public ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante){
        return ResponseEntity.ok(estudianteService.save(estudiante));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> update(@RequestBody Estudiante estudiante,  @PathVariable int id){
        return ResponseEntity.ok(estudianteService.update(estudiante, id) );
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id ) {
        estudianteService.Delete(id);
    }

}
