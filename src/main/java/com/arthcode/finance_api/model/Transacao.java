package com.arthcode.finance_api.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transacoes")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private String tipo; // "RECEITA" ou "DESPESA"

    private String categoria;

    // Getters e Setters
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getDescricao(){return descricao; }
    public void setDescricao(String descricao){this.descricao = descricao;}

    public BigDecimal getValor(){return valor;}
    public void setValor(BigDecimal valor){this.valor = valor;}
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    }
