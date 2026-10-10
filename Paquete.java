public class Paquete {
    // 1. Atributos protegidos (Encapsulamiento)
    private String id;
    private String descripcion;
    private double peso;
    private String estado;

    // 2. Constructor: Nace con estado "Recibido"
    public Paquete(String id, String descripcion, double peso) {
        this.id = id;
        this.descripcion = descripcion;
        this.peso = peso;
        this.estado = "Recibido"; 
    }

    // 3. Métodos que representan acciones reales del negocio (reemplazan al setter)
    public void ponerEnPreparacion() {
        this.estado = "En preparación";
    }

    public void enviarADistribucion() {
        this.estado = "Salió a distribución";
    }

    public void marcarComoEntregado() {
        this.estado = "Entregado";
    }

    // 4. Getters para que otros puedan leer la información sin modificarla
    public String getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public double getPeso() { return peso; }
    public String getEstado() { return estado; }
}
