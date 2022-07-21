package me.dio.academia.digital.service;

import me.dio.academia.digital.domain.Aluno;
import me.dio.academia.digital.domain.AvaliacaoFisica;
import me.dio.academia.digital.dto.AlunoDTO;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public List<Aluno> findBydataDeNascimento(String dataDeNascimento) {
        if(dataDeNascimento == null){
            throw new RuntimeException("Insira uma data de nascimento válida");
        }
        LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
        return repo.findByDataDeNascimento(localDate);
    }
}
