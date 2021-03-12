package game;

import javax.swing.*;
import java.awt.*;

class GameBoard extends JFrame {

    GameBoard() {

        this.setTitle("Knights,Elves,Dwarfs");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocation(300, 200);
        new GamePanel();
    }


    private static class GamePanel {


        public void paint(Graphics g) {
            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 9; col++) {

                    g.setColor(Color.BLACK);
                    g.drawRect(0, 0, 100, 100);

                    Color tileColor = this.getTileColor(row, col);
                    GameTile tile = new GameTile(row, col);
                    tile.render(g);


                }
            }
        }

        private Color getTileColor(int row, int col) {

            boolean isRowEven = (row % 2 == 0);
            boolean isColEven = (col % 2 == 0);


            if (!(row == 2) && !(row == 3) && !(row == 4)) {
                if (isRowEven) return Color.DARK_GRAY;
                if (isColEven) return Color.DARK_GRAY;
            }
            return Color.GRAY;
        }
    }
}