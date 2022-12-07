import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

public class Push {
    public static void main(String[] args) throws IOException{

		String branch = args[0];
		ArrayList<String> protectedBranches = new ArrayList<>();
		protectedBranches.add("main");
		protectedBranches.add("master");


		System.out.println("Vous vouz appretez à pousser sur la branche " + branch);

		if (protectedBranches.contains(branch)){
			System.out.println("Évitez de push sur la branche principale, ce n'est pas une bonne pratique !");
			System.exit(1);
		} else {
			System.out.println("Vous venez de push sur la branche " + branch);
			System.exit(0);
		}


		
    }
}
