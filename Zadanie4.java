/*
public class Zadania {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in)
        System.out.print("Podaj ciąg znaków: ");
        String ciag = wejscie.nextLine();
        char ostatniZnak = ciag.charAt(ciag.length() - 1);
        int licznik = 0;
        for (int i = 0; i < ciag.length(); i++) {
            if (ciag.charAt(i) == ostatniZnak) licznik++;
        }
        System.out.println("Ostatni znak '" + ostatniZnak + "' występuje " + licznik + " razy.");
      
        System.out.print("Podaj ciąg znaków: ");
        String ciag = wejscie.nextLine();
        String odwrocony = new StringBuilder(ciag).reverse().toString();
        System.out.println("Odwrócony ciąg: " + odwrocony);
       
        System.out.print("Podaj ciąg znaków: ");
        String ciag = wejscie.nextLine();
        String odwrocony = new StringBuilder(ciag).reverse().toString();
        if (ciag.equalsIgnoreCase(odwrocony)) {
            System.out.println("Ciąg jest palindromem.");
        } else {
            System.out.println("Ciąg nie jest palindromem.");
        }

       
        System.out.print("Podaj tekst: ");
        String tekst = wejscie.nextLine();
        int suma = 0;
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (Character.isDigit(znak)) {
                suma += Character.getNumericValue(znak);
            }
        }
        System.out.println("Suma cyfr w tekście: " + suma);
     
       
        System.out.print("Podaj wyrażenie arytmetyczne: ");
        String wyrazenie = wejscie.nextLine();
        int licznik = 0;
        boolean blad = false;

        for (int i = 0; i < wyrazenie.length(); i++) {
            char znak = wyrazenie.charAt(i);
            if (znak == '(') licznik++;
            else if (znak == ')') licznik--;
            if (licznik < 0) {
                blad = true;
                break;
            }
        }

        if (blad || licznik != 0)
            System.out.println("Błędne sparowanie nawiasów");
        else
            System.out.println("OK");
       
        System.out.print("Podaj łańcuch znaków do zaszyfrowania: ");
        String tekst = wejscie.nextLine();
        System.out.print("Podaj przesunięcie: ");
        int przesuniecie = wejscie.nextInt();
        wejscie.nextLine();

        StringBuilder zaszyfrowany = new StringBuilder();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (znak == ' ') {
                zaszyfrowany.append(' ');
            } else {
                int nowyZnak = ((znak - 'a' + przesuniecie) % 26 + 26) % 26 + 'a';
                zaszyfrowany.append((char) nowyZnak);
            }
        }

        System.out.println("Zaszyfrowany tekst: " + zaszyfrowany);
      
        wejscie.close();
    }
}
*/
