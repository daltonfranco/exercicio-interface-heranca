public class Quadrado implements FIguraGeometrica {

    private double lado;
    
    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double getArea() {
        double area = this.lado*2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        double perimetro = this.lado*4;
        return perimetro;
    }
  
}
