package CRC;

public class Paciente {
	double pesoKG;
	double alturaMt;
	double imc;
	
	public Paciente(double pesoKG, double alturaMt, double imc) {
		this.pesoKG = pesoKG;
		this.alturaMt = alturaMt;
		this.imc = imc;
	}
	
	public double getPesoKG() {
		return pesoKG;
	}
	public double getAlturaMt() {
		return alturaMt;
	}
	public double getImc() {
		imc = pesoKG / (alturaMt * alturaMt); 
		return imc;
	}
	
	/*public double CalcularImc() {
		imc = pesoKG / (alturaMt * alturaMt); 
	
		return imc;
	}*/
}
