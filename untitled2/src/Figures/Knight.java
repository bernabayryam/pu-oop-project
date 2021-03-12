package Figures;

import game.GameTile;

import java.awt.*;

public class Knight extends Piece {

    public Knight(int row, int col, Color color) {

        this.row = row;
        this.col = col;
        this.color = color;
        this.id = "K";
        this.attack = 8;
        this.shield = 3;
        this.health = 15;
        this.attackRange = 1;
        this.speed = 1;

    }
    public  void drawFigure(Graphics g) {
        int x = this.col * GameTile.TILE_SIZE;
        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 10,50,50);
        g.setColor(Color.BLACK);
        g.drawString(" K ", x + 30, y + 40);
    }

    @Override
    public boolean isMoveValid(int row, int col) {
        return false;
    }
}
