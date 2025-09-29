import java.util.Scanner;

public class Imc {

    double imc;
    double peso;
    double altura;
    double alturareal;
    String nome;

    public void obterDados(){

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        peso = leitor.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = leitor.nextDouble();

        System.out.print("Digite o seu nome: ");
        nome = leitor.next();

    }

    public void calcularImc(){
        alturareal = altura / 100;
        imc = peso / (alturareal * alturareal);

    }

    public void exibirResultados(){

        System.out.println("Iremos realizar o calculo do seu IMC");
        System.out.println("---------------------------------");
        System.out.println("Obtendo dados:");
        System.out.println("PESO: " + peso);
        System.out.println("ALTURA: " + altura);
        System.out.println("NOME: " + nome);
        System.out.println("---------------------------------");
        System.out.println("Seu IMC é de " + imc);
        if (imc >= 25 && imc < 30) {
            System.out.println("Você está levemente acima do peso, não está ruim mas pode melhorar!");
        } else if (imc>= 18.6 && imc <25){
            System.out.println("Você está no peso ideal, parabéns!");
        } else if (imc>= 18.5) {
            System.out.println("Você está abaixo do peso, tente se alimentar mais!");
        } else if (imc>=30 && imc <35) {
            System.out.println("Você está acima do peso, vamos treinar!");
        } else if (imc>=35 && imc <40) {
            System.out.println("Você está com obesidade severa, por favor procure um médico!");
        } else  {
            System.out.println("Você está com obesidade mórbida, por favor procure um médico imediatamente");
        }

    }
}
