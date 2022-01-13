public class ProcesaLista {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Faltan argumentos. ");
            System.exit(1);
        }

        int suma = 0;
        int media = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i < args.length; i++) {
            int x =0;

            try {
                x = Integer.parseInt(args[i]);
            }catch (NumberFormatException ex){
                System.out.println("Error en formatos de numeros. ");
                System.exit(2);
            }

            min= Math.min(min, x);
            max= Math.max(max, x);

            suma = suma + x;

        }

            System.out.println("suma = " + suma);
            System.out.println("minimo = " + min);
            System.out.println("maximo = " + max);
            System.out.println("media = " + (suma/ args.length));



    }

}
