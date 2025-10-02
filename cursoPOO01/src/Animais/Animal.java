package Animais;

public class Animal {

    // Atributos
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    // Construtor
    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    // Métodos
    protected void comer() {
        // lógica de comer
    }

    protected void dormir() {
        // lógica de dormir
    }

    public void soar() {
        System.out.println("cri cri");
    }
}
