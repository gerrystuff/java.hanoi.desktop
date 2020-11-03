import vista.Hanoi;

import javax.swing.*;
import java.awt.*;

public class AppHanoi extends JFrame {

  Hanoi hanoi1,hanoi2,hanoi3;
    public AppHanoi() {
        super("Mis Torres de vista.Hanoi");
        interFace();
    }

    private void interFace(){
//        String cant = JOptionPane.showInputDialog("INGRESE CANTIDAD DE TORRES DE HANOI");
//        cantidad = Integer.parseInt(cant);


        setSize(900,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(0,3));

        hanoi1 = new Hanoi();
        hanoi2 = new Hanoi();
        hanoi3 = new Hanoi();

        add(hanoi1);
        add(hanoi2);
        add(hanoi3);
        setVisible(true);


    }
    public static void main(String[] args) {

        new AppHanoi();


    }
}
