package me.dio.academia.academia.digital.repositories;

import me.dio.academia.academia.digital.domain.AvaliacaoFisica;
import me.dio.academia.academia.digital.domain.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {


}
