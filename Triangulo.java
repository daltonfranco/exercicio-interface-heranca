
public class Triangulo implements FIguraGeometrica {
    
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        double area = (this.altura * this.base) / 2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Triangulo";
    }

    @Override
    public double getPerimetro() {
        double perimetro = this.base*3;
        return perimetro;
    }

    
    

}
