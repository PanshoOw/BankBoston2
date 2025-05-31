package exp1_s2_grupo19;

public class CuentaDeCredito extends TipoCuenta implements InterfazSaldo {

    private String cuentaDeCredito;

    public CuentaDeCredito() {
        this.saldoCuenta = new CalculoSaldo(2000000); // saldo inicial 2 millones
    }

    public CuentaDeCredito(String cuentaDeCredito) {
        this.cuentaDeCredito = cuentaDeCredito;
        this.saldoCuenta = new CalculoSaldo(2000000);
    }

    public CuentaDeCredito(String cuentaDeCredito, String nombre, String apellidoPaterno, String apellidoMaterno,
            String comuna, String domicilio, String rut, int telefono, double saldo, int numCuenta) {
        super(nombre, apellidoPaterno, apellidoMaterno, comuna, domicilio, rut, telefono, saldo, numCuenta);
        this.cuentaDeCredito = cuentaDeCredito;
        this.saldoCuenta = new CalculoSaldo(2000000);
    }

    @Override
    public String mostrarInfo() {
        return "Cuenta de Crédito.";
    }

    @Override
    public void mostrarDato() {
        System.out.println("______________________________________________ ");
        System.out.println("Cuenta de Crédito:");
        System.out.println("______________________________________________ ");
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Tipo de cuenta: " + getTipoCuenta());
        System.out.println("Número de Cuenta: " + numCuenta);
        System.out.println("_______________________________________________");
    }

    @Override
    public void depositar(double monto) {
        saldoCuenta.depositar(monto);
    }

    @Override
    public void girar(double monto) {
        saldoCuenta.girar(monto);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo disponible: $" + saldoCuenta.getSaldo());
    }
    
        @Override
    public String getTipoCuenta() {
        return "Cuenta de Crédito";
    }
}
