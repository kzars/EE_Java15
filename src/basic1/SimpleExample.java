package basic1;

public class SimpleExample {
    public static void main(String[] args) {
        int y = 0;
        for(int i = 0; i < 4; i++){
            System.out.println("y = " + y);
            y += i;
            System.out.println("i = " + i);
        }
    }
}
