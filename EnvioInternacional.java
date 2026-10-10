public class EnvioInternacional extends Envio {

    public EnvioInternacional(String codigoEnvio, String destino) {
        super(codigoEnvio, destino, 5000.0); // Costo base internacional
    }

    @Override
    public double calcularCostoFinal() {
        // Al costo normal le sumamos un impuesto aduanero fijo de $2500
        return super.calcularCostoFinal() + 2500.0;
    }
}