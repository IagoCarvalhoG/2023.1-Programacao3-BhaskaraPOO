/**
 * Delta
 */
public class Delta {
    protected double a;
    protected double b;
    protected double c;
    protected double delta;
    public Delta(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (this.b*this.b) + (-4*this.a*this.c);
        while(this.delta <=0){
            System.out.println("Os valores inseridos para bhaskara retornaram um delta negativo ou igual a zero, programa será terminado");
            System.exit(0);
        }
    }
    
}