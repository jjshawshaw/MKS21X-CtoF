public class CtoFTester {

  public static double celsiusToFahrenheit(double cel) {
    return (9 * cel / 5) + 32;
  }

  public static double fahrenheitToCelsius(double cel) {
    return (cel - 32) * 5 / 9;
  }

  public static void main(String[] args){
    if ((celsiusToFahrenheit(0) == 32) && (fahrenheitToCelsius(32) == 0)) {
        System.out.println("Functions work");
    }
  }
}
