public class casting {
    public static void main(String[] args) {
        //casting é a transformação do tipo de um valor
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        String minhaString = "10";
        int meuInt = Integer.parseInt(minhaString);

        String minhaString2 = String.valueOf(meuInt);
    }
}
