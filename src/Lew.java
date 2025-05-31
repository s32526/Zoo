public class Lew extends Ssak {
    @Override
    public String wydajDzwiek() {
        return "Lew ryczy";
    }

    @Override
    public String poruszajSie() {
        return "Lew biegnie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Pustynia";
    }

    public void poluj() {
        System.out.println("Lew poluje na inne zwierzę");
    }
}
