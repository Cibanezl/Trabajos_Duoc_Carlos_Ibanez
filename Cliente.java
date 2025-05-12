

class Cliente {
    boolean esTerceraEdad;
    boolean esMujer;
    boolean esEstudiante;
    boolean esNino;

    public Cliente(boolean esTerceraEdad, boolean esMujer, boolean esEstudiante, boolean esNino) {
        this.esTerceraEdad = esTerceraEdad;
        this.esMujer = esMujer;
        this.esEstudiante = esEstudiante;
        this.esNino = esNino;
    }

    public double obtenerDescuento() {
        double[] descuentos = new double[] {
            esTerceraEdad ? 0.25 : 0.0,
            esMujer ? 0.20 : 0.0,
            esEstudiante ? 0.15 : 0.0,
            esNino ? 0.10 : 0.0
        };
        double max = 0;
        for (double d : descuentos) {
            if (d > max) max = d;
        }
        return max;
    }
}

