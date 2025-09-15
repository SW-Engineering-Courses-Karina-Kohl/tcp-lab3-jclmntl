import java.util.Locale;

public class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;

    public TrianguloEquilatero(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3.00) / 4.00) * (lado * lado);
    }

    @Override
    public double calcularPerimetro() {
        return lado * 3.00;
    }

    @Override
    public String getTipoFigura() {
        return "triangulo equilatero";
    }

    @Override
    public String getDetalhes(){
        return String.format("Lados %.2f", lado);
    }

    @Override
    public String getInfo(){
        return String.format(Locale.US,"%s, Lados: %.2f, Area: %.2f, perimetro: %.2f, cor: %s", 
        super.getInfo(), getLado(), calcularArea(), calcularPerimetro(), getCor());
    }
    
}
