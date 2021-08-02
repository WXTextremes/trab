package classes;

public class Aeronave {
    //#region Atributos
    private int quantidadePassageiros;
    private String numeroSerie;
    private String modelo;
    private Pessoa piloto;
    private int velocidadevoo;
    //#endregion

    //#region Getters / Setters
    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getPiloto() {
        return piloto;
    }

    public void setPiloto(Pessoa piloto) {
        this.piloto = piloto;
    }
    
    //#endregion

    public int getVelocidadevoo() {
        return velocidadevoo;
    }

    public void setVelocidadevoo(int velocidadevoo) {
        this.velocidadevoo = velocidadevoo;
    }

    //#region Construtores
    public Aeronave() {}

    public Aeronave(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Aeronave(String numeroSerie, Pessoa piloto) {
        this.numeroSerie = numeroSerie;
        this.piloto = piloto;
    }

    public Aeronave(Pessoa piloto) {
        this.piloto = piloto;
    }
    void voar(){
        velocidadevoo++;
        }
       
       void voar(int limite){
       for (int i = 0; i < limite; i++){
           this.voar();
       }
    }
    //#endregion

    @Override
    public String toString() {
        return "Aeronave [modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", piloto=" + piloto
                + ", quantidadePassageiros=" + quantidadePassageiros + ", velocidadevoo=" + velocidadevoo + "]";
    }
    
}