import java.util.*;

class convert{
    Scanner sc = new Scanner(System.in);
    double Amount;
    // String Currency_1,Currency_2
    double result;
    
    
    void getData(){
        System.out.println("Enter Amount (DOLLOR) : ");
        Amount = sc.nextInt();

    }
    void convertCurrency(){
        result = Amount * 85.4;
    }
    void showData(){
        System.out.printf("Ruppes: %.2f "+"in INR: %.2f ", Amount, result);
    }
}

public class Main{
    public static void main(String[] args){
        convert cv =  new convert();
        cv.getData();
        cv.convertCurrency();
        cv.showData();
    }
}