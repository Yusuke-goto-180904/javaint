public class Ex2_15{
    public static void main(String[] args){
        System.out.println("Please tell me your name ?");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("Please tell me your age ?");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("Your name is " + name + "," + "Your age is " + age + ".");
    }  
}