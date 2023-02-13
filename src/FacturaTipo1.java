public class FacturaTipo1 implements Facturacion {

    @Override
    public void notificarFactura(String mensaje)
    {
        System.out.println(mensaje+"   TIENE IVA DEL 19%");
    }
}
