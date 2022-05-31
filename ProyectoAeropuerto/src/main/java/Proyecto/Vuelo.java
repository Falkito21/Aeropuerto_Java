package Proyecto;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precios;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String identificador, 
            String ciudadOrigen, String ciudadDestino, 
            double precios, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precios = precios;
        this.numMaxPasajeros = numMaxPasajeros;
//        ESTOS DOS ATRIBUTOS LOS LLENO YO YA QUE:
//        EL NUMERO ACTUAL DE PASAJEROS VA A SER IGUAL A O
        this.numActualPasajeros = 0;
//        Y VAMOS A ESTABLECER EL ESPACIO QUE
//      TENDRA LA LISTA EN BASE AL NUM.MAX DE PASAJEROS
        listaPasajeros = new Pasajero[numMaxPasajeros];
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecios() {
        return precios;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

//    ///////////////////////////////////
//      pedimos un pasajero de tipo Pasajero
    public void insertarPasajero(Pasajero pasajero){
//        metemos a 'pasajero' en la lista de pasajeros
//      usando la variable 'numActualPasajeros' como iterador
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i= 0;
        Pasajero pas = null;
        while((!encontrado)&&(i<listaPasajeros.length)){
            if(pasaporte.equals(listaPasajeros[i].getPasaporte())){
                encontrado =  true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;
    }
    
    
}
