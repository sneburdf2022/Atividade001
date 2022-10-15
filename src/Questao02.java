import java.util.Scanner;

public class Questao02 {
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        int n1 = ler.nextInt();
        System.out.println("Digite a segunda nota do aluno");
        int n2 = ler.nextInt();        
        float mediaFinal = (n1+n2)/2;
        if(mediaFinal > 7){
            System.out.println(ANSI_VERDE + "Aluno Aprovado!" + ANSI_RESET);
        }
        else{
            System.out.println(ANSI_VERMELHO + "Aluno Reprovado!" + ANSI_RESET);
        }
        ler.close();
    }
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_VERMELHO = "\u001B[31m";
    public static final String ANSI_VERDE = "\u001B[32m";
}
