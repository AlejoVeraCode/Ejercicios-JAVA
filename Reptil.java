public class Reptil extends Animal {
    public boolean esAnfibio;

    public Reptil (String nombre, int edad, String genero, double peso, boolean esAnfibio) {
        super (nombre, edad, genero, peso);
        this.esAnfibio = esAnfibio;
    }

    //Getter y Setter para saber si es anfibio
    public boolean getEsAnfibio () {
        return esAnfibio;
    }

    public void setEsAnfibio (boolean esAnfibio) {
        this.esAnfibio = esAnfibio;
    }

    //Metodo adicional para reptiles

    public void mudarPiel() {
        System.out.println("El reptil esta mudando su piel");
    }
}
