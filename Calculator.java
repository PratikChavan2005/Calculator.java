
import java.util.Scanner;

class Calculator{
    public static void main(String[]args){
        double num1 ,num2,result;
        int n;
        System.out.println("Simple calculator");
        Scanner number = new Scanner(System.in);
            System.out.println("Enter num1 :-");
                num1=number.nextDouble();
            System.out.println("Eneter num2 :-");
                num2=number.nextDouble(); 
            System.out.println("1/Addition");
            System.out.println("2/substraction");
            System.out.println("3/multiply");
            System.out.println("4/divsion");
            System.out.println("Enter choice ");
         n=number.nextInt();
         switch(n) {
             case 1:
                result=num1+num2;
                System.out.println("Addition is " + result);
                 break;
            case 2:
                result=num1-num2;
                System.out.println("Sub is " + result);
                 break;
            case 3:
                result=num1*num2;
                System.out.println(" mutliply is " + result);
                 break;
            case 4:
                result=num1/num2;
                System.out.println(" division is " + result);
                 break;
             default:
                if(n>4){
                 System.out.println("Inavlid option ");
                }
         }
         
         
    }
}
