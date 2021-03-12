package game;
import Figures.Piece;
import sun.print.PathGraphics;

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


        private PlayerATerritory[][] tileCollection;
        private boolean GameOver;
        private int Score;
        private int eScore;
        private Piece selectedPiece;


        /**
         * Method which draw the game board
         *
         * @param g
         */
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

            PathGraphics g = null;
            if (Score == 1200) {
                g.setColor(Color.YELLOW);
                g.setFont(new Font("YES", Font.ITALIC, 100));
                g.drawString("WIN", 120, 2);
            }
            if (eScore == 1200) {
                g.setColor(Color.RED);
                g.setFont(new Font("YES", Font.ITALIC, 100));
                g.drawString("WIN", 120, 2);
            }
        }

        private void setColor(Color yellow) {
        }

        private void getTileCollection() {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 9; j++) {
                    this.tileCollection[i][j] = (new PlayerATerritory());
                }
            }

            for (int i = 2; i < 5; i++) {
                for (int j = 0; j < 9; j++) {
                    this.tileCollection[i][j] = (new Battlefield());
                }
            }

            for (int i = 5; i <= 6; i++) {
                for (int j = 0; j < 9; j++) {
                    this.tileCollection[i][j] = (new PlayerBTerritory());
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
            if (this.isThereTile(row, col)) {
                Tile t = (Tile) this.getTile(row, col);
                t.drawTiles(g);
            }
        }

        private Object getTile(int row, int col) {
            return this.tileCollection;

        }

        private boolean isThereTile(int row, int col) {
            return this.tileCollection != null;
        }


        }
    }
