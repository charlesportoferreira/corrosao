/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaocorrosao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author charleshenriqueportoferreira
 */
public class SimulacaoCorrosao {

   

    public List<Ponto> geraPontos(int minX, int maxX, int minY, int maxY, int nrPontos) {
        Random random = new Random();
        double x, y;
        List<Ponto> pontos = new ArrayList<>();
        for (int i = 0; i < nrPontos; i++) {
            x = (random.nextDouble() * (maxX-minX)) + minX;
            y = (random.nextDouble() * (maxY-minY)) + minY;
            
            pontos.add(new Ponto(x, y));
        }
        
        return pontos;
    }

}
