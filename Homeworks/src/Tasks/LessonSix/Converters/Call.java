package Tasks.LessonSix.Converters;

public class Call {
    public static void main(String[] args) {
        CelsiusKelvin celsiusKelvin = new CelsiusKelvin(0);
        System.out.println(celsiusKelvin.convert());

        CelsiusFahrenheit celsiusFahrenheit = new CelsiusFahrenheit(0);
        System.out.println(celsiusFahrenheit.convert());

        KelvinCelsius kelvinCelsius = new KelvinCelsius(0);
        System.out.println(kelvinCelsius.convert());

        KelvinFahrenheit kelvinFahrenheit = new KelvinFahrenheit(0);
        System.out.println(kelvinFahrenheit.convert());

        FahrenheitCelsius fahrenheitCelsius = new FahrenheitCelsius(0);
        System.out.println(fahrenheitCelsius.convert());

        FahrenheitKelvin fahrenheitKelvin = new FahrenheitKelvin(0);
        System.out.println(fahrenheitKelvin.convert());
    }

}
