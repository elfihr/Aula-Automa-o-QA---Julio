package br.com.lojinha15.pojo;

import br.com.lojinha15.enuns.Tamanho;
import br.com.lojinha15.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito{

    private double impostoNacional;

     public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
        //TODO Auto-generated constructor stub
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }

    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() +","  +this.getValor();
       }
    


    
}
