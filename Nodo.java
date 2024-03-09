package lista_examen;

public class Nodo {
    



    String dato;  //Almacena el valor del nodo
    Nodo siguiente; //refetencia al siguiente nodo en la lista


            //constructor para crear un nuevo nodo econ el valor proporcionado
            public Nodo(String elementoInicio){

                this.dato=elementoInicio; //inicializamos el nodo
                this.siguiente=null; //inicializamos el siguiente nodo
            }
}
