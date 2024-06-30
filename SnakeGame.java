
package snakegame;

import javax.swing.*;
public class SnakeGame extends JFrame {
    SnakeGame(){
        super("Snake Game");//must be the first statement else error;
        add(new Board());
        pack();// Inorder refect changes Reload can be used again and again
        setResizable(false);
        setLocationRelativeTo(null);
       
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new SnakeGame(). setVisible(true);
    }
    
}
