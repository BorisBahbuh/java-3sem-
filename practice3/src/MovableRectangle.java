public class MovableRectangle implements Movable {
    private MovablePoint topLeft = new MovablePoint(0, 1, 0, 0);
    private MovablePoint bottomRight = new MovablePoint(1, 0, 0, 0);

    public MovableRectangle(int x1, int y1, int x2, int y2, int spedX, int speedY) {
        this.topLeft = new MovablePoint(x1, y1, spedX, speedY);
        this.bottomRight = new MovablePoint(x2, y2, spedX, speedY);
    }

    public void moveUp() {
        if (isSpeedEquals(topLeft, bottomRight)) {
            this.topLeft.moveUp();
            this.bottomRight.moveUp();
        }
        else {
            System.out.println("Error! Points have different speed.");
        }
    }

    public void moveDown() {
        if (isSpeedEquals(topLeft, bottomRight)) {
            this.topLeft.moveDown();
            this.bottomRight.moveDown();
        }
        else {
            System.out.println("Error! Points have different speed.");
        }
    }

    public void moveLeft() {
        if (isSpeedEquals(topLeft, bottomRight)) {
            this.topLeft.moveLeft();
            this.bottomRight.moveLeft();
        }
        else {
            System.out.println("Error! Points have different speed.");
        }
    }

    public void moveRight() {
        if (isSpeedEquals(topLeft, bottomRight)) {
            this.topLeft.moveRight();
            this.bottomRight.moveRight();
        }
        else {
            System.out.println("Error! Points have different speed.");
        }
    }

    public boolean isSpeedEquals(MovablePoint point1, MovablePoint point2) {
        if (point1.getSpeedX() == point2.getSpeedX() && point1.getSpeedY() == point2.getSpeedY()) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return "Top left poin is at " + topLeft + " and bottom right point is at " + bottomRight;
    }
}