package exercicios.exercicio1;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.largura = largura;
        this.altura = altura;
    }


    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura deve ser maior que zero.");
        }
    }

    public void setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Largura deve ser maior que zero.");
        }
    }

    public double area() {
        return getLargura() * getAltura();
    }

    public double perimetro() {
        return (getAltura() + getLargura()) * 2;
    }

    public boolean cabe(Retangulo r) {
        return r.getLargura() <= this.largura && r.getAltura() <= this.altura;
    }


    public static void main(String[] args)  {
        Retangulo ret1 = new Retangulo(10, 5);
        Retangulo ret2 = new Retangulo(8, 4);
        Retangulo ret3 = new Retangulo(12, 6);

        System.out.println("Área do retângulo 1: " + ret1.area());
        System.out.println("Perímetro do retângulo 1: " + ret1.perimetro() + "\n");

        System.out.println("Área do retângulo 2: " + ret2.area());
        System.out.println("Perímetro do retângulo 2: " + ret2.perimetro() + "\n");

        System.out.println("Área do retângulo 3: " + ret3.area());
        System.out.println("Perímetro do retângulo 3: " + ret3.perimetro() + "\n");

        System.out.println("Retângulo 2 cabe no retângulo 1? " + ret1.cabe(ret2));
        System.out.println("Retângulo 3 cabe no retângulo 1? " + ret1.cabe(ret3));

    }
}