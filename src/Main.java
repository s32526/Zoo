public class Main {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = {
                new Lew(),
                new Orzel(),
                new Waz()
        };

        for (Zwierze zwierze : zwierzeta) {
            System.out.println("_________");
            System.out.println("Głos - " + zwierze.wydajDzwiek());
            System.out.println("Poruszanie - " + zwierze.poruszajSie());
            System.out.println("Środowisko - " + zwierze.srodowiskoNaturalne());

            if (zwierze instanceof Lew) ((Lew) zwierze).poluj();
            if (zwierze instanceof Orzel) ((Orzel) zwierze).obserwujZDaleka();
            if (zwierze instanceof Waz) ((Waz) zwierze).dus();
        }

    }
}