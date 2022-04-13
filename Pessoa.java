package com.company;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String sexo;
    protected String idade;
    protected Endereco endereco = new Endereco();
    protected Contato contato = new Contato();

    public Pessoa(){}
    public Pessoa(String nome,String cpf, String sexo, String idade ,
                  Endereco endereco, Contato contato ){
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        this.endereco = endereco;
        this.contato = contato;

    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return this.sexo;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }

    public String getIdade(){
        return this.idade;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
    public void setContato(Contato contato){
        this.contato = contato;
    }

    public Contato getContato(){
        return this.contato;
    }
}
