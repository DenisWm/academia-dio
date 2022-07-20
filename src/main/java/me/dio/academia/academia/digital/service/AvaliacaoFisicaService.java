package me.dio.academia.academia.digital.service;

import me.dio.academia.academia.digital.domain.Aluno;
import me.dio.academia.academia.digital.domain.AvaliacaoFisica;
import me.dio.academia.academia.digital.dto.AvaliacaoFisicaDTO;
import me.dio.academia.academia.digital.repositories.AlunoRepository;
import me.dio.academia.academia.digital.repositories.AvaliacaoFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repo;
    @Autowired
    private AlunoRepository alunoRepo;

    public AvaliacaoFisica save(AvaliacaoFisicaDTO avaliacaoFisicaDto) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Optional<Aluno> aluno = alunoRepo.findById(avaliacaoFisicaDto.getAlunoId());
        avaliacaoFisica.setId(null);
        avaliacaoFisica.setAluno(aluno.orElseThrow(() -> new RuntimeException("Aluno não encontrado!")));
        avaliacaoFisica.setAltura(avaliacaoFisicaDto.getAltura());
        avaliacaoFisica.setPeso(avaliacaoFisicaDto.getPeso());
       return repo.save(avaliacaoFisica);
    }
}
