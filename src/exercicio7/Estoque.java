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
public class Estoque {
    private String nome;
    private int quantidadeAtual;
    private int quantidadeMinima;

    public Estoque() {
    }

    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }
    
    
    public void alteraNome(String novoNome){
        nome = novoNome;
    }
    
    public void alteraQuantidadeMinima(int minima){
        if(quantidadeMinima < 0){
            System.out.println("A quanrtidade mínima não pode ser negativs");
        }
        
        quantidadeMinima = minima;
    }
    
    public void reporEstoque(int valor){
        quantidadeAtual = quantidadeAtual + valor;
    }
    
    public void darBaixa(int valor){
        quantidadeAtual = quantidadeAtual - valor;
    }
    
    public void dadosProduto(){
        System.out.println("Dados do produto:");
        System.out.println("Nome: " + getNome());
        System.out.println("Quantidade atual do produto: " + getQuantidadeAtual());
        System.out.println("Quantidade minima do produto: " + getQuantidadeMinima());
    }
    
    public String dadosProdutos(){
        String str = "Nome: " + getNome();
        str = str + "\nQuantidade atual do produto: " + getQuantidadeAtual();
        str = str + "\nQuantidade minima do produto: " + getQuantidadeMinima();
        return str;
    }  
    
    
    public void precisaRepor(){
        if(quantidadeAtual < quantidadeMinima){
            System.out.println("É preciso repor o produto \"" + getNome() + "\"");
        }else{
            System.out.println("Não precisa repor!\n");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
}
