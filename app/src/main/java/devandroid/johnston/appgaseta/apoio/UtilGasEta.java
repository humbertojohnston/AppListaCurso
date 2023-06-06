package devandroid.johnston.appgaseta.apoio;

public class UtilGasEta {

    public void metodoNaoEstatico() {
    }

    public static void metodoEstatico() {
    }

    public static String mensagem() {
        return "Qualquer mensagem...";
    }

    public static String calcularMelhorOpcao(double gasolina, double etanol) {
        //precp da gasolina: R$ 5,12
        //preço do etanol  : R$ 3,99
        //preço ideal = gasolina * R$ 0,70 = R$ 3,548

        double precoIdeal = gasolina * 0.70;
        String msgDeRetorno;

        if (etanol <= precoIdeal) {
            msgDeRetorno = "Abastecer com etanol";
        } else {
            msgDeRetorno = "Abastecer com gasolina";
        }

        //se o preco do etanol for igual ou menor que o preco ideal,
        //melhor abastecer com etanol, caso contrário, a gasolina é
        //mais vantagem.

        return msgDeRetorno; //Abastecer com Gasolina - Abastecer com Alcool.
    }

}
