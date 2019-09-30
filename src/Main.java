import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sten saks papir");

        //Dette er ikke nødvendigt
        Hannd sune = Hannd.PAPIR;
        Hannd Nicky = Hannd.SAKS;
        Hannd mik = Hannd.STEN;

        //start
        SSP runde1 = new SSP();
        System.out.println(runde1.slaa(sune,Nicky));

        //pc generetes a hand
        Hannd pc = null;
        int hanndTal = (int) (Math.random()*3+1);


        if (hanndTal == 1) {pc =Hannd.STEN;}
        if (hanndTal == 2) {pc =Hannd.SAKS;}
        if (hanndTal == 3) {pc =Hannd.PAPIR;}

        //load player hand
        Scanner input = new Scanner(System.in);
        Hannd playerhand = null;
        String playerstring = input.next();
        if (playerstring.equalsIgnoreCase("sten")) {playerhand = Hannd.STEN;}
        if (playerstring.equalsIgnoreCase("saks")) {playerhand = Hannd.SAKS;}
        if (playerstring.equalsIgnoreCase("papir")) {playerhand = Hannd.PAPIR;}
        System.out.println("player choose" + playerhand);
        //compare with slaa
        int resultat = runde1.slaa(pc, playerhand);
       // pronunce a winner
        System.out.println("the winner is" + resultat);



    }
}
