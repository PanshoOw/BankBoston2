
package exp1_s2_grupo19;


public abstract class TipoCuenta {
    
    protected String nombre, apellidoPaterno, apellidoMaterno; 
    protected String comuna, domicilio, rut;
    protected int telefono;
    protected CalculoSaldo saldoCuenta;
    
    
    protected int numCuenta;
    
    // Constructor Vacío
    public TipoCuenta() {
    }
    
    // Constructor con atributos
    public TipoCuenta(String nombre, String apellidoPaterno, String apellidoMaterno, String comuna, String domicilio, String rut, int telefono, double saldo, int numCuenta) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.comuna = comuna;
        this.domicilio = domicilio;
        this.rut = rut;
        this.telefono = telefono;
        this.numCuenta = numCuenta;
        this.saldoCuenta = new CalculoSaldo();
    }
    
    //Getters and Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public abstract String getTipoCuenta();

    @Override
    public String toString() {
        return "TipoCuenta{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", comuna=" + comuna + ", domicilio=" + domicilio + ", rut=" + rut + ", telefono=" + telefono + ", cuentaBancaria=" + saldoCuenta + ", numCuenta=" + numCuenta + '}';
    }

    //Método para mostrar los datos
    
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
    public void depositar(double monto) {
        saldoCuenta.depositar(monto);
    }
    
    // Método para girar
    public void girar(double monto) {
        saldoCuenta.girar(monto);
    }
    
    // Método para consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo disponible: $:" + saldoCuenta.getSaldo());
    }
    
    public abstract String mostrarInfo();
    
}
