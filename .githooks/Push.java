import java.io.IOException;
import java.util.Scanner; 

public class Push {
    public static void main(String[] args) throws IOException{
        System.out.println("Vous allez push sur la branche " + args[1]);
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Validez-vous l'opération ?(y/n)");
        String answer = myObj.nextLine();  // Read user input

        System.out.println("Votre réponse : " + answer);

        if(answer == "yes" || answer == "y" || answer == ""){
            System.out.println("Push réussi");
            System.exit(1);
        } else {
            System.exit(1);
        }
    }
}
