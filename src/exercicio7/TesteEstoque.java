/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author Luis Guilherme
 */
public class TesteEstoque {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estoque produto1 = new Estoque();
        Estoque produto2 = new Estoque();
        Estoque produto3 = new Estoque();
        Estoque produto4 = new Estoque();
        
        produto1.setNome("Impressora Jato de tinta");
        produto1.setQuantidadeAtual(13);
        produto1.setQuantidadeMinima(6);
        
        produto2.setNome("Monitor LCD 17 polegadas");
        produto2.setQuantidadeAtual(11);
        produto2.setQuantidadeMinima(13);
        
        produto3.setNome("Mouse óptico");
        produto3.setQuantidadeAtual(6);
        produto2.setQuantidadeMinima(2);
        
        produto4.setNome("Teclado");
        produto4.setQuantidadeAtual(8);
        produto4.setQuantidadeMinima(2);
        
        System.out.println("Dados do produto 1:");
        System.out.println(produto1.dadosProdutos());
        
        produto1.darBaixa(5);
        
        System.out.println("\nDados do produto 1:");
        System.out.println(produto1.dadosProdutos());
        
        System.out.println("\nDados do produto 2:");
        System.out.println(produto2.dadosProdutos());
        
        produto2.reporEstoque(7);
        
        System.out.println("\nDados do produto 2:");
        System.out.println(produto2.dadosProdutos());
        
        System.out.println("\nDados do produto 3:");
        System.out.println(produto3.dadosProdutos());
        
        produto3.darBaixa(4);
        
        System.out.println("\nDados do produto 3:");
        System.out.println(produto3.dadosProdutos());
        
        System.out.print("\nProduto 1\t");
        produto1.precisaRepor();
        System.out.print("Produto 2\t");
        produto2.precisaRepor();
        System.out.print("Produto 3\t");
        produto3.precisaRepor();
        System.out.print("Produto 4\t");
        produto4.precisaRepor();
    }
    
}
