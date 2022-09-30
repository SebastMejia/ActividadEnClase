import java.util.Scanner;

public class NumeroCifras {
	  public static void main(String[] args) {
		   Scanner sn = new Scanner(System.in);
		   int n, cifras;
		   char car;
		   
		   System.out.println("Ingrese un numero entero");
		   n = sn.nextInt();
		   cifras= 0;
		   
		   do {
			 
			  
 				n = n/10;
			   cifras++;
			  
		   } while(n!=0);
		  
		   System.out.println("El numero tiene "+cifras+" cifras");
		   
	  }}