public class sample {
    public static void main(String[] args) {
        int no1,no2,no3;
        no1 = 10;
        no2 = 2;
        String msg = "12";

        try{
            no3 = no1/no2;
            System.out.println(no3);
            System.out.println("Equation done");

            int x = Integer.parseInt(msg);
            System.out.println(msg);
            System.out.println("Conversion done");
        }catch(ArithmeticException | NumberFormatException ex){
            System.out.println(ex);
            System.out.println("Exception caught...");
        }finally {
            System.out.println("this will anyway printed");
        }
    }
}
