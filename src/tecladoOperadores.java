import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class tecladoOperadores extends JPanel {
    public tecladoOperadores() {
        setLayout(new GridLayout(5, 1, 10, 10));
        setBorder(new EmptyBorder(0, 5, 20, 10));
        JButton mas = new JButton("+");
        JButton menos = new JButton("-");
        JButton por = new JButton("x");
        JButton div = new JButton("/");
        JButton igual = new JButton("=");

        add(mas);
        mas.setFont(new Font("arial", Font.BOLD, 40));
        mas.setBackground(Color.red);
        mas.setForeground(Color.WHITE);

        add(menos);
        menos.setFont(new Font("arial", Font.BOLD, 40));
        menos.setBackground(Color.red);

        add(por);
        por.setFont(new Font("arial", Font.BOLD, 40));
        por.setBackground(Color.red);

        add(div);
        div.setFont(new Font("arial", Font.BOLD, 40));
        div.setBackground(Color.red);

        add(igual);
        igual.setFont(new Font("arial", Font.BOLD, 40));
        igual.setBackground(Color.red);
    }

}
