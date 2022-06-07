import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner st = new Scanner(System.in);
      String pesel="";
      System.out.println("Podaj numer PESEL");
      pesel=st.nextLine();

    if(pesel.length()!=11)
      System.out.println("Numer jest za krótki!");
    else
      System.out.println("PESEL poprawny");
      int numer = pesel.charAt(9);
      if(numer %2 != 0)
        System.out.println("Mezczyzna");
      else
        System.out.println("Kobieta");
  }
}