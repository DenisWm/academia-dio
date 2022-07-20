package me.dio.academia.academia.digital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.academia.digital.domain.Aluno;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long alunoId;
}
