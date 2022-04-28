package br.edu.ifnmg.atividade;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    private List<Double> ins = new ArrayList();
    private List<Double> outs = new ArrayList();

    public void testeUm() {
        ins.add(1D);
        ins.add(3D);
        ins.add(5D);
        outs.add(1D);
        outs.add(3D);
        outs.add(5D);
        Classe.metodo(ins, outs);
    }
    public  void testeDois() {
        ins.add(1D);
        ins.add(3D);
        ins.add(5D);
        outs.add(2D);
        outs.add(4D);
        outs.add(6D);
        Classe.metodo(ins, outs);

    }
    public void testeTres() {
        ins.add(1D);
        ins.add(3D);
        ins.add(5D);
        outs.add(3D);
        outs.add(7D);
        outs.add(11D);
       Classe.metodo(ins, outs);

    }

    public void testeQuatro() {
        ins.add(1D);
        ins.add(3D);
        ins.add(5D);
        outs.add(4.5);
        outs.add(12.5);
        outs.add(20.5);
        Classe.metodo(ins, outs);

    }

    public void testeCinco() {
        ins.add(2.900000095);
        ins.add(6.699999809);
        ins.add(4.900000095);
        ins.add(7.900000095);
        ins.add(9.800000191);
        ins.add(6.900000095);
        ins.add(6.099999905);
        ins.add(6.199999809);
        ins.add(6D);
        ins.add(5.099999905);
        ins.add(4.699999809);
        ins.add(4.400000095);
        ins.add(5.800000191);
        
        outs.add(4D);
        outs.add(7.400000095);
        outs.add(5D);
        outs.add(7.199999809);
        outs.add(7.900000095);
        outs.add(6.099999905);
        outs.add(6D);
        outs.add(5.800000191);
        outs.add(5.199999809);
        outs.add(4.199999809);
        outs.add(4D);
        outs.add(4.400000095);
        outs.add(5.199999809);
        Classe.metodo(ins, outs);

    }
}
