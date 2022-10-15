import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = ler.nextInt();
        int nAnterior = n1 - 1;
        int nProximo = n1 + 1;
            System.out.println(ANSI_VERMELHO + "Anterior: " + nAnterior + ANSI_RESET);
            System.out.println(ANSI_RESET + "Digitado: " + n1 );
            System.out.println(ANSI_VERDE + "Próximo:" + nProximo + ANSI_RESET);
        ler.close();
    }
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_VERMELHO = "\u001B[31m";
    public static final String ANSI_VERDE = "\u001B[32m";
}
