public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = 2;
        // -------------------------------
        // VERSÃO ANTIGA (Java 8/11)
        // Switch como comando, precisa de break
        // -------------------------------
//        String nomeDia;
//
//        switch (dia) {
//            case 1:
//                nomeDia = "Domingo";
//                break;
//            case 2:
//                nomeDia = "Segunda-Feira";
//                break;
//            default:
//                nomeDia = "Dia inválido";
//                break;
//        }
//        System.out.println(nomeDia);
//    }
//}
        // -------------------------------
        // VERSÃO MODERNA (Java 12+)
        // Switch como expressão, retorna valor diretamente
        // -------------------------------
        String nomeDia = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-Feira";
            default -> "Dia inválido";
        };
        System.out.println(nomeDia);
    }
}
