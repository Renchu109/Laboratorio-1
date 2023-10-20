import java.util.Random;

public class POO_Introduccion {
    public static void main(String[] args){

        //Ejercicios 1,2,3
        //Creación de los objetos de la clase perrito
        perrito perro1 = new perrito("Renzo", "Ovejero alemán", 20);
        perrito perro2 = new perrito("Rodolfo", "Caniche mini toy", 69);
        perrito perro3 = new perrito("Max", "Boyero de Berna", 21);


        //Llamar a los métodos de la información de los perros
        System.out.println("\nInformación sobre el primer perro\n");
        perro1.mostrar_Info_Perros();
        perro1.ladrar();

        System.out.println("\nInformación sobre el segundo perro\n");
        perro2.mostrar_Info_Perros();
        perro2.ladrar();

        System.out.println("\nInformación sobre el tercer perro\n");
        perro3.mostrar_Info_Perros();
        perro3.ladrar();


        //Ejercicios 4,5
        //Crear objeto de la clase circulo

        circulo rad1 = new circulo(14);
        circulo rad2 = new circulo(8);
        circulo rad3 = new circulo(20);

        //Llamar a los métodos de la clase círculo

        System.out.println("\nInformación sobre el primer radio: 14\n");
        rad1.mostrar_Radio_Circun();

        System.out.println("\nInformación sobre el segundo radio: 8\n");
        rad2.mostrar_Radio_Circun();

        System.out.println("\nInformación sobre el tercer radio: 20\n");
        rad3.mostrar_Radio_Circun();


        //Ejercicios 6,7
        //Creación de objetos la clase estudiante
        estudiante est1 = new estudiante("Renzo", "7", 20);
        estudiante est2 = new estudiante("Rodolfo", "69", 27);
        estudiante est3 = new estudiante("Max", "546", 21);
        estudiante est4 = new estudiante("Gualter", "15", 22);
        estudiante est5 = new estudiante("Nacho", "4856", 22);

        //Llamar a los métodos de lso objetos
        System.out.println("\nInformación del 1° estudiante\n");
        est1.mostrar_Info_Estudiantes();

        System.out.println("\nInformación del 2° estudiante\n");
        est2.mostrar_Info_Estudiantes();

        System.out.println("\nInformación del 3° estudiante\n");
        est3.mostrar_Info_Estudiantes();

        System.out.println("\nInformación del 4° estudiante\n");
        est4.mostrar_Info_Estudiantes();

        System.out.println("\nInformación del 5° estudiante\n");
        est5.mostrar_Info_Estudiantes();


        //Ejercicios 8,9
        //Creación de los objetos de la clase
        libro l1 = new libro("Harry Potter y el cáliz de fuego", "J.K. Rowling", 1997);
        libro l2 = new libro("El imperio de los tecnoperones", "Mario Japaz", 2015);
        libro l3 = new libro("Las crónicas de Narnia: El león, la bruja y el armario", "C.S. Lewis", 1950);

        //Llamar a métodos de los objetos
        System.out.println("\nInformación sobre el primer libro\n");
        l1.mostrar_Info_Libros();

        System.out.println("\nInformación sobre el segundo libro\n");
        l2.mostrar_Info_Libros();

        System.out.println("\nInformación sobre el tercer libro\n");
        l3.mostrar_Info_Libros();


        //Ejercicio 10,11
        int sald = 0;

        //Método para depositar

        System.out.println("\ncliente\n");

        int deposito = depositar(sald);

        //Método para retirar
        int retiro = retirar(sald);

        sald = deposito + retiro;

        //Crear objetos de la clase cuenta bancaria
        cuenta_Bancaria cuenta = new cuenta_Bancaria(4,sald);

        //Llamar a métodos de los objetos

        cuenta.mostrar_Info_Clientes();

        //Ejercicio 12
        //Crear objeto de la clase rectángulo

        rectangulo rec1 = new rectangulo(5,10);
        rectangulo rec2 = new rectangulo(10, 5);
        rectangulo rec3 = new rectangulo(8, 8);

        //Llamar a los métodos de la clase rectángulo

        System.out.println("\nInformación sobre el primer rectángulo: Ancho = 5. Alto = 10\n");
        rec1.mostrar_Area_Per();

        System.out.println("\nInformación sobre el segundo rectángulo: Ancho = 10. Alto = 5\n");
        rec2.mostrar_Area_Per();

        System.out.println("\nInformación sobre el tercer rectángulo: Ancho = 8. Alto = 8\n");
        rec3.mostrar_Area_Per();

        //Ejercicio 13, 14
        //Crear objeto de la clase coche
        coche c1 = new coche("Audi", "TT", 2023);
        coche c2 = new coche("Volkswagen", "Suran", 2010);
        coche c3 = new coche("Chevrolet", "Corsa", 2005);

        //Llamar a los métodos de los objetos
        System.out.println("\nCoche 1\n");
        c1.mostrar_Info_Coches();
        c1.acelerar();
        c1.frenar();

        System.out.println("\nCoche 2\n");
        c2.mostrar_Info_Coches();
        c2.acelerar();
        c2.frenar();

        System.out.println("\nCoche 3\n");
        c3.mostrar_Info_Coches();
        c3.acelerar();
        c3.frenar();

        //Ejercicio 15
        //Crear objeto de la clase película
        pelicula pel1 = new pelicula("9 Reinas", "Fabián Bielinski", 115);
        pelicula pel2 = new pelicula("John Wick", "Chad Stahelski", 169);
        pelicula pel3 = new pelicula("MadMax", "George Miller", 93);

        //Llamar al método de los objetos
        System.out.println("\nPelícula 1\n");
        pel1.mostrar_Info_Pel();

        System.out.println("\nPelícula 2\n");
        pel2.mostrar_Info_Pel();

        System.out.println("\nPelícula 3\n");
        pel3.mostrar_Info_Pel();
    }
    //Método para depositar saldo
    public static int depositar(int sald){
        System.out.println("\tSe registró un depósito de $500");

        return (sald + 500);
    }

    //Método para retirar saldo
    public static int retirar(int sald){
        System.out.println("\tSe registró un retiro de $350");

        return (sald - 350);
    }
}

//Definición de la clase perrito
class perrito{

    //Atributos de la clase perrito
    String nombre;
    String raza;
    int edad;


    //Constructor para inicializar la clase perrito
    public perrito(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    //Método para motrar la información de los perros
    public void mostrar_Info_Perros(){
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tRaza: " + raza);
        System.out.println("\tEdad: " + edad);
    }

    public void ladrar(){
        System.out.println("\tguau guau");
    }
}

//Creación de la clase círculo
class circulo{

    //Atributo de la clase círculo
    int radio;

    //Constructor para inicializar la clase círculo
    public circulo(int radio){
        this.radio = radio;
    }

    //Método para mostrar area y circunferencia
    public void mostrar_Radio_Circun(){
        double area = 3.14 * radio * radio;
        double circun = 3.14 * radio * 2;
        System.out.println("\tÁrea: " + area);
        System.out.println("\tCircunferencia: " + circun);
    }
}

//Creación de la clase estudiante
class estudiante{

    //Atributos de la clase estudiante
    String nombre;
    String id;
    int edad;

    //Constructor para inicializar la clase estdiante
    public estudiante(String nombre, String id, int edad){
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    //Método para mostrar la información de los estudiantes
    public void mostrar_Info_Estudiantes(){
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tNúmero de identificación: " + id);
        System.out.println("\tEdad: " + edad);
    }
}

//Creación de la clase libro
class libro{

    //Atributos de la clase libro
    String titulo;
    String autor;
    int anio;

    //Constructor para inicializar la clase libro
    public libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    //Método para mostrar la información de los libros

    public void mostrar_Info_Libros(){
        System.out.println("\tTítulo: " + titulo);
        System.out.println("\tAutor: " + autor);
        System.out.println("\tAño de publicación: " + anio);
    }
}

//Creacion de la clase cuentabancaria
class cuenta_Bancaria{

    //Atributos
    int nro_Cuenta;
    int saldo;


    //Constructor para inicializar la clase
    public cuenta_Bancaria(int nro_Cuenta, int saldo){
        this.nro_Cuenta = nro_Cuenta;
        this.saldo = saldo;
    }

    //Método para mostrar la información de los clentes
    public void mostrar_Info_Clientes(){
        System.out.println("\tNúmero de cuenta: " + nro_Cuenta);
        System.out.println("\tSaldo en cuenta: " + saldo);
    }
}

//Creación de la clase rectangulo
class rectangulo{

    //Atributo de la clase rectangulo
    int ancho;
    int alto;

    //Constructor para inicializar la clase rectangulo
    public rectangulo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    //Método para mostrar area y perímetro
    public void mostrar_Area_Per(){
        int area_rec = ancho * alto;
        int per_rec = (ancho * 2) + (alto * 2);
        System.out.println("\tÁrea: " + area_rec);
        System.out.println("\tPerímetro: " + per_rec);
    }
}

//Creación de la clase coche
class coche{

    //Atributos de la clase coche

    String marca;
    String modelo;
    int anio;

    //Constructor para inicializar la clase
    public coche(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    //Método para mostrar la información de los coches
    public void mostrar_Info_Coches(){
        System.out.println("\tMarca: " + marca);
        System.out.println("\tModelo: " + modelo);
        System.out.println("\tAño de fabricación: " + anio);
    }

    //Método para acelerar el coche
    public void acelerar(){
        Random rand = new Random();

        int v = rand.nextInt(500) + 1;
        System.out.println("\tVelocidad inicial: 0 k/h");
        System.out.println("\tAcelerando...");
        System.out.println("\tVelocidad actual: " + v + " k/h");
    }

    //Método para frenar el coche
    public void frenar(){
        System.out.println("\tFrenando...");
        System.out.println("\tVelocidad final: 0 k/h");
    }
}

//Creación de la clase película
class pelicula{

    //Atributos de la clase película
    String titulo;
    String director;
    int duracion;

    //Constructor para inicializar la clase película
    public pelicula(String titulo, String director, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    //Método para mostrar la información de la película
    public void mostrar_Info_Pel(){
        System.out.println("\tTítulo: " + titulo);
        System.out.println("\tDirector: " + director);
        System.out.println("\tDuración en minutos: " + duracion);
    }
}