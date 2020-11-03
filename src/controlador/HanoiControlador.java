package controlador;

import modelo.HanoiModelo;
import vista.Hanoi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class HanoiControlador implements ItemListener, ActionListener {
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
}
