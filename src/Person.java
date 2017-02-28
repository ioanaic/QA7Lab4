/**
 * @author flo
 * @since 28/02/2017.
 */
public class Person {
    public static int persoaneCreate = 0;
    private String prenume;
    private String nume;
    private int ziNastere;
    public int id;
    String cucu;

    public Person() {
    }

    public Person (String prenume, String nume, int x) {
        this.prenume = prenume;
        this.nume = nume;
        ziNastere = x;
        persoaneCreate = persoaneCreate + 1;
        this.id = persoaneCreate;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String x) {
        prenume = x;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getName() {
        return nume;
    }

    public void setZiNastere(int ziNastere) {
        this.ziNastere = ziNastere;
    }

    public int getZiNastere() {
        return ziNastere;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Person florin = new Person();
        Person maria = new Person();
        florin.setNume("Macicasan");
        maria.setPrenume("Maria");
        florin.setPrenume("Florin");
        florin.setNume("Popescu");

    }
}
