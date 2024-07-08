public class Main {
    public static void main(String[] args)  throws InterruptedException {

        Thread.sleep(2000);

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }


        int [] arr = {10, 20, 30, 40, 50, 60, 70};

        Pixel p1 = new Pixel(100, 100);
        p1.draw();

        System.out.println();

        p1.setX(-10);
        p1.draw();

        System.out.println();


        //p1.setY(-20);

        try {
            p1.setY(-20);
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

        System.out.println("Main continues");




        /*try {
            System.out.println("DB Connection Created");

            System.out.println("Last ele: " + arr[6]);

            int res = 10/2;
            System.out.println("res = " + res);

            try {
                Object obj = new int[]{11, 22, 33};
                //Object obj = "Demo String";
                String str = (String) obj;
            }
            catch (NullPointerException ne) {
                System.out.println("Null pointer exception");
            }
            *//*catch (ClassCastException ce) {
                System.out.println("Invalid type casting " + ce.getMessage());
            }*//*

            System.out.println("End of outer try");
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid index!");
        }
        catch (ArithmeticException ae) {
            System.out.println("Invalid arithmetic operation...");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("DB Connection closed");
        }*/

    }
}
