
package exp1_s2_grupo19;

public class CuentaCorriente extends TipoCuenta implements InterfazSaldo {

    private String cuentaCorriente;
    
    //constructor vacío

    public CuentaCorriente() {
    }
    // constructor completo 
    public CuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
    // constructor vinculado a TipoCuenta para utilizar sus metodos y constructores
    public CuentaCorriente(String cuentaCorriente, String nombre, String apellidoPaterno, String apellidoMaterno, String comuna, String domicilio, String rut, int telefono, double saldo, int numCuenta) {
        super(nombre, apellidoPaterno, apellidoMaterno, comuna, domicilio, rut, telefono, saldo, numCuenta);
        this.cuentaCorriente = cuentaCorriente;
    }

    
    //override que se usará para entregar la información de cuenta en la clase main
    @Override
    public String mostrarInfo() {
        cuentaCorriente = "Cuenta Corriente.";
        String cuenta = cuentaCorriente;
        return cuenta;
    }
    
    //metodos propios
    
    //Método para mostrar los datos
    
    @Override
    public void mostrarDato(){
        System.out.println("______________________________________________ ");
        System.out.println("CuentaCorriente: ");
        System.out.println("______________________________________________ ");        
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre + " " +apellidoPaterno + " " +  apellidoMaterno);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Comuna: " + comuna);
        System.out.println("Telefono: " + telefono);
        System.out.println("Tipo de cuenta: " + getTipoCuenta());
        System.out.println("Numero de Cuenta: " + numCuenta);
        System.out.println("_______________________________________________");
    }  
    
    
   // Método para depositar 
    @Override
    public void depositar(double monto) {
        saldoCuenta.depositar(monto);
    }
    
    // Método para girar
    @Override
    public void girar(double monto) {
        saldoCuenta.girar(monto);
    }
    
    // Método para consultar saldo
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo disponible: $:" + saldoCuenta.getSaldo());
    }
    
    @Override
    public String getTipoCuenta() {
        return "Cuenta Corriente";
    }
}
