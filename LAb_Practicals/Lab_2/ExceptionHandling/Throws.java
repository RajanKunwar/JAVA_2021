import java.io.IOException;
public class Throws {
    public void getFile(String file) throws IOException
	{
		throw new IOException("File not found in your current directory");
	} 
    public static void main(String[] args) throws IOException
	{
		Throws throwsExe = new Throws();
        try {
            throwsExe.getFile("java"); 
        } catch (Exception e) {
            System.out.println("Error message:"+ e.getMessage());
        }
			
	}   
}