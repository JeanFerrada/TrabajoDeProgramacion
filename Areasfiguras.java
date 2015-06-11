
//Este programa conciste en calcular el area de figuras geométricas, tales como; cuadrado, rectángulo, círculo y triángulo.


package areasfiguras;

/*Lo primero que se debe hacer es importar los datos de java.util.Scanner, 
para que el programa pueda utilizarlos, sin necesidad de tener que crear dichas configuraciones. */
import java.util.Scanner;
/* @author Diegou  */
public class Areasfiguras {

    public static void main(String[] args) {
 
      /*Se genera un Scanner "figura" para luego poder ser utilizado para capturar la opción que va a seleccionar el usuario
        al elegir de que figura va a calcular el área*/
        Scanner figura = new Scanner (System.in);
        
        /*Luego, se deben crear los identificadores para poder ser ultizados posteriormente dentro del programa.
        Se deben generar "int" para valores numericos enteros; "double" para valores numéricos con decimales 
        (como el valor de "pi" para el área del circulo); y "String", para capturar datos alfanumericos  */
        int numero, resp, lado, lado2, radio, base, altura;
        double pi=3.14,resultado;
        String nombre;
        
        /*Solicitaremos al usuario que ingrese su nombre, para luego dar
         la bievenida al programa indicando las intrucciones, utilizando  
        salidas estandar*/
Scanner entrada = new Scanner (System.in);
    System.out.print("Por favor, para continuar ingrese su nombre: ");
            nombre=entrada.nextLine();
    System.out.println("Hola "+nombre+ "! Bienvenido al calculador de áreas de figuras geométricas.");
     System.out.println("Instrucciones:");
     System.out.println("      - para seleccionar una opción recuerde indicar el numero de esta.");
     System.out.println("      - recuerde que solo se puede utilizar numeros positivos enteros.");
    
     /*Generamos una repetición del tipo "do while" para que una vez efectuado
     todos los cálculos, este pregunte si desea volver a calcular el área de otra figura*/
 do{
     
     /*Indicamos al usuario cuales son las figuras disponibles utilizando salidas estandar
     a través de un menú generado por una estructura "switch"
     luego se genera una entrada estandar para capturar la opción seleccionada por el usuario. */
    System.out.println("1.- Cuadrado");
    System.out.println("2.- Rectángulo");
    System.out.println("3.- Círculo");
    System.out.println("4.- Triángulo");
    System.out.print(nombre+ ", Seleccione el número de la figura de la cual desea calcular el área: ");        
    numero=figura.nextInt();
        
    switch (numero){
            
        /*Dentro del "switch" tenemos 4 "case". En cada uno están las salidas estandar
       correspondientes, solicitando al usuario los datos necesarios para luego generar una última 
        salida indicando el valor de área de la figura correspondiente. Si se digita un número 
        no válido, por "default" se genera una salida indicando al usuario de que el número no
        es válido.*/
        /*En cada "case" se encuentra un "if" señalando como condición de que si el valor(es)
        es negativo, este lanzará una salida estandar indicando que recuerde las instrucciones, 
        ya que al principio se indica claramente que para efectuar los cálculos se necesitan números 
        positivos enteros.*/
            case 1: 

                /*En el primer "case" generamos un "Scanner" con el método "cuadrado", para que así al ingresar un valor,
                    este sea capturado, pudiendo dar el resultado final*/
                     Scanner cuadrado = new Scanner(System.in);
                  System.out.println("Ingrese los datos necesarios: ");
                  System.out.print("valor del lado del cuadrado = ");
               /* Al identificador "lado" se le genera un método para que este pueda capturar y utilizar el dato para formar el resultado  */
                  lado =cuadrado.nextInt();
               /* Luego, al identificador "resultado" le generamos una operación con los datos capturados
                  para que este se pueda concatenar con la salida estandar indicando el resultado de la operación.*/
                    resultado=lado*lado;

                    /* Luego se genera una estructura de desicion doble, en donde si el numero ingresado es positivo, genera el resultado,
                    y en el caso de que sea cero o negativo, este recuerda al usuario las instrucciones*/    
                    if (lado>=1){
                  System.out.print("El área de su cuadrado es "+resultado+", ");
                    }else{
                System.out.print("Recuerde que solo puede ingresar números positivos, ");
            }
        break;
        
            case 2: 
                
                /*En el segundo "case" generamos un "Scanner" con el método "rectángulo", para que así al ingresar los valores,
                    estos sean capturados, pudiendo dar el resultado final*/
                     Scanner rectangulo = new Scanner(System.in);
                  System.out.println("Ingrese los datos necesarios: ");
                  /* A los identificadores "lado"  y "lado2" se les genera un método a cada uno para que estos puedan  capturar y utilizar
                dichos valores para formar el resultado  */
                 System.out.print("valor de altura del rectángulo = ");
                   lado = rectangulo.nextInt();
                 System.out.print("valor de ancho del rectángulo = ");
                   lado2 = rectangulo.nextInt();
                /* Luego, al identificador "resultado"  le generamos una operación con los datos capturados
                para que este se pueda concatenar con la salida estandar indicando el resultado de la operación.*/
                    resultado=lado*lado2;
                    /* Luego se genera una estructura de desicion doble, en donde si los números ingresados son positivos, genera el resultado,
                    y en el caso de que sean cero y/o negativos, este recuerda al usuario las instrucciones*/
                    if (lado>=1 && lado2>=1)
                    {
                System.out.print("El área de su rectángulo es "+resultado+", ");
                  }else{
                System.out.print("Recuerde que solo puede ingresar números positivos, ");
            }
        break;
            
            case 3:                                     
                /*En el tercer "case" generamos un "Scanner" con el método "círculo", para que así al ingresar el valor,
                    este sea capturado, pudiendo dar el resultado final*/
                Scanner circulo = new Scanner(System.in);
                
                  System.out.println("Ingrese los datos necesarios: ");
                  System.out.print("valor del radio del círculo = ");
                /* Al identificador "radio" se le genera un método para que este pueda capturar y utilizar el dato para formar el resultado  */
                  radio = circulo.nextInt();
                  /* Luego, al identificador "resultado"  le generamos una operación con los datos capturados
                para que este se pueda concatenar con la salida estandar indicando el resultado de la operación.*/
                    resultado= (pi *(radio*radio));
                    /* Luego se genera una estructura de desicion doble, en donde si los números ingresados son positivos, genera el resultado,
                    y en el caso de que sean cero y/o negativos, este recuerda al usuario las instrucciones*/
                    if (radio>=1){
                System.out.print("El área de su círculo es "+resultado+", ");
                  }else{
                System.out.print("Recuerde que solo puede ingresar números positivos, ");
            }
        break;
            
            case 4:
                /*En el cuarto "case" generamos un "Scanner" con el método "triángulo", para que así al ingresar los valores,
                    estos sean capturados, pudiendo dar el resultado final*/
                Scanner triangulo = new Scanner(System.in);
                
                  System.out.println("Ingrese los datos necesarios: ");
                  /* A los identificadores "base"  y "altura" se les genera un método a cada uno para que estos puedan  capturar y utilizar
                dichos valores para formar el resultado  */
                  System.out.print("base = ");
                 base= triangulo.nextInt();
                  System.out.print("altura = ");
                 altura= triangulo.nextInt();
                  /* Luego, al identificador "resultado"  le generamos una operación con los datos capturados
                para que este se pueda concatenar con la salida estandar indicando el resultado de la operación.*/
                    resultado= (base*altura)/2;
                    /* Luego se genera una estructura de desición doble, en donde si los números ingresados son positivos, genera el resultado,
                    y en el caso de que sean cero y/o negativos, este recuerda al usuario las instrucciones*/
                if (base>=1 && altura>=1)
                {    
                System.out.print("El área de su triángulo es "+resultado+", ");  
                }else{
                System.out.print("Recuerde que solo puede ingresar números positivos, ");
            }
        break;      
           
        /* Acá se crea un "Default, en donde si el usuario ingresa un dato que no corresponde,
           se genera una salida estandar indicando que la opcion no es valoda"*/        
            default: System.out.print(nombre+", La opción ingresada no es válida.");

                /*En esta parte se genera una entrada estandar preguntando al usuario si desea hacer otra operación.
                Este dato es capturado a traves de un valor numerico asignado a cada una de las respuestas presentes*/
}                 System.out.println("¿Desea hacer otra operación?");
                     System.out.println("1.- Si");
                     System.out.println("2.- No");
                     resp = entrada.nextInt();
   
 /*Por último, si el usuario ya no desea realizar más cálculos, este solo debe presionar el número 2
 y así el programa arrojará una salida agradeciendo el que se haya utilizado el programa */ 
 }while(resp!=2 && resp==1);
                   
 System.out.println("Gracias por utilzar nuestro programa ;D");
 
 }}


/*Fundamentos de Programación, seccion 70
Integrantes:
    Henry Abarzua
    Jean Ferrada
    Matias Gonzalez
    Diego Morales
*/