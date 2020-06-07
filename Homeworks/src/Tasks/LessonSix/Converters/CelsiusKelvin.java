package Tasks.LessonSix.Converters;

public class CelsiusKelvin extends BaseConverter{


    public static void main(String[] args) {
//        BaseConverter celsiusKelvinTest = new BaseConverter();
//        System.out.println(celsiusKelvinTest.convert(5));
        CelsiusKelvin celsiusKelvinTest = new CelsiusKelvin();
        System.out.println(celsiusKelvinTest.convert(5));
    }

    @Override
    public double convert(double value) {
        return value + 273.15;
    }
}
