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
    }
}