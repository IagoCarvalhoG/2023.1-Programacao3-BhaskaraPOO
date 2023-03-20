
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Será iniciado um circulo com valores presetados e será feito 5 testes com valores aleatórios para as cordenada teste");
        Cinrcunference circulo = new Cinrcunference(10, -30, -10);
        for(int i =0; i<5;i++){
            int x= rand.nextInt()/10000000;
            int y = rand.nextInt()/10000000;
            circulo.testIfCoordinateInside(x, y);
        }
    }
}
