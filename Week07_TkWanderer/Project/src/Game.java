import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Viktor on 2016.12.05..
 */
public class Game extends JFrame {
    public Game() {

        this.add(new Board());
        setTitle("Victor's Wanderer - The RPG game");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        this.setSize(500, 500);
        this.setMinimumSize(new Dimension(500, 528));
        //setPreferredSize(new Dimension(720, 720));
        //setVisible(true);
        this.pack();

    }
}