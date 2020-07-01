import java.util.Locale;
import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		//String x = sc.next();
		//double y = sc.nextDouble();
		//char z = sc.next().charAt(0);
		//System.out.println("Voce digitou: " + x + " " + y + " " + z);
		// Separados por espaco contam como dados separados
		int x;
		String x1,x2,x3;
		x=sc.nextInt();
		sc.nextLine(); //Absorveu o "enter"
		x1=sc.nextLine();
		x2=sc.nextLine();
		x3=sc.nextLine();
		System.out.println(x);
		System.out.printf("Eu digitei: '%s', e '%s', e '%s'%n",x1,x2,x3);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		sc.close();
	}

}
