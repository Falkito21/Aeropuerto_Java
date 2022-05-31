package Proyecto;

public class Compania {
    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelos = 0;

    public Compania(String nombre) {
        this.nombre = nombre;
    }

    public Compania(String nombre, Vuelo v[]) {
        this.nombre = nombre;
        this.listaVuelos = v;
//        indicamos cuantos vuelos hay en mi lista de vuelos 
        numVuelos = v.length;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelos() {
        return numVuelos;
    }
    
    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numVuelos] = vuelo;
        numVuelos++;
    }
    
    public Vuelo getVuelo(int i) {
        return listaVuelos[i];
    }
    public Vuelo getVuelo(String id) {
        boolean encontrado = false;
        int i = 0;
        Vuelo v = null;
        while((!encontrado)&&(i<listaVuelos.length)){
            if(id.equals(listaVuelos[i].getIdentificador())){
                encontrado = true;
                v = listaVuelos[i];
            }
            i++;
        }
        return v;
    }
    
}
