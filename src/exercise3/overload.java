package exercise3;

public class overload {

    public static String Method1 (int x, double y){
        String result = String.format("This is int + double. x = %d y = %.02f",x,y);
        return result;
    }
    public static String Method1 (double x, int y) {
        String result = String.format("This is double + int. x = %.02f y = %d",x,y);
        return result;
    }
    public static String Method1 (int x, String y) {
        String result = String.format("This is int + String. x = %d y = %s",x,y);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Method1(2.2, 1));
        System.out.println(Method1(1, 2.2));
        System.out.println(Method1(1, "string"));
    }
}
