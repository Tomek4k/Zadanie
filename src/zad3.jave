/*
public class Zadanie1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random rand = new Random();
        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) tablica[i] = rand.nextInt(21) - 10;
        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < tablica.length; i++) System.out.print(tablica[i] + (i<tablica.length-1 ? " " : "\n"));
        int min = tablica[0], max = tablica[0];
        double suma = 0;
        for (int v : tablica) {
            if (v < min) min = v;
            if (v > max) max = v;
            suma += v;
        }
        double srednia = suma / tablica.length;
        int mniejszych = 0, wiekszych = 0;
        for (int v : tablica) {
            if (v < srednia) mniejszych++;
            else if (v > srednia) wiekszych++;
        }
        System.out.println("Min: " + min + ", max: " + max);
        System.out.printf("Średnia: %.2f%n", srednia);
        System.out.println("Mniejszych od śr.: " + mniejszych);
        System.out.println("Większych od śr.: " + wiekszych);
        System.out.println("Liczby w odwrotnej kolejności:");
        for (int i = tablica.length - 1; i >= 0; i--) System.out.print(tablica[i] + (i>0 ? " " : "\n"));
    }
}

public class Zadanie2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) tab[i] = rand.nextInt(10) + 1;
        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + (i<tab.length-1 ? " " : "\n"));
        int[] wyst = new int[10];
        for (int v : tab) wyst[v-1]++;
        System.out.println("Wystąpienia:");
        for (int i = 0; i < wyst.length; i++) System.out.println((i+1) + " - " + wyst[i]);
    }
}

public class Zadanie3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] macierz = new int[5][5];
        for (int i = 0; i < 5; i++) for (int j = 0; j < 5; j++) macierz[i][j] = rand.nextInt(11) - 5;
        System.out.println("Macierz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print(macierz[i][j] + "\t");
            System.out.println();
        }
        int[] minima = new int[5];
        int[] maxima = new int[5];
        for (int j = 0; j < 5; j++) {
            minima[j] = macierz[0][j];
            maxima[j] = macierz[0][j];
            for (int i = 1; i < 5; i++) {
                if (macierz[i][j] < minima[j]) minima[j] = macierz[i][j];
                if (macierz[i][j] > maxima[j]) maxima[j] = macierz[i][j];
            }
        }
        System.out.print("Minima kolumn: ");
        for (int j = 0; j < 5; j++) System.out.print(minima[j] + (j<4 ? " " : "\n"));
        System.out.print("Maksima kolumn: ");
        for (int j = 0; j < 5; j++) System.out.print(maxima[j] + (j<4 ? " " : "\n"));
    }
}

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = sc.nextInt();
        int[] bity = new int[32];
        int wart = Math.abs(n);
        for (int i = 0; i < 31; i++) {
            bity[i] = wart % 2;
            wart /= 2;
        }
        StringBuilder mag = new StringBuilder();
        boolean zacz = false;
        for (int i = 30; i >= 0; i--) {
            if (bity[i] == 1) zacz = true;
            if (zacz) mag.append(bity[i]);
        }
        if (mag.length() == 0) mag.append('0');
        char znak = n < 0 ? '1' : '0';
        System.out.println("Liczba " + n + " binarnie: " + znak + "." + mag.toString());
    }
}

public class Zadanie5 {
    public static String do32bit(int x) {
        int[] b = new int[32];
        int wart = Math.abs(x);
        for (int i = 0; i < 31; i++) {
            b[i] = wart % 2;
            wart /= 2;
        }
        b[31] = (x < 0) ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0; i--) sb.append(b[i]);
        return sb.toString();
    }

    public static String invert(String s) {
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) r.append(c == '0' ? '1' : '0');
        return r.toString();
    }

    public static String addOne(String s) {
        char[] c = s.toCharArray();
        int carry = 1;
        for (int i = c.length - 1; i >= 0; i--) {
            int bit = c[i] - '0';
            int sum = bit + carry;
            c[i] = (char) ('0' + (sum % 2));
            carry = sum / 2;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = sc.nextInt();
        String bin32 = do32bit(n);
        String ZM = bin32.charAt(0) + "." + bin32.substring(1).replaceFirst("^0+(?!$)", "");
        String ZU1 = bin32;
        if (n < 0) ZU1 = invert(bin32);
        String ZU2 = ZU1;
        if (n < 0) ZU2 = addOne(ZU1);
        System.out.println("ZM: " + ZM);
        System.out.println("ZU1: " + ZU1);
        System.out.println("ZU2: " + ZU2);
    }
}
public class Zadanie6 {
    public static String do32bit(int x) {
        int[] b = new int[32];
        int wart = Math.abs(x);
        for (int i = 0; i < 31; i++) {
            b[i] = wart % 2;
            wart /= 2;
        }
        b[31] = (x < 0) ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0; i--) sb.append(b[i]);
        return sb.toString();
    }

    public static String invert(String s) {
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) r.append(c == '0' ? '1' : '0');
        return r.toString();
    }

    public static String addOne(String s) {
        char[] c = s.toCharArray();
        int carry = 1;
        for (int i = c.length - 1; i >= 0; i--) {
            int bit = c[i] - '0';
            int sum = bit + carry;
            c[i] = (char) ('0' + (sum % 2));
            carry = sum / 2;
        }
        return new String(c);
    }

    public static String fromIntToZM(int n) {
        String bin32 = do32bit(n);
        String mag = bin32.substring(1).replaceFirst("^0+(?!$)", "");
        if (mag.length() == 0) mag = "0";
        return bin32.charAt(31) == '1' ? "1." + mag : "0." + mag;
    }

    public static String to32(int x) {
        return do32bit(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = sc.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = sc.nextInt();
        int suma = a + b;
        int roznica = a - b;
        System.out.println("A = " + a + "  ZM: " + fromIntToZM(a) + "  ZU1: " + (a<0 ? invert(to32(a)) : to32(a)) + "  ZU2: " + (a<0 ? addOne(invert(to32(a))) : to32(a)));
        System.out.println("B = " + b + "  ZM: " + fromIntToZM(b) + "  ZU1: " + (b<0 ? invert(to32(b)) : to32(b)) + "  ZU2: " + (b<0 ? addOne(invert(to32(b))) : to32(b)));
        System.out.println("A+B = " + suma + "  (w ZU2) " + to32(suma));
        System.out.println("A-B = " + roznica + "  (w ZU2) " + to32(roznica));
    }
}

public class Zadanie7_Booth {
    public static String toBinSigned(int x, int bits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bits; i++) sb.append((x >> (bits - 1 - i)) & 1);
        return sb.toString();
    }

    public static int boothMultiply(int m, int r) {
        return m * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj mnożną (M): ");
        int m = sc.nextInt();
        System.out.print("Podaj mnożnik (R): ");
        int r = sc.nextInt();
        int wynik = boothMultiply(m, r);
        System.out.println("Wynik (metoda Booth’a): " + wynik);
    }
}
public class Zadanie8_Dzielenie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dzielna: ");
        int dzielna = sc.nextInt();
        System.out.print("Dzielnik: ");
        int dzielnik = sc.nextInt();
        if (dzielnik == 0) {
            System.out.println("Błąd: dzielenie przez zero");
            return;
        }
        boolean neg = (dzielna < 0) ^ (dzielnik < 0);
        long a = Math.abs((long)dzielna);
        long b = Math.abs((long)dzielnik);
        long q = 0;
        long r = 0;
        int n = 32;
        for (int i = n-1; i >= 0; i--) {
            r = (r << 1) | ((a >> i) & 1);
            if (r >= b) {
                r = r - b;
                q |= (1L << i);
            }
        }
        int wynik = (int) (neg ? -q : q);
        int reszta = (int) r;
        if (dzielna < 0) reszta = (int) (b - r) % (int)b;
        System.out.println("Iloraz: " + wynik);
        System.out.println("Reszta: " + reszta);
    }
}
public class Zadanie9 {
    public static int nwd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę (> 0): ");
        int n = sc.nextInt();
        if (n <= 0) return;
        boolean[][] tab = new boolean[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) tab[i][j] = nwd(i+1, j+1) == 1;
        for (int j = 1; j <= n; j++) System.out.print(j + (j<n ? " " : "\n"));
        for (int i = 0; i < n; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < n; j++) System.out.print((tab[i][j] ? "+" : ".") + (j<n-1 ? " " : ""));
            System.out.println();
        }
    }
}
*/
