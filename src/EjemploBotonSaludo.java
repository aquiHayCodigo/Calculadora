import java.awt.FlowLayout; // Importa la clase FlowLayout
import java.awt.Frame;     // Importa la clase Frame
import java.awt.Button;    // Importa la clase Button
import java.awt.event.WindowAdapter; // Importa WindowAdapter para manejar eventos de la ventana
import java.awt.event.WindowEvent;   // Importa WindowEvent
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploBotonSaludo {
    public static void main(String[] args) {
        //Creamos el marco principal
        JFrame frame = new JFrame("Ejemplo de botón con función asignada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);
        frame.setLayout(new FlowLayout());

        //Creamos campo de texto
        JTextField nombreField = new JTextField();
        nombreField.setColumns(24);
        frame.add(nombreField);

        //Creamos el botón
        JButton botonSaludar = new JButton("Saludar");

        //Añadimos botón al marco
        frame.add(botonSaludar);
        

        frame.setVisible(true);

        //Definimos el ActionListener y lo asociamos al botón
        botonSaludar.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                JFrame saludoFrame = new JFrame("Saludo");
                saludoFrame.setSize(320,200);
                saludoFrame.setLayout(new FlowLayout());
                JLabel saludoLabel = new JLabel("Hola " + nombre);
                saludoFrame.add(saludoLabel);
                saludoFrame.setVisible(true);
            }
        });
    }
}