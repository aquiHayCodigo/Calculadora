import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Interfaz Calculadora");

        //VENTANA aplicación con distribucion BorderLayout
        JFrame ventana = new JFrame ("Calculadora simple");
        ventana.setLayout(new BorderLayout());
        ventana.setSize(400,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //PANELES PANTALLA para la calculadora
        JPanel pantalla = new JPanel();
        pantalla.setLayout(new FlowLayout());
        pantalla.setBorder(new EmptyBorder(10,10,10,10));

        // TECLADO NUMEROS
        //JPanel.setDefaultLookAndFeelDecorated
        JPanel tecladoNum=new JPanel();
        tecladoNum.setLayout(new GridLayout(4,3,10,10));
        tecladoNum.setBorder(new EmptyBorder(0,5,0,5));
        
        // OPERADORES
        JPanel operadores = new JPanel();
        operadores.setLayout(new GridLayout(5,1,10,10));
        operadores.setBorder(new EmptyBorder(0,5,20,10));

        JPanel copyright = new JPanel();
        copyright.setLayout(new FlowLayout());

        ventana.add(pantalla, BorderLayout.NORTH);
        ventana.add(tecladoNum, BorderLayout.CENTER);
        ventana.add(operadores, BorderLayout.EAST);

        
        //Componentes para el PANEL PANTALLA
        JTextField lcdDisplay= new JTextField("0");
        lcdDisplay.setColumns(7);
        lcdDisplay.setMaximumSize(null);
        lcdDisplay.setBackground(Color.BLACK);
        lcdDisplay.setForeground(Color.WHITE);
        lcdDisplay.setFont(new Font("arial", Font.BOLD, 40)); 
        pantalla.add(lcdDisplay);
        
        JComboBox modCalc= new JComboBox();
        modCalc.addItem("Estandar");
        modCalc.addItem("Científica");

        pantalla.add(modCalc);
        pantalla.add(lcdDisplay);


        //Componentes para el PANEL TECLADO NUMÉRICO
        JButton n1= new JButton("1");
        n1.setFont(new Font("arial", Font.BOLD, 40));
        n1.setBackground(Color.pink);
        JButton n2= new JButton("2");
        n2.setFont(new Font("arial", Font.BOLD, 40));
        n2.setBackground(Color.pink);
        JButton n3= new JButton("3");
        n3.setFont(new Font("arial", Font.BOLD, 40));
        n3.setBackground(Color.pink);
        JButton n4= new JButton("4");
        n4.setFont(new Font("arial", Font.BOLD, 40));
        n4.setBackground(Color.pink);
        JButton n5= new JButton("5");
        n5.setFont(new Font("arial", Font.BOLD, 40));
        n5.setBackground(Color.pink);
        JButton n6= new JButton("6");
        n6.setFont(new Font("arial", Font.BOLD, 40));
        n6.setBackground(Color.pink);
        JButton n7= new JButton("7");
        n7.setFont(new Font("arial", Font.BOLD, 40));
        n7.setBackground(Color.pink);
        JButton n8= new JButton("8");
        n8.setFont(new Font("arial", Font.BOLD, 40));
        n8.setBackground(Color.pink);
        JButton n9= new JButton("9"); 
        n9.setFont(new Font("arial", Font.BOLD, 40));
        n9.setBackground(Color.pink);

        tecladoNum.add(n1);
        tecladoNum.add(n2);
        tecladoNum.add(n3);
        tecladoNum.add(n4);
        tecladoNum.add(n5);
        tecladoNum.add(n6);
        tecladoNum.add(n7);
        tecladoNum.add(n8);
        tecladoNum.add(n9);

        JButton mas= new JButton("+");
        JButton menos= new JButton("-");
        JButton por= new JButton("x");
        JButton div= new JButton("/");
        JButton igual= new JButton("=");

        operadores.add(mas);
        mas.setFont(new Font("arial", Font.BOLD, 40));
        mas.setBackground(Color.red);
        mas.setForeground(Color.WHITE);
        operadores.add(menos);
        menos.setFont(new Font("arial", Font.BOLD, 40));
        menos.setBackground(Color.red);
        operadores.add(por);
        por.setFont(new Font("arial", Font.BOLD, 40));
        por.setBackground(Color.red);
        operadores.add(div);
        div.setFont(new Font("arial", Font.BOLD, 40));
        div.setBackground(Color.red);
        operadores.add(igual);
        igual.setFont(new Font("arial", Font.BOLD, 40));
        igual.setBackground(Color.red);

        ventana.setVisible(true);

        //Listener para detectar eventos
        n1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                n1.setBackground(Color.CYAN);
            }
        });

        //comonoBox
        modCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (modCalc.getSelectedItem() == "Científica"){
                    operadores.setVisible(false); // esto oculta el panel
                } else {
                    operadores.setVisible(true);
                }
            }
        });

        //Detecta si se ha pulsado la letra M para cambio de modo
        /* String teclaModo= "M";
        teclaModo.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){
                operadores.setVisible(false);
            }
        }); */
    }
}
