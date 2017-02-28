/**
 * @author flo
 * @since 28/02/2017.
 */
public class Names1 {

    public static void main(String[] args) {

        int persoane = SkeletonJava.readIntConsole("Cate persoane sa fie?");

        String[] names = new String[persoane];
        String[] prenume = new String[persoane];
        String[][] persona = new String[persoane][2];


        int[] ziuaDeNastere = new int[persoane];
        for(int i=0; i < persoane; i++) {
            names[i] = SkeletonJava.readStringConsole("Nume?");
            prenume[i] = SkeletonJava.readStringConsole("Prenume?");
            ziuaDeNastere[i] = SkeletonJava.readIntConsole("Ziua de nastere?Luni=0");
        }

        for(int i=0; i< persoane;i++) {
            // Popescu+Victoria 8
            // Maria+Vasile 7
            SkeletonJava.printConsole(names[i] + "+" + prenume[i] + names[i].length() + "nas" + ziuaDeNastere[i]);
        }
    }
}
