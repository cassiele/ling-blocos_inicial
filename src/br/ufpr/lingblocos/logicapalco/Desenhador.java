/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;


public interface Desenhador {
    
    void desenhaElipse(int x, int y, int largura, int altura);
    
    public void desenhaEstrela();
    
    public void desenhaImagem();
    
    public void desenhaLinhaLivre();
    
    public void desenhaLinhaReta();
    
    public void desenhaPoligono(int x,int y,int lados,int tamLados);
    
    public void desenhaRetangulo(int x, int y, int largura, int altura);
    
    public void desenhaTriangulo(int x,int y,int base,int altura);    
    
    
    
    
    
    
    
    
    
}
