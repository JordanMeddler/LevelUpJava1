package Tasks.LessonSix.Converters;

public class FahrenheitCelsius extends BaseConverter {
    private double inputFahrenheit;

    FahrenheitCelsius(double inputFahrenheit) {
        this.inputFahrenheit = inputFahrenheit;
    }

    private double fahrenheitCelsiusFormula(double value) {
        return (value - 32) * 5/9;
    }

    @Override
    public double convert() {
        return fahrenheitCelsiusFormula(inputFahrenheit);
    }
}
