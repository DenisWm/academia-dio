package me.dio.academia.academia.digital.repositories;

import me.dio.academia.academia.digital.domain.Aluno;
import me.dio.academia.academia.digital.domain.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {


}
