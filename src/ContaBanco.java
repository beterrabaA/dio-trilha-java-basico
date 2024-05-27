package src;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeClient;
    private double saldo;

    public ContaBanco(int numero, String agencia, String nomeClient, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeClient = nomeClient;
        this.saldo = saldo;
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

    public String getNomeClient() {
        return nomeClient;
    }

    public void setNomeClient(String nomeClient) {
        this.nomeClient = nomeClient;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saudacao() {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomeClient,agencia,numero,saldo);
    }
}
