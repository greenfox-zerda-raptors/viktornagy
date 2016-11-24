import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Viktor on 2016.11.23..
 */
public class MemoryApp extends JFrame{
    private JTextField inputArea;
    private JButton buttonReset;
    private JLabel labelActual,labelPrev;

    private String momText="";
    private String prevText="";

    public MemoryApp() {
        createView();

        setTitle("UI Controls Sample!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

    }

    private void createView() {
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();



        getContentPane().add(panel);
        getContentPane().add(panel2);
        getContentPane().add(panel3);


        inputArea=new JTextField();
        inputArea.setPreferredSize(new DimensionUIResource(300,35));
        inputArea.addKeyListener(new inputKeyListener());

        panel.add(inputArea, BorderLayout.PAGE_START);


        labelActual = new JLabel();
        labelActual.setPreferredSize(new Dimension(400,30));
        panel2.add(labelActual);

        labelPrev = new JLabel();
        labelPrev.setPreferredSize(new Dimension(400,30));
        panel3.add(labelPrev);

        updateTexts();


        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ButtonResetActionListener());
        panel.add(buttonReset);

        getContentPane().setLayout(
                new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

    }

    private void updateTexts(){
        prevText=momText;
        momText=this.inputArea.getText();

        this.labelPrev.setText("Prev. String: "+prevText);
        this.labelActual.setText("Actual String: "+momText);

    }

    private void resetMemory(){
        this.labelPrev.setText("Prev. String: ");
        this.labelActual.setText("Actual String: ");
    }


    private class inputKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER)
            {
                updateTexts();
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private class ButtonResetActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            resetMemory();
        }
    }

}