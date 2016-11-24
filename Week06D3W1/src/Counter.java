import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Viktor on 2016.11.23..
 */
public class Counter extends JFrame{
    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;

    private int clicks = 0;

    public Counter() {
        createView();

        setTitle("Click Me!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200,30));
        panel.add(labelCount);
        updateCounter();

        buttonCounter = new JButton("Click me!");
        buttonCounter.addActionListener(new ButtonCounterActionListener());
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ButtonResetActionListener());
        panel.add(buttonReset);

    }

    private void updateCounter(){
        labelCount.setText("Clicked "+clicks+" times");
    }


    private class ButtonResetActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks=0;
            updateCounter();

        }

    }

    private class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();

        }

    }

}
