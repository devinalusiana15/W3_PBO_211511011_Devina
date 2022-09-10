package pertemuan3;

import java.util.*;

public class InputOutput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] tokens = s.split("[^a-zA-Z]");
        int number= 0;
        
        for (int i=0; i<tokens.length; ++i) 
            if (tokens[i].length() > 0) 
                number++;
        
        System.out.println(number);
        
        for (int i=0; i<tokens.length;++i)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
    }
}
