import java.util.Scanner;

public class ConversorDeTemperatura extends MetodosDeConversao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Conversor de Temperaturas! :)");   

        System.out.println("Escolha duas unidades de temperatura entre Celsius, Kelvin e Fahrenheit");

        String tipoOrigem = scanner.next();
        String tipoConverter = scanner.next();

   
            if (tipoOrigem.equals("Celsius") && tipoConverter.equals("Kelvin")) {
                System.out.println("Você quer transformar quantos graus Celsius em graus Kelvin?");
                double quantidadeCelsius = scanner.nextDouble();
                double resultadoUm = CelsiusParaKelvin(quantidadeCelsius);
                System.out.println(quantidadeCelsius + "Cº em Kelvin é " + resultadoUm + "Kº");
                System.out.printf("%.1fCº em Celsius é %.2fKº", quantidadeCelsius, resultadoUm);
            } else if (tipoOrigem.equals("Celsius") && tipoConverter.equals("Fahrenheit")) {
                System.out.println("Você quer transformar quantos graus Celsius em Fahrenheit");
                double quantidadeCelsius = scanner.nextDouble();
                double resultadoDois = CelsiusParaFahrenheit(quantidadeCelsius);
                System.out.printf("%.1fCº em Celsius é %.2fFº", quantidadeCelsius, resultadoDois);
            } else if (tipoOrigem.equals("Kelvin") && tipoConverter.equals("Celsius")) {
                System.out.println("Você quer transformar quantos graus Kelvin em Celsius?");
                double quantidadeKelvin = scanner.nextDouble();
                double resultadoTres = KelvinParaCelsius(quantidadeKelvin);
                System.out.println(quantidadeKelvin + "Kº em Celsius é " + resultadoTres + "Cº");
                System.out.printf("%.1fKº em Celsius é %.2fCº", quantidadeKelvin, resultadoTres);
            } else if (tipoOrigem.equals("Kelvin") && tipoConverter.equals("Fahrenheit")) {
                System.out.println("Você quer transformar quantos graus Kelvin em Fahrenheit?");
                double quantidadeKelvin = scanner.nextDouble();
                double resultadoQuatro = KelvinParaFahrenheit(quantidadeKelvin);
                System.out.printf("%.1fCº em Celsius é %.2fFº", quantidadeKelvin, resultadoQuatro);
            } else if (tipoOrigem.equals("Fahrenheit") && tipoConverter.equals("Celsius")) {
                System.out.println("Você quer transformar quantos graus Fahrenheit em Celsius?");
                double quantidadeFahrenheit = scanner.nextDouble();
                double resultadoCinco = FahrenheitParaCelsius(quantidadeFahrenheit);
                System.out.printf("%.1fFº em Celsius é %.2fCº", quantidadeFahrenheit, resultadoCinco);
            } else {
                System.out.println("Você quer transformar quantos graus Fahrenheit em Kelvin?");
                double quantidadeFahrenheit = scanner.nextDouble();
                double resultadoSeis = FahrenheitParaKelvin(quantidadeFahrenheit);
                System.out.printf("%.1fFº em Kelvin é %.2fKº", quantidadeFahrenheit, resultadoSeis);
            }



    }}
        
		
		