package me.dio.academia.academia.digital.service;

import me.dio.academia.academia.digital.domain.Aluno;
import me.dio.academia.academia.digital.domain.AvaliacaoFisica;
import me.dio.academia.academia.digital.dto.AlunoDTO;
import me.dio.academia.academia.digital.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repo;

    public List<Aluno> findAll(){
        List<Aluno> list = repo.findAll();
        return list;
    }

    public Aluno save(AlunoDTO alunoDto) {
        Aluno aluno = new Aluno();
        aluno.setId(null);
        aluno.setNome(alunoDto.getNome());
        aluno.setBairro(alunoDto.getBairro());
        aluno.setCpf(alunoDto.getCpf());
        aluno.setDataDeNascimento(alunoDto.getDataDeNascimento());
        return repo.save(aluno);
    }


    public List<AvaliacaoFisica> findAllAvalicoes(Long id) {
        Aluno aluno = repo.findById(id).get();
        return aluno.getAvaliacoes();
    }
}
