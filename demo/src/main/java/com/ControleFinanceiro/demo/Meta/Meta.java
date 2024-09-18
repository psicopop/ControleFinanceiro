package com.ControleFinanceiro.demo.Meta;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String Tipo;
    Double Valor;

    public Meta() {
    }

    public Meta(long id, String tipo, Double valor) {
        Id = id;
        Tipo = tipo;
        Valor = valor;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meta meta = (Meta) o;
        return Id == meta.Id && Objects.equals(Tipo, meta.Tipo) && Objects.equals(Valor, meta.Valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Tipo, Valor);
    }

    @Override
    public String toString() {
        return "Meta{" +
                "Id=" + Id +
                ", Tipo='" + Tipo + '\'' +
                ", Valor=" + Valor +
                '}';
    }
}
