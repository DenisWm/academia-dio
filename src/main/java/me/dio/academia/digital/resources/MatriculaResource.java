package me.dio.academia.digital.resources;

import me.dio.academia.digital.domain.Matricula;
import me.dio.academia.digital.dto.MatriculaDTO;
import me.dio.academia.digital.service.MatriculaService;
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

    @GetMapping(value = "/bairro/aluno")
    public List<Matricula> findByBairroEAluno(@RequestParam(value = "bairro", required = false) String bairro){
        return service.findByBairroEAluno(bairro);

    }

    @PostMapping
    public Matricula criarMatricula(@RequestBody MatriculaDTO matriculaDto){
        return service.criarMatricula(matriculaDto);
    }


}
