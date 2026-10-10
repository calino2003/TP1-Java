public class EnvioExpress extends Envio {

    // Constructor
    public EnvioExpress(String codigoEnvio, String destino) {
        // 'super' llama al constructor de la clase padre (Envio)
        // Le pasamos un costo base más alto por ser express
        super(codigoEnvio, destino, 3000.0); 
    }

    // Sobreescribimos el método de la clase padre
    @Override
    public double calcularCostoFinal() {
        // Calculamos el costo normal (con recargos por peso si los hay) 
        // y le sumamos un 20% de recargo por rapidez
        double costoNormal = super.calcularCostoFinal();
        return costoNormal * 1.20; 
    }
}