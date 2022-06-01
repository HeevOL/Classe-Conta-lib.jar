package my.stack;

public class Conta {
    
    private int banco, agencia;
    private String titularDaConta;
    private double saldo;
    
    public Conta(int banco, int agencia, String titularDaConta, double saldo){
        this.banco = banco;
        this.agencia = agencia;
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
    }

    public void depositar(double deposito){        
        saldo = saldo + deposito;
        System.out.println("Banco-agência: " + banco + "-" + agencia + ", Titular: " + titularDaConta);
        System.out.println("Deposito de: R$" + deposito + ", Realizado com sucesso.");
        System.out.println("Novo saldo: R$" + saldo + ".");
        System.out.println();
    }

    public void sacar(double saque){
        if (saldo >= saque){
            saldo = saldo-saque;
            System.out.println("Banco-agência: " + banco + "-" + agencia + ", Titular: " + titularDaConta);
            System.out.println("Saque de: R$" + saque + ", Realizado com sucesso.");
            System.out.println("Novo saldo: R$" + saldo + ".");  
            System.out.println();          
        }
        else{
            System.out.println("Erro: Valor de saque maior que o saldo atual.");
            System.out.println();
        }
    }

    public void tranferir(Conta contaDestino, int bancoDestino, int agenciaDestino, String titular, double tranferencia){
        if (bancoDestino == contaDestino.banco && saldo >= tranferencia && 
            agenciaDestino == contaDestino.agencia && titular == contaDestino.titularDaConta){
            contaDestino.saldo = contaDestino.saldo + tranferencia;
            saldo = saldo - tranferencia;
            System.out.println("Banco-agência: " + banco + "-" + agencia + ", Titular: " + titularDaConta);
            System.out.println("Transferência de: R$" + tranferencia + ", Realizado com sucesso.");
            System.out.println("Novo saldo: R$" + saldo + "."); 
            System.out.println(); 
        }
        else{
            System.out.println("Erro: Impossivel realizar a tranferência. Saldo insuficiente ou a conta não existe.");
            System.out.println();
        }
    }

    public void consultaConta(){
        System.out.println("Titular da Conta: " + titularDaConta + ".");
        System.out.println("Banco: " + banco + ".");
        System.out.println("Agência: " + agencia + ".");
        System.out.println("Saldo atual: R$" + saldo + "."); 
        System.out.println(); 
    }

    public static void main(String[] args) {
        // Conta c1 = new Conta(10, 1, "Heverton", 500);
        // Conta c2 = new Conta(5, 3, "Laryssa", 1000);

        // // c1.saldo = 1000;
        // c1.depositar(100);
        // // System.out.println(c1.saldo);

        // // c2.saldo = 10000;
        // c2.sacar(500);
        // // System.out.println(c2.saldo);

        // c2.tranferir(c1,10, 1,"Heverton",0);
        // // System.out.println(c1.saldo);   
        // // System.out.println(c2.saldo);
        // c1.consultaConta();     

    }
}
