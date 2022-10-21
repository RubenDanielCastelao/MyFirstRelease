import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Funsiones calcSuma = new Funsiones();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
        int numb = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero: "));
        System.out.println("La suma es: " + calcSuma.suma(num1,numb));
    }
}