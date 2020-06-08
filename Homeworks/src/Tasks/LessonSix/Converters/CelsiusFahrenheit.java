package Tasks.LessonSix.Converters;

public class CelsiusFahrenheit extends BaseConverter{
    private double inputFahrengeit;

    CelsiusFahrenheit(double inputFahrengeit) {
        this.inputFahrengeit = inputFahrengeit;
    }

    private double celsiusFahrenheitFormula(double value) {
        return (value * 9/5) + 32;
    }

    @Override
    public double convert() {
        return celsiusFahrenheitFormula(inputFahrengeit) ;
    }
}
