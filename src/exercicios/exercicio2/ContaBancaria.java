package exercicios.exercicio2;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public void depositar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor inválido");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor inválido");
        }

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double restante = valor - saldo;
            if (restante > chequeEspecial) {
                throw new Exception("Limite do cheque especial atingido");
            }
            saldo = 0;
            chequeEspecial -= restante;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public static void main(String[] args) {
        try {
            ContaBancaria conta = new ContaBancaria(100.0, 200.0);

            System.out.println("Saldo inicial: " + conta.getSaldo());
            System.out.println("Cheque especial disponível: " + conta.getChequeEspecial());

            conta.depositar(50.0);

            System.out.println("Saldo: " + conta.getSaldo());

            conta.sacar(120.0);

            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Cheque especial: " + conta.getChequeEspecial());

            conta.sacar(100.0);

            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Cheque especial: " + conta.getChequeEspecial());

            conta.sacar(200.0);

        } catch (Exception e) {
            System.out.println("\nErro: " + e.getMessage());
        }
    }
}


