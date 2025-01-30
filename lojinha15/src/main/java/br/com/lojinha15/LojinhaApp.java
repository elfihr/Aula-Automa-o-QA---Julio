package br.com.lojinha15;
import br.com.lojinha15.enuns.Tamanho;
import br.com.lojinha15.pojo.Produto;
import br.com.lojinha15.pojo.ProdutoInternacional;
import br.com.lojinha15.pojo.ProdutoNacional;

public class LojinhaApp {
    public static void main(String[] args) { 

        Produto meuProduto = new Produto("JL",Tamanho.MEDIO);

        meuProduto.setNome("Playstation");
        meuProduto.setValor(100);
        meuProduto.setMarca("Sony"); 
        meuProduto.setItensIncluso("2 controle e 3 jogos");

        System.out.println("=====LOJA IPHONE DO JAPONES=====\n" );
        System.out.println("Produto: "+ meuProduto.getNome() + "\n" + "Marca: "+ meuProduto.getMarca() +"\n" +"Preço: R$ "+ meuProduto.getValor() + "\n" + "Tamanho: "+ meuProduto.getTamanho() + "\n" + "Itens Inclusos: " + meuProduto.getItensIncluso());
   
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
       
        meuProdutoNacional.setNome("Nintendo Switch");
        meuProdutoNacional.setValor(120);
        meuProdutoNacional.setImpostoNacional(30);
        meuProdutoNacional.setMarca("Nintendo");
        System.out.println("\n=========PRODUTOSNACIONAIS========="+ "\n");
        System.out.println("Produto: " + meuProdutoNacional.getNome() + "\n" + "Preço: R$" + meuProdutoNacional.getValor() + "\n" + "Imposto: R$ " + meuProdutoNacional.getImpostoNacional() + "\nMarca:" + meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getDadosFavoritos());
    
        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Microsoft", Tamanho.MEDIO);
        meuProdutoInternacional.setNome("MXbox One");
        meuProdutoInternacional.setValor(200);
        meuProdutoInternacional.setMarca("Microsoft");
        meuProdutoInternacional.setImpostoImportacao(0.20);

        System.out.println("\n=========PRODUTOSINTERNACIONAIS========="+ "\n");
        System.out.println("Produto: " + meuProdutoInternacional.getNome() + "\n" + "Preço: R$" + meuProdutoInternacional.getValor() + "\n" + "Imposto: R$ " + meuProdutoInternacional.getValor() * meuProdutoInternacional.getImpostoImportacao() + "\nMarca:" + meuProdutoInternacional.getMarca() +"\n\n");
    
       
    
    }
}