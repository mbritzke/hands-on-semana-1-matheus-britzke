package com.eldorado.org;

import com.eldorado.org.modelo.BaseDeNota;
import com.eldorado.org.servico.ServicoDeArquivo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicoDeArquivo servicoDeArquivo = new ServicoDeArquivo();

        List<BaseDeNota> listaFaturamentos = servicoDeArquivo.lerArquivo("faturamento.txt");
        List<BaseDeNota> listaNotas = servicoDeArquivo.lerArquivo("nota.txt");

        System.out.println("====================FATURAMENTO========================");
        System.out.println(listaFaturamentos);
        System.out.println("========================================================");

        System.out.println("====================NOTA========================");
        System.out.println(listaNotas);
        System.out.println("========================================================");
    }
}