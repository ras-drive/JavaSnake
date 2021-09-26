import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(String args){
        this.add(new GamePanel(args));
        this.setTitle("Snake");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
