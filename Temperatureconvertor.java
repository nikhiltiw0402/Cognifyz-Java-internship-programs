import java.util.Scanner;
class Temperatureconvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter ");
        System.out.println("1.  Convert from Celsius to Fahrenheit");
        System.out.println("2.  Convert from Fahrenheit to Celsius");
        System.out.print("Enter your choice 1 / 2 : ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            float celsius = scanner.nextFloat();
            float fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("The coverted temperature is " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            float fahrenheit = scanner.nextFloat();
            float celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("The coverted temperature is " + celsius);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }


    }

    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    public static float  fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
