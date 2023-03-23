package br.newtonpaiva.franquia_acai;
import javax.swing.*;
public class PontoAcai {
    public static void main(String[] args) {

        Integer acrescimo = null;


        Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do acai: \n 1. 300ml \n 2.500ml \n 3.700ml \n 4.Sair"));

        MontarMensagem(opcao, acrescimo);
    }

    public static void MontarMensagem(Integer opcao, Integer acrescimo){

        Acai acai1 = new Acai();
        acai1.valorTamanho(opcao);

        acrescimo = Integer.parseInt(JOptionPane.showInputDialog("Possui acrescimo? 1 para sim e 2 para não: "));
        acai1.setValor(acai1.calculaAcrescimo(acrescimo));

        System.out.println();
        JOptionPane.showMessageDialog(null,"O seu açai ficou no valor de: " + acai1.getValor(),"resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}
