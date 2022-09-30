import java.util.Scanner;

public class Añobisiesto {
   public static void main(String[] args) {
   Scanner sn = new Scanner(System.in);
  
   System.out.println("Ingrese el valor del año");
   int year = sn.nextInt();
   
   if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
   System.out.println("El año " + year + " es bisiesto");
   } else {
	   System.out.println("El año " + year + " no es bisiesto");
   }
   
}
}
