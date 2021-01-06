package sample;

import javafx.scene.image.ImageView;

import java.io.Serializable;

public abstract class Actor implements Serializable {
    protected double x;
    protected int y;
    protected double speed;
    protected boolean dead;
    private transient ImageView imView;

    public Actor(double x, int y, double speed){
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.dead=false;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x += x;
    }
    public void setX_(double x) {
        this.x -= x;
    }


    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y += y;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDead() {
        return dead;
    }
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setImview(ImageView imview) {
        this.imView = imview;
    }

    public ImageView getImview() {
        return imView;
    }

    public abstract void act();
    public abstract void act2();
}