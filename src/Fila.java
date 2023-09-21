public class Fila {
    private static Fila intancia;

    private Fila(){
    }
    public static Fila getInstance(){
        if (intancia == null){

            intancia = new Fila();
        }
        return intancia;

    }
    private void ImprimirDocumento(){

    }
    private void RemoveDocumento(){

    }
    private void RemoveTodosDocumento(){

    }
}
