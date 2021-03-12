package Figures;


import game.GameTile;

import java.awt.*;

public abstract class Piece {
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


    public Piece() {
        this.row = row;
        this.col = col;
    }

    public abstract void drawFigure(Graphics g);

    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getAttack() {
        return attack;
    }

    public int getShield() {
        return shield;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackRange() {
        return getAttackRange();
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean isMoveValid(int row, int col);
}