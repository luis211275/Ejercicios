
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor COMPLETAR

    public Coche (String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //Getters and setters

    public void getmarca(){
        return marca;
    }

    public void setmarca(String marca){
        this.marca;
    }

    public void getmodelo(){
        return marca;
    }

    public void setmodelo(String modelo){
        this.marca;
    }

    public void getvelodidad(){
        return marca;
    }

    public void setvelodidad(int velocidad){
        this.marca;
    }

    
    
    // Método acelerar (suma +10) COMPLETAR

    public static void acelerar (){
        setvelodidad(getvelodidad+10);
        System.out.println ("El coche acelera y sube a: " + getvelodidad + "km/h");

    }
   

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR

    public static void frenar (){

        System.out.println ("El coche frena y baja a: " + (getvelodidad - 10) + "km/h")

    }
   

    // Método mostrarDatos COMPLETAR

    public static void MostrarInformacion(){

        return("Marca: " + getmarca + "\nModelo: " + getmodelo + "\nVelocidad: " + getvelodidad)

    }
    

}



// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//


import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor COMPLETAR

    public Alumno (String nombre){
        this.nombre = nombre;
        notas = new ArrayList<>();
    }

   //Getters y setters
   public void getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre;
    }

    // Método añadirNota COMPLETAR
   
   public static void AñadirNota(){
    notas.add (nota);
   }

    // Método calcularMedia COMPLETAR

    public static void CalcularMedia (){

        int suma = 0;
        for (int n:notas){
            suma += n;
        }
        return (double) suma /notas.size();
    }
    

    // Método mostrarInfo COMPLETAR

    public static vois MostrarInformacion (){
        return ("Nombre: " + getnombre + "Notas: " + AñadirNota + "Media: " + CalcularMedia);
    }
    
}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


class CuentaBancaria {

    // atributos COMPLETAR

    private String titular;
    private int saldo;
    

    // constructor COMPLETAR
    
    public CuentaBancaria (String titular, int saldo){
        this.titular = titular;
        this.saldo = saldo;
    }



    // método ingresar COMPLETAR

    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.saldo += cantidad;
            System.out.println("Has ingresado: " + cantidad + "$");
        }else{
            System.out.println("Cantidad no valida");
        }
    }
   

    // método retirar COMPLETAR
   
   public void retirar (double cantidad){
    if(cantidad <=0){
        System.out.println("Cantidad no valida");
    }else if (cantidad > saldo){
        System.out.println("No tienes tanto dinero");
    }else{
        saldo -= cantidad;
        System.out.println("Has retirado " + cantidad + "$");
    }
   }

    // método mostrarSaldo COMPLETAR
    public void MostrarSaldo(){
        System.out.println("Saldo actual: " + saldo);
    }
}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private boolean disponible; // Nuevo atributo necesario para saber si se puede prestar

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Por defecto, al crear un libro, está disponible
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método mostrarInfo
    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Estado: " + estado);
    }
}


import java.util.ArrayList;

public class Biblioteca {

    // Lista de libros
    private ArrayList<Libro> listaLibros;

    // Constructor: Inicializamos la lista vacía
    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    // Método añadirLibro
    public void anadirLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro añadido: " + libro.getTitulo());
    }

    // Método prestarLibro: Recibe el título, busca el libro y cambia su estado
    public void prestarLibro(String titulo) {
        boolean encontrado = false;

        for (Libro libro : listaLibros) {
            // Buscamos por título (ignorando mayúsculas/minúsculas)
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
                if (libro.isDisponible()) {
                    libro.setDisponible(false); // Cambiamos estado a NO disponible
                    System.out.println("El libro '" + titulo + "' ha sido prestado con éxito.");
                } else {
                    System.out.println("Lo siento, el libro '" + titulo + "' ya está prestado.");
                }
                break; // Salimos del bucle si ya encontramos el libro
            }
        }

        if (!encontrado) {
            System.out.println("El libro '" + titulo + "' no existe en la biblioteca.");
        }
    }

    // Método devolverLibro: Busca y cambia el estado a disponible
    public void devolverLibro(String titulo) {
        boolean encontrado = false;

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
                if (!libro.isDisponible()) {
                    libro.setDisponible(true); // Vuelve a estar disponible
                    System.out.println("Has devuelto el libro '" + titulo + "'. Gracias.");
                } else {
                    System.out.println("Este libro ya estaba en la biblioteca, no se puede devolver.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No puedes devolver un libro que no pertenece a esta biblioteca.");
        }
    }
    
    // Método extra para ver todo el inventario
    public void mostrarLibros() {
        System.out.println("\n--- Inventario de la Biblioteca ---");
        for (Libro libro : listaLibros) {
            libro.mostrarInfo();
        }
        System.out.println("-----------------------------------\n");
    }
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//

