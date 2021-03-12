package Figures;


import game.GameTile;

import java.awt.*;

public class Piece {
    private static final int PIECE_SIZE = 50;
    protected int row;
    protected int col;
    protected Color color;
    protected String id;
    protected int attack;
    protected int shield;
    protected int health;
    protected int attackRange;
    protected int speed;
    public GameTile tile;
    private String name;
    private int defence;


    public void renderPiece(Graphics g, GameTile Tile) {
        tile = Tile;

        int pieceX = this.col * GameTile.TILE_SIZE;
        int pieceY = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(pieceX, pieceY, PIECE_SIZE, PIECE_SIZE);
    }

}