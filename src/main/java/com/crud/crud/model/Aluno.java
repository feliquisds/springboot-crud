package com.crud.crud.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(unique = true)
    private long Matricula;
    
    private String Nome, Sobrenome;
    
    @Column(unique = true)
    private String CPF;

    private Date DataNascimento;

    private String ContatoResponsavel, Endereco, EmailResponsavel, TipoSanguineo;
    
    @ManyToOne
    private Turma IDTurma;

    public long getID() {
        return ID;
    }
    public void setID(long iD) {
        ID = iD;
    }
    public long getMatricula() {
        return Matricula;
    }
    public void setMatricula(long matricula) {
        Matricula = matricula;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getSobrenome() {
        return Sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public Date getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }
    public String getContatoResponsavel() {
        return ContatoResponsavel;
    }
    public void setContatoResponsavel(String contatoResponsavel) {
        ContatoResponsavel = contatoResponsavel;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public String getEmailResponsavel() {
        return EmailResponsavel;
    }
    public void setEmailResponsavel(String emailResponsavel) {
        EmailResponsavel = emailResponsavel;
    }
    public String getTipoSanguineo() {
        return TipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo) {
        TipoSanguineo = tipoSanguineo;
    }
    public Turma getIDTurma() {
        return IDTurma;
    }
    public void setIDTurma(Turma iDTurma) {
        IDTurma = iDTurma;
    }
}
