package br.com.sigafatec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    private Long id;
    
    private String nome;
}
