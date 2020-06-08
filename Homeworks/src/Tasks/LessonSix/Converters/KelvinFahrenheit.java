package Tasks.LessonSix.Converters;

public class KelvinFahrenheit extends BaseConverter {
    private double inputKelvin;

    KelvinFahrenheit(double inputKelvin) {
        this.inputKelvin = inputKelvin;
    }

    private double kelvinFahrenheitFormula(double value) {
        return (value - 273.15) * 9/5 + 32;
    }

    @Override
    public double convert() {
        return kelvinFahrenheitFormula(inputKelvin);
    }
}
