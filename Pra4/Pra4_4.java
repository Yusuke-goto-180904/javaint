public class Pra4_4{
    public static void main(String[] args){
        int[] numbers = {3,4,9};
        System.out.println("Please tell me number");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int i = 0;i<numbers.length;i++){
        if(input == numbers[i]){
            System.out.println("hit!");
        } 
        }
    }
}