package basic2;

public class BreakCon {
    public static void main(String[] args) {

        //Break
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("-----------");

        //CONTINUE
        boolean con = false;

        for (int i = 0; i < 10; i++) {
            if (i == 5 && con == true) {
                continue;
            }
            System.out.println(i);
        }


    }
}
