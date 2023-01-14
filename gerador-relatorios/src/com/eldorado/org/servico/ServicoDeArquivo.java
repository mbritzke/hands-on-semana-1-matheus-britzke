package com.eldorado.org.servico;

import com.eldorado.org.modelo.BaseDeNota;
import com.eldorado.org.modelo.Faturamento;
import com.eldorado.org.modelo.Nota;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicoDeArquivo {

    private static final Logger LOGGER = Logger.getLogger(ServicoDeArquivo.class.getName());
    private static final String CAMINHO = "resources/txt/";

    public List<BaseDeNota> lerArquivo(String nomeArquivo) {
        List<BaseDeNota> listaDeNotas = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format("%s/%s", CAMINHO, nomeArquivo)))) {
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] vetor = line.split(";");
                if (vetor.length == 9)
                    listaDeNotas.add(criaFaturamento(vetor));
                if (vetor.length == 6)
                    listaDeNotas.add(criaNota(vetor));
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        return listaDeNotas;
    }

    private Faturamento criaFaturamento(String[] vetor) {
        Faturamento faturamento = new Faturamento();
        faturamento.setCompany(vetor[0]);
        faturamento.setMes(vetor[1]);
        faturamento.setAno(vetor[2]);
        faturamento.setDataParcela1(vetor[3]);
        faturamento.setParcela1(vetor[4]);
        faturamento.setDataParcela2(vetor[5]);
        faturamento.setParcela2(vetor[6]);
        faturamento.setDataParcela3(vetor[7]);
        faturamento.setParcela3(vetor[8]);
        return faturamento;
    }

    private Nota criaNota(String[] vetor) {
        Nota nota = new Nota();
        nota.setCompany(vetor[0]);
        nota.setMes(vetor[1]);
        nota.setAno(vetor[2]);
        nota.setNota(vetor[3]);
        nota.setDataEmissao(vetor[4]);
        nota.setNota(vetor[5]);
        return nota;
    }
}
