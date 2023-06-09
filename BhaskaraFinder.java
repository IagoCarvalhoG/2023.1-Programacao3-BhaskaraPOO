import java.math.BigDecimal;
import java.math.RoundingMode;
public class BhaskaraFinder extends Delta {
    /**
     * InnerBhaskaraFinder
     */
    private double x1;
    private double x2;
    private double y1;
    private double y2;
        public BhaskaraFinder(double a, double b, double c){
            super(a,b,c);
            this.x1 = bhaskaraSolverForPositive(super.a, super.b,super.delta );
            this.x2 = bhaskaraSolverForNegative(super.a, super.b,super.delta );
            this.y1 = yFinder(super.a, super.b, super.c, this.x1);
            this.y2 = yFinder(super.a, super.b, super.c, this.x2);
            
        }
        private double bhaskaraSolverForNegative(double a, double b,double delta){
            double resultNegative = (((-b -Math.sqrt(delta))/(2*a))); 
            BigDecimal bd = new BigDecimal(resultNegative).setScale(2, RoundingMode.HALF_UP);  
            resultNegative = bd.doubleValue();
            return resultNegative;
        }
        private double bhaskaraSolverForPositive(double a, double b, double delta){
            double resultPositive = (((-b +Math.sqrt(delta))/(2*a))); 
            BigDecimal bd = new BigDecimal(resultPositive).setScale(2, RoundingMode.HALF_UP);  
            resultPositive = bd.doubleValue();
            return resultPositive;
        }
        private double yFinder(double a, double b, double c, double x){
            double y1 = Math.pow(x, 2) * a + b*x + c;
            BigDecimal bd = new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);  
            y1 = bd.doubleValue();
            return y1;
        }
        public double getX1() {
            return this.x1;
        }
        public double getX2() {
            return this.x2;
        }
        public double getY1() {
            return this.y1;
        }
        public double getY2() {
            return this.y2;
        }


    }
