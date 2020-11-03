package vista;

import modelo.Utilidades;

import java.awt.*;


public class HanoiPaint extends Canvas {
    Graphics g;
    Image buffer = null;

    public HanoiPaint(){

    }

    public void paint(Graphics g) {
        if (buffer == null) {
            buffer = createImage(getWidth(), getHeight());
            this.g = buffer.getGraphics();
            repaint();
            return;
        }

        Dibuja();
        g.drawImage(buffer, 0, 0, getWidth(), getHeight(), this);


    }

    private void Dibuja(){
        g.drawImage(Utilidades.AjustarImagen("Recursos/Hanoi-Component.png",this.getWidth(),this.getHeight()).getImage(),0,0,null);
        g.drawImage(Utilidades.AjustarImagen("Recursos/comp1.png",100,10).getImage(),11,145,null);
        g.drawImage(Utilidades.AjustarImagen("Recursos/comp2.png",80,10).getImage(),21,135,null);
        g.drawImage(Utilidades.AjustarImagen("Recursos/comp3.png",60,10).getImage(),31,125,null);
        g.drawImage(Utilidades.AjustarImagen("Recursos/comp4.png",40,10).getImage(),41,115,null);
        g.drawImage(Utilidades.AjustarImagen("Recursos/comp5.png",20,10).getImage(),51,105,null);

    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

}
