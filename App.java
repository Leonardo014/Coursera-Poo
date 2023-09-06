package CRC;

public class App {

	public static void main(String[] args) {
		Paciente paciente = new Paciente(52.0, 1.56, 0.0);
		double imc = paciente.getImc();
		
		if (imc < 16.0) {
			System.out.println("Baixo peso muito grave");
		} else if (imc >= 16.0 && imc < 17.0) {
			System.out.println("Baixo peso grave");
		} else if (imc >= 17.0 && imc < 18.5) {
			System.out.println("Baixo peso");
		} else if (imc >= 18.5 && imc < 25.0) {
			System.out.println("Peso normal");
		} else if (imc >= 25.0 && imc < 30.0) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30.0 && imc < 35.0) {
			System.out.println("Obesidade grau I");
		} else if (imc >= 35.0 && imc < 40.0) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III (obesidade morbido"); 
		}
	
	}

}
