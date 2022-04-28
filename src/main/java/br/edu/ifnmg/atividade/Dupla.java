package br.edu.ifnmg.atividade;

public class Dupla<T, U> {

    private T valorA;
    private U valorB;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Dupla() {
    }

    public Dupla(T valorA, U valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public T getValorA() {
        return valorA;
    }

    public void setValorA(T valorA) {
        this.valorA = valorA;
    }

    public U getValorB() {
        return valorB;
    }

    public void setValorB(U valorB) {
        this.valorB = valorB;
    }
    //</editor-fold>

}
