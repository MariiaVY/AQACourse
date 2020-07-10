package Task2;

public class FahrenheitConverter implements Converter{

    @Override
    public double convert(double celsius) {
     double f = ((celsius*9)/5)+32;
     return f;
    }
}
