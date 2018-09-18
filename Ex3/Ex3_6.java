public class Ex3_6{
    public static void main(String[] args){
        System.out.println("Your Fortune");
        int fortune = new java.util.Random().nextInt(8) + 1;
        switch (fortune){
            case 1:
                System.out.println("Great Fortune");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Middle Fortune");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Fortune");
                break;
            case 8:
                System.out.println("Bad Fortune");
                break;
        }
    }
}