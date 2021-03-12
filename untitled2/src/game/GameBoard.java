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
        Component mouseClick = new MouseClick();
    }



    private static class GamePanel {


        private PlayerATerritory[][] tileCollection;

        public void paint(Graphics g) {
            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 9; col++) {

                    this.renderTiles(g, row, col);
                    Color tileColor = this.getTileColor(col, row);
                    this.getTileCollection();
                    GameOver();
                }

            }
        }

        private void GameOver() {
        }

        private void getTileCollection() {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 9; j++) {
                    this.tileCollection[i][j] = (new PlayerATerritory());
                }
            }

            for (int i = 2; i < 5; i++) {
                for (int j = 0; j < 9; j++) {
                    this.tileCollection[i][j] = (new Battlefield(i, j));
                }
            }

            for (int i = 5; i <= 6; i++) {
                for (int j = 0; j < 9; j++) {
                    this.tileCollection[i][j] = (new PlayerBTerritory(i,j));
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

        private void renderTiles(Graphics g, int row, int col) {


        }

        private static class PlayerATerritory {
            public PlayerATerritory() {
            }
        }

        private static class Battlefield extends PlayerATerritory {
            public Battlefield(int i, int j) {
                super();
            }
        }

        private static class PlayerBTerritory extends PlayerATerritory {
            private PlayerBTerritory(int i, int j) {
            }
        }
    }

    private static class MouseClick extends Component {
    }
}