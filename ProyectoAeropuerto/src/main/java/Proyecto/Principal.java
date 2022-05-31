package Proyecto;

import java.util.Scanner;

public class Principal {
    static Scanner e = new Scanner(System.in);
    final static int num = 4;//numero de aeropuertos
//    CREAMOS UNA LISTA DE AEROPUERTOS CON EL NOMBRE DE aeropuerto Y CON UN NUMERO MAX. DE 4 AEROPUERTOS 
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    public static void main(String[] args){
        //INSERTAMOS TODOS LOS DATOS QUE TENEMOS DE LOS AEROPUERTOS 
        insertarDatosAeropuerto(aeropuertos);
//        LLAMAMOS AL METODO MENU
        menu();
    }
//     METODO EN DONDE INSERTAMOS TODOS LOS DATOS DE LOS AEROPUERTOS
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
       
        aero[0] = new AeropuertoPublico(800000000, "Jorge Chavez", 
                "Lima", "Perú");
        aero[0].insertarCompania(new Compania("AeroPeru"));
        aero[0].insertarCompania(new Compania("LATAM"));
        aero[0].getCompanias("AeroPeru").insertarVuelo(new Vuelo("IB20", 
                "Lima", "Mexico", 150.90, 150));
        aero[0].getCompanias("AeroPeru").insertarVuelo(new Vuelo("IB21", 
                "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompanias("LATAM").insertarVuelo(new Vuelo("FC12", 
                "Lima", "Londres", 500.90, 180));
        aero[0].getCompanias("LATAM").insertarVuelo(new Vuelo("FC13", 
                "Lima", "Espania", 480.90, 135));
        aero[0].getCompanias("AeroPeru").getVuelo("IB20").
                insertarPasajero(new Pasajero("Juan", "20BGHP", "Argentino"));
        aero[0].getCompanias("AeroPeru").getVuelo("IB20").
                insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
        aero[0].getCompanias("AeroPeru").getVuelo("IB21").
                insertarPasajero(new Pasajero("Pepe","PYT17M", "Colombiano"));
        aero[0].getCompanias("AeroPeru").getVuelo("IB21").
                insertarPasajero(new Pasajero("Alejo", "BVC16L", "Chileno"));
        aero[0].getCompanias("LATAM").getVuelo("FC12")
                .insertarPasajero(new Pasajero("Silvina", "X31SZA", "Rusa"));
        aero[0].getCompanias("LATAM").getVuelo("FC12").
                insertarPasajero(new Pasajero("Raul", "JH21K1", "Italiano"));
        aero[0].getCompanias("LATAM").getVuelo("FC13")
                .insertarPasajero(new Pasajero("Juan", "FG87IO", "Polaco"));
        aero[0].getCompanias("LATAM").getVuelo("FC13")
                .insertarPasajero(new Pasajero("Javier", "Milei", "Cubano"));
        
        
        aero[1] = new AeropuertoPrivado("Tutney", "Chilecito", "Chile");
        aero[1].insertarCompania(new Compania("AirChile"));
        String empresas [] = {"Convorse", "Patyui"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompanias("AirChile")
                .insertarVuelo(new Vuelo(
                        "ART01", "Chilecito", "Brasil", 200.50, 100));
        aero[1].getCompanias("AirChile")
                .insertarVuelo(new Vuelo(
                        "ART02", "Chilecito", "Buenos Aires", 150.75, 110));
        aero[1].getCompanias("AirChile").getVuelo("ART01")
                .insertarPasajero(new Pasajero(
                        "Jose", "BN21MM", "Boliviano"));
        aero[1].getCompanias("AirChile").getVuelo("ART01")
                .insertarPasajero(new Pasajero(
                        "Agustin", "UY8KL1", "Argentino"));
        aero[1].getCompanias("AirChile").getVuelo("ART02")
                .insertarPasajero(new Pasajero(
                        "Marcelo", "BX31ZM", "Espaniol"));
        aero[1].getCompanias("AirChile").getVuelo("ART02")
                .insertarPasajero(new Pasajero(
                        "Rolando", "JIOP09", "Uruguayo"));
        
        
        aero[2] = new AeropuertoPublico(
                900000000, "Ezeiza", "Buenos Aires", "Argentina");
        aero[2].insertarCompania(new Compania("Arcor"));
        aero[2].insertarCompania(new Compania("Parse"));
        
        aero[2].getCompanias("Arcor")
                .insertarVuelo(new Vuelo(
                        "AB100", "Buenos Aires", "Islas Canarias", 345.30, 90));
        aero[2].getCompanias("Arcor").getVuelo("AB100")
                .insertarPasajero(new Pasajero(
                        "Carlos", "IY91OP", "Peruano"));
        aero[2].getCompanias("Arcor").getVuelo("AB100")
                .insertarPasajero(new Pasajero(
                        "Robertson", "KL77NM", "Mexicano"));
        aero[2].getCompanias("Parse")
                .insertarVuelo(new Vuelo(
                        "19HFG", "Buenos Aires", "Tucuman", 90, 80));
        aero[2].getCompanias("Parse")
                .insertarVuelo(new Vuelo(
                        "CB230", "Buenos Aires", "Mendoza", 100, 110));
        aero[2].getCompanias("Parse").getVuelo("CB230")
                .insertarPasajero(new Pasajero(
                        "Maria", "123ABV", "Alemana"));
        aero[2].getCompanias("Parse").getVuelo("CB230")
                .insertarPasajero(new Pasajero(
                        "Marcela", "NE871", "Colombiana"));
        
        
        aero[3] = new AeropuertoPublico(600000000, "Panel", "Florianopolis", "Brasil");
        aero[3].insertarCompania(new Compania("Trabelinia"));
        
        aero[3].getCompanias("Trabelinia")
                .insertarVuelo(new Vuelo(
                        "T910B", "Florianopolis", "India", 130, 400));
        aero[3].getCompanias("Trabelinia")
                .insertarVuelo(new Vuelo(
                        "T911B", "Florianopolis", "Rusia", 600.40, 120));
        aero[3].getCompanias("Trabelinia").getVuelo("T910B")
                .insertarPasajero(new Pasajero(
                        "Manjul", "Y9U8O1", "Indio"));
        aero[3].getCompanias("Trabelinia").getVuelo("T910B")
                .insertarPasajero(new Pasajero(
                        "Manjula", "N1M0R9", "Rumana"));
        
        aero[3].getCompanias("Trabelinia").getVuelo("T911B")
                .insertarPasajero(new Pasajero(
                        "Vervisqui", "YIT012", "Ruso"));
        aero[3].getCompanias("Trabelinia").getVuelo("T911B")
                .insertarPasajero(new Pasajero(
                        "Manuel", "L2910J", "Paraguayo"));
    }
    
//    METODO EN DONDE MOSTRAMOS TODO EL MENU QUE VA A VER EL USUSARIO
    public static void menu(){
        int opcion;
        String nombreAeropuerto, nombreCompania, origen, destino;
//        CREAMOS UNA VARIABLE aeropuerto DE TIPO AEROPUERTO 
        Aeropuerto aeropuerto;   
        Compania compania;
        do {
            System.out.println("\t::MENU::");
            System.out.println("1.Consultar los Aeropuertos Gestionados "
                    + "(Publicos o Privados)");
            System.out.println("2.Ver empresas (Privado) o "
                    + "subvencion (Publico)");
            System.out.println("3. Listas de companias de un aeropuerto");
            System.out.println("4.Lista de vuelos por Compania");
            System.out.println("5.Listar posibles vuelos de origen a destino");
            System.out.println("6.Salir");
            System.out.println("Opcion");
            opcion = e.nextInt();
//            DEPENDIENDO DE LO QUE PONGA EN LA VARIABLE OPCION ENTRA A UN DETERMINADO CASO DEL SWITCH
            switch (opcion) {
                case 1:
                    System.out.println("");
//                    LE PASAMOS AL METODO mostrarDatosAeropuerto ,POR PARAMETRO, LA LISTA DE aeropuertos
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2:
                    System.out.println("");
//                    LE PASAMOS AL METODO mostrarPatrocinio, POR PARAMETRO, LA LISTA DE aeropuertos
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3:
                    System.out.println("");
                     e.nextLine();
                     System.out.println("\nDigite el nombre del Aeropuerto");
                     nombreAeropuerto = e.nextLine();
//                     BUSCAMOS SI EL AEROPUERTO QUE ESCRIBIO EL USUARIO ES CORRECTO Y LO GUARDAMOS EN LA VARIABLE aeropuerto
                     aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
//                     SI NO ES CORRECTO SE LO INDICAMOS
                     if(aeropuerto == null){
                         System.out.println("El aeropuerto no existe");
                     }
//                     SI ES CORRECTO
                     else{
//                         LE PASAMOS AL METODO, POR PARAMETRO, LA VARIABLE aeropuerto
                         mostrarCompanias(aeropuerto);
                     }
                    break;
                case 4:
                    System.out.println("");
                    e.nextLine();
                    System.out.println("\nDigite el nombre del aeropuerto: ");
                    nombreAeropuerto = e.nextLine();
//                    GUARDAMOS EN aeropuerto EL VALOR QUE NOS RETORNE EL METODO buscarAeropuerto
//                    AL CUAL LE PASAMOS PARAMETRO EL NOMBRE DEL AEROPUERTO QUE BUSCAMOS Y UNA LISTA DE AEROPUERTOS
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if(aeropuerto == null){
                         System.out.println("El aeropuerto no existe");
                     }
                     else{
                        System.out.println("");
                         e.nextLine();
                         System.out.println("\nDigite el nombre de la conpania: ");
                         nombreCompania = e.nextLine();
                         compania = aeropuerto.getCompanias(nombreCompania);
                         mostrarVuelos(compania);
                     }
                    
                    break;
                case 5:
                    e.nextLine();
                    System.out.println("\nDigite la Ciudad Origen");
                    origen = e.nextLine();
                    System.out.println("Digite la ciudad Destino");
                    destino = e.nextLine();
//                    LE PASAMOS POR PARAMETRO LOS VALORES DE origen, destino Y LA LISTA DE aeropuertos
                    mostarVueloOrigenDestino(origen, destino, aeropuertos);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("OPCION ERRONEA");
                    break;
            }
            
        } while (opcion != 6);
    }
//    RECIBE POR PARAMETO UNA LISTA DE TIPO Aeropuerto CON EL NOMBRE DE aeropuertos
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
//        MIETRAS i SEA MENOR AL LARGO LE LA LISTA aeropuertos
        for(int i =0; i<aeropuertos.length; i++){
//            SI aeropuertos[EN LA POSICION i] ES DE TIPO AeropuertoPrivado
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                
                System.out.println("Aeropuerto PRIVADO:");
                System.out.println("Nombre: "+
//                        MOSTRAMOS EL NOMBRE DEL AEROPUERTO 
                        aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+
//                        MOSTRAMOS LA CIUDAD DONDE SE ENCUENTRA EL AEROPUERTO
                        aeropuertos[i].getCiudad());
                System.out.println("pais: "+
//                        MOSTRAMOS EL PAIS DE DONDE ES EL AEROPUERTO 
                        aeropuertos[i].getPais());
            }
//            SI aeropuertos[EN LA POSICION i] ES DE TIPO AeropuertoPublico
            else{
                System.out.println("Aeropuerto PUBLICO:");
                System.out.println("Nombre: "+
//                        MOSTRAMOS EL NOMBRE
                        aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+
//                        MOSTRAMOS LA CIUDAD EN LA QUE SE ENCUENTRA
                        aeropuertos[i].getCiudad());
                System.out.println("pais: "+
//                        MOSTRAMOS EL PAIS EN EL QUE SE ENCUENTRA
                        aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }
//    RECIBE POR PARAMETRO  LA LISTA DE aeropuertos DE TIPO Aeropuerto
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
//        CREAMOS UNA LISTA DE STRING CON EL NOMBRE DE empresas
        String empresas[];
//        MIETRAS i SEA MENOR AL LARGO DE LA LISTA aeropuertos PASADO POR PARAMETRO
        for(int i =0; i<aeropuertos.length;i++){
//            SI EL AEROPUERTO QUE ESTA EN LA LISTA EN LA POSICION i ES DE TIPO AeropuertoPrivado
            if(aeropuertos[i] instanceof AeropuertoPrivado){
//                MOSTRAMOS EL NOMBRE DEL AEROPUERTO EN ESA POSICION
                System.out.println("Aeropuerto PRIVADO: "+
                        aeropuertos[i].getNombre());
//                HACEMOS UN DOWNcASTING ALMACENANDOLO EN LA VARIABLE empresas
//              LE DECIMOS QUE ME ALMACENE EN LA VARIABLE empresas TODAS LAS EMPRESAS QUE TENGA EL AEROPUERTO DE LA LISTA EN LA POSICION i 
//                dOWNcASTEANDOLO A UN AEROPUERTO DE TIP AeropuertoPrivado
                empresas = ((AeropuertoPrivado)aeropuertos[i])
                        .getListaEmpresas();
//                MIENTRAS j SEA MENOR AL LARGO DE LA LISTA EMPRESAS
                for(int j= 0; j<empresas.length;j++){
//                    MOSTRAME LO QUE HAY EN LA LISTA empresas[EN LA POSICON j]
                    System.out.println(empresas[j]);
                }
            }
//            Y SI ES DE TIPO AeropuertoPublico
            else{
//                MOSTRAME EL NOMBRE DE ESE AEROPUERTO
                System.out.println("Aeropuerto PUBLICO: "+
                        aeropuertos[i].getNombre());
//                MOSTRAME LA SUBVENCION DEL AEROPUERTO QUE ESTA EN LA LISTA DE aeropuertos[EN LA POSICION i]
//              PARA MOSTRARTE ESOS DATOS HAY QUE HACER UN dOWNcASTING
                System.out.println("Subvencion: "+
                        ((AeropuertoPublico)aeropuertos[i])
                                .getSubvencion());
            }
            System.out.println("");
        }
    }
//    RECIBO POR PARAMETRO EL NOMBRE DEL AEROPUERTO A BUSCAR Y LA LISTA DE AEROPUERTOS
    public static Aeropuerto buscarAeropuerto( String nombre, 
            Aeropuerto aeropuertos[]){
//        BUSQUEDAS SECUENCIAL 
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;
        while((!encontrado)&&(i<aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
//        RETORNO LO QUE HAYA EN LA VARIABLE aero
        return aero;
        }
//    RECIBE POR PARAMETRO LA VARIABLE aeropuerto DE TIPO Aeropuerto
    public static void mostrarCompanias(Aeropuerto aeropuerto){
//        MOSTRAMOS EL NOMBRE DEL AEROPUERTO
        System.out.println("\nLas companias del aeropuerto: "+
                aeropuerto.getNombre());
//        MIENTRAS i SEA MENOR AL NUMERO DE COMPANIAS QUE TIENE EL AEROPUERTO QUE EL USUARIO NOS PASO POR PARAMETRO
        for(int i =0; i<aeropuerto.getNumCompania();i++){
//            MOSTRAME EL NOMBRE DE LA COMPANIA QUE SE ENCUENTRA EN LA LISTA(EN LA POSICION i) DEL AEROPUERTO INDICADO
            System.out.println(aeropuerto.getCompania(i).getNombre());
        }
    }
    public static void mostrarVuelos(Compania compania){
        Vuelo vuelo;
        System.out.println("Los vuelos de la compania: "+ compania.getNombre());
        for(int i = 0; i<compania.getNumVuelos(); i++){
            vuelo = compania.getVuelo(i);
            System.out.println("Identificador: "+vuelo.getIdentificador());
            System.out.println("Ciudad Origen: "+vuelo.getCiudadOrigen());
            System.out.println("Ciudad Destino: "+vuelo.getCiudadDestino());
            System.out.println("Precio: "+vuelo.getPrecios());
            System.out.println("");
        }
    }
//    RECIBE POR PARAMETRO LOS VALORES QUE LE PASA EL USUARIO
    public static Vuelo[] buscarVuelosOrigenDestino(String origen, 
            String destino,Aeropuerto aeropuerto[]){
//        CREAMOS UNA VARIABLE vuelo DE TIPO Vuelo
        Vuelo vuelo;
        int cont = 0;
//        CREAMOS UNA LISTA listaVuelos DE TIPO Vuelo
        Vuelo listaVuelos[];
//        MIENTRAS i SEA MENOR AL LARGO DE LISTA DE aeropueto
        for(int i = 0;i<aeropuerto.length;i++){
//            MIENTRAS j SEA MENOR AL NUMERO DE COMPANIAS QUE TENGA EL AEROPUERTO EN LA POSICION i
            for(int j=0;j<aeropuerto[i].getNumCompania();j++){
//                MIENTRAS k SEA MENOR AL NUMERO DE VUELOS QUE TIENE LA COMPANIA EN LA POSICION j DEL AEROPUERTO EN LA POSICIOON i
                for(int k=0; k<aeropuerto[i].getCompania(j).getNumVuelos();k++){
//                    GUARDAME EN velo LOS VUELOS DE LA POSICION k DE LA COMPANIA EN LA POSICION j DEL AEROPUERTO EN LA POSICION i
                    vuelo = aeropuerto[i].getCompania(j).getVuelo(k);
//                    SI EL NOMBRE DEL origen QUE ENVIO EL USUARIO ES IGUAL A LA CIUDAD ORIGEN DE VUELO ALMACENADO EN Vuelo
//                      Y SI EL NOMBRE DEL destino QUE ENVIO EL USUARIO ES IGUAL AL DESTINO DEL VUELO ALMACENADO EN Vuelo
                    if((origen.equals(vuelo.getCiudadOrigen()))&&
                            (destino.equals(vuelo.getCiudadDestino()))){
//                        AUMENTA EL CONTADOR
                        cont++;
                    }
                }
            }
        }
//        CREAMOS UNA LISTA CON EL NOMBRE listaVuelos DE TIPO Vuelo CON UNA CANTIDAD DE ESPACIOS IGUAL AL cont ANTERIOR
        listaVuelos = new Vuelo[cont];
        int q =0;
//        MIENTRAS i SEA MENOR AL LARGO DE LA LISTA aeropuerto
        for(int i =0; i<aeropuerto.length;i++){
//            MIENTRAS j SEA MENOR AL NUMERO DE COMPANIAS QUE TIENE EL AEROPUERTO EN LA LISTA EN LA POSICION i
            for(int j =0; j<aeropuerto[i].getNumCompania();j++){
//                MIENTRAS k SEA MENOR AL NUMERO DE VUELOS QUE TIENE LA COMPANIA EN LA POSICION j DEL AEROPUERTO EN LA POSICION i
                for(int k = 0; k<aeropuerto[i].getCompania(j)
                        .getNumVuelos();k++){
//                    GUARDAME EN VUELO EL VUELO QUE ESTAN EN LA POSICION k DE LA COMPANIA EN LA POSICION j DEL AEROPUERTO EN LA POSICION i
                    vuelo = aeropuerto[i].getCompania(j).getVuelo(k);
//                    SI EL origen Y EL destino SON IGUALES A LOS QUE INDICO EL USUARIO
                    if((origen.equals(vuelo.getCiudadOrigen()))&&
                            destino.equals(vuelo.getCiudadDestino())){
//                        GUARDAME EN listaVuelos[EN LA POSCIOON Q] EL vuelo PREVIAMENTE GUARDADO
                        listaVuelos[q] = vuelo;
                        }
                    }
                }                
            }
//        RETORNAME LA listaVuelos
        return listaVuelos;
    }
//    RECIBE POR PARAMETRO LOS VALORES QUE LE PASA EL USUARIO
    public static void mostarVueloOrigenDestino(String origen, String destino,
    Aeropuerto aeropuerto[]){
//        CREAMOS UNA LISTA vuelos DE TIPO Vuelo
        Vuelo vuelos[];
//        Vuelo = AL VALOR QUE RETORNE EL METODO buscarVuelosOrigenDestino
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
//        SI LA LISTA vuelos NO CONTIENE NINGUN VALOR
        if(vuelos.length == 0){
//            IMPRIME ESTO
            System.out.println("No existen Vuelos De Esa Ciudad De "
                    + "Origen A Destino");
        }
//        SINO
        else{
            System.out.println("\nVUELOS ENCONTRADOS: ");
            for(int i =0; i<vuelos.length;i++){
                System.out.println("\nIdentificador: "+
                        vuelos[i].getIdentificador());
                System.out.println("Ciudad Origen: "
                        + vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad Destino: "+
                        vuelos[i].getCiudadDestino());
                System.out.println("Precio: "+vuelos[i].getPrecios());
                System.out.println("");
                
            }
        }
    }
}
