import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, 10.5, 20, "Neutro");
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);

//        Petshop petshop = new Petshop();
//
//        petshop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//
//        petshop.darBanho(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//
//        petshop.tosar(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
         cachorro1.soar();
         gato1.soar();
         passaro1.soar();

         //Pra virar mestre:
//        int inteiro; // int, ling, byte = 0;
//        float $$; // double e float = 0.0
//        boolean $87; // boolean tem como default false
//        char ch; // chhar é vazio
//        String teste; // valor default de qualquer objeto é null

//        double d = 5.5d;
//        float f = 3.00f;
//
//        float x = f + (float) d;
//        System.out.println(x);

        int a = 23_456_789;

    }
}