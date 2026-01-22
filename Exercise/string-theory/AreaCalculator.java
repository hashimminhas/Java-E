package sprint;

public class AreaCalculator {

    public static double calculateArea(double  side){
        double square = Math.pow(side, 2);
        return square;
    }

    public static double calculateArea(double len, double wid){
        double rectangle = len * wid;
        return rectangle;
    }

    public static double calculateArea(double radius, boolean isCircle){
        if(!isCircle){
            return Double.NaN;
        }
        double circle = Math.PI * radius * radius;
        return circle;
    }
}