//package CRC;

public class Main {
    public static void main(String[] args) {
     Paciente paciente = new Paciente(30.0, 1.70);
     paciente.calculaIMC();
     System.out.println("Seu peso eh: " + paciente.getPesoKG() + "\n" + "Sua altura eh: " + paciente.getAlturaMt());
     System.out.println("O valor do seu IMC eh: " + paciente.getImc());

    }
}