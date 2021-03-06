/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.telablocos.swing;

import br.ufpr.lingblocos.apresentacao.desktop.blocos.swing.ArrastavelGrudavelAdapter;
import br.ufpr.lingblocos.apresentacao.desktop.blocos.swing.BlocoArrastavel;
import br.ufpr.lingblocos.apresentacao.desktop.blocos.swing.BlocoInvolucro;
import br.ufpr.lingblocos.apresentacao.desktop.mouseadapters.MouseAdapterBlocos;
import br.ufpr.lingblocos.apresentacao.desktop.principal.JanelaPrincipal;
import br.ufpr.lingblocos.logicablocos.BlocoEspere;
import br.ufpr.lingblocos.logicablocos.Painel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import br.ufpr.lingblocos.util.Observer;
import java.util.Iterator;

/**
 *
 * @author Helio
 */
public class TelaBlocos implements Observer<MouseAdapterBlocos> {

    private JPanel tela;
    private List<BlocoArrastavel> blocos = new ArrayList<>();
    private JanelaPrincipal pai;
    private MouseAdapter mouseAdapter;

    public TelaBlocos(int largura, int altura) {
        tela = new JPanel();
        tela.setSize(largura, altura);
        tela.setLayout(null);
        tela.setBackground(SystemColor.text);

    }

    public void addBloco(BlocoArrastavel bloco, int x, int y) {
        blocos.add(bloco);
        tela.add(bloco.getBloco());
        bloco.getBloco().setLocation(x, y);
    }

    public BlocoInvolucro embrulha(BlocoArrastavel bloco) {
        int index = blocos.indexOf(bloco);
        tela.remove(bloco.getBloco());
        BlocoInvolucro blocoNovo = new BlocoInvolucro(this, new BlocoEspere()); //RESOLVER!!
        blocos.set(index, blocoNovo);
        tela.add(blocoNovo.getBloco());
        tela.repaint();

        //painel.encaixar
        return blocoNovo;
    }

    public void trocaPainel(BlocoArrastavel bloco, BlocoInvolucro bloco2) {
        Iterator<BlocoArrastavel> it = bloco.iterator();
        this.getTela().remove(bloco.getBloco());
        blocos.remove(bloco);
        while (it.hasNext()) {
            bloco2.addBloco(it.next());
        }
        //painel.juntarBlocos();
    }

    public BlocoArrastavel desembrulha(BlocoInvolucro bloco) {
        int index = blocos.indexOf(bloco);
        tela.remove(bloco.getBloco());
        BlocoArrastavel blocoNovo = bloco.iterator().next();
        //blocoNovo.setMouseAdapter(new ArrastavelGrudavelAdapter(blocoNovo, this));
        blocos.set(index, blocoNovo);
        tela.add(blocoNovo.getBloco());
        blocoNovo.getBloco().setLocation(bloco.getBloco().getLocation());
        bloco.setPai(null);
        tela.repaint();
        return blocoNovo;
    }

    @Override
    public void update(MouseAdapterBlocos m) {
        setMouseAdapter(m);
    }

    public JPanel getTela() {
        return tela;
    }

    public void setLocation(int x, int y) {
        tela.setLocation(x, y);
    }

    public void setPai(JanelaPrincipal pai) {
        this.pai = pai;
    }

    public void setMouseAdapter(MouseAdapter mouseAdapter) {
        tela.removeMouseListener(this.mouseAdapter);
        this.mouseAdapter = mouseAdapter;
        tela.addMouseListener(this.mouseAdapter);
    }

    public List<BlocoArrastavel> getBlocos() {
        return blocos;
    }

}
