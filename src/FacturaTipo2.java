public class FacturaTipo2 implements Facturacion {


        @Override
        public void notificarFactura(String mensaje) {
            System.out.println(mensaje+"  TIENE IVA DEL 8%");
        }
}

