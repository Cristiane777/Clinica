package com.company;

public class Endereco {
    private String cidade;
    private String bairro;
    private String rua;
    private String ncasa;

    public Endereco (){}

    public Endereco (String cidade, String bairro,String rua, String ncasa) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.ncasa = ncasa;

    }

    public void setCidade(String cidade){
        this.cidade=cidade;
    }

    public String getCidade(){
        return this.cidade;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getBairro(){
        return this.bairro;
    }
    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return this.rua;
    }
    public void setNcasa(String ncasa){
        this.ncasa = ncasa;
    }

    public String getNcasa(){
        return this.ncasa;
    }
}
