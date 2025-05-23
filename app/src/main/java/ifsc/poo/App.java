/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

// A aplicação (App.java) será usada para instanciar objetos das classes e testar suas
//funcionalidades. Crie um metodo estático para executar o teste de cada classe e invoque-
//os na main.

import java.util.Random;

public class App {

    public static void main(String[] args) {

        // Classe Lampada
        Lampada abajur = new Lampada(true);
        Lampada lamp2 = new Lampada(false);

        System.out.println("O abajur " + "está " + abajur.verEstado() + " e a lampada 2 " + lamp2 + " está " + lamp2.verEstado());

        // Classe Pessoa
        Pessoa p1 = new Pessoa("Alice", 22);
        Pessoa p2 = new Pessoa("Bruno", 25);
        for (int i = 0; i < 3; i++) p2.felizAniversario();
        System.out.println(p2.getIdade());
        System.out.println(Pessoa.getNumPessoas());

        // Classe Retangulo
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            new Retangulo(
                    gerador.nextFloat(10),
                    gerador.nextFloat(10)
            );
        }
        Retangulo maior = Retangulo.getRetanguloMaior();
        System.out.println(maior.getArea());
        System.out.println(maior.getPerimetro());




    }
}
