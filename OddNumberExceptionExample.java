import java.util.Scanner;

public class OddNumberExceptionExample {
    public static void main(String[] args) throws OddNumberException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2!=0){
            throw new OddNumberException("Number is Odd") ;
        }
        System.out.println("Number is even");
    }
}
class OddNumberException extends Exception{
    OddNumberException(String msg){
        super(msg);
    }
}
//10