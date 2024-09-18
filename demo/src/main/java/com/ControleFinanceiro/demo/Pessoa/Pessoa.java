package com.ControleFinanceiro.demo.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Pessoa {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;
    String Nome;
    String Cpf;
    String Email;
    Integer Telefone;

    public Pessoa(long id, String nome, String cpf, String email, Integer telefone) {
        Id = id;
        Nome = nome;
        Cpf = cpf;
        Email = email;
        Telefone = telefone;
    }

    public Pessoa() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getTelefone() {
        return Telefone;
    }

    public void setTelefone(Integer telefone) {
        Telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Id == pessoa.Id && Objects.equals(Nome, pessoa.Nome) && Objects.equals(Cpf, pessoa.Cpf) && Objects.equals(Email, pessoa.Email) && Objects.equals(Telefone, pessoa.Telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Nome, Cpf, Email, Telefone);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Cpf='" + Cpf + '\'' +
                ", Email='" + Email + '\'' +
                ", Telefone=" + Telefone +
                '}';
    }
}
