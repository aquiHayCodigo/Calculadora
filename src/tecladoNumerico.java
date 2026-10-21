import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JPanel; // sin importar el getActionMap() da error
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class tecladoNumerico extends JPanel{
    private InputMap mapaEntrada =  getInputMap(WHEN_IN_FOCUSED_WINDOW);
    private ActionMap mapaAcciones = getActionMap();

    public tecladoNumerico(){
        setLayout(new GridLayout(4,3,10,10)); // valores sacados de App en JPanel tecladoNum
        setBorder(new EmptyBorder(0,10,0,5));
        for(int i = 1; i <= 9; i++){ // Bucle para generar botones del 0-9 para no generar 1 a 1
            String caracter = i + "";
            char tecla = (char) (i + '0');
            JButton boton = new JButton(caracter);
            boton.setFont(new Font("arial", Font.BOLD, 40));
            boton.setBackground(Color.ORANGE);
            add(boton);
            setBinding(tecla, boton);

        }
    }

    private void setBinding(char c, final JButton boton){
    KeyStroke teclaPres= KeyStroke.getKeyStroke(Character.toLowerCase(c));
    mapaEntrada.put(teclaPres, teclaPres.toString());
    mapaAcciones.put(teclaPres.toString(), new AbstractAction(){

        @Override 
        public void actionPerformed(ActionEvent e){
            boton.doClick();
        }
    });

}
}

