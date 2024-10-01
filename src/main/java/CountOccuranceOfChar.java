import java.util.HashMap;
public class CountOccuranceOfChar
{
    public static void main(String[] args)
    {
        String str = "i live in dhaka";

        HashMap <Character, Integer> charCount = new HashMap<>();
        for (int m = str.length() - 1; m >= 0; m--)
        {
            if(charCount.containsKey(str.charAt(m)))
            {
                int count = charCount.get(str.charAt(m));
                charCount.put(str.charAt(m), ++count);
            }
            else
            {
                charCount.put(str.charAt(m),1);
            }
        }
        System.out.println(charCount);
    }
}