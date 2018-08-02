public class Task {
  public static void main(String[] args) {
    printReceipt();
  }

  public static String printReceipt(){
    return "+--------------------------------------+\n" +
            "|      Java Bank ATM Receipt           |\n" +
            "|      Wednesday, December 2, 2018     |\n" +
            "|      ATM Location # 123              |\n" +
            "|                                      |\n" +
            "|                                      |\n" +
            "|      Account Number: 1234567         |\n" +
            "|      Customer: John Q. Public        |\n" +
            "|      Transaction Type: Deposit       |\n" +
            "|      Transaction Amount: %500.00     |\n" +
            "|      Account Balance: $1,500.00      |\n" +
            "|                                      |\n" +
            "|      Thank you for banking with us   |\n" +
            "|      Have a coffee day               |\n" +
            "+--------------------------------------+";
  }

}