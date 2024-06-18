import java.util.Scanner;
public class ContaTerminal extends Cliente{
    Scanner entrada = new Scanner(System.in);
    private int num;
    private String agencia;

    public ContaTerminal(String nomeCliente, double saldo, int num, String agencia) {
        super(nomeCliente, saldo);
        this.num = num;
        this.agencia = agencia;
    }

    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
   


    public void criarConta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====Ezar Bank=====");
        System.out.println("Obrigado por optar em criar uma conta conosco, a seguir infome os dados necessários.");
        System.out.println("Informe o numero da conta: ");
        int num = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Informe o numero da agencia: ");
        String agencia = entrada.nextLine();
        System.out.println("Informe seu nome: ");
        String nomeCliente = entrada.nextLine();
        System.out.println("Olá " + nomeCliente + ", sua conta de agência " + agencia + ", nº " + num + " foi criada com sucesso e seu saldo atual é de R$" + getSaldo() + ".");
       

    }

    public void depositar(double deposito){
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====Ezar Bank=====");
        System.out.println("Saldo Atual: R$"+ getSaldo());
        System.out.println("Informe o valor a ser depositado: ");
        deposito = entrada.nextDouble();
        entrada.nextLine();
        setSaldo(getSaldo() + deposito);
        System.out.println("Deposito confirmado.");
        System.out.println("Saldo Atual: R$"+ getSaldo());
    }

    public static void buscarConta(){
        }
}
    

