package br.com.lojinha15.pojo;

import java.util.ArrayList;
import java.util.List;

import br.com.lojinha15.enuns.Tamanho;

public class Produto {
    // atributos
    private String nome;
    private String marca;
    private Tamanho tamanho;
    private double valor;
    private String itensIncluso;

    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor) {
        if(novoValor > 0){
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valor do Produto deve ser Maior que 0");
        }
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public String getItensIncluso() {
        return itensIncluso;
    }

    public void setItensIncluso(String itensIncluso) {
        this.itensIncluso = itensIncluso;
    }

}
