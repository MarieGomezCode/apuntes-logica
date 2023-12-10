package apuntes;

import java.util.Scanner;

public class AplicacionWhile {
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Ingrese 1 para inicializar");
	 int init = sc.nextInt();
	 
	 
	  
	 
	 while(init != 0) {
		 System.out.println("Seleccione una opcion  \n"
				 + "1.Registrarse\n"
				 + "2.Iniciar Seccion\n"
				 + "3.Salir\n"
				 
				 
				 
				 );
		 int opc = sc.nextInt();
		 switch (opc){
			 
			 case 1:
				 System.out.println("Registro");
				 break;
			 case 2:
				 System.out.println("Iniciar Seccion");
				 break;
			 case 3:
				 System.out.println("Salir");
				 break;
				 
		
		 }
		 
	 }
	 
}
}
