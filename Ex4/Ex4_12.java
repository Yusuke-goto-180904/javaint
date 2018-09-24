public class Ex4_12{
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b;
        System.out.println(a[0]);
        b = a; 
        b[0] = 100;
        System.out.println(a[0]);
    }
}