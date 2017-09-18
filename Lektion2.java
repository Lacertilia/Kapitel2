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
        JOptionPane.showMessageDialog(null, info);*/
        String firstname = JOptionPane.showInputDialog(null, "Ditt f" + '\u00F6' + "rnamn?");
        String lastname = JOptionPane.showInputDialog(null, "Ditt efternamn?");
        String fullname = firstname + " " + lastname;
        JOptionPane.showMessageDialog(null, "Du heter " + fullname + " :)");
    }
}