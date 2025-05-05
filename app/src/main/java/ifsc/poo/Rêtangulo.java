package ifsc.poo;

// Nenhum objeto Retangulo pode ser criado sem altura e largura definidas.

public class Rêtangulo {

    // Crie um retângulo que possua formas de calcular sua área e perímetro.
    private float largura;
    private float altura;
    private float Area;
    private float Perimetro;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getPerimetro() {
        return Perimetro;
    }

    public float getArea() {
        return Area;
    }
}
