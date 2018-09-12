public class Ex1_4{
    public static void main(String[] args){
        final double tax = 1.08;
        int fax = 50;
        System.out.println("This Fax's price decresed from 50 thousand to 40 thousand");
        fax = 40;
        System.out.println("New Fax's price is " + fax * tax +" Thousand yen");
    }
}