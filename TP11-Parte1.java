//TP11 Parte 1

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
   private static ArrayList <Integer> cantidad;

   public static void main(String[] args){
       System.out.println("Ejercicio 1");
       ejercicio1();
       System.out.println("\nEjercicio 2");
       ArrayList<String> jugadores = new ArrayList<>();
       EquipoDeFutbol mi_equipo = new EquipoDeFutbol(jugadores);
       mi_equipo.menu();
       System.out.println("\nEjercicio 3");
       ArrayList <String> articulos = new ArrayList();
       ArrayList <Double> precioUnitario = new ArrayList();
       cantidad = new ArrayList();
       Factura mi_factura = new Factura(1234, "24/10/2023", "Juan Salvo", articulos, precioUnitario, cantidad, 0, 0, 0);
       mi_factura.menu();
       System.out.println("\nFACTURA:");
       System.out.println("Numero de factura: " + mi_factura.getNumeroFactura());
       System.out.println("Fecha de emisión: " + mi_factura.getFecha());
       System.out.println("Nombre del cliente: " + mi_factura.getCliente());
       for (int i = 0; i < mi_factura.getArticulos().size(); i++){
           System.out.println("Articulo: " + mi_factura.getArticulos().get(i));
           System.out.println("Precio unitario: " + mi_factura.getPrecioUnitario().get(i));
           System.out.println("Cantidad: " + mi_factura.getCantidad().get(i));
       }
       System.out.println("Subtotal: " + mi_factura.getSubtotal());
       System.out.println("Iva: " + mi_factura.getIva());
       System.out.println("Total: " + mi_factura.getTotal());
   }

   public static void ejercicio1(){
       Scanner sc = new Scanner(System.in);
       ArrayList <String> autos = new ArrayList<>();
       String marca;
       int respuesta;

       while (true){
           System.out.print("Ingrese una marca de auto: ");
           marca = sc.nextLine();
           autos.add(marca);
           System.out.println("¿Desea ingresar otra marca?");
           System.out.println("1. Sí    2. No");
           System.out.print("Respuesta: ");
           respuesta = sc.nextInt();
           sc.nextLine();
           if (respuesta == 2){
               break;
           } else if (respuesta == 1){
               System.out.println("Agregará una nueva marca de auto.");
           } else {
               System.out.println("Respuesta incorrecta, agregue otra marca");
           }
       }
       System.out.println("Las marcas de auto que ingresó: ");
       for (String auto : autos) {
           System.out.println(auto);
       }
   }

}

class EquipoDeFutbol{
   private ArrayList<String> jugadores;
   public EquipoDeFutbol(ArrayList<String> jugadores){
       this.jugadores = jugadores;
   }
   public void menu(){
       Scanner sc = new Scanner(System.in);
       int respuesta;
       String agregar, eliminar;
       while(true){
           System.out.println("Ingrese el número de opción que desea seleccionar.");
           System.out.println("1. Agregar Jugador.");
           System.out.println("2. Eliminar Jugador.");
           System.out.println("3. Ver mi equipo.");
           System.out.println("4. Salir.");
           System.out.print("Respuesta: ");
           respuesta = sc.nextInt();
           sc.nextLine();
           if (respuesta == 1){
               System.out.println("¿A qué jugador desea agregar?");
               System.out.print("Respuesta: ");
               agregar = sc.nextLine();
               agregar = agregar.toUpperCase();
               jugadores.add(agregar);
               System.out.println("Jugador Agregado.");
           } else if (respuesta == 2){
               System.out.println("¿A qué jugador desea eliminar?");
               System.out.print("Respuesta: ");
               eliminar = sc.nextLine();
               eliminar = eliminar.toUpperCase();
               jugadores.remove(eliminar);
               System.out.println("Jugador Eliminado.");
           } else if (respuesta == 3) {
               if (jugadores.isEmpty()){
                   System.out.println("No hay jugadores en la lista.");
               } else {
                   System.out.println("Lista de jugadores: ");
                   for (String jugador : jugadores) {
                       System.out.println(jugador);
                   }
               }

           } else if (respuesta == 4) {
               System.out.println("Saliendo del programa...");
               break;
           } else {
               System.out.println("Número Inválido. Intente de nuevo.");
           }
       }
   }
}

class Factura{
   private int numeroFactura;
   private String fecha;
   private String cliente;
   private ArrayList<String> articulos;
   private ArrayList<Double> precioUnitario;
   private ArrayList<Integer> cantidad;
   private double subtotal;
   private double iva;
   private double total;

