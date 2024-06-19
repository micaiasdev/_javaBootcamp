<<<<<<< HEAD
public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo; 

    public void printfeedbackCreateAccount(){
        System.out.println("Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "+ this.getAgencia() +", sua conta é "+ this.getNumero() + " e seu saldo " + this.getSaldo() +" já está disponível para saque.");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
=======
public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo; 

    public void printfeedbackCreateAccount(){
        System.out.println("Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "+ this.getAgencia() +", sua conta é "+ this.getNumero() + " e seu saldo " + this.getSaldo() +" já está disponível para saque.");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
>>>>>>> a9dddb795bc9408cce9168657aae95eef2f81677
}