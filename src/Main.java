public class Main {
    public static void main(String[] args) {
        Facturacion facturacion = Factura.obtenerFactura("2");
        facturacion.notificarFactura("ESTA FACTURA");
    }
}