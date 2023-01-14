package com.eldorado.org.modelo;

public class BaseDeNota {

    protected String company;
    protected String mes;
    protected String ano;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return  "company='" + company + '\'' +
                ", mes='" + mes + '\'' +
                ", ano='" + ano + '\'' ;
    }
}