   public Factura(int numeroFactura, String fecha, String cliente, ArrayList<String> articulos, ArrayList<Double> precioUnitario, ArrayList<Integer> cantidad, double subtotal, double iva, double total){
       this.numeroFactura = numeroFactura;
       this.fecha = fecha;
       this.cliente = cliente;
       this.articulos = articulos;
       this.precioUnitario = precioUnitario;
       this.cantidad = cantidad;
       this.subtotal = subtotal;
       this.iva = iva;
       this.total = total;
   }

   public int getNumeroFactura() { return numeroFactura; }
   public void setNumeroFactura(int numeroFactura) { this.numeroFactura = numeroFactura; }
   public String getFecha() { return fecha; }
   public void setFecha(String fecha) { this.fecha = fecha; }
   public String getCliente() { return cliente; }
   public void setCliente(String cliente) { this.cliente = cliente; }
   public ArrayList<String> getArticulos() { return articulos; }
   public void setArticulos(ArrayList<String> articulos) { this.articulos = articulos;}
   public ArrayList<Double> getPrecioUnitario() { return precioUnitario; }
   public void setPrecioUnitario(ArrayList<Double> precioUnitario) { this.precioUnitario = precioUnitario;}
   public ArrayList<Integer> getCantidad() { return cantidad; }
   public void setCantidad(ArrayList<Integer> cantidad) { this.cantidad = cantidad;}
   public double getSubtotal() { return subtotal; }
   public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
   public double getIva() { return iva; }
   public void setIva(double iva) { this.iva = iva; }
   public double getTotal() { return total; }
   public void setTotal(double total) { this.total = total; }

   public void menu(){
       Scanner sc = new Scanner(System.in);
       int respuesta;
       while (true){
           System.out.println("Ingrese el número de opción que desea seleccionar.");
           System.out.println("1. Agregar Artículo.");
           System.out.println("2. Calcular Subtotal.");
           System.out.println("3. Calcular IVA.");
           System.out.println("4. Calcular Total.");
           System.out.println("5. Salir.");
           System.out.print("Respuesta: ");
           respuesta = sc.nextInt();
           sc.nextLine();
           if (respuesta == 1){
               articulos = agregarArticulos();
           } else if (respuesta == 2){
               cantidad = calcularCantidad();
               precioUnitario = calcularPrecios();
               subtotal = calcularSubtotal();

           } else if (respuesta == 3){
               iva = calcularIva();

           } else if (respuesta == 4){
               total = calcularTotal();

           } else if (respuesta == 5){
               System.out.println("Saliendo del programa...");
               break;

           } else {
               System.out.println("Respuesta incorrecta. Intente de nuevo.");
           }
       }
   }

   public ArrayList<String> agregarArticulos(){
       Scanner sc = new Scanner(System.in);
       String agregar;
       int respuesta;
       while (true){
           System.out.println("¿Qué articulo desea agregar?");
           System.out.print("Respuesta: ");
           agregar = sc.nextLine();
           agregar = agregar.toUpperCase();
           articulos.add(agregar);
           System.out.println("Artículo Agregado.");
           System.out.println("¿Desea agregar otro artículo?");
           System.out.println("1- Sí.    2- No.");
           System.out.print("Respuesta: ");
           respuesta = sc.nextInt();
           sc.nextLine();
           if (respuesta == 2){
               break;
           }
       }
       return articulos;
   }

   public ArrayList<Integer> calcularCantidad(){
       Scanner sc = new Scanner(System.in);
       int respuesta;
       for (String articulo : articulos) {
           System.out.println("¿cuántos unidades compró de este artículo: " + articulo + "?");
           System.out.print("Respuesta: ");
           respuesta = sc.nextInt();
           sc.nextLine();
           respuesta = Integer.valueOf(respuesta);
           cantidad.add(respuesta);
       }
       return cantidad;
   }

   public ArrayList<Double> calcularPrecios(){
       Scanner sc = new Scanner(System.in);
       double respuesta;
       for (String articulo : articulos) {
           System.out.println("¿cuánto costo este artículo: " + articulo + "?");
           System.out.print("Respuesta: $");
           respuesta = sc.nextDouble();
           sc.nextLine();
           respuesta = Double.valueOf(respuesta);
           precioUnitario.add(respuesta);
       }
       return precioUnitario;
   }

   public double calcularSubtotal(){
       double subtotal = 0;
       for (int i = 0; i < cantidad.size(); i++) {
           subtotal = subtotal + (cantidad.get(i) * precioUnitario.get(i));
       }
       System.out.println("Subtotal: " + subtotal);
       return subtotal;
   }

   public double calcularIva(){
       iva = subtotal * 0.21;
       System.out.println("Iva: " + iva);
       return iva;
   }

   public double calcularTotal(){
       total = subtotal + iva;
       System.out.println("Total: " + total);
       return total;
   }
}

