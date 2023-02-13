public class Factura {

    public static Facturacion obtenerFactura(String tipo){
        if (tipo=="1") {
            return new FacturaTipo1();
        }
        else if(tipo=="2") {

            return new FacturaTipo2();
        } else{

            return new FacturaTipo1();
        }
    }

}
