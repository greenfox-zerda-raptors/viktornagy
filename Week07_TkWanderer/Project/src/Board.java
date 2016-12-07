import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


/**
 * Created by Viktor on 2016.12.05..
 */

/*
* Keylistenerből hívódik ---> Karakter mozgató függvény ---> Mozgás ellenőrzés(maradjon pályán)
*
*
*
* */
public class Board extends JComponent {

    boolean[][] map = new boolean[][]{
            {true, true, true, false, false, false, false, false, true, true},
            {true, true, true, false, true, false, true, false, false, true},
            {true, false, false, false, true, false, true, false, false, true},
            {true, false, true, true, true, false, true, true, false, true},
            {false, false, false, false, false, false, false, false, false, false},
            {true, false, true, false, true, true, false, true, false, true},
            {true, false, true, false, true, false, false, true, false, true},
            {true, false, true, true, true, false, false, true, false, true},
            {true, false, false, false, true, true, false, true, false, true},
            {true, true, true, false, false, false, false, false, false, true},
    };

    ArrayList<GameObject> gameObjects;
    Hero hero1;
    Skeleton skeleton1;
    Skeleton skeleton2;
    ListenForKeys lForKeys;

    public Board() {
        gameObjects = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j]) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
        }
        this.hero1 = new Hero(2, 2);
        this.skeleton1 = new Skeleton(5, 5);
        this.skeleton2 = new Skeleton(6, 6);
        this.hero1.fill();
        this.lForKeys = new ListenForKeys();
        this.addKeyListener(lForKeys);

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);

    }



    private class ListenForKeys implements KeyListener {

        public void keyTyped(KeyEvent e){



        }

        public void keyPressed(KeyEvent e) {

        }

        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
        hero1.draw(graphics);
        skeleton1.draw(graphics);
        skeleton2.draw(graphics);
    }
}