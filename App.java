public class App {
    
    public static void main(String[] args) {
        
        Quadrado q = new Quadrado();

        q.setLado(4.0);
        System.out.println(q.getNomeFigura());
        System.out.println(q.getArea() + " metros quadrados");
        System.out.println(q.getPerimetro() + " metros");

        System.out.println();

        Triangulo t = new Triangulo();

        t.setAltura(5.0);
        t.setBase(4.0);
        System.out.println(t.getNomeFigura());
        System.out.println(t.getArea() + " metros quadrados");
        System.out.println(t.getPerimetro() + " metros");

    }

}
