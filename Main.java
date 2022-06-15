
import java.util.*;
import java.io.*;
import java.math.*;

class Main 
{

  public static void generatePassword(int passwordType) throws IOException
    {
  

      if (passwordType == 1)
      {
        char[] lowerCharArray = new char[1000];   //You need to create a character array to cycle through for the password digits.
        int[] lowerInts= new int[1000] ;
        for (int i = 0; i<lowerInts.length; i++)
        {
          int k = (int)(97+Math.random()*25);
          lowerInts[i] = k;
        }
        File fileName1 = new File("Lower.txt");
        PrintWriter outFile1 = new PrintWriter(fileName1);
        for (int ch : lowerInts)
        {
          outFile1.print((char)ch);
        }
        outFile1.close();   

        File filePasswords1 = new File("Lowerpw.txt");    
        PrintWriter outFile1pw = new PrintWriter(filePasswords1);
        int count1 = 0;

        for (int p = 0; p<=lowerCharArray.length-1; p++)
        {
          if (count1 % 8 != 0)    //populating the passwords file.
          {
            int px1 = lowerInts[p];
            lowerCharArray[p] = (char)px1;
            outFile1pw.print(lowerCharArray[p]);
          }
          else      //Printing new line to separate the passwords.
          {
            outFile1pw.println();
          }
          count1++; 
        }
        outFile1pw.close();
        System.out.println("Passwords have been generated Lowerpw.txt.");
      }


      else if (passwordType == 2)
      {   
        char[] upperCharArray = new char[1000];
        int[] upperInts = new int[1000] ;
        for (int i = 0; i<upperInts.length; i++)
        {
          int k = (int)(65+Math.random()*25);
          upperInts[i] = k;
        }  
        File fileName2 = new File("Upper.txt");
        PrintWriter outFile2 = new PrintWriter(fileName2);
        for (int ch : upperInts)
        {
          outFile2.print((char)ch);
        } 
        outFile2.close();   

        File filePasswords2 = new File("Upperpw.txt");    
        PrintWriter outFile2pw = new PrintWriter(filePasswords2);
        int count2 = 0;

        for (int p = 0; p<=upperCharArray.length-1; p++)
        {
          if (count2 % 8 != 0)    //populating the passwords file.
          {
            int px2 = upperInts[p];
            upperCharArray[p] = (char)px2;
            outFile2pw.print(upperCharArray[p]);
          }
          else      //Printing new line to separate the passwords.
          {
            outFile2pw.println();
          }
          count2++;
        }
        outFile2pw.close();
        System.out.println("Passwords have been generated in file Upperpw.txt.");
      }


      else if (passwordType == 3)
      {
        char[] mixedLettersArray = new char[1000];
        int[] mixedLetInts = new int[1000] ;
        for (int i = 0; i<mixedLetInts.length; i++)
        {
          int k = (int)(65+Math.random()*50);
          if(k > 90)
          {
            k += 6;
          }
          mixedLetInts[i] = k;
        }  
        File fileName3 = new File("Mixed_letters.txt");
        PrintWriter outFile3 = new PrintWriter(fileName3);
        for(int ch:mixedLetInts)
        {
          outFile3.print((char)ch); 
        }
        outFile3.close();   

        File filePasswords3 = new File("MixedLpw.txt");    
        PrintWriter outFile3pw = new PrintWriter(filePasswords3);
        int count3 = 0;

        for (int p = 0; p<=mixedLettersArray.length-1; p++)
        {
          if (count3 % 8 != 0)    //populating the passwords file.
          {
            int px3 = mixedLetInts[p];
            mixedLettersArray[p] = (char)px3;
            outFile3pw.print(mixedLettersArray[p]);
          }
          else      //Printing new line to separate the passwords.
          {
            outFile3pw.println();
          }
          count3++;
        }
        outFile3pw.close();
        System.out.println("Passwords have been generated in file MixedLpw.txt.");
      }


      else if (passwordType == 4)
      {
        char[] mixedLettersNumArray = new char[1000];
        int[] mixedLetNumInts = new int[1000] ;
        for (int i = 0; i<mixedLetNumInts.length; i++)
        {
          int k = (int)(48+Math.random()*60);
          if (k > 57)
          {
            k += 7;
          }
          if (k > 90)
          {
            k += 6;
          }
          mixedLetNumInts[i] = k;
        }  
        File fileName4 = new File("Mixed_letters_numbers.txt");
        PrintWriter outFile4 = new PrintWriter(fileName4);
        for (int ch : mixedLetNumInts)
        {
          outFile4.print((char)ch);
        }
        outFile4.close();   

        File filePasswords4 = new File("MixedNumpw.txt");    
        PrintWriter outFile4pw = new PrintWriter(filePasswords4);
        int count4 = 0;

        for (int p = 0; p<=mixedLettersNumArray.length-1; p++)
        {
          if (count4 % 8 != 0)    //populating the passwords file.
          {
            int px4 = mixedLetNumInts[p];
            mixedLettersNumArray[p] = (char)px4;
            outFile4pw.print(mixedLettersNumArray[p]);
          }
          else      //Printing new line to separate the passwords.
          {
            outFile4pw.println();
          }
          count4++;
        }
        outFile4pw.close();
        System.out.println("Passwords have been generated in file MixedNumpw.txt.");
      }



      else if (passwordType == 5)
      {
        char[] allCharArray = new char[1000];
        int[] upperallCharsInts= new int[1000];
        for(int i = 0; i<upperallCharsInts.length; i++)
        {
          int k = (int)(33+Math.random()*92);   //Math.random for the entire range.

          upperallCharsInts[i] = k;
        }  
        File fileName5 = new File("Mixed_chars.txt");
        PrintWriter outFile5 = new PrintWriter(fileName5);
        
        for(int ch : upperallCharsInts)
        {
          outFile5.print((char)ch);
        }
        outFile5.close();   

        File filePasswords5 = new File("AllCharspw.txt");    
        PrintWriter outFile5pw = new PrintWriter(filePasswords5);
        int count5 = 0;

        for (int p = 0; p<=allCharArray.length-1; p++)
        {
          if (count5 % 8 != 0)    //populating the passwords file.
          {
            int px5 = allCharArray[p];
            allCharArray[p] = (char)px5;
            outFile5pw.print(allCharArray[p]);
          }
          else      //Printing new line to separate the passwords.
          {
            outFile5pw.println();
          }
          count5++; 
        }
        outFile5pw.close();
        System.out.println("Passwords have been generated in file AllCharspw.txt.");
      }


      else if (passwordType == 0)
      {
        System.out.println("End of program.");
        System.exit(0);
      }


    }
    



