import java.math.BigDecimal;
import java.math.RoundingMode;
public class Cinrcunference extends BhaskaraFinder {
    private double radius;
    public Cinrcunference(double a, double b, double c){
        super(a, b, c);
        this.radius = radius(super.getX1(),super.getX2(),super.getY1(),super.getY2());
    }
    private double radius(double x1, double x2, double y1, double y2){
        double radius = Math.sqrt(Math.pow((x2-x1),2) + (Math.pow((y2-y1),2)));
        BigDecimal bd = new BigDecimal(radius).setScale(2, RoundingMode.HALF_UP);  
        radius = bd.doubleValue();
        return radius;
    }
    public void testIfCoordinateInside(double coordinateX, double coordinateY){
        if(this.radius <= radius(super.getX1(),coordinateX,super.getY1(),coordinateY)){
            System.out.println("Para o centro do cículo com cordenadas (" + super.getX1() + "," + super.getY1() + ") e raio de " + this.radius + " a cordenada inserida (" + coordinateX + "," + coordinateY + ") esta fora");
        }else{
            System.out.println("Para o centro do cículo com cordenadas (" + super.getX1() + "," + super.getY1() + ") e raio de " + this.radius + " a cordenada inserida (" + coordinateX + "," + coordinateY + ") esta dentro");
        }
    }
}
