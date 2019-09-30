public class Main {
    public static void main(String[] args) {
        System.out.println("Sten saks papir");

        //Dette er ikke nødvendigt
        Hannd sune = Hannd.PAPIR;
        Hannd Nicky = Hannd.SAKS;

        //start
        SSP runde1 = new SSP();
        System.out.println(runde1.slaa(sune,Nicky));

    }
}
