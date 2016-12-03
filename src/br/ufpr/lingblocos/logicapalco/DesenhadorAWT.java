/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

import br.ufpr.lingblocos.apresentacao.desktop.teladesenho.TelaDesenho;


public class DesenhadorAWT implements Desenhador{

    TelaDesenho telaDesenho;
        
    @Override
    public void desenhaElipse(int x, int y, int largura, int altura) {
        telaDesenho.desenhaElipse(x, y, largura, altura);
    }
    
    
    @Override
    public void desenhaTriangulo(int x,int y,int base,int altura) {
        telaDesenho.desenhaTriangulo(x, y, base, altura);
    }
    

    @Override
    public void desenhaEstrela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desenhaImagem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void desenhaLinhaLivre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desenhaLinhaReta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desenhaPoligono(int x,int y,int lados,int tamLados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void desenhaRetangulo(int x, int y, int largura, int altura){
        telaDesenho.desenhaRetangulo(x, y, largura, altura);
    }
    
    
}
