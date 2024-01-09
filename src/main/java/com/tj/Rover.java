package com.tj;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void spinLeft() {
        int updatedDirection = (direction.ordinal() - 1 + 4) % 4;
        direction = Direction.values()[updatedDirection];
    }

    public void spinRight() {
        int updatedDirection = (direction.ordinal() + 1) % 4;
        direction = Direction.values()[updatedDirection];
    }

    public void move() {
        switch (direction) {
            case N:
                moveUp();
                break;
            case E:
                moveRight();
                break;
            case S:
                moveDown();
                break;
            case W:
                moveLeft();
                break;
        }
    }

    private void moveUp() {
        y += 1;
    }

    private void moveDown() {
        y = Math.max(y - 1, 0);
    }

    private void moveLeft() {
        x = Math.max(x - 1, 0);
    }

    private void moveRight() {
        x += 1;
    }
}
