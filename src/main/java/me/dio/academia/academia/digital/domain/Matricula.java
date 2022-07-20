package me.dio.academia.academia.digital.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDateTime dataDaMatricula = LocalDateTime.now();

}
