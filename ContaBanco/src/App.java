import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ContaTerminal conta = null;
        int opcao;

        do{

            System.out.println("=====Ezar Bank=====");
            System.out.println("Bem-vindo ao Ezar Bank, como podemos te ajudar hoje?");
            System.out.println("1. Criar uma conta.");
            System.out.println("2. Depositar um valor.");
            System.out.println("3. Sacar valor do saldo.");
            System.out.println("4. Sair.");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                //criar conta
                case 1:
                conta.criarConta();
                break;
                //deposito
                case 2:
                conta.depositar();
                
                break;
                //saque
                case 3:
                
                break;
                
                case 4: 
                System.out.println("Saindo...");

                break; 
                
                default:
                System.out.println("Opção inválida.");

                break;
            }
        }while(opcao != 4);
        

    }
}
