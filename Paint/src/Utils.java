import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {


    public static void writeHTMLToIndex(String html)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Resources/index.html"));
            writer.write(html);
            writer.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException("ecriture dans le fichier index.html echouée\n" + e);
        }
    }

}
