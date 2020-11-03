package controlador;

import modelo.HanoiModelo;
import vista.Hanoi;

import javax.swing.*;
import java.awt.event.*;

public class HanoiControlador implements ItemListener, ActionListener, ComponentListener {
    Hanoi vista;
    HanoiModelo modelo;

    public HanoiControlador(Hanoi vista,HanoiModelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() != ItemEvent.SELECTED)
            return;

        if(e.getSource() == vista.combo){

        String num = (String) vista.combo.getSelectedItem();


            vista.setTowers(num);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btn){
            vista.start();
        }
    }

    @Override
    public void componentResized(ComponentEvent e) {
        if(e.getSource() instanceof JPanel){
            Hanoi aux = (Hanoi) e.getSource();

            int w = aux.getWidth();
            int h = aux.getHeight();

            //label.setBorder(new LineBorder(Color.red));
            aux.label.setSize((int)(w*0.32),33);
            aux.label.setLocation((int)(w*0.11),(3+0*3));

            //combo.setBorder(new LineBorder(Color.red));
            aux.combo.setSize((int)(w*0.15),20);
            aux.combo.setLocation((int)(w*0.45),(9+0*3));

            //btn.setBorder(new LineBorder(Color.red));
            aux.btn.setSize((int)(w*0.25),20);
            aux.btn.setLocation((int)(w*0.62),(9+0*3));

        }
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
