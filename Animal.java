public class Animal {
    private String nombre;
    private int edad;
    private String genero;
    private double peso;

    public Animal (String nombre, int edad, String genero, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
    }

    //Getters y setter para los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public double getPeso () {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodo generico para hacer sonido

    public void hacerSonido() {
        System.out.println("Animal hace un sonido");
    }
}

