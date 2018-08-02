import java.text.DecimalFormat;

class Task {
  public static void main(String[] args) {
    System.out.println("Monthly payment: $" + getMonthlyPayment(200000,4,15));
  }

  // Complete the code to compute the monthly payment of a loan
  // based on the parameters passed in
  //
  // Return the amount to two decimal places
  // The formula to calculate a monthly payment for a loan is:
  //
  public static double getMonthlyPayment(double loanAmount, double interestRate, double term_in_years) {
    DecimalFormat df = new DecimalFormat("0.00");
    double rate = (interestRate / 100) / 12;
    double base = (rate + 1);
    double months = term_in_years * 12;
    double result = 0;
    result = loanAmount * (rate * (Math.pow(base, months)) / ((Math.pow(base, months)) - 1));

    return Double.parseDouble(df.format(result));
  }
}