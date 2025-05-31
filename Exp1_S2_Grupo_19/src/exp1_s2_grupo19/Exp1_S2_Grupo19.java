package exp1_s2_grupo19;

import java.util.ArrayList;
import java.util.Scanner;

public class Exp1_S2_Grupo19 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // Variables Locales
        int numeroCuenta = 500500500;
        int opcion = 0;
        boolean continuar = true;

        // ArrayList para guardar cuentas, usando la superclase 'TipoCuenta'
        ArrayList<TipoCuenta> usuario = new ArrayList<>();

        while (continuar) {
            System.out.println("*****************************");
            System.out.println("        BANK BOSTON        ");
            System.out.println("  Seguridad y Confianza 24/7   ");
            System.out.println("*****************************");
            System.out.println("_________________________________ ");
            System.out.println("<><><><> MENU PRINCIPAL: <><><><> ");
            System.out.println("_________________________________ ");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Ver datos cliente");
            System.out.println("3. Depositar");
            System.out.println("4. Girar");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Salir");
            System.out.println("_________________________________ ");

            System.out.println("<><><><> SELECCIONE UNA OPCION: <><><><>");
            while (!sc.hasNextInt()) {
                System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Registro de cliente
                    System.out.println("Ha seleccionado Registro de Cliente");

                    // Datos comunes
                    String nombre = "";
                    String apellidoPaterno = "";
                    String apellidoMaterno = "";
                    String rut = "";
                    String domicilio = "";
                    String comuna = "";
                    int telefono = 0;

                    sc.nextLine(); // limpiar buffer

                    while (true) {
                        System.out.println("Ingrese su nombre: ");
                        nombre = sc.nextLine();
                        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                            System.out.println("Error, el nombre sólo debe contener letras. Intentelo de nuevo.");
                        } else break;
                    }

                    while (true) {
                        System.out.println("Ingrese su apellido paterno");
                        apellidoPaterno = sc.nextLine();
                        if (!apellidoPaterno.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                            System.out.println("Error. El nombre solo debe contener letras. Intentelo de nuevo.");
                        } else break;
                    }

                    while (true) {
                        System.out.println("Ingrese su apellido materno");
                        apellidoMaterno = sc.nextLine();
                        if (!apellidoMaterno.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                            System.out.println("Error. El nombre solo debe contener letras, Intentelo de nuevo.");
                        } else break;
                    }

                    System.out.println("Ingrese su RUT en formato xx.xxx.xxx-x:");
                    while (true) {
                        rut = sc.nextLine();
                        if (rut.matches("\\d{2}\\.\\d{3}\\.\\d{3}-[0-9kK]")) {
                            System.out.println("RUT valido: " + rut);
                            break;
                        } else {
                            System.out.println("Formato incorrecto. Intente nuevamente (xx.xxx.xxx-x):");
                        }
                    }

                    System.out.println("Ingrese su domicilio");
                    domicilio = sc.nextLine();

                    while (true) {
                        System.out.println("Ingrese su comuna");
                        comuna = sc.nextLine();
                        if (!comuna.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                            System.out.println("Error. El nombre solo debe contener letras, Intentelo de nuevo.");
                        } else break;
                    }

                    while (true) {
                        System.out.println("Ingrese su numero de telefono");
                        if (!sc.hasNextInt()) {
                            System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                            sc.next();
                            continue;
                        }
                        telefono = sc.nextInt();
                        if (telefono > 999999999 || telefono < 100000000) {
                            System.out.println("No pueden ser mas de 9 digitos ni menos de 9. Por favor, intentelo de nuevo");
                        } else break;
                    }
                    sc.nextLine(); // limpiar buffer

                    numeroCuenta++;
                    System.out.println("Seleccione tipo de cuenta a crear:");
                    System.out.println("1 - Cuenta Corriente");
                    System.out.println("2 - Cuenta de Ahorro");
                    System.out.println("3 - Cuenta de Crédito");
                    
                    int tipoCuenta = 0;
                    
                    while (true) {
                        if (!sc.hasNextInt()) {
                            System.out.println("Opción inválida, intente de nuevo:");
                            sc.next();
                            continue;
                        }
                        tipoCuenta = sc.nextInt();
                        if (tipoCuenta < 1 || tipoCuenta > 3) {
                            System.out.println("Opción inválida, intente de nuevo:");
                            continue;
                        }
                        break;
                    }
                    sc.nextLine(); // limpiar buffer

                    // saldo inicial 0
                    double saldoInicial = 0;

                    TipoCuenta nuevaCuenta = null;

                    switch (tipoCuenta) {
                        case 1:
                            nuevaCuenta = new CuentaCorriente("Cuenta Corriente", nombre, apellidoPaterno, apellidoMaterno,
                                    comuna, domicilio, rut, telefono, saldoInicial, numeroCuenta);
                            break;
                        case 2:
                            nuevaCuenta = new CuentaDeAhorro("Cuenta de Ahorro", nombre, apellidoPaterno, apellidoMaterno,
                                    comuna, domicilio, rut, telefono, saldoInicial, numeroCuenta);
                            break;
                        case 3:
                            nuevaCuenta = new CuentaDeCredito("Cuenta de Crédito", nombre, apellidoPaterno, apellidoMaterno,
                                    comuna, domicilio, rut, telefono, saldoInicial, numeroCuenta);
                            break;
                    }

                    usuario.add(nuevaCuenta);

                    System.out.println("Cliente registrado con éxito. Su número de cuenta es: " + numeroCuenta);
                    break;

                case 2:
                    // Ver datos de cliente
                    System.out.println("ha seleccionado ver sus datos, ingrese su numero de cuenta:");
                    int buscarNum = 0;
                    while (true) {
                        if (!sc.hasNextInt()) {
                            System.out.println("Seleccion invalida intentelo de nuevo");
                            sc.next();
                            continue;
                        }
                        buscarNum = sc.nextInt();
                        if (buscarNum > 999999999 || buscarNum < 100000000) {
                            System.out.println("numero invalido deben ser 9 digitos");
                        } else break;
                    }

                    boolean encontrado = false;

                    for (TipoCuenta c : usuario) {
                        if (c.getNumCuenta() == buscarNum) {
                            c.mostrarDato();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Usuario no encontrado o inexistente.");
                    }
                    break;

                case 3:
                    System.out.println("Ha seleccionado 'Depósitar'. Ingrese su número de cuenta: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número de cuenta válido.");
                        sc.next();
                    }

                    buscarNum = sc.nextInt();
                    encontrado = false;

                    for (TipoCuenta c : usuario) {
                        if (c.getNumCuenta() == buscarNum) {
                            System.out.println("Por favor, ingrese el monto a depositar: ");
                            double monto = sc.nextDouble();

                            c.depositar(monto);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("Ha seleccionado 'Girar'. Ingrese su número de cuenta: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número de cuenta válido.");
                        sc.next();
                    }

                    buscarNum = sc.nextInt();
                    encontrado = false;

                    for (TipoCuenta c : usuario) {
                        if (c.getNumCuenta() == buscarNum) {
                            System.out.println("Por favor, ingrese el monto a girar: ");

                            while (!sc.hasNextDouble()) {
                                System.out.println("Monto inválido. Por favor, ingrese un número válido.");
                                sc.next();
                            }

                            double monto = sc.nextDouble();

                            c.girar(monto);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Ha seleccionado 'Consultar saldo'. Ingrese su número de cuenta: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número de cuenta válido.");
                        sc.next();
                    }

                    buscarNum = sc.nextInt();
                    encontrado = false;

                    for (TipoCuenta c : usuario) {
                        if (c.getNumCuenta() == buscarNum) {
                            c.consultarSaldo();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    Thread.sleep(2000);
                    System.out.println("¡Gracias por preferir Bank Boston! ¡que tenga buen día!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Numero Invalido intentelo de nuevo");
            }
        }
    }
}
