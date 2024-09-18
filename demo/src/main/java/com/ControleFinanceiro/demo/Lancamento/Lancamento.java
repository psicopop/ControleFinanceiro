package com.ControleFinanceiro.demo.Lancamento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String Nome;
    String Descricao;
    String Data;
    String Tipo;

    public Lancamento(Long id, String nome, String descricao, String data, String tipo) {
        Id = id;
        Nome = nome;
        Descricao = descricao;
        Data = data;
        Tipo = tipo;
    }

    public Lancamento() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return Objects.equals(Id, that.Id) && Objects.equals(Nome, that.Nome) && Objects.equals(Descricao, that.Descricao) && Objects.equals(Data, that.Data) && Objects.equals(Tipo, that.Tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Nome, Descricao, Data, Tipo);
    }

    @Override
    public String toString() {
        return "Lancamento{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", Data='" + Data + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}
