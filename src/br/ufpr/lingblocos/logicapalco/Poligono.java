/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

/**
 *
 * @author Lenovo
 */
public class Poligono extends Ator{
    
    private Desenhador desenhador;
    
    private int lados;
    private int tamLados;

    public Poligono(int x, int y, int lados, int tamlados) {
        super(x, y);
        this.lados  = lados;
        this.tamLados = tamlados;
    }

    @Override
    public void desenhar() {
        desenhador.desenhaPoligono(x , y, lados, tamLados);
    }

    @Override
    public void dentro(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
