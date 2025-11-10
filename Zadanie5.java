/*
public class FunkcjeTekstowe {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
       
        System.out.print("Podaj liczbę: ");
        int n = wejscie.nextInt();
        System.out.println("Silnia iteracyjnie: " + silniaIteracyjna(n));
        System.out.println("Silnia rekurencyjnie: " + silniaRekurencyjna(n));
        System.out.print("Podaj n: ");
        int n = wejscie.nextInt();
        System.out.println("Fibonacci iteracyjnie: " + fibonacciIteracyjny(n));
        System.out.println("Fibonacci rekurencyjnie: " + fibonacciRekurencyjny(n));

        System.out.print("Podaj tekst: ");
        String tekst = wejscie.nextLine();
        System.out.print("Podaj znak: ");
        char znak = wejscie.next().charAt(0);
        System.out.println("Indeks znaku: " + strpos(tekst, znak));
  
        System.out.print("Podaj tekst: ");
        String tekst = wejscie.nextLine();
        System.out.println("Zmienione wielkości liter: " + flipCase(tekst));
  
        System.out.print("Podaj łańcuch 1: ");
        String str1 = wejscie.nextLine();
        System.out.print("Podaj łańcuch 2: ");
        String str2 = wejscie.nextLine();
        System.out.println("Czy \"" + str1 + "\" zaczyna się od \"" + str2 + "\"? " + startsWith(str1, str2));
 
        System.out.print("Podaj tekst reprezentujący liczbę: ");
        String str = wejscie.nextLine();
        System.out.println("Wynik: " + strToInt(str));
  
        System.out.print("Podaj tekst, w którym szukasz: ");
        String gdzie = wejscie.nextLine();
        System.out.print("Podaj tekst, którego szukasz: ");
        String co = wejscie.nextLine();
        System.out.println("Pozycja: " + strfind(gdzie, co));

        System.out.print("Podaj tekst: ");
        String tekst = wejscie.nextLine();
        System.out.println("Liczba słów: " + wordCount(tekst));

        System.out.print("Podaj tekst: ");
        String tekst = wejscie.nextLine();
        String[] slowa = podzielNaSlowa(tekst);
        System.out.println("Słowa:");
        for (String s : slowa) System.out.println(s);

        System.out.print("Podaj tekst, w którym szukasz: ");
        String gdzie = wejscie.nextLine();
        System.out.print("Podaj tekst, którego szukasz: ");
        String co = wejscie.nextLine();
        System.out.println("Liczba wystąpień: " + strFindAndCount(gdzie, co));
 
        System.out.print("Podaj tekst: ");
        String tekst = wejscie.nextLine();
        System.out.print("Podaj początek (start): ");
        int start = wejscie.nextInt();
        System.out.print("Podaj ile znaków usunąć: ");
        int ile = wejscie.nextInt();
        System.out.println("Wynik: " + strcut(tekst, start, ile));
  
        String[] zadania = {"mamla", " mama ", "+12", "0001", "991-234-3", "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};
        String fraza = "ma";

        int suma = 0;
        StringBuilder lacz = new StringBuilder();
        int wystapieniaTab = 0;
        int wystapieniaLacz = 0;

        for (String el : zadania) {
            int liczba = strToInt(el);
            suma += liczba;
            if (liczba == 0 && !(el.startsWith("+") || el.startsWith("-") || Character.isDigit(el.charAt(0)))) {
                lacz.append(el);
                wystapieniaTab += strFindAndCount(el, fraza);
            }
        }

        wystapieniaLacz = strFindAndCount(lacz.toString(), fraza);
        double stosunek = (wystapieniaLacz == 0) ? 0 : (double) wystapieniaTab / wystapieniaLacz;

        System.out.println("Pkt.1: " + suma);
        System.out.println("Pkt.2: " + lacz);
        System.out.println("Pkt.3: " + wystapieniaTab);
        System.out.println("Pkt.4: " + wystapieniaLacz);
        System.out.println("Pkt.5: " + stosunek);
 
        String tekst = "Egzamin";
        int[] kol = {0, 1, 4, 3, 2, 6, 5};
        System.out.println("Wynik: " + poprzestawiaj(tekst, kol));

        System.out.println(czyAnagram("kolej", "olejk"));
        System.out.println(czyAnagram("kolej", "kole"));
        System.out.println(czyAnagram("kolej", "K O L E J"));
        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
  
        System.out.print("Podaj kolor HTML (#RRGGBB): ");
        String kolor = wejscie.nextLine();
        int[] rgb = HTMLColor2RGB(kolor);
        System.out.println("RGB: " + Arrays.toString(rgb));
        

        wejscie.close();
    }

    //FUNKCJEE

    // 1
    public static long silniaIteracyjna(int n) {
        long wynik = 1;
        for (int i = 1; i <= n; i++) wynik *= i;
        return wynik;
    }

    public static long silniaRekurencyjna(int n) {
        if (n <= 1) return 1;
        return n * silniaRekurencyjna(n - 1);
    }

    //  2
    public static int fibonacciIteracyjny(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        int a = 1, b = 2;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibonacciRekurencyjny(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        return fibonacciRekurencyjny(n - 1) + fibonacciRekurencyjny(n - 2);
    }

    //  3
    public static int strpos(String text, char z) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == z) return i;
        }
        return -1;
    }

    //  4
    public static String flipCase(String text) {
        StringBuilder wynik = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) wynik.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) wynik.append(Character.toUpperCase(c));
            else wynik.append(c);
        }
        return wynik.toString();
    }

    //  5
    public static boolean startsWith(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        return str1.substring(0, str2.length()).equals(str2);
    }

    //  6
    public static int strToInt(String str) {
        if (str.isEmpty()) return 0;
        int i = 0, znak = 1, wynik = 0;
        if (str.charAt(0) == '-') { znak = -1; i++; }
        else if (str.charAt(0) == '+') { i++; }

        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            wynik = wynik * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (i < str.length() && (str.charAt(i) == 'e' || str.charAt(i) == 'E')) {
            i++;
            int potega = 0, znakPotegi = 1;
            if (i < str.length() && str.charAt(i) == '-') return wynik * znak;
            if (i < str.length() && str.charAt(i) == '+') i++;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                potega = potega * 10 + (str.charAt(i) - '0');
                i++;
            }
            wynik *= Math.pow(10, potega);
        }

        return wynik * znak;
    }

    //  7
    public static int strfind(String gdzie, String co) {
        if (co.isEmpty()) return 0;
        for (int i = 0; i <= gdzie.length() - co.length(); i++) {
            if (gdzie.substring(i, i + co.length()).equals(co)) return i;
        }
        return -1;
    }

    //  8
    public static int wordCount(String text) {
        String[] slowa = text.trim().split("\\s+");
        if (text.trim().isEmpty()) return 0;
        return slowa.length;
    }

    //  9
    public static String[] podzielNaSlowa(String tekst) {
        if (tekst.trim().isEmpty()) return new String[0];
        return tekst.trim().split("\\s+");
    }

    //  10
    public static int strFindAndCount(String gdzie, String co) {
        if (co.isEmpty()) return 0;
        int licznik = 0, index = 0;
        while ((index = gdzie.indexOf(co, index)) != -1) {
            licznik++;
            index += co.length();
        }
        return licznik;
    }

    // 11
    public static String strcut(String str, int start, int ile) {
        if (start < 0 || start >= str.length()) return str;
        int koniec = Math.min(start + ile, str.length());
        return str.substring(0, start) + str.substring(koniec);
    }

    //  13
    public static String poprzestawiaj(String tekst, int[] kolejnosc) {
        char[] wynik = new char[tekst.length()];
        for (int i = 0; i < tekst.length(); i++) {
            wynik[kolejnosc[i]] = tekst.charAt(i);
        }
        return new String(wynik);
    }

    //  14
    public static boolean czyAnagram(String t1, String t2) {
        t1 = t1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        t2 = t2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] a = t1.toCharArray();
        char[] b = t2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    //  15
    public static int[] HTMLColor2RGB(String color) {
        int r = Integer.parseInt(color.substring(1, 3), 16);
        int g = Integer.parseInt(color.substring(3, 5), 16);
        int b = Integer.parseInt(color.substring(5, 7), 16);
        return new int[]{r, g, b};
    }
}
*/
