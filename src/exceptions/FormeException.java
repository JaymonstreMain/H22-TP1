package exceptions;

public class FormeException {
    public FormeException(){
    }
    public FormeException(String erreur){
        if (erreur.equals("erreur couleur"))
            System.out.println("go");

    }
}
