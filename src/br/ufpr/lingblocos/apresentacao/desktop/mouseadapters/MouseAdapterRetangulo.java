/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.mouseadapters;

import br.ufpr.lingblocos.apresentacao.desktop.teladesenho.TelaDesenho;
import br.ufpr.lingblocos.logicapalco.Palco;
import br.ufpr.lingblocos.logicapalco.Retangulo;
import java.awt.event.MouseEvent;

/**
 * Apenas um exemplo de listener de mouse.
 * @author Helio
 */
public class MouseAdapterRetangulo extends MouseAdapterFigura {
   
    public MouseAdapterRetangulo(TelaDesenho telaDesenho,Palco palco){
        super(telaDesenho,palco);
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        if (pressed) {
            pressed = false;
            //AQUI É ONDE VOCÊS DEVEM FAZER A LÓGICA SER CHAMADA,
            //ANTES DE DESENHAR NA TELA
            palco.inserirAtor(new Retangulo(x, y, e.getX() - x, e.getY() - y));
            tela.desenhaRetangulo(x, y, e.getX() - x, e.getY() - y);
        }
    }
    

    
    

}
