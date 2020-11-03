package vista;

import controlador.HanoiControlador;
import jdk.jshell.execution.Util;
import modelo.HanoiModelo;
import modelo.Utilidades;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;


public class Hanoi extends JPanel implements ActionListener,ComponentListener {
  private int w,h;
  public JComboBox combo;
  public JButton btn;
  public JLabel label;
  private int cant,count;

  HanoiModelo modelo;
  HanoiControlador controlador;

    boolean start;

    public Hanoi(){
        interFace();
    }

    private void setListeners(HanoiControlador c){
        addComponentListener(this);
        combo.addItemListener(c);
        btn.addActionListener(c);
    }

    public void start(){
        start = true;
        btn.setEnabled(false);
        repaint();
    }

    private void interFace(){
        setLayout(null);
        setSize(300,300);
        setBorder(new LineBorder(Color.red));

        combo = new JComboBox();
        btn = new JButton("Iniciar");
        label = new JLabel("Cantidad discos ");

        start = false;


        combo.insertItemAt("#",0);
        combo.insertItemAt("1",1);
        combo.insertItemAt("2",2);
        combo.insertItemAt("3",3);


        combo.setSelectedIndex(0);


        w = getWidth();
        h = getHeight();

        label.setSize((int)(w*0.32),(int)(h*0.10));
        label.setLocation((int)(w*0.11),(3+0*3));

        combo.setSize((int)(w*0.15),(int)(h*0.06));
        combo.setLocation((int)(w*0.45),(9+0*3));

        btn.setSize((int)(w*0.25),(int)(h*0.06));
        btn.setLocation((int)(w*0.62),(9+0*3));

        add(label);
        add(combo);
        add(btn);

        btn.setEnabled(false);

        modelo = new HanoiModelo();
        controlador = new HanoiControlador(this,modelo);
        setListeners(controlador);

    }

    public void paint(Graphics g){
        count++;
        System.out.println("**: " + count);

        super.paint(g);


        w = getWidth();
        h = getHeight();

        if(h>400)
            h = 400;

        g.drawImage(Utilidades.AjustarImagen("Recursos/Hanoi-Component.png",(int)(w*0.80),(int)(h*0.80)).getImage(),(int)(w*0.10),30,null);
        if(start){
            g.drawImage(Utilidades.AjustarImagen("Recursos/comp1.png",(int)(w*0.20),(int)(7)).getImage(),(int)(w*0.13),(int)(h*0.87),null);

        }

    }

    public void setTowers(String cant){
        this.cant = Integer.parseInt(cant);
        btn.setEnabled(true);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        w = getWidth();
        h = getHeight();

        //label.setBorder(new LineBorder(Color.red));
        label.setSize((int)(w*0.32),33);
        label.setLocation((int)(w*0.11),(3+0*3));

        //combo.setBorder(new LineBorder(Color.red));
        combo.setSize((int)(w*0.15),20);
        combo.setLocation((int)(w*0.45),(9+0*3));

        //btn.setBorder(new LineBorder(Color.red));
        btn.setSize((int)(w*0.25),20);
        btn.setLocation((int)(w*0.62),(9+0*3));
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
