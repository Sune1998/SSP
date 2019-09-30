public class SSP {

   int slaa(Hannd a, Hannd b) {


       int resultat = -1;
       //first hanf rock
       if ( a == Hannd.STEN) {
           if (b == Hannd.STEN) {resultat = 0; }
           if (b == Hannd.SAKS) {resultat = 1; }
           if (b == Hannd.PAPIR) {resultat = 2; }

       }
       //first hand Saks
       if ( a == Hannd.SAKS) {
           if (b == Hannd.STEN) {resultat = 2; }
           if (b == Hannd.SAKS) {resultat = 0; }
           if (b == Hannd.PAPIR) {resultat = 1; }

       }
       //first hand papir
       if ( a == Hannd.PAPIR) {
           if (b == Hannd.STEN) {
               resultat = 1;
           }
           if (b == Hannd.SAKS) {
               resultat = 2;
           }
           if (b == Hannd.PAPIR) {
               resultat = 0;
           }
       }
return resultat;
       }




    // TODO flereKampe() {}

}
