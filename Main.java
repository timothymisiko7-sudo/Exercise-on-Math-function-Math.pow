import java.util.Scanner; 

public class Main{

public static void main(String[]args){


    // THIS IS A CALCULATION OF COMPOUND INTREST ; 
    // amount = principal * Math.pow(1 + rate/timesCompound, timesCompound * years)
    
    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int timesCompound;
    int years;
    double amount;


    System.out.print("Enter the principal amount in $:");
    principal = scanner.nextDouble();

    System.out.print("Enter the rate (in %) :");
    rate = scanner.nextDouble() / 100;

    System.out.print("Enter the number of times compounded per year :");
    timesCompound = scanner.nextInt();

    System.out.print("Enter the number of years :");
    years = scanner.nextInt();

    amount = principal * Math.pow(1 + rate/timesCompound, timesCompound * years); 
    
    System.out.printf("The amount after %d years is : %.2f", years, amount);

    scanner.close();



}
}