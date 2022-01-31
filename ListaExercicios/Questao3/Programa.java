package Questao3;

public class Programa {
    public static void main(String[] args) {
        Time time1 = new Time("INTER");
        Time time2 = new Time("GREMIO");
        Jogo jogo1 = new Jogo(time1, time2, 1, 2);
        Jogos lista = new Jogos(jogo1);
        lista.adicionarJogo(jogo1);
        System.out.println(lista.filtrarJogosTime2());

    }
}
