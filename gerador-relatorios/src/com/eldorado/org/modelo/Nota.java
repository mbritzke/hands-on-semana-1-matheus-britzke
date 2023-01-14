package com.eldorado.org.modelo;

public class Nota extends BaseDeNota {

    private String valor;
    private String dataEmissao;
    private String nota;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "{" +
                "company='" + company + '\'' +
                ", mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", valor='" + valor + '\'' +
                ", dataEmissao='" + dataEmissao + '\'' +
                ", nota='" + nota + '\'' +
                '}' + "\n";
    }
}
