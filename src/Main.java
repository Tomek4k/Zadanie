/*
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.println("Wproawdz stopnie celsjusza:");
        Scanner text = new Scanner(System.in);

        float celsius = text.nextFloat();
        float fahrenheit = (float)1.8 * celsius + (float)32.0;
        System.out.println(celsius+ " Stopni celsjusza to:\n" + fahrenheit +  " Stopni Fahreneita");

        System.out.println("Podaj 3 liczby:");
        int a , b, c;
        a = text.nextInt();
        b = text.nextInt();
        c = text.nextInt();
        int[] tablica = {a,b,c};
        int max = a;
        int min = a;
        for (int i = 0; i < tablica.length; i++) {
            int currentnum = tablica[i];
            if(currentnum > max)
                max = currentnum;
            if(currentnum < min)
                min = currentnum;
        }
        System.out.println("Najmniejsza: "+ min);
        System.out.println("Najwieksza: " + max);

        System.out.println("Podaj wagę kg:");
        float waga = text.nextFloat();
        System.out.println("Podaj wzrost cm:");
        float wzrost = text.nextFloat();
        wzrost = wzrost /100;1
        float bmi = (waga) / (wzrost * wzrost);
        System.out.println("BMI: " + bmi);

        if(bmi > 24.9) {
            System.out.println("Nadwaga");
        }
        else if (bmi < 18.5) {
            System.out.println("Niedowaga");
        }else {
            System.out.println("waga prawidłowa");
        }

        System.out.println("Podaj dohod w tym roku:");
        float podatek;
        float dochod = text.nextFloat();
        float podatek1 = (float) 85.528;
        if(dochod <=  85.528) {
            podatek = ( (dochod  /100 ) * 18)  - (float)556.02;

        } else {
            float nadwyzka = dochod - podatek1;
            podatek = (float)14839.02 + ((nadwyzka / 100) * 32);
        }
        System.out.println("Podatek to: " + podatek);

        System.out.println("Podaj cenę towaru między 100 a 10000");

        float cenatowaru = 0;
        while (cenatowaru == 0) {
            float nextline = text.nextFloat();
            if(nextline < 100 || nextline > 10000) {
                System.out.println("Cena musi mieścić się między 100 a 10000");
            } else {
                cenatowaru = nextline;
            }

            }
        System.out.println("Podano cenę:" + cenatowaru);

        System.out.println("Podaj ilość rat między 6 a 48:");

        float liczbarat = 0;
        while (liczbarat == 0) {
            float nextline = text.nextFloat();
            if(nextline < 6 || nextline > 10000) {
                System.out.println("Ilość rat musi się mieścić między 6 a 48");
            } else {
                liczbarat = nextline;
            }

        }
        System.out.println("Podano raty:" + liczbarat);
        float oprocentowanie = 0;
        if(12 >= liczbarat) {
            oprocentowanie = (float)2.5;
        } else if (24 >= liczbarat) {
            oprocentowanie = (float)5;

        } else {
            oprocentowanie = (float)10;

        }
        System.out.println("Aktualne oprocentowanie: " + oprocentowanie + "%");
        float miesiecznacena = cenatowaru / liczbarat;
        float miesiecznarata = miesiecznacena + (miesiecznacena * (oprocentowanie / 100));
        System.out.println("Aktualne cena miesięczna z ratą: " + miesiecznarata );

        System.out.println("Kalkulator fajny");
        System.out.println("Podaj liczbe 1");
        float liczba1 = text.nextFloat();
        System.out.println("Podaj symbol operacji możliwe: |*| i |/| i |+| i |-|");
        String symbol = text.nextLine();
        while(symbol != "*" || symbol != "+" || symbol != "-" || symbol != "/") {
            System.out.println("Podaj symbol operacji możliwe: |*| i |/| i |+| i |-|");
            symbol = text.nextLine();
        }
        float liczba2 = text.nextFloat();
        while(symbol == "/" && liczba2 == 0) {

        }

        return;
    }
}
*/