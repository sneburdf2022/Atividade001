import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome");
        String strNome = ler.nextLine();
        
                System.out.println(ANSI_RESET + String.format("Olá %s%s%s%s",ANSI_VERDE, strNome, ANSI_RESET,"."));
        
        ler.close();
    }
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_VERDE = "\u001B[32m";
}
