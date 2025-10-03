/*
public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

         while
        int sum = 0, i = A;
        while (i <= B) sum += i++;

        System.out.println(sum);

         do-while
        sum = 0; i = A;
        do { sum += i++; } while (i <= B);
        System.out.println(sum);

         for
        sum = 0;
        for (i = A; i <= B; i++) sum += i;
        System.out.println(sum);
    }
}
public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        while (p <= n) {
            System.out.println(p);
            p *= 2;
        }
    }
}
public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, x;
        do {
            x = sc.nextInt();
            sum += x;
        } while (x != 0);
        System.out.println("Suma: " + sum);
    }
}
public class Zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, count = 0;

        while ((x = sc.nextInt()) != 0) {
            sum += x;
            count++;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println("Suma min + max: " + (min + max));
        System.out.println("Średnia: " + (sum / (double)count));
    }
}
public class Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess;

        do {
            guess = sc.nextInt();
            if (guess < secret) System.out.println("Podałeś za małą wartość");
            else if (guess > secret) System.out.println("Podałeś za dużą wartość");
        } while (guess != secret);

        System.out.println("Gratulacje!");
    }
}
public class Zad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char znak = sc.next().charAt(0);
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        for (int i = 1; i < y; i++) System.out.println(); 

        for (int i = 0; i < a; i++) {
            for (int j = 1; j < x; j++) System.out.print(" "); 
            for (int j = 0; j < b; j++) System.out.print(znak);
            System.out.println();
        }
    }
}
public class Zad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
public class Zad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int evenSum = 0, evenCount = 0, oddSum = 0, oddCount = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            if (digit % 2 == 0) { evenSum += digit; evenCount++; }
            else { oddSum += digit; oddCount++; }
            n /= 10;
        }

        double evenAvg = evenCount > 0 ? (double)evenSum / evenCount : 0;
        double oddAvg = oddCount > 0 ? (double)oddSum / oddCount : 1; // unikamy dzielenia przez 0

        System.out.println("Suma cyfr: " + sum);
        System.out.println("Stosunek średnich: " + (evenAvg / oddAvg));
    }
}
public class Zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }
}
public class Zad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Liczba pierwsza" : "Nie jest liczbą pierwszą");
    }
}
*/
