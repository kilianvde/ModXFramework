package kilian.ModXFramework;

import java.io.*;
import static java.lang.System.*;

public class ModXFileReader {
	
	public static String readFile(String path)
	{
		try
		{
			String dummy;
			String file;
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			file = br.toString();
			br.close();
			return file;
		}
		catch(IOException e)
		{
			out.println("[SEVERE] Error while reading given file !");
			return "error";
		}
	}
}
