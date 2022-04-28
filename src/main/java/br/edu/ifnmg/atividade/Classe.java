package br.edu.ifnmg.atividade;

import java.util.List;

public class Classe {

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs) {

        Integer e = 2000, i, j;
        Double p, dif, w0 = 0.0, w1 = 0.0, lr = 0.025;

        i = 1;

        while (i <= e) {

            j = 0;

            while (j < ins.size()) {
                p = w1 * ins.get(j) + w0;
                dif = outs.get(j) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(j);
                j++;
            }
            System.out.printf(">> e = %d -> w1 = %.3f, w0 = %.3f \n", i, w1, w0);

            i++;
        }

        Dupla<Double, Double> d = new Dupla<>(w1, w0);
        return d;
    }

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, Integer e) {

        Integer i, j;
        double p, dif, w0 = 0.0, w1 = 0.0, lr = 0.025;

        i = 1;

        while (i <= e) {

            j = 0;

            while (j < ins.size()) {
                p = w1 * ins.get(j) + w0;
                dif = outs.get(j) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(j);
                j++;
            }
            System.out.printf(">> e = %d -> w1 = %.3f, w0 = %.3f \n", i, w1, w0);
            i++;
        }

        Dupla<Double, Double> d = new Dupla<>(w1, w0);
        return d;

    }

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, Integer e, Integer lr) {

        Integer i, j;
        Double p, dif, w0 = 0.0, w1 = 0.0;

        i = 1;

        while (i <= e) {

            j = 0;

            while (j < ins.size()) {
                p = w1 * ins.get(j) + w0;
                dif = outs.get(j) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(j);
                j++;
            }
            System.out.printf(">> e = %d -> w1 = %.3f, w0 = %.3f \n", i, w1, w0);
            i++;
        }

        Dupla<Double, Double> d = new Dupla<>(w1, w0);
        return d;

    }

}
