
package uge.pkg4.classes;

/**
 *
 * @author Oii
 */
public class Uge4Classes {

    public static void main(String[] args) {
        flyveMaskine Boing = new flyveMaskine();            // laver en ny template af "Flyvemaskine" ved navn boing
                                                             // " new flyveMaskine " er et nyt objekt, og 
        
        //Dette kan også gøres på denne måde: 
        flyveMaskine Boing2;
        Boing2 = new flyveMaskine ();                       // Der bliver altså først tildelt boing2 til classen, 
                                                            // og derefter bliver objektet lavet og først der optager det ram

    }
    
}

class flyveMaskine {

    int passagere;
    int gnsHastighed;
    double benzinKapacitet;
    double benzinForbrug;       // gennemsnits forbrænding
    
}

