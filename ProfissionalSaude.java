package com.company;

public class ProfissionalSaude extends Pessoa{
    private double conselhoclasse;


    public ProfissionalSaude(String nome,String cpf,String sexo, String idade,Endereco endereco,Contato contato,double conselhoclasse){
        super(nome,cpf,sexo,idade,endereco,contato);
        this.conselhoclasse = conselhoclasse;

    }

    public ProfissionalSaude() {

    }

    public void setConselhoclasse(double conselhoclasse){
        this.conselhoclasse = conselhoclasse;
    }

    public double getConselhoclasse(){
        return this.conselhoclasse;
    }
    public String mostra(){
        return "Dados Profissional de Saude:\n"+
                "Nome: "+getNome()+"\n"+
                "CPF: "+getCpf()+"\n"+
                "CRM/COREN: "+getConselhoclasse();
    }
}
