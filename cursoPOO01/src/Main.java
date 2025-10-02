//modelagem orientada a objetos

import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, 10.5, 20, "Neutro");
        System.out.println(cachorro1.getNumeroDeCachorro());

        Cachorro cachorro2 = new Cachorro("Puppy", "Preto", 12, 8.2, 15, "Feliz");
        System.out.println(cachorro1.getNumeroDeCachorro());
        System.out.println(cachorro2.getNumeroDeCachorro());
    }
}
