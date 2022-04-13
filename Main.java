package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Paciente p = new Paciente();
        ProfissionalSaude p1 = new ProfissionalSaude();

            while (true){
                int resposta = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar paciente"+
                        "\n2- Cadastrar Profissional de Saude"+
                        "\n3- Consultar dados do Paciente"+
                        "\n4- Consutar dados do Profissional de Saude"+
                        "\n5- Sair"));
                if(resposta==1){
                    p = new EntradaDados().dadosPaciente();
                }
                else if(resposta==2){
                    p1 = new EntradaDados().dadosProfissionalSaude();
                }
                else if (resposta==3){
                    JOptionPane.showMessageDialog(null, p.mostra());
                }
                else if (resposta==4) {
                    JOptionPane.showMessageDialog(null, p1.mostra());

                }
                else
                    break;
            }
        }

        }



