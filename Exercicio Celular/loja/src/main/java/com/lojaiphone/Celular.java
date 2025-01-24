package com.lojaiphone;

import com.lojaiphone.Modelos;
import com.lojaiphone.Manual;
import com.lojaiphone.Carregador;

public class Celular {
    private Modelos modelo;
    private Double valor;
    private Manual manual;
    private Fone newFone;
    private Carregador newCarregador;

    public Celular(Modelos modelo, Manual manual, Carregador newCarregador, Fone newFone) {
        this.modelo = modelo;
        this.manual = manual;
        this.newCarregador = newCarregador;
        this.newFone = newFone;
    }

    public Carregador getNewCarregador() {
        return newCarregador;
    }

    public void setNewCarregador(Carregador newCarregador) {
        this.newCarregador = newCarregador;
    }

    public Modelos getModelo() {
        return modelo;
    }

    public void setModelo(Modelos modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Manual getManual() {
        return manual;
    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    public Fone getNewFone() {
        return newFone;
    }

    public void setNewFone(Fone newFone) {
        this.newFone = newFone;
    }
}