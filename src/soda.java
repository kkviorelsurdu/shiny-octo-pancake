import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class soda {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("sto budete piti !");
    System.out.println("gazirovka 'x'.");
    System.out.println("gazirovka s dobavkoi 'y'.");
    System.out.println( GetMyDrinkString());
  }

  private static String GetMyDrinkString() throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String drink = br.readLine();
    if (drink.equalsIgnoreCase("x")) {
      System.out.println("Horoso vi budete gazirovku !" );
    } else {
      System.out.println("vedite dobavku");
      String dobavka = br.readLine();
      System.out.println("gazirovka s dobavkoi " + dobavka);
    }
    return " ";
  }
}
