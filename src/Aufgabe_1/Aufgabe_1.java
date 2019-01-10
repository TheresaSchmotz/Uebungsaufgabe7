package Aufgabe_1;

import javax.swing.*;

public class Aufgabe_1 {
    public static void main(String[] args) {

        double double_1 = Double.parseDouble(JOptionPane.showInputDialog("Gib Zahl eins an"));
        double double_2 = Double.parseDouble(JOptionPane.showInputDialog("Gib Zahl eins an"));

        int i_1 = (int)double_1;
        int i_2 = (int)double_2;
        int i_3 = i_1/i_2;

    }
}
