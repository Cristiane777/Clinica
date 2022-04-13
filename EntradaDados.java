package com.company;
import javax.swing.JOptionPane;

public class EntradaDados {

    private static String descricao;

    private static Endereco pedeEndereco(String descricao){

        Endereco end = new Endereco();
        end.setCidade(JOptionPane.showInputDialog("Nome da cidade do "+descricao));
        end.setBairro(JOptionPane.showInputDialog("Nome do bairro "+descricao));
        end.setRua(JOptionPane.showInputDialog("Nome da rua do "+descricao));
        end.setNcasa(JOptionPane.showInputDialog("Numero da casa do "+descricao));
        return end;
    }
    private static Contato pedeContato(String descricao){
        Contato cont = new Contato();
        cont.setTelefone(JOptionPane.showInputDialog("Telefone do "+descricao));
        cont.setEmail(JOptionPane.showInputDialog("Email do "+descricao));
        return cont;
    }
    private static Pessoa pedePessoa(String descricao){
        Pessoa p1 = new Pessoa();

        p1.setNome(JOptionPane.showInputDialog("Nome do "+descricao));
        p1.setSexo(JOptionPane.showInputDialog("Sexo do "+descricao));
        p1.setCpf(JOptionPane.showInputDialog("Cpf do "+descricao));
        p1.setIdade(JOptionPane.showInputDialog("Idade do "+descricao));
        return p1;
    }
    private static Paciente pedePaciente(){
        Paciente p2 = new Paciente();


        p2.setDoenca(JOptionPane.showInputDialog("Doença do Paciente"));
        p2.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Peso do Paciente")));
        p2.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura do Paciente")));
        p2.setImc((p2.getPeso() / (p2.getAltura() * p2.getAltura())));

        return p2;
        

    }
    private static ProfissionalSaude pedeProfissionalSaude(){
        ProfissionalSaude p3 = new ProfissionalSaude();

        p3.setConselhoclasse(Double.parseDouble(JOptionPane.showInputDialog("CRM/COREN:")));

        return p3;
    }
    public Paciente dadosPaciente(){
        Pessoa p = pedePessoa("Paciente");
        Paciente p2 = pedePaciente();

        return new Paciente(p.getNome(),p.getCpf(),p.getSexo(),p.getIdade()
               ,p2.getDoenca(),p2.getAltura(),p2.getPeso(),p2.getImc(),pedeEndereco("Paciente"), pedeContato("Paciente"));
    }
    public ProfissionalSaude dadosProfissionalSaude(){
        Pessoa p2 = pedePessoa("ProfissionalSaude");
        ProfissionalSaude p1= pedeProfissionalSaude();
        return new ProfissionalSaude(p2.getNome(),p2.getCpf(),p2.getSexo(),p2.getIdade(),pedeEndereco("ProfissionalSaude"),
                pedeContato("ProfissionalSaude"),p1.getConselhoclasse());
    }

}
