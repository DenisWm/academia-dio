package me.dio.academia.academia.digital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long alunoId;

    private double peso;

    private double altura;

}
