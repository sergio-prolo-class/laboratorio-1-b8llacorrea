package ifsc.poo;

// Nenhum objeto Retangulo pode ser criado sem altura e largura definidas.

public class Retangulo {

    // Crie um retângulo que possua formas de calcular sua área e perímetro.

    // ESTATICOS
    private static Retangulo retanguloMaior;

    // Atributos
    private float largura;
    private float altura;

    // Construtores
    public Retangulo(float largura, float altura) {
        // valor padrão
        if (largura <= 0) largura = 1;
        if (altura <= 0) altura = 1;
        this.largura = largura;
        this.altura = altura;
        if (retanguloMaior == null
                || this.getArea() / this.getPerimetro()
                > retanguloMaior.getArea() / retanguloMaior.getPerimetro()) {
                    retanguloMaior = this ; // o objeto que estou adicionando é o maior.
        }
    }

    public static Retangulo getRetanguloMaior() {
        return retanguloMaior;
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public void setLargura(float largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public float getArea() {
        return largura * altura;
    }

    public float getPerimetro() {
        return 2 * (altura + largura);
    }

}
