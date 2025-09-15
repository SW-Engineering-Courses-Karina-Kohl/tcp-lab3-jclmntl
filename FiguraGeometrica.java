public abstract class FiguraGeometrica implements CalculosGeometricos {
    private String cor;
    private int idFigura;
    private static int totalFiguras = 0;

    public FiguraGeometrica(String cor){
        totalFiguras++;
        this.cor = cor;
        this.idFigura = totalFiguras;
    }

    public static int getTotalFiguras(){
        return totalFiguras;
    }

    public String getCor(){
        return cor;
    }

    public int getIdFigura(){
        return idFigura;
    }

    public String getInfo(){
        return String.format("Id: %d, Cor: %s, Tipo: %s", idFigura, cor, getTipoFigura());
    }

    public abstract String getDetalhes();
}
