import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

public class Push {
    public static void main(String[] args) throws IOException{

		String branch = args[0];
		ArrayList<String> protectedBranches = new ArrayList<>();
		protectedBranches.add("main");
		protectedBranches.add("master");
		
        // String[] remoteBranchRefs = args[0].split("/");
		// String remoteBranchName = remoteBranchRefs[remoteBranchRefs.length - 1];

		System.out.println("Vous vouz appretez à pousser sur la branche " + branch);

		if (protectedBranches.contains(branch)){
			System.out.println("Évitez de push sur la branche principale, ce n'est pas une bonne pratique !");
			System.exit(1);
		} else {
			System.out.println("Vous venez de push sur la branche " + branch);
			System.exit(0);
		}
		
		// if (remoteBranchName.equals("main") || remoteBranchName.equals("master")) {
		// 	System.out.println("Évitez de push sur la branche principale, ce n'est pas une bonne pratique !");
		// 	System.exit(1);
		// }
		// else { 
		// 	System.out.println("Vous venez de push sur la branche " + remoteBranchName);
		// 	System.exit(0);
		// }

		
    }
}
