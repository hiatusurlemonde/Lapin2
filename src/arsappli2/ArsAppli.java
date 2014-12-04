/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsappli2;

/**
 *
 * @author hiatus
 */
public class ArsAppli {

    static int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Little poney world, loool !");
        System.out.println("TABULATIOOOOOOON, B*tche !");
        Lapin jeannot = new Lapin("Jeannaut", 4);
        while (i <= 10) {
            jeannot.talk();
            ++i;
        }

    }

}