  public static void main(String[] args) throws IOException  
  {
    int typeX = 0;
    Scanner scan = new Scanner(System.in);
    int pe = 1;
    
    while (pe != 0)   //Loop that allows the loop to run as long as the user wants.
    {
      System.out.println("Please enter the type of pasword you would like to  generate" + "\n Types of passwords include...");
      System.out.println("1 - Lowercase letters." + "\n2 - Uppercase letters," + "\n3 - Lowercase and uppercase letters." + "\n4 - Upper case, lowercase, and  numbers." + "\n5 - Lowercase, uppercase, numbers, and symbols." + "\n0 -     EXIT.");
      System.out.println("Enter selection by typing numbers 1, 2, 3, 4, 5, or 0 to    exit.");
      typeX = scan.nextInt();
      System.out.println();

      generatePassword(typeX);   //Calling method to generate password.

      System.out.println();
      System.out.println();
      System.out.println("Type 1 to generate another password or another number to exit.");
      pe = scan.nextInt();
      System.out.println();

      if (pe == 0)
      {
        System.out.println("End of program.");
        System.exit(0);
      }

    }
    scan.close();
    System.out.println("End of program.");
    

  }
} 

//Kim Shawver - Hello Sam! You should have txt files with numbers and text files with 8 character passwords. You are very close. You just have a couple of things to fix up. Email me after.