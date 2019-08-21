package comm.fahim;
import java.util.ArrayList;
import java.util.Arrays;
 
public class ReplaceAllWithoutUnaryOperator 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("good", "bad", "worst", "drastic"));
         
        System.out.println(alphabets);
         
        alphabets.replaceAll(alphabet->alphabet.toUpperCase());  
         
        System.out.println(alphabets);
    }
}
 