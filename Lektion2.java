import javax.swing.*;
/*Rasmus Mattas
Skriver ut ditt namn efter du skrivit det.
18/9-17
*/
public class Lektion2{
    public static void main(String[] args) {
        /*String name = "Rasmus";
        String adress = "Hemma";
        String tfn = "0776969699";
        String info = name + "\n" + adress + "\n" + tfn;
        JOptionPane.showMessageDialog(null, info);
        String firstname = JOptionPane.showInputDialog(null, "Ditt f" + '\u00F6' + "rnamn?");
        String lastname = JOptionPane.showInputDialog(null, "Ditt efternamn?");
        String fullname = firstname + " " + lastname;
        JOptionPane.showMessageDialog(null, "Du heter " + fullname + " :)");
        char stort = '\u00D8';
        char litet = '\u00F8';
        char pi = '\u03C0';
        JOptionPane.showMessageDialog(null, stort);
        JOptionPane.showMessageDialog(null, litet);
        JOptionPane.showMessageDialog(null, pi);
        String a = "Programspråk";
        String b = a.charAt(1) + a.substring(5, 8) + a.charAt(5);
        JOptionPane.showMessageDialog(null, b);*/
        String a, b;
        a = "Erik Andersson 860314-2714";
        int d1 = a.indexOf('1');
        int d2 = a.indexOf('-');
        int m = a.indexOf('0');
        b = a.substring(d1, d2) + "/" + a.substring(m, d1);
        JOptionPane.showMessageDialog(null, b);
        }
}