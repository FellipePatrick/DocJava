package ModuloDois;

public class switchh {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("faixa-preta");
            case "amarela":
                System.out.println("faixa-amarela");
            default:
                System.out.println("sem faixa");
        }
    }
}
