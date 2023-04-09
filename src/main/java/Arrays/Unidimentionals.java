package Arrays;

public class Unidimentionals {
    private int  cantMax; //Tamaño del arreglo
    private int Top;// Variable para contar la cantidad de celdas ocupadas
    private int Arreglo []; // Declaración del arreglo


    public Unidimentionals(int m){
        cantMax = m; //Se inicializa el tamaño del arreglo
        Top = 0;//Se inicializa el arreglo vacío
        Arreglo =new int [cantMax];//Creación del arreglo
    }
    public boolean EstaLLeno (){
        if (Top == cantMax){
            return true;
        }else{
            return false;
        }
    }
    public boolean EstaVacio (){
        if (Top == 0){
            return true;
        }else{return false;}
    }
    public boolean Insrtar (int dato){
        if (!EstaLLeno()){
            for (int i = 0; i <= Top-1; i++){
                if (Arreglo[i] == dato) { //Comparación para detectar si el dato ya existe
                    return false; //No se insertara el dato (duplicado)
                }
            }
            Arreglo[Top] = dato; //Se inserta el dato del arreglo
            Top ++; //Se incrementa uno al tamaño del arreglo
            return true; //Dato Insertado con éxito
        }else {
            return false; //No se insert porque está lleno el arreglo
        }
    }
    public boolean Eliminar(int dato){
        if (!EstaVacio()){
            for (int i = 0; i <= Top-1; i++) {
                if (Arreglo[i] == dato){
                    for (int y = 0; y <= Top - 2; y++) { // Desplazamiento de los vectores de las celdas sucesoras
                        Arreglo[y] = Arreglo[y + 1];
                        Top--; //Se decrementa las cantidades de datos del arreglo
                        return true; // Dato eliminado con éxito
                    }
                }
                return false; //No se encontró el dato
            }
        }else{
            return false; // Esta vacío
        }
        return false;
    }
    public String Mostrar (){
        String Resultado = "\n\nTop = " + Top + "\n";
        if (!EstaVacio()){
            for (int i = 0; i <= Top - 1; i++){
                Resultado = Resultado + "\n[" + i + "]"+ Arreglo[i];
            }
        }else{
            Resultado = Resultado + "\nArreglo Vacio";
        }
        return Resultado;
    }
    public boolean Ordenar() {
        if (!EstaVacio()){
            for (int p = 0; p <= Top - 2; p++) { //Ciclo de la celda pivote
                for (int i = p + 1; i <= Top - 1; i++) { // Ciclo del resto de los datos del arreglo
                    if (Arreglo[i] < Arreglo[p]){//Comparación
                        int temporal = Arreglo[p];
                        Arreglo[p] = Arreglo[i];//Intercambio de valores
                        Arreglo[i] = temporal;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    public int ObtenerMayor (){
        int mayor = Arreglo[0];//Inicializa la variable mayor con el primer valor del arreglo
        for (int i = 1; i <= Top - 1; i++) {
            if (Arreglo[i] > mayor) {
                mayor = Arreglo[i];
            }
        }
        return mayor;
    }
}
