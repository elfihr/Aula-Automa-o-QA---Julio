package br.com.lojinha15;
import br.com.lojinha15.enuns.Tamanho;
import br.com.lojinha15.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) { 

        Produto meuProduto = new Produto("JL",Tamanho.MEDIO);

        meuProduto.setNome("Playstation");
        meuProduto.setValor(100);
        meuProduto.setMarca("Sony"); 
        meuProduto.setItensIncluso("2 controle e 3 jogos");

        System.out.println("=========Lojinha========="+ "\n");
        System.out.println("Produto: "+ meuProduto.getNome() + "\n" + "Marca: "+ meuProduto.getMarca() +"\n" +"R$ "+ meuProduto.getValor() + "\n" + "Tamanho: "+ meuProduto.getTamanho() + "\n" + "Itens Inclusos: " + meuProduto.getItensIncluso() +"\n");
    }
}