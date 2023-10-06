public class Banco {

    double saldo;

    public double deposito(double x) {
        double deposito_att;
        saldo = saldo + x;
        return saldo;
    }
    public double saque(double y) {
        double saque_att;
        saldo = saldo - y;
        return saldo;
    }
    public double transferencia(double z) {
        double transf_att;
        saldo = saldo + z;
        return saldo;
    }
}
