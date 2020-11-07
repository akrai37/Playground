package pack1.pack2;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int days=sc.nextInt();
        
        switch(days) {
        case 1:System.out.println("Sunday");       //We have entered number "1", then it will print the current value along with the next value since, we have not used 'break' statement.
        case 2:System.out.println("Monday");break;
        case 3:System.out.println("Tuesday");break;
        case 4:System.out.println("Wednesday");break;
        case 5:System.out.println("Thursday");break;
        case 6:System.out.println("Friday");break;
        case 7:System.out.println("Saturday");break;
        default:System.out.println("invalid day");
        }
	}

}
