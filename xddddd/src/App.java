import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String [] productos = {"platano", "caca", "banano"};
        int precios [] = {50,30,100};
        Scanner xd = new Scanner (System.in);

        boolean kk = true;
        while (kk) {
            System.out.println("este es nuestro menu");
            for (int i = 0; i < precios.length; i++) {
                System.out.println((i + 1)+ ". "+ productos[i]+ " - "+" $ "+precios[i]);

                
            }
            System.out.println("elija el producto de acuerdo al indice ");
            int elegir = xd.nextInt();

            if (elegir==0) {
                kk = false;

                
            } else if (elegir>=1 && elegir <= productos.length) {
                
                
            } else {
                
            }{
                
            }
            
        }


       
       
       
        
        
    }
}
