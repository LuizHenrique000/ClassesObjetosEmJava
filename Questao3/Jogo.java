package Questao3;

public class Jogo {
    private Time time1;
    private Time time2;
    private int placarTime1;
    private int placarTime2;

    public Jogo(Time time1, Time time2, int placarTime1, int placarTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
    }

    public Time getTime1() {
        return time1;

    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }

    public Time getTime2() {
        return time2;

    }

    @Override
    public String toString() {
        return "Jogo [placarTime1=" + placarTime1 + ", plcacarTime2=" + placarTime2 + ", time1=" + time1 + ", time2="
                + time2 + "]";
    }

}
