package br.ufjf.dcc193.exm01;

public class Pessoa {
    private String nome;
    private Integer idade;

    Pessoa(){
        this.nome = "";
        this.idade = 0; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getIdade() {
        return idade;
    }
    
}