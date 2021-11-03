import java.util.Scanner;
public class Throw1 {
    



    public static void main(String[] args) {
        int num = 0;
        int den = 0;
        Scanner input = new Scanner(System.in);

        try {
            //scanner
            System.out.println("Math calculator");
            //enter a numerator
            System.out.println("Enter a numerator: ");
            num = input.nextInt();
            //enter a denominator
            System.out.println("Enter a denominator: ");
            den = input.nextInt();
            //if den is 0
            if (den == 0) {
                //throw exception
                throw new ArithmeticException("Cannot divide by zero");
            }
            //calculate the quotient
            System.out.println("The quotient is: " + num / den);
            //close input
            
        } catch (ArithmeticException e) {
            System.out.println("Math Problem : " + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Program complete");
            input.close();
        }
        //PRODUCT IS

        System.out.println("The product is: " + num * den);
        // print operation done
        System.out.println("Operation done");
    }

    //end of main
    }
//end of class

    
}