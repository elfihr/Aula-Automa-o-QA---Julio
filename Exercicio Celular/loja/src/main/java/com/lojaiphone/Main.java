package com.lojaiphone;

import com.lojaiphone.Celular;

public class Main {
    public static void main(String[] args) {
        Celular meuCelular = new Celular(Modelos.ihpone6, Manual.Sim, Carregador.Não, Fone.Sim);

        System.out.println("=====LOJA IPHONE DO JAPONES=====\n\n" + "Modelo:" + meuCelular.getModelo() + "\n"
                + "Acompanha Manual? " + meuCelular.getManual());
        System.out.println("Acompanha Carregador? " + meuCelular.getNewCarregador() + "\nAcompanha Fone de Ouvido? "
                + meuCelular.getNewFone() + "\n\n==============================");
    }
}