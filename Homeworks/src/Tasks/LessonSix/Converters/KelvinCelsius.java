package Tasks.LessonSix.Converters;

public class KelvinCelsius extends BaseConverter {
    private double inputKelvin;
    private double celsius = -273.15;

    KelvinCelsius(double inputKelvin) {
        this.inputKelvin = inputKelvin;
    }

    @Override
    public double convert() {
        return inputKelvin + celsius;
    }
}
