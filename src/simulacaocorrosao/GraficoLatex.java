/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaocorrosao;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charleshenriqueportoferreira
 */
public class GraficoLatex {

    double altura;
    double largura;
    int z;

    public GraficoLatex(double altura, double largura, int z) {
        this.altura = altura;
        this.largura = largura;
        this.z = z;
    }

    public void geraGraficoTex() {
        StringBuilder sb = new StringBuilder();
        sb.append("\\documentclass{standalone}\n"
                + "\\usepackage{tikz}\n"
                + "\\usepackage{pgfplots}\n"
                + "\\pgfplotsset{compat=1.9}\n"
                + "\n"
                + "\n"
                + "\\begin{document}\n"
                + "\n"
                + "\\begin{tikzpicture}\n"
                + "\\begin{axis}[\n"
                + "    enlargelimits=false,\n"
                + "    xmin=0, xmax=" + largura + ",\n"
                + "    ymin=0, ymax=" + altura + ",\n"
                + "    height=" + altura + "cm, \n"
                + "    width=" + largura + "cm,\n"
                + "]\n"
                + "\\addplot[\n"
                + "    only marks,\n"
                + "    color = black,\n"
                + "    mark size=0.03cm]\n"
                + "table[x = x, y = y,col sep=comma]\n"
                + "{dados1.dat};\n"
                + "\n"
                + "\n"
                + "\\addplot[\n"
                + "    only marks,\n"
                + "    color = black,\n"
                + "    mark size=0.03cm]\n"
                + "table[x = x, y = y,col sep=comma]\n"
                + "{dados2.dat};\n"
                + "\n"
                + "\\draw [black,dashed] \n"
                + "(axis cs:" + z + ",0) -- (axis cs:" + z + "," + altura + ");\n"
                + "\n"
                + "\\end{axis}\n"
                + "\\end{tikzpicture}\n"
                + "\\end{document}");

        try {
            Util.printFile("latex/Corrosao.tex", sb.toString());
        } catch (IOException ex) {
            Logger.getLogger(GraficoLatex.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
