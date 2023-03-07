package calculoIMCCorporal;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso,estaura,IMC;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo IMC: IMC=peso/estatura^2");
		System.out.println("Introduce un peso en kg: ");
		peso=entrada.nextDouble();
		System.out.println("Introduce una estatura en m: ");
		estaura=entrada.nextDouble();
		IMC=peso/Math.pow(estaura, 2);
		if(IMC<18.5) {
			System.out.println("Tu IMC es: "+IMC);
			System.out.println("Estás bajo de peso, debes engordar unos kilos");
		}else if(IMC>=18.5 && IMC<=24.9) {
			System.out.println("Tu IMC es: "+IMC);
			System.out.println("Tienes un IMC normal, mantén la forma");
	    }else if(IMC>=25.0 && IMC<=29.9) {
	    	System.out.println("Tu IMC es: "+IMC);
			System.out.println("Tienes sobrepeso, cuídate más");
	    }else if(IMC>=30) {
	    	System.out.println("Tu IMC es: "+IMC);
			System.out.println("Tienes obesidad, baja de peso inmediatamente");
		}
		
		entrada.close();
		
		
		
	}

}
