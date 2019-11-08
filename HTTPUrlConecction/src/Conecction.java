import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class Conecction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is the url that the program will connect to.
				String output = getUrlContents("https://ahuire-ricardo.github.io/food.json");
				
				//This is the actual output. It will print out the html file for the url provided above.
				System.out.println(output);

	}
	
private static String getUrlContents(String theUrl) {
		
		// Try/catch statement to catch an exceptions being thrown. 
		StringBuilder content = new StringBuilder();
		
		try {
			
			//URL object.
			URL url = new URL(theUrl);
			
			//URLConnection object
			URLConnection urlConnection = url.openConnection();
			
			//BufferedReader object.
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String line;
			
			// Read from the urlconnection through bufferedreader.
			while((line = bufferedReader.readLine()) != null) {
				
				content.append(line + "\n");
				
			}
			
			bufferedReader.close();
			
		}
		
		catch(Exception e)
		
		{
			
			e.printStackTrace();
		
		}
		
		return content.toString();
}

}
