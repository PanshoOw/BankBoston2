package exp1_s2_grupo19;

public class CuentaDeAhorro extends TipoCuenta implements InterfazSaldo {

    private String cuentaDeAhorro;

    public CuentaDeAhorro() {
        this.saldoCuenta = new CalculoSaldo();
    }

    public CuentaDeAhorro(String cuentaDeAhorro) {
        this.cuentaDeAhorro = cuentaDeAhorro;
        this.saldoCuenta = new CalculoSaldo();
    }

    public CuentaDeAhorro(String cuentaDeAhorro, String nombre, String apellidoPaterno, String apellidoMaterno,
            String comuna, String domicilio, String rut, int telefono, double saldo, int numCuenta) {
        super(nombre, apellidoPaterno, apellidoMaterno, comuna, domicilio, rut, telefono, saldo, numCuenta);
        this.cuentaDeAhorro = cuentaDeAhorro;
        this.saldoCuenta = new CalculoSaldo();
    }

    @Override
    public String mostrarInfo() {
        return "Cuenta de Ahorro.";
    }

    @Override
    public void mostrarDato() {
        System.out.println("______________________________________________ ");
        System.out.println("Cuenta de Ahorro:");
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
        return "Cuenta de Ahorro";
    }
}
