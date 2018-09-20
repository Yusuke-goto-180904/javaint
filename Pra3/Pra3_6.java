public class Pra3_6{
    public static void main(String[] args){
        System.out.println("Number Game !");
        int ans = new java.util.Random().nextInt(10);
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Please tell me Number !");
            int num = new java.util.Scanner(System.in).nextInt();
            if(num == ans){
                System.out.println("Win !");
                break;
            }else{
                System.out.println("False");
                }
            }
            System.out.println("Game Over");
        }
    }