package basic2;

public class Methods {
    public static void main(String[] args) {

        //printPersonInfo("Kārlis",1900);
        //printPersonInfo("Bob", 2012);

        String[] names = new String[]{"Kārlis", "Tom", "Bob"};

        //System.out.println(getFirstInLine(names));

        multi(40,7);
        multi(5,7);

    }

    static void printPersonInfo(String name, int birthYear){
        int age;
        age = 2021-birthYear;
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }

    static String getFirstInLine(String[] namesList){
        return namesList[0];
    }

    static void multi(int num1, int num2){
        System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
    }



}
