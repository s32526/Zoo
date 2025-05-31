public class Orzel extends Ptak {
    @Override
    public String wydajDzwiek() {
        return "Orzeł krzyczy";
    }

    @Override
    public String poruszajSie() {
        return "Orzeł szybko lata";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i lasy";
    }

    public void obserwujZDaleka() {
        System.out.println("Orzeł wypatruje ofiary z dalekiej odległości");
    }
}
