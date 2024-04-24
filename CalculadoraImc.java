import java.util.Scanner;
public class CalculadoraImc {  
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite seu M para masculino e F para feminino e N s não deseja informar: ");
        String sexo = lerTeclado.nextLine();
        char generoChar = sexo.charAt(0);

        System.out.println("Digite sua altura:");
        double altura = lerTeclado.nextDouble();

        System.out.println("Digite sua peso:");
        double peso = lerTeclado.nextDouble();
        double imc = peso / (Math.pow(altura, 2));

        switch (generoChar) {
            case 'M', 'm':
                if (imc >= 40) {
                    System.out.println("A classificação de " + nome + (" è obesidade mórbida"));
                } else if (imc > 30 && imc < 39.9) {
                    System.out.println("A classificação de " + nome + (" è obesidade moderada"));
                } else if (imc > 25 && imc < 29.9) {
                    System.out.println("A classificação de " + nome + (" è obesidade leve"));
                } else if (imc > 20 && imc < 24.9) {
                    System.out.println("A classificação de " + nome + (" è obesidade normal"));
                } else if (imc < 20) {
                    System.out.println("A classificação de " + nome + (" è obesidade abaixo do peso"));
                }
                break;

            case 'F', 'N', 'f', 'n':
                if (imc >= 39) {
                    System.out.println("A classificação de " + nome + ("é de obesidade morbida"));
                } else if (imc > 29 && imc < 38.9) {
                    System.out.println("A classificação de " + nome + ("é de obesidade moderada"));
                } else if (imc > 24 && imc < 28.9) {
                    System.out.println("A classificação de " + nome + ("é de obesidade leve"));
                } else if (imc > 19 && imc < 23.9) {
                    System.out.println("A classificação de " + nome + ("é de obesidade normal"));
                } else if (imc < 19) {
                    System.out.println("A classificação de " + nome + ("é de abaixo do peso"));
                }
                break;
            default:
                break;
        }
        lerTeclado.close();
    }
}

    

