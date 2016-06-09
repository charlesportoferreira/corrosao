/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaocorrosao;

/**
 *
 * @author charleshenriqueportoferreira
 */
public class Ponto {

    double x;
    double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        x = (double) Math.round(x * 100d) / 100d;
        y = (double) Math.round(y * 100d) / 100d;
        return x + "," + y + "\n";
    }

}
