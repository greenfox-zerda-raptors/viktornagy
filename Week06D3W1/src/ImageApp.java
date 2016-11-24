import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

/**
 * Created by Viktor on 2016.11.23..
 */

class ImagePanel extends JPanel {

    private Image img;

    public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

}


public class ImageApp extends JFrame{




    public ImageApp() {
        createView();

        setTitle("Image Me!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);



        pack();

    }

    private void createView() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //requestFocus();
                g.drawImage(Toolkit.getDefaultToolkit().createImage("D:\\Green_fox_academy\\JAVA\\JAVA_Projects\\Week06D3W1\\src\\Tulips.jpg"),0,0,null);

            }
        };


        getContentPane().add(panel);

        ImagePanel ip=new ImagePanel(Toolkit.getDefaultToolkit().createImage("D:\\Green_fox_academy\\JAVA\\JAVA_Projects\\Week06D3W1\\src\\Tulips.jpg"));

        getContentPane().add(ip);
    }
}