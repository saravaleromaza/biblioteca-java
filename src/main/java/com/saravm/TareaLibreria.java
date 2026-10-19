package com.saravm;
import java.util.Scanner;
import java.util.ArrayList;

public class TareaLibreria {
    public static void main(String[] args) {

        System.out.println("INVENTARIO BIBLIOTECA.");
        Scanner sc = new Scanner(System.in);

        //Declaro la variable "opcion" que almacena la opcion que elija el usuario
        int opcion;
        //ArrayList de la Clase Libro que guarde los libros introducidos.
        ArrayList<Libro> libros = new ArrayList<>();

        //do - while, el programa mostrará el menú mientras que no se eliga la opción 4 (salir).
        do {
            //Menú que se muestra después de cada interacción
            System.out.println("MENÚ PRINCIPAL - ELIGE QUE DESEAS HACER:" +
                    "\n1. AGREGAR UN NUEVO LIBRO." +
                    "\n2. MOSTRAR TODOS LOS LIBROS." +
                    "\n3. BUSCAR EL LIBRO POR TÍTULO." +
                    "\n4. SALIR. ");
            opcion = sc.nextInt();

            //Después de nextInt y nextDouble, para que limpie el salto de línea
            sc.nextLine();

            if (opcion == 1){
                System.out.println("AGREGAR UN NUEVO LIBRO.");
                System.out.println("Título: ");
                String titulo = sc.nextLine();

                System.out.println("Autor/autora: ");
                String autor = sc.nextLine();

                System.out.println("Año de publicación: ");
                int año = sc.nextInt();
                //While que asegura un año de publicación sea válido
                while (año <= 0 || año > 2025){
                    System.out.println("Año no válido.");
                    System.out.println("Año de publicación: ");
                    año = sc.nextInt();
                }

                System.out.println("Precio: ");
                double precio = sc.nextDouble();
                //While que asegura un precio válido
                while (precio <= 0){
                    System.out.println("Precio no válido");
                    System.out.println("Precio: ");
                    precio = sc.nextDouble();

                }
                //Se crea un nuevo libro y se añade al ArrayList
                libros.add(new Libro(titulo, autor, año, precio));

                //Vuelve a limpiar el salto de línea
                sc.nextLine();

            } else if(opcion == 2){
                System.out.println("MOSTRAR TODOS LOS LIBROS.");
                //For-Each recorre el ArrayList
                for (Libro datos:libros){
                    //Uso del método creado en la clase Libro para mostrar todos los datos que se introducen
                    System.out.println(datos.mostrarDatos());
                }

            } else if(opcion == 3){
                System.out.println("BUSCAR EL LIBRO POR TÍTULO.");
                System.out.println("Titulo: ");
                String tituloBuscado = sc.nextLine();

                //Variable que indica si se encuentra o no el libro
                boolean encontrado = false;
                //For-Each recorre el ArrayList
                for (Libro buscador:libros){
                    //Busca en titulos ignorando mayúsculas y minúsculas
                    if (buscador.titulo.equalsIgnoreCase(tituloBuscado)){
                        System.out.println("Libro encontrado");
                        encontrado = true;
                        break;     //Al encontrar un libro para la búsqueda

                    }
                }
                /*If fuera del bucle para libros no encontrados.
                ya que si acedes a libros no encontrados con else se repite
                "no encontrado" por cada vez que un título no coincide*/
                if (encontrado == false){
                System.out.println("Libro no encontrado");
                }


            } else if (opcion == 4) {
                //Esta condición evita que el 4 entre dentro el siguiente else

            } else {
                //Con el else aseguramos que el rango de opciones vaya del 1 al 4
                System.out.println("La opción debe estar dentro de las 4 mencionadas");
            }

        } while (opcion != 4);
        System.out.println("Saliendo del programa");
    }
}
