package Figures;

import game.GameTile;

import java.awt.*;

public class Elf extends Piece {


    private GameTile Tile;

    public Elf(int row, int col, Color color) {

        this.row = row;
        this.col = col;
        this.color = color;
        this.id = id;
        this.attack = attack;
        this.shield = shield;
        this.health = health;
        this.attackRange = attackRange;
        this.speed = speed;


    }
    public void drawFigure(Graphics g) {
        int x = this.col * GameTile.TILE_SIZE;
        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 10,50,50);
        g.setColor(Color.BLACK);
        g.drawString(" E ", x + 30, y + 40);
    }

    @Override
    public boolean isMoveValid(int row, int col) {
        return false;
    }

}


