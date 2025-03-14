public class Pessoaimc {

    private double altura,peso,imc;

    public void SetAltura(double altura) {this.altura = altura; }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void calculeIcm() {
       imc = peso/ (altura*altura);
    }
}
