package br.ufjf.dcc193.exm01;

public class Pessoa {
    private Long id;
    private String nome;
    private Integer idade;

    Pessoa(){
    }
    Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
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
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nome+" "+this.idade+" anos";
    }

}