/**
 * Created by Viktor on 2016.11.23..
 */
import javax.swing.*;
import java.awt.*;


public class HelloWorld extends JFrame {

    public HelloWorld() {

        this.setSize(400, 400);

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        JPanel pa;
        JLabel lb;

        this.setTitle("Hello world");
        this.setSize(400, 400);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width/2)-(this.getWidth()/2);
        int yPos = (dim.height/2)-(this.getWidth()/2);
        this.setLocation(xPos,yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pa = new JPanel();
        lb = new JLabel("Hello world!");
        this.add(pa);
        pa.add(lb);

        for (String labels : hellos) {
            pa.add(new JLabel(labels));
        }
        setVisible(true);
    }
}