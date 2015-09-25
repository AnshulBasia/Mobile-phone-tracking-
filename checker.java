import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class checker
{
	public static void main ( String args [])
	{
		BufferedReader br = null;
		RoutingMapTree r = new RoutingMapTree();
		
		
		

		try {
			String actionString;
			br = new BufferedReader(new FileReader("actions.txt"));

			while ((actionString = br.readLine()) != null) {//System.out.println(actionString.substring(0,10));
				r.performAction(actionString);

				
				
			}
							Exchange w=r.root();
				//Exchange k=w.child(1);
				//System.out.println(k.id());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
