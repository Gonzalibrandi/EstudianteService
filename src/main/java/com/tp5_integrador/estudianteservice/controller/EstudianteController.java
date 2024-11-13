package com.tp5_integrador.estudianteservice.controller;


import com.tp5_integrador.estudianteservice.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tp5_integrador.estudianteservice.entity.Estudiante;


import java.util.List;

@RestController
@RequestMapping("/api/clubes_futbol")
public class EstudianteController {
    private final EstudianteService estudianteService;

    @Autowired
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }


    @GetMapping("/{dni}")
    public ResponseEntity<Estudiante> obtenerEstudiantePorDNI(@PathVariable Long dni) {
        Estudiante estudiante = estudianteService.findByDNI(dni);
        return ResponseEntity.ok(estudiante);
    }
}
}
