import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public void setup() 
{
  String[] lines = {"beast","dough","happy","question","star","three","eagle","try"};
  System.out.println("there are " + lines.length + " lines");
  for (int i = 0 ; i < lines.length; i++) 
  {
    System.out.println(pigLatin(lines[i]));
  }
}
public void draw()
{
        //not used
}
public int findFirstVowel(String sWord) {
  for(int i=0; i<sWord.length(); i++){
    if(sWord.substring(i,i+1).equals("a")||(sWord.substring(i,i+1).equals("e"))||(sWord.substring(i,i+1).equals("i"))||(sWord.substring(i,i+1).equals("o"))||(sWord.substring(i,i+1).equals("u"))){
      return i;
    } 
  }
  return -1;
}

public String pigLatin(String sWord)
{
  if(findFirstVowel(sWord)==-1) {
    return sWord + "ay";
  } else if(findFirstVowel(sWord)==0) {
    return sWord + "way";
  } else if(findFirstVowel(sWord)!=-1) {
    return sWord.substring(findFirstVowel(sWord)) + sWord.substring(0,findFirstVowel(sWord)) + "ay";
  } else if(sWord.startsWith("qu")) {
    return sWord.substring(2,sWord.length())+"quay";
  }  else {
    return "ERROR!";
  }
}
