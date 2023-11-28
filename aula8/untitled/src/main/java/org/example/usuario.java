package org.example;

public class usuario {
    private String nome;
    private int idade;

    public usuario(String nome,  int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String comprimentar(){
        return "Olá,eu sou o" + nome;
    }

    public boolean verificarIdade(){
        return idade>=18;
    }

}
