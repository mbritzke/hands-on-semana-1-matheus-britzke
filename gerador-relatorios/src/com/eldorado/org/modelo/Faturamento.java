package com.eldorado.org.modelo;

public class Faturamento extends BaseDeNota {
    private String dataParcela1;
    private String parcela1;
    private String dataParcela2;
    private String parcela2;
    private String dataParcela3;
    private String parcela3;

    public String getDataParcela1() {
        return dataParcela1;
    }

    public void setDataParcela1(String dataParcela1) {
        this.dataParcela1 = dataParcela1;
    }

    public String getParcela1() {
        return parcela1;
    }

    public void setParcela1(String parcela1) {
        this.parcela1 = parcela1;
    }

    public String getDataParcela2() {
        return dataParcela2;
    }

    public void setDataParcela2(String dataParcela2) {
        this.dataParcela2 = dataParcela2;
    }

    public String getParcela2() {
        return parcela2;
    }

    public void setParcela2(String parcela2) {
        this.parcela2 = parcela2;
    }

    public String getDataParcela3() {
        return dataParcela3;
    }

    public void setDataParcela3(String dataParcela3) {
        this.dataParcela3 = dataParcela3;
    }

    public String getParcela3() {
        return parcela3;
    }

    public void setParcela3(String parcela3) {
        this.parcela3 = parcela3;
    }

    @Override
    public String toString() {
        return "{" +
                " company='" + company + '\'' +
                ", mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", dataParcela1='" + dataParcela1 + '\'' +
                ", parcela1='" + parcela1 + '\'' +
                ", dataParcela2='" + dataParcela2 + '\'' +
                ", parcela2='" + parcela2 + '\'' +
                ", dataParcela3='" + dataParcela3 + '\'' +
                ", parcela3='" + parcela3 + '\'' +
                '}' + "\n";
    }
}
