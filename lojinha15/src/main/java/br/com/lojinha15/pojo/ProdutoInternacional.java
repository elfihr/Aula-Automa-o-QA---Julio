package br.com.lojinha15.pojo;

import br.com.lojinha15.enuns.Tamanho;

public class ProdutoInternacional extends Produto{

    private double impostoImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
        //TODO Auto-generated constructor stub
    }

    public double getImpostoImportacao() {
        return impostoImportacao;
    }
    public void setImpostoImportacao(double impostoImportacao) {
        this.impostoImportacao = impostoImportacao;
    }
    public void setValor(double novoValor) {
        if(novoValor > -100){
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valor do Produto deve ser Maior que 0");
        }
    }
}
