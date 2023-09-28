public class MovableCircle implements Movable {
    private int radius = 0;
    MovablePoint center = new MovablePoint(0, 0, 0, 0);

    public MovableCircle(int x, int y, int speedX, int speedY, int radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
        else {
            this.radius = this.radius;
        }
        this.center = new MovablePoint(x, y, speedX, speedY);
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Radius is " + this.radius + ", center is at " + this.center;
    }
}