package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Jogos {
    private List<Jogo> jogos = new ArrayList<>();

    public Jogos(Jogo jogo) {
        adicionarJogo(jogo);
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public int filtrarJogosEmpatados() {
        int contador = 0;
        for (Jogo elemento : jogos) {
            if (elemento.getPlacarTime1() == elemento.getPlacarTime2()) {
                contador++;
            }
        }
        return contador;
    }

    public int filtrarJogosTime1() {
        int contador = 0;
        for (Jogo elemento : jogos) {
            if (elemento.getPlacarTime1() > elemento.getPlacarTime2()) {
                contador++;
            }
        }

        return contador;
    }

    public int filtrarJogosTime2() {
        int contador = 0;
        for (Jogo elemento : jogos) {
            if (elemento.getPlacarTime2() > elemento.getPlacarTime1()) {
                contador++;
            }
        }
        return contador;
    }
}
