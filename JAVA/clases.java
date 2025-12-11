
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

    public String getmarca(){
        return marca;
    }

    public void setmarca(String marca){
        this.marca = marca;
    }

    public String getmodelo(){
        return marca;
    }

    public void setmodelo(String modelo){
        this.marca = marca;
    }

    public int getvelodidad(){
        return velocidad;
    }

    public void setvelodidad(int velocidad){
        this.velocidad = velocidad;
    }

    
    
    // Método acelerar (suma +10) COMPLETAR

    public static void acelerar (){
        setvelodidad(getvelodidad()+10);
        System.out.println ("El coche acelera y sube a: " + getvelodidad() + "km/h");

    }
   

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR

    public static void frenar (){
        setvelodidad(getvelodidad() + 10);
        System.out.println ("El coche frena y baja a: " + getvelodidad() + "km/h");

    }
   

    // Método mostrarDatos COMPLETAR

    public static void MostrarInformacion(){

        return("Marca: " + getmarca() + "\nModelo: " + getmodelo() + "\nVelocidad: " + getvelodidad())

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
   public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
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

    public static void MostrarInformacion (){
        return ("Nombre: " + getnombre() + "Notas: " + AñadirNota() + "Media: " + CalcularMedia());
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


    public int getSaldo(){
        return this.saldo;

    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }




    // método ingresar COMPLETAR

    public void ingresar(double cantidad){
        if(cantidad > 0){
            
            setSaldo(getSaldo() + cantidad);
            System.out.println("Has ingresado: " + getSaldo() + "$");
        }else{
            System.out.println("Cantidad no valida");
        }
    }
   

    // método retirar COMPLETAR
   
   public void retirar (double cantidad){
    if(cantidad <=0){
        System.out.println("Cantidad no valida");
    }else if (cantidad > saldo){
        System.out.println("No tienes el dinero suficiente");
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

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void  MostrarInfo(){
        System.out.println("Titulo: " + getTitulo() + " || Autor: " + getAutor);
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
        System.out.println("Se ha añadido el libro: " + libro.getTitulo());
    }

    // Método prestarLibro: Recibe el título, busca el libro y cambia su estado
    public void prestarLibro(String titulo) {
        boolean encontrado = false;

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
                if (libro.getDisponible()) {
                    libro.setDisponible(false); 
                    System.out.println("Ya tienes a tu disposicion el libro: " + titulo);
                } else {
                    System.out.println("Lo siento, el libro: " + titulo + ", ya está prestado.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El libro: " + titulo + ", no existe en la biblioteca.");
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
    
    // Mostrar informacion
    public void mostrarLibros() {
        System.out.println("--- Todos los libros de la biblioteca ---");
        for (Libro libro : listaLibros) {
            libro.mostrarInfo();
        }
    }
}


























// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//

public class Producto {

    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters and setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    // metodo to string
    public String toString() {
        return nombre + "-->" + precio + "$";
    }
}




import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> compras;

    // Constructor
    public Carrito() {
        this.compras = new ArrayList<>();
    }

    // Método añadirProducto
    public void anadirProducto(Producto p) {
        compras.add(p);
        System.out.println("Añadido al carrito: " + p.getNombre());
    }

    // Método calcularTotal
    public double calcularTotal() {
        double total = 0; 
        
        
        for (Producto p : compras) {
            total+=p.getPrecio();
        }
        
        return total;
    }
    
    public void mostrarDetalle() {
        System.out.println("--- Ticket de Compra ---");
        for(Producto p : compras){
            System.out.println( + p.toString());
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

        Coche coche = new coche ("toyota", "corolla", 100);
        coche.acelerar();
        coche.frenar();
        coche.MostrarInformacion();








        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

        Alumno alumno = new Alumno("Luis");
        alumno.AñadirNota(5, 7, 8, 5);
        alumno.CalcularMedia();
        alumno.MostrarInformacion()










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

            // Añadir libros
            Libro libro1 = new Libro("El Quijote", "Cervantes");
            Libro libro2 = new Libro("Harry potter", "JK.Rowling");
            Libro libro3 = new Libro("El Principito", "Saint-Exupery");

            // Metodo añadir libro
            miBiblioteca.anadirLibro(libro1);
            miBiblioteca.anadirLibro(libro2);
            miBiblioteca.anadirLibro(libro3);

            // Estado inicial
            miBiblioteca.mostrarLibros();

            // metodo prestar libro
            miBiblioteca.prestarLibro("El Principito"); 
            miBiblioteca.prestarLibro("El Principito");
            miBiblioteca.prestarLibro("biblia");

            // metodo devolver libro
            miBiblioteca.devolverLibro("El Principito"); // Éxito

            // Estado final
            miBiblioteca.mostrarLibros();
  

















        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

                //Crear productos
                Producto producto1 = new Producto("Leche", 1.20);
                Producto producto2 = new Producto("Pan", 0.60);
                Producto producto3 = new Producto("Café", 2);

                //Crear el carrito
                Carrito Carrito = new Carrito();

                //Llenar el carrito
                Carrito.anadirProducto(producto1);
                Carrito.anadirProducto(producto2);
                Carrito.anadirProducto(producto3);
                
                // Añadimos otro pan (puedes repetir objetos)
                Carrito.anadirProducto(producto2); 

                //Mostrar detalle
                Carrito.mostrarDetalle();

                //Calcular y mostrar el total
                double totalPagar = miCarrito.calcularTotal();
                System.out.println("------------------------");
                System.out.println("TOTAL A PAGAR: " + totalPagar + "€");
    }
}
    

