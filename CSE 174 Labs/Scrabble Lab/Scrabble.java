import java.util.Scanner;

import java.io.File;

import java.io.IOException;

public class Scrabble {
  
  public static void main(String[] args) throws IOException {
    
// Use a Scanner to open a file. A file we know
    
// contains 187,632 words
    
    Scanner in = new Scanner(new File("words.txt"));
    
    String[] words = new String[187632];
    
// Read the words from the file into an array
    
    for (int i = 0; i < words.length; i++) {
      
      words[i] = in.next();
      
    }
    
    in.close();
    
    
    
    // twoLetters(words);
    // longestWord(words);
    //lettersInArray(words);
    //startsWithS(words);
    //endsWithQ(words);
    //beginsAndEnds(words);
    //qButNotU(words);
    //hundrethU(words);
    //howManyE(words);
    //howManyQ(words);
    //System.out.println(search(words, "lol"));
    hundrethX(words);
    
  } //end of main
  
  public static void twoLetters(String[] words){
    int count = 0;
    for(int i = 0; i <= words.length-1; i++){
      if((words[i]).length() == 2)
        count++;
      
      
    }
    System.out.print(count);
    
  } //end of twoLetters
  
  public static void longestWord(String[] words) {
    int longestLength = 0;
    for(String string : words){
      int lengthOfString = string.length();
      if(lengthOfString > longestLength)
        longestLength = lengthOfString;
      
      
    }
    System.out.println(longestLength);
  }//end longestWord
  
  public static void lettersInArray(String[] words) {
    int sum = 0;
    for(String string : words){
      sum+=string.length();
    }
    System.out.println(sum);
  }
  
  public static void startsWithS(String[] words) {
    int count = 0;
    for(String string : words){
      if(string.substring(0,1).equals("s"))
        count++;
    }
    
    System.out.println(count);
  }//end startsWithS
  
  public static void endsWithQ(String[] words) {
    
    for(String string : words){
      if(string.endsWith("q"))
        System.out.println(string);
    }//end for
    
  }//end endsWIthQ
  
  public static void beginsAndEnds(String[] words){
    int count = 0;
    for(String string : words){
      if(string.charAt(0) == string.charAt(string.length()-1))
        count++;
      
    }//end for
    System.out.println(count);
  }// end beginsAndEnds
  
  public static void qButNotU(String[] words){
    int count = 0;
    for(String string : words){
      if(string.contains("q") && !string.contains("u"))
        count++;
    }
    System.out.print(count);
  }//end qButNotU
  
  public static void hundrethU(String[] words){
    int count = 0;
    for(int i = 0; i <= words.length-1; i++){
      if(words[i].endsWith("u")){
        count++;
      if(count == 100)
        System.out.println(words[i]);
      }
    }//end for   
  }//end hundrethU
  
  public static void howManyE(String[] words){
    int count = 0;
    for(String string : words){
      for(int i = 0; i <= string.length()-1; i++){
        if(string.substring(i,i+1).equals("e"))
          count++;
      }//end small for
    }//end big for
    System.out.println(count);
  }//end of howManyE
  
  public static void howManyQ(String[] words){
    int count = 0;
    for(String string : words){
      for(int i = 0; i <= string.length()-1; i++){
        if(string.substring(i,i+1).equals("q"))
          count++;
      }//end small for
    }//end big for
    System.out.println(count);
  }//end of howManyQ
  
  public static int search(String[] words, String searchWord){
    for(int i = 0; i < words.length -1; i++){
      if(words[i].equals(searchWord))
        return i;
    }//end for
    return -1;
  }//end search

  public static void hundrethX(String[] words){
    int count = 0;
    for(String string : words){
      for(int i = 0; i <= string.length()-1; i++){
        
        
        if(string.charAt(i) == 'x'){
          count++;
          if(count == 100)
           System.out.println(string);
        }
            
      }//end small for
    }//end big for
  }//end hundrethX

}
