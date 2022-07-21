package me.dio.academia.digital.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' [precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotBlank(message = "Preencha o campo corretamente.")
    @CPF(message = "'${validatedValue}' é inválido!")
    private String cpf;

    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' [precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    @NotNull(message = "Preencha o campo corretamente.")
    @JsonFormat(pattern="dd/MM/yyyy")
    @Past(message = "Data '${validatedValue}' é inválida")
    private LocalDate dataDeNascimento;
}
