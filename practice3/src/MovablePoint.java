public class MovablePoint implements Movable {
    private int x;
    private  int y;
    private int speedX;
    private int speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void moveUp() {
        this.y += speedY;
    }

    public void moveDown() {
        this.y -= speedY;
    }

    public void moveLeft() {
        this.x += speedX;
    }

    public void moveRight() {
        this.x -= speedX;
    }

    public String toString() {
        return this.x + ", " + this.y;
    }
}