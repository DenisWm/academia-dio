package me.dio.academia.academia.digital.resources;

import me.dio.academia.academia.digital.domain.Matricula;
import me.dio.academia.academia.digital.dto.MatriculaDTO;
import me.dio.academia.academia.digital.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaResource {

    @Autowired
    MatriculaService service;

    @GetMapping
    public List<Matricula> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Matricula criarMatricula(@RequestBody MatriculaDTO matriculaDto){
        return service.criarMatricula(matriculaDto);
    }
}
