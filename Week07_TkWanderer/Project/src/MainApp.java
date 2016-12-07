import javax.swing.*;

/**
 * Created by Viktor on 2016.12.05..
board
 move
 listen for keys associated
  safe to enter

 monstwers
  bcrease reduced
     i
   move

   heal
     no move

 */

public class MainApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Board());
        frame.pack();
        frame.setVisible(true);
    }
}