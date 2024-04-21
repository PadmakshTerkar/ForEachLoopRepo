public class ExceptionExample {
        public static void main(String args[])
        {
            try
            {
                int div = 509/0;
                int div2 =509 * 0;

            }catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println("End of the Code");
        }
}
