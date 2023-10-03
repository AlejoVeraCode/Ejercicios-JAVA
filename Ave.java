public class Ave extends Animal {
    private String tipoDeAlimentacion;

    public Ave(String nombre, int edad, String genero, double peso, String tipoDeAlimentacion) {
        super(nombre, edad, genero, peso);
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    //Getter y Setter para tipo de alimentacion
    public String getTipoDeAlimentacion () {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion (String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    //Metodo adicional para aves
    public void volar() {
        System.out.println("Alta en el cielo un ave guerrera, audaz se eleva, al vuelo triunfal");
    }
}
