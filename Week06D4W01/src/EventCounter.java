/**
 * Created by Viktor on 2016.11.24..
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;

public class EventCounter extends JFrame {

    JButton button1;
    JTextField textField1;
    JTextArea textArea1;
    int buttonClicked;

    public static void main(String[] args) {

        new EventCounter();
    }

    public EventCounter() {

        this.setSize(400, 400);

        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My second frame");
        JPanel thePanel = new JPanel();
        button1 = new JButton("Click Here");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);
        textField1 = new JTextField("Type Here", 15);
        ListenForKeys lForKeys = new ListenForKeys();
        textField1.addKeyListener(lForKeys);
        thePanel.add(textField1);
        textArea1 = new JTextArea(15, 20);
        textArea1.setText("Tracking Events\n");
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        thePanel.add(scrollbar1);
        this.add(thePanel);
        ListenForWindow lForWindow = new ListenForWindow();
        this.addWindowListener(lForWindow);
        this.setVisible(true);
        ListenForMouse lForMouse = new ListenForMouse();
        thePanel.addMouseListener(lForMouse);

    }


    private class ListenForButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button1) {
                buttonClicked++;
                textArea1.append("Button clicked " + buttonClicked + "times\n");
            }
        }
    }

    private class ListenForKeys implements KeyListener {

        public void keyTyped(KeyEvent e) {
            textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
        }

        public void keyPressed(KeyEvent e) {
        }

        public void keyReleased(KeyEvent e) {
        }
    }

    private class ListenForMouse implements MouseListener{

        public void mouseClicked(MouseEvent e) {
            textArea1.append("Mouse Panel Pos: " + e.getX() + " " + e.getY() + "\n");
            textArea1.append("Mouse Screen Pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
            textArea1.append("Mouse Button: " + e.getButton()  + "\n");
            textArea1.append("Mouse Clicks: " + e.getClickCount()  + "\n");
        }

        public void mouseEntered(MouseEvent arg0) {
        }

        public void mouseExited(MouseEvent arg0) {
        }

        public void mousePressed(MouseEvent arg0) {
        }

        public void mouseReleased(MouseEvent arg0) {
        }
    }

    private class ListenForWindow implements WindowListener{

        public void windowActivated(WindowEvent e) {
            textArea1.append("Window Activated\n");
        }

        public void windowClosed(WindowEvent arg0) {
        }

        public void windowClosing(WindowEvent arg0) {
        }

        public void windowDeactivated(WindowEvent e) {
            textArea1.append("Window Activated\n");
        }
        public void windowDeiconified(WindowEvent arg0) {
            textArea1.append("Window in Normal State\n");
        }
        public void windowIconified(WindowEvent arg0) {
            textArea1.append("Window Minimized\n");
        }
        public void windowOpened(WindowEvent arg0) {
            textArea1.append("Window Created\n");
        }
    }
}