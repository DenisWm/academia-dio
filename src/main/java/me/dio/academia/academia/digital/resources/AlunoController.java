package me.dio.academia.academia.digital.resources;

import me.dio.academia.academia.digital.domain.Aluno;
import me.dio.academia.academia.digital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        aluno.setId(null);
        return service.save(aluno);
    }
}
