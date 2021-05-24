import java.util.*;
import java.io.*;
import java.math.*;


class Solution 
{


    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
    private static String[][] letters = new String[alphabet.length()][];

    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();

        

        if (in.hasNextLine()) 
        {
            in.nextLine();
        }

        for ( int letterIndex = 0 ; letterIndex < letters.length ; letterIndex ++ )
            letters[letterIndex] = new String[height];



        String text = in.nextLine();

        for (int i = 0; i < height; i ++) 
        {
            String line = in.nextLine();


            for ( int j = 0 ; j < line . length() ; j += width )
            {
                String letterLine = line.substring( j , j + width );
                int letterIndex = j / width;
                letters[letterIndex][i] = letterLine;
            }
        }


        StringBuilder line = new StringBuilder();

        for ( int i = 0 ; i < height ; i ++)
        {
            
            for (int columnIndex = 0 ; columnIndex < text.length() ; columnIndex ++)
            {
                char letter = text.charAt(columnIndex);
                int letterIndex = alphabet.indexOf(Character.toUpperCase(letter));
                if ( letterIndex == -1 )
                {
                    letterIndex = alphabet.length()-1;
                }
                String letterLine = letters[letterIndex][i];
                line.append(letterLine); 
            }
            line.append("\n");
        }


        in.close();
        System.out.print(line);
    }
}
