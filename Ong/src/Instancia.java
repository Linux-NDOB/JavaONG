import javax.swing.*;
import java.awt.*;

public class Instancia {

    private int valorDonacion;

    private int instituciones;

    private int niños;

    private int salud;

    private int bolsa;

    public Instancia() {
        valorDonacion = 0;
        instituciones = 0;
        niños = 0;
        salud = 0;
        bolsa = 0;
    }

    public void pediryMostrar(){

        valorDonacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "¿cual fue el valor de la donacion?"));

        if (valorDonacion > 10000000) {
            instituciones = ((30 * valorDonacion) / 100);
            niños = ((30 * valorDonacion) / 100);
            salud = ((20 * valorDonacion) / 100);
            bolsa = ((20 * valorDonacion) / 100);
        }
        else if (valorDonacion < 10000000)
                 instituciones = ((20*valorDonacion)/100);
                  niños =  ((20*valorDonacion)/100)*-1;
                  salud = ((20*valorDonacion)/100)*-1;
                  bolsa = ((40*valorDonacion)/100);


        JOptionPane.showMessageDialog(null , "El valor de la donacion es: " + valorDonacion +"\n"+
                "El valor a instituciones es: " + instituciones +"\n"+
                "El valor de la niños es: " + (niños*-1) +"\n"+
                "El valor a salud  es: " + (salud*-1) +"\n"+
                "El valor a bolsa es: " + bolsa +"\n");


    }

}
