
public class MetodosDeConversao {
	
	public static double CelsiusParaKelvin(Double celsius) {
		final Double FATOR1 = 273.15;
		return (celsius + FATOR1);
	}

	public static Double CelsiusParaFahrenheit(Double celsius) {
		final Double FATOR1 = 9.0 / 5.0;
		final int FATOR2 = 32;
		return (celsius * FATOR1) + FATOR2;
	}

	public static Double KelvinParaFahrenheit(Double kelvin) {

		final Double FATOR1 = 273.15;
		final Double FATOR2 = 9.0 / 5.0;
		final int FATOR3 = 32;

		return (kelvin - FATOR1) * FATOR2 + FATOR3;
	}

	public static Double KelvinParaCelsius(Double kelvin) {
		final Double FATOR1 = 273.15;
		return (kelvin - FATOR1);
	}

	public static Double FahrenheitParaKelvin(Double fahrenheit) {

		final Double FATOR1 = 273.15;
		final Double FATOR2 = 9.0 / 5.0;
		final int FATOR3 = 32;
		return (fahrenheit - FATOR3) * FATOR2 + FATOR1;

	}

	public static Double FahrenheitParaCelsius(Double fahrenheit) {

		final Double FATOR1 = 9.0 / 5.0;
		final int FATOR2 = 32;
		return (fahrenheit - FATOR2) * FATOR1;
	}

}
