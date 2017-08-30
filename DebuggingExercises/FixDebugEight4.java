// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixDebugEight4
{
   public static void main(String[] args)
   {
      int y;
      List<String> wordlist = new ArrayList<String>() ;
      String entry;
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");
     
      entry = JOptionPane.showInputDialog(null,
        "Enter any word\n" +
        "Enter " + STOP +" when you want to stop");
      while(!entry.equals(STOP))
      {
         wordlist.add(entry);
         entry = JOptionPane.showInputDialog(null,
            "Enter another word\n" +
            "Enter " + STOP + " when you want to stop"); 
      }
      for(y = 0; y < wordlist.size(); ++y)
      {
         Collections.reverse(wordlist);
         message.append(wordlist.get(y));
         message.append("\n");
      }
      JOptionPane.showMessageDialog(null, message);
   }
}

