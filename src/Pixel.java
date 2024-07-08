public class Pixel {
    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        try {
            if (x < 0) {
                ArithmeticException ae = new ArithmeticException("x co-ordinate can not be negative!");
                throw ae;
            }
            this.x = x;
        }
        catch (ArithmeticException ae) {
            this.x = 0;
            System.out.println("X co-ordinate reset");
        }

    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws ArithmeticException, NumberFormatException{
        if(y < 0) {
            throw  new ArithmeticException("Y co-ordinate can not be negative...");
        }
        this.y = y;
    }

    public void draw() {
        System.out.println("x = " + x + " y = " + y);
    }
}
