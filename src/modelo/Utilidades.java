package modelo;

import javax.swing.ImageIcon;

public class Utilidades {
    public Utilidades() {
    }

    public static String padString(String var0, int var1) {
        for(int var2 = var0.length(); var2 < var1; ++var2) {
            var0 = var0 + " ";
        }

        return var0;
    }

    public static ImageIcon AjustarImagen(String var0, int var1, int var2) {
        ImageIcon var3 = new ImageIcon(var0);
        ImageIcon var4 = new ImageIcon(var3.getImage().getScaledInstance(var1, var2, 4));
        return var4;
    }

    public static int random(int var0, int var1) {
        int var2 = (int)(Math.random() * (double)(var0 - var1 + 1)) + var1;
        return var2;
    }
}