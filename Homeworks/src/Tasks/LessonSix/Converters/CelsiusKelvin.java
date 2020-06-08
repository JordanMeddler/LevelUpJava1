package Tasks.LessonSix.Converters;

public class CelsiusKelvin extends BaseConverter {
    private double inputCelsius;
    private double kelvin = 273.15;

    CelsiusKelvin(double inputCelsius) {
        this.inputCelsius = inputCelsius;
    }

    @Override
    public double convert() {
        return inputCelsius + kelvin;
    }
}
