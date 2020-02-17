package entity;

import Interface.ICoordinates;

import java.awt.*;

public class Coordinates implements ICoordinates {
    private int x;
    private int y;
    private int height;
    private int width;
    private int oppositeX;
    private int oppositeY;

    public Coordinates(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    /*// возможно переписать логику, пока не понятно как получим результат
    public Coordinates GetCordinats(int x, int y, int oppositeX, int oppositeY) {
        return new Coordinates(x, y, oppositeX - x, oppositeY - y);
    }*/

    public Rectangle GetRectangle()
    {
       return new Rectangle(this.x, this.y,this.width,this.height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getOppositeX() {
        return oppositeX;
    }

    public int getOppositeY() {
        return oppositeY;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", width=" + width +
                ", oppositeX=" + oppositeX +
                ", oppositeY=" + oppositeY +
                '}';
    }
}
