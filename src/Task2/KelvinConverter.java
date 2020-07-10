package Task2;

public class KelvinConverter implements Converter{

    public double k = 273.15;

    @Override
    public double convert(double celsius) {
        return  celsius + k;
    }
}
