import java.util.Locale;

public class Retangulo extends FiguraGeometrica {
    private double altura;
    private double largura;


    public Retangulo(String cor, double altura, double largura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
       return (largura + altura) * 2;
    }

    @Override
    public String getTipoFigura() {
        return "retangulo";
    }

    @Override
    public String getDetalhes() {
        return String.format("Altura: %.2f, Largura: %.2f", altura, largura);
    }
    
    @Override
    public String getInfo(){
        return String.format(Locale.US,"%s, largura: %.2f, altura: %.2f, area: %.2f, perimetro: %.2f, cor: %s", 
        super.getInfo(), getLargura(), getAltura(), calcularArea(), calcularPerimetro(), getCor());
    }
}
