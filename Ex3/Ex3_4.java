public class Ex3_4{
    public static void main(String[] args){
        System.out.println("Your Fortune");
        int fortune = new java.util.Random().nextInt(4) + 1;

        if(fortune == 1){
            System.out.println("Great Fortune");
        }else if(fortune == 2){
            System.out.println("Middle Fortune");
        }else if(fortune == 3){
            System.out.println("Fortune");
        }else{
            System.out.println("Bad Fortune");
        }
    }
 }