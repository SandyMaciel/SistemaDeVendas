
package br.ce.projetofinal.equipea;

public class CadastrarCliente {
    
    private int id;
    private String nome;
    private int cnpj;
    private String cidade;
    private double limite;
    private double saldoTotal;

    public CadastrarCliente(String nome, int cnpj, String cidade, double limite, double saldoTotal) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.limite = limite;
        this.saldoTotal = saldoTotal;
    }
        
    public String getNome(){
        return this.nome;
    }
    
    public int cnpj(){
        return this.cnpj;
    }
    
    public String cidade(){
        return this.cidade;
    }
    
    public double limite(){
        return this.limite;
    }
    
    public double saldoTotal(){
        return this.saldoTotal;
    }
    
    
}
