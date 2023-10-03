//Clase mamifero que hereda de "Animal"
public class Mamifero extends Animal {
    private int numeroDePatas;

    public Mamifero (String nombre, int edad, String genero, double peso, int numeroDePatas) {
        super(nombre, edad, genero, peso);
        this.numeroDePatas = numeroDePatas;
    }

    //Getter y setter para numeroDePatas
    public int getNumeroDePatas() {
        return numeroDePatas;
    }
    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    //Metodo adicional para mamiferos
    public void hibernar() {
        System.out.println("El mamifero empezo a hibernar");
    }
}
