package br.newtonpaiva.franquia_acai;

public class Acai {

    public Integer tamanho;

    private Double valor = 0.0;

    public Integer acrescimo;

    public Acai(Integer tamanho, Double valor, Integer acrescimo){
        this.tamanho = tamanho;
        this.valor = valor;
        this.acrescimo = acrescimo;
    }

    public Acai(){
        this.tamanho = tamanho;
        this.valor = valor;
        this.acrescimo = acrescimo;
    }

    public Double valorTamanho(Integer tamanho) {
        if (tamanho == 1) {
            valor += 8.0;
        }
        if (tamanho == 2) {
            valor += 10.0;
        }
        if (tamanho == 3) {
            valor += 12.0;
        }
        return valor;
    }
    public Double calculaAcrescimo(Integer acrescimo) {

        if (acrescimo == 1) {
            valor += 2.0;
        }
        return valor;
    }



    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
