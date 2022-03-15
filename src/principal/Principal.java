package principal;

public class Principal {
	public static void main(String[] args) {
		// primitivos
		int numero1;
		numero1 = 100000;
		float numero2;
		numero2 = 1.23f;
		byte numero3;
		numero3 = -50;
		short numero4;
		numero4 = 20000;
		long numero5;
		numero5 = -2L;
		double numero6;
		numero6 = 1.2345e300d;
		boolean sentencia;
		sentencia = true;
		char letra;
		letra = 'M';
		System.out.println("***********************************************************************************");
		System.out.println("* NOMBRE	*		   LONGITUD		        *	EJEMPLO");
		System.out.println("                                                                                   *");
		System.out.println("* int		*	   -2147483648 a 2147483647 		*	"+ numero1);
		System.out.println("                                                                                   *");
		System.out.println("* float	   	*     ± 3.4x(10*(-38)) a ± 3.4x(10(38)) 	*       "+ numero2);
		System.out.println("                                                                                   *");
		System.out.println("* byte		*       	  -128 a 127 		        *	"+ numero3);
		System.out.println("                                                                                   *");
		System.out.println("* short		*      	        -32768 a 32767 		        *	"+ numero4);
		System.out.println("                                                                                   *");
		System.out.println("* long   	* -9223372036854775808 a 9223372036854775807 	*	"+ numero5);
		System.out.println("                                                                                   *");
		System.out.println("* double:	*     ± 1.8x(10(-308)) a ± 1.8x(10(308)) 	*	"+ numero6);
		System.out.println("                                                                                   *");
		System.out.println("* boolean:	*		  true ó false 		        *	"+ sentencia);
		System.out.println("                                                                                   *");
		System.out.println("* char:		*	   	 u0000 a uFFFF                  *        "+ letra);
		System.out.println("                                                                                   *");
		System.out.println("***********************************************************************************");

	}
}
