package com.company;

public class Paciente extends Pessoa {

    private String doenca;
    private float altura;
    private float peso;
    private float imc;


    public Paciente() {

    }

    public Paciente(String nome, String cpf, String sexo, String idade, String doenca,
                    Float altura, Float peso, Float imc, Endereco endereco, Contato contato) {
        super(nome, cpf, sexo, idade, endereco, contato);
        this.doenca = doenca;
        this.altura = altura;
        this.peso = peso;
        this.imc= imc;
    }

    public void setDoenca(String doenca){
        this.doenca=doenca;
    }
    public String getDoenca(){
        return this.doenca;
    }
    public void setAltura(Float altura){
        this.altura=altura;
    }
    public Float getAltura(){
        return this.altura;
    }
    public void setPeso(Float peso){
        this.peso= peso;
    }
    public Float getPeso(){
        return this.peso;
    }
    public void setImc(float imc){
        this.imc = imc;
    }
    public Float getImc(){
        return this.imc;
    }

    public String mostra(){
        Endereco e = getEndereco();
        Contato c = getContato();

        return "Dados do Paciente:\n"+
                "Nome: "+getNome()+"\n"+
                "Sexo: "+getSexo()+"\n"+
                "Idade: "+getIdade()+"\n"+
                "Doenca:"+getDoenca()+"\n"+"\n"+"Endereco:\n "+
                "Cidade: "+e.getCidade()+"\n"+
                "Bairro: "+e.getBairro()+"\n"+
                "Rua: "+e.getRua()+"\n"+
                "Nº da casa: "+e.getNcasa()+"\n"+ "Contato\n"+
                "Telefone: "+c.getTelefone()+"\n"+
                "Email: "+c.getEmail()+"\n"+
                "IMC: "+ getImc();


    }

}
