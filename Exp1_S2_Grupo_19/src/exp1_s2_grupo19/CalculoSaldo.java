
package exp1_s2_grupo19;

public class CalculoSaldo {

    private double saldo;
    
    // Constructor vacío con el cual todas los nuevos registros inician con 0 en su saldo
    public CalculoSaldo() {
        this.saldo = 0.0;
    }
    
    // Constructor con atributos con el cual el cliente decide si realizar un depósito al momento de la creación de su cuenta
    public CalculoSaldo(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    // Métodos propios
    
    // Método para que los usuarios realicen depósitos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto; // Con esto le sumamos el monto depositado al saldo que el cliente ya tenía previamente
            System.out.println("Depósito realizado con éxito. Su saldo actual es de: $" + saldo);
        } else {
            System.out.println("Monto inválido.");
        }
    }
    
    // Método para que los usuarios realicen giros
    public void girar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto; // Con esto le restamos el monto girado al saldo que el cliente ya tenía previamente
            System.out.println("Giro realizado con éxito. Su saldo actual es de: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}