public class Producto {

    // Atributos
    private String nombre;
    private double precio; // Usamos double para permitir decimales

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    // Es CRUCIAL tener getPrecio() para que el carrito pueda sumar
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Opcional: Para imprimir bonito
    public String toString() {
        return nombre + " (" + precio + "€)";
    }
}

import java.util.ArrayList;

public class Carrito {

    // Lista de productos
    private ArrayList<Producto> compras;

    // Constructor
    public Carrito() {
        this.compras = new ArrayList<>(); // Iniciamos la lista vacía
    }

    // Método añadirProducto
    public void anadirProducto(Producto p) {
        compras.add(p);
        System.out.println("Añadido al carrito: " + p.getNombre());
    }

    // Método calcularTotal
    public double calcularTotal() {
        double total = 0; // 1. Creamos una variable acumulador iniciada en 0
        
        // 2. Recorremos la lista producto por producto
        for (Producto p : compras) {
            // 3. Sumamos el precio del producto actual al total
            total = total + p.getPrecio(); 
            // También se puede escribir: total += p.getPrecio();
        }
        
        // 4. Devolvemos el resultado final
        return total;
    }
    
    // Método extra para ver qué llevamos
    public void mostrarDetalle() {
        System.out.println("\n--- Ticket de Compra ---");
        for(Producto p : compras){
            System.out.println("- " + p.toString());
        }
    }
}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
public class Main {
    public static void main(String[] args) {

    

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.


        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        CuentaBancaria cuenta = new CuentaBancaria("luis", 10000);
        cuenta.ingresar(300);
        cuenta.retirar(500);
        cuenta.retirar(100000000);
        cuenta.MostrarSaldo();

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
            // 1. Crear la biblioteca
            Biblioteca miBiblioteca = new Biblioteca();

            // 2. Crear libros
            Libro l1 = new Libro("El Quijote", "Cervantes");
            Libro l2 = new Libro("1984", "George Orwell");
            Libro l3 = new Libro("El Principito", "Saint-Exupery");

            // 3. Añadir libros a la biblioteca
            miBiblioteca.anadirLibro(l1);
            miBiblioteca.anadirLibro(l2);
            miBiblioteca.anadirLibro(l3);

            // 4. Mostrar estado inicial
            miBiblioteca.mostrarLibros();

            // 5. Probar prestar libro
            miBiblioteca.prestarLibro("1984"); // Éxito
            miBiblioteca.prestarLibro("1984"); // Fallo (ya está prestado)
            miBiblioteca.prestarLibro("Harry Potter"); // Fallo (no existe)

            // 6. Probar devolver libro
            miBiblioteca.devolverLibro("1984"); // Éxito

            // 7. Mostrar estado final
            miBiblioteca.mostrarLibros();
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

                public class Main {
            public static void main(String[] args) {
                // 1. Crear productos
                Producto p1 = new Producto("Leche", 1.20);
                Producto p2 = new Producto("Pan", 0.80);
                Producto p3 = new Producto("Café", 4.50);

                // 2. Crear el carrito
                Carrito miCarrito = new Carrito();

                // 3. Llenar el carrito
                miCarrito.anadirProducto(p1);
                miCarrito.anadirProducto(p2);
                miCarrito.anadirProducto(p3);
                
                // Añadimos otro pan (puedes repetir objetos)
                miCarrito.anadirProducto(p2); 

                // 4. Mostrar detalle
                miCarrito.mostrarDetalle();

                // 5. Calcular y mostrar el total
                double totalPagar = miCarrito.calcularTotal();
                System.out.println("------------------------");
                System.out.println("TOTAL A PAGAR: " + totalPagar + "€");
    }
}
    }
}

