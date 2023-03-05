/*
Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,número de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita acceder al registro de un empleado por cualquiera de estos tres datos.(Nota:No se dispone de memoria suficiente para duplicar los registros de los empleados).
 */
import java.util.Scanner;
public class Ej10 {

    class Empleado {
        String nombre;
        int numEmpleado;
        int numSeguridadSocial;
        Empleado(String nombre, int numEmpleado, int numSeguridadSocial) {
            this.nombre = nombre;
            this.numEmpleado = numEmpleado;
            this.numSeguridadSocial = numSeguridadSocial;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumEmpleado() {
            return numEmpleado;
        }

        public int getNumSeguridadSocial() {
            return numSeguridadSocial;
        }
    }
    class TablaHash {
        Empleado[] tabla;
        TablaHash() {
            tabla = new Empleado[100];
        }
        public void insertar(Empleado empleado) {
            int posicion = empleado.getNumEmpleado() % 100;
            tabla[posicion] = empleado;
        }
        public Empleado buscarPorNombre(String nombre) {
            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i] != null) {
                    if (tabla[i].getNombre().equals(nombre)) {
                        return tabla[i];
                    }
                }
            }
            return null;
        }
        public Empleado buscarPorNumEmpleado(int numEmpleado) {
            int posicion = numEmpleado % 100;
            if (tabla[posicion] != null) {
                if (tabla[posicion].getNumEmpleado() == numEmpleado) {
                    return tabla[posicion];
                }
            }
            return null;
        }
        public Empleado buscarPorNumSeguridadSocial(int numSeguridadSocial) {
            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i] != null) {
                    if (tabla[i].getNumSeguridadSocial() == numSeguridadSocial) {
                        return tabla[i];
                    }
                }
            }
            return null;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ej10 ej10 = new Ej10();
        TablaHash tablaHash = ej10.new TablaHash();
        Empleado empleado1 = ej10.new Empleado("Juan", 1, 1);
        Empleado empleado2 = ej10.new Empleado("Pedro", 2, 2);
        Empleado empleado3 = ej10.new Empleado("Luis", 3, 3);
        Empleado empleado4 = ej10.new Empleado("Ana", 4, 4);
        Empleado empleado5 = ej10.new Empleado("Maria", 5, 5);
        Empleado empleado6 = ej10.new Empleado("Jose", 6, 6);
        Empleado empleado7 = ej10.new Empleado("Antonio", 7, 7);
        Empleado empleado8 = ej10.new Empleado("Rosa", 8, 8);
        Empleado empleado9 = ej10.new Empleado("Luisa", 9, 9);
        Empleado empleado10 = ej10.new Empleado("Marta", 10, 10);
        tablaHash.insertar(empleado1);
        tablaHash.insertar(empleado2);
        tablaHash.insertar(empleado3);
        tablaHash.insertar(empleado4);
        tablaHash.insertar(empleado5);
        tablaHash.insertar(empleado6);
        tablaHash.insertar(empleado7);
        tablaHash.insertar(empleado8);
        tablaHash.insertar(empleado9);
        tablaHash.insertar(empleado10);
        System.out.println("Introduce el nombre del empleado:");
        String nombre = sc.nextLine();
        Empleado empleado = tablaHash.buscarPorNombre(nombre);
        if (empleado != null) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("NumEmpleado: " + empleado.getNumEmpleado());
            System.out.println("NumSeguridadSocial: " + empleado.getNumSeguridadSocial());
        } else {
            System.out.println("No se ha encontrado el empleado.");
        }
        System.out.println("Introduce el numero de empleado:");
        int numEmpleado = sc.nextInt();
        empleado = tablaHash.buscarPorNumEmpleado(numEmpleado);
        if (empleado != null) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("NumEmpleado: " + empleado.getNumEmpleado());
            System.out.println("NumSeguridadSocial: " + empleado.getNumSeguridadSocial());
        } else {
            System.out.println("No se ha encontrado el empleado.");
        }
        System.out.println("Introduce el numero de seguridad social:");
        int numSeguridadSocial = sc.nextInt();
        empleado = tablaHash.buscarPorNumSeguridadSocial(numSeguridadSocial);
        if (empleado != null) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("NumEmpleado: " + empleado.getNumEmpleado());
            System.out.println("NumSeguridadSocial: " + empleado.getNumSeguridadSocial());
        } else {
            System.out.println("No se ha encontrado el empleado.");
        }
    }


}
