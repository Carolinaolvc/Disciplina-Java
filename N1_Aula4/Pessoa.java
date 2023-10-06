package N1_Aula4;

public class Pessoa {
    private double peso;
    private double altura;

    private String nome;
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
