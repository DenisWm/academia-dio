package me.dio.academia.digital.resources;

import me.dio.academia.digital.domain.Aluno;
import me.dio.academia.digital.domain.AvaliacaoFisica;
import me.dio.academia.digital.dto.AlunoDTO;
import me.dio.academia.digital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public Aluno salvar(@RequestBody @Valid AlunoDTO alunoDto) {
        return service.save(alunoDto);
    }

    @RequestMapping(value = "/data", method=RequestMethod.GET)
    public List<Aluno> findBydataDeNascinemto(@RequestParam(value="dataDeNascimento", required = false) String dataDeNascimento){
        return service.findBydataDeNascimento(dataDeNascimento);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> findAllAvaliacoesId(@PathVariable Long id){
        return service.findAllAvalicoes(id);

    }


}
