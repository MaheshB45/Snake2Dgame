import javax.swing.*;
//Main SnakeGame class
public class SnakeGame extends JFrame {
    Board board;
    SnakeGame(){
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        //Initialize snake game
        SnakeGame snakeGame = new SnakeGame();
    }
}