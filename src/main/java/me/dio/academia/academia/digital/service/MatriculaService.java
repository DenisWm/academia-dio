package me.dio.academia.academia.digital.service;

import me.dio.academia.academia.digital.domain.Aluno;
import me.dio.academia.academia.digital.domain.Matricula;
import me.dio.academia.academia.digital.dto.MatriculaDTO;
import me.dio.academia.academia.digital.repositories.AlunoRepository;
import me.dio.academia.academia.digital.repositories.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository repo;

    @Autowired
    private AlunoRepository alunoRepository;

    public Matricula criarMatricula(MatriculaDTO matriculaDto){
        Aluno aluno = alunoRepository.findById(matriculaDto.getAlunoId()).get();
        Matricula matricula = new Matricula();
        matricula.setId(null);
        matricula.setAluno(aluno);

        return repo.save(matricula);

    }

    public List<Matricula> findAll(){
        return repo.findAll();
    }
}
