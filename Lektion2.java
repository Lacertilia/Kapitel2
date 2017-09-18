import javax.swing.*;

public class Lektion2{
    public static void main(String[] args) {
        String name = "Rasmus";
        String adress = "Hemma";
        String tfn = "0776969699";
        String info = name + "\n" + adress + "\n" + tfn;
        JOptionPane.showMessageDialog(null, info);
    }
}