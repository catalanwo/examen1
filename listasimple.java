package lista_examen;



public class listasimple {
	Nodo cabeza; //Referencia al primer nodo de la lista

    //constructor para inicializar la lista como vacia
    public listasimple(){

        this.cabeza=null;  //Inicializamos la lista vacia

    }

    //Metodo para insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio(String elementoInicio){
        Nodo nuevoNodo = new Nodo(elementoInicio);  // Crea un nuevo nodo con el valor proporcionado
        nuevoNodo.siguiente = cabeza; // Establece el siguiente del nuevo nodo como la cabeza actual
        cabeza = nuevoNodo; //Actualiza la cabeza para que apunte al nuevo nodo
    }

    //Metodo para insertar un nuevo nodo al final de la lista

    public void insetarAlFinal(String dato){
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor proporcionado
        if(cabeza == null){ //Verifica si la lista esta vacia
            cabeza = nuevoNodo; // Si esta vacia, el nuevo nodo se convierte en la cabeza
        }  
        else {
            Nodo temp = cabeza; 
            while (temp.siguiente != null) { //Avanza hasta el ultimo nodo de la lista
                temp = temp.siguiente;
            }

        }
    }

    

    
   

   
    //Metodo para buscar un elemento en la lista

        public boolean buscar(String buscarElemento) {
	Nodo temp = cabeza;
	while (temp != null) {//Recorre la lista
		if (temp.dato == buscarElemento) {//Compara el valor del nodo con el dato buscado
			return true;//Retorna true si lo encuentra
		}
		temp = temp.siguiente;
	}
	return false;
}

        //Metodo para imprimir los elementos de la lista
        public void imprimirLista() {
	Nodo temp = cabeza;
	System.out.print("Lista: ");
	while (temp != null) {//Recorre la lista
		System.out.print(temp.dato + " ");//Imprime el valor del nodo actual
		temp = temp.siguiente;//Avanza al siguiente nodo
	}
	System.out.println();
}
}
