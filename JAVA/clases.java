
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


class Libro {

    // atributos COMPLETAR
    private Srting titulo;
    private String autor;
    private ArrayList<Libro> libros;
    
    
    // constructor COMPLETAR
   
   public Libro (String titulo, Srting autor){
    this.titulo = titulo;
    this.autor = autor;
    libros = new ArrayList<>();
   }
   //Metodo añadir libro

    public void AñadirLibro(Libro libro){
        libro.add(libros);
    }

    //Getters and setters

     public void getitulo(){
        return titulo;
    }

    public void settitulo(String titulo){
        this.titulo;
    }

    public void getautor(){
        return autor
    }

    public void setautor(String autor){
        this.autor
    }


    //Metodo prestar libro

    public void prestarLibro(String titulo){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el titulo del libro que quieres comprar")
        String titulos = sc.nextLine();
            if (libro.gettitulo().equals(titulos)) {
                System.out.println(libro);
            }else{
                System.out.println("Lo siento, no tenemos ese libro")
            }
    }

    //Metodo prestar libro

    public void devolverLibro(String titulo){

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el titulo del libro que vas a devolver:")
    }


    // método mostrarInfo COMPLETAR
    
}



class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
    pri
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

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
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}

