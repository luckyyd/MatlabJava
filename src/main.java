
//import HelloWorld.Class1;

import monodex.Provenance;
import AntColonyDifference.antColony;

import com.mathworks.toolbox.javabuilder.MWArray;
import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWNumericArray;

public class main {
	
	public static void main(String[] args)
	{
		Provenance provenance = null;
		antColony antcolony = null;
		try{
			System.out.println("Procedure 1: Provenance...");
			provenance = new Provenance();
			provenance.monodex();
			System.out.println("Procedure 2: Optimization...");
			antcolony = new antColony();
			antcolony.AntColonyDifference(0, args);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	

}
