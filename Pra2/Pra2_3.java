public class Pra2_3{
    public static void main(String[] args){
        System.out.println("Welcome to fortune house !");
        System.out.println("Please tell me your name ?");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("Please tell me your age ?");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("Your result,");
        System.out.println(age  + " years old " + name + ".");
        System.out.println("Your fortune number is " + fortune + ".");
        System.out.println(" 1:great fortune\n 2:middle fortune\n 3:fortune\n 4:bad fortune");
    }
}