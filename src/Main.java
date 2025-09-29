public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando aplicação ");

        Imc imc1 = new Imc();
        Imc imc2 = new Imc();

        imc1.calcularImc();
        imc1.obterDados();
        imc1.exibirResultados();
    }
}
