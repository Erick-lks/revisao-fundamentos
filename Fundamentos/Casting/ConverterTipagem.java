package Casting;

public class ConverterTipagem {
    public static void main(String[] args) {
        double metrica = 1.5;
        int metricaInt = (int) metrica;
        System.out.println("Metrica converção Double para int: " + metricaInt);
        System.out.println("=========================");

        int resultado = 10;
        double resultadoDouble = resultado;

        System.out.println("Inteiro para Double: " + resultadoDouble);
        System.out.println("=========================");

        String valorString = "50";
        int valorInt = Integer.parseInt(valorString);
        System.out.println("String para Int: " + valorInt);
        System.out.println("=========================");

        String minhaString = String.valueOf(metricaInt);
        System.out.println("Int  para String: " + minhaString);
        System.out.println("========Fim de Casting=========");

    }

}
