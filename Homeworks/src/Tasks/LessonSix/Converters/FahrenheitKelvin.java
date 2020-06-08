package Tasks.LessonSix.Converters;

public class FahrenheitKelvin extends BaseConverter {
    private double inputFahrenheit;

    FahrenheitKelvin(double inputFahrenheit) {
        this.inputFahrenheit = inputFahrenheit;
    }

    private double fahrenheitKelvinFormula(double value) {
        return (value - 32) * 5/9 + 273.15;
    }

    @Override
    public double convert() {
        return fahrenheitKelvinFormula(inputFahrenheit);
    }
}
