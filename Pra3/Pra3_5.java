public class Pra3_5{
    public static void main(String[] args) {
        System.out.println("[MENU]\n1:Search\n2:Registration\n3:Delete\n4:Change");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch(selected){
            case 1:
            System.out.println("Searching now");
            break;
            case 2:
            System.out.println("Registration now");
            break;
            case 3:
            System.out.println("Delite now");
            break;
            case 4:
            System.out.println("Chande now");
            break;
        }
    }
}