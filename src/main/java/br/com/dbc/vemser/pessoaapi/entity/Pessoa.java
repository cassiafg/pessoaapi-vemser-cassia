package br.com.dbc.vemser.pessoaapi.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pessoa {

    private Integer idPessoa;

    private String nome;

    private LocalDate dataNascimento;

    private String cpf;

    private String email;
}