/*  simple input 
  # system.out- the output stream for normal results.
 #system.in- the input stream defined in java.io package.
   (package- group of realted classes.
   input streams defines a programming interfaces for reading input from user, ..)
 #  System.err- the output stream for error response
   basically streams are of two types;
   `1)byte oriented- owe can read data of any datatype with them as bytes are read. these streams are also called as data streams - datainput 
   and dataoutput streams.
   2) character oriented-only character are read through these types of streams. these streams are often referred to as reader amd writer streams.
   
   classes of java.io package-
   java.io . InputStream- stores information between an input device and the computer.
   java.io.InputStreamReader- translated byte types received from inputstream object into a stream of characters.
   java.io.BufferedReader- stores the input recieved from InputStreamReader object this is done to improve the efficiency.*/
   
   // Q- obtain some input from the user and print it..
   /*import java.io.*;
   public class myconsoleIO{
       // firstly creating a stringbuffereader for keyboard input.
        private static BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[]args) throws IOException{
           System.out.println("type some data for program");
           String input= stdin.readLine();
           System.out.println("input ="+input);
           
           
       }// main method ends here..
       
       
       
   }// my console ends here....*/
   
   // read an integer using datainputstream and print whether it is even or odd;
     import java.io.*;
      class datastreams{
         public static void main(String[]args){
             DataInputStream in= new  DataInputStream (System.in);
             int n=0;
             try{
                 System.out.println("enter a digit");
                 n= in.readInt();
             }
         catch (Exception e){}
         if(n%2==0)
         System.out.println("you entered a even digit");
         else
             System.out.println("you entered a odd digit");
         
         
             
         }}// The try statement allows you to define a block of code to be tested for errors while it is being executed. 
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//Try/catch blocks allow a program to handle an exception gracefully in the way the programmer wants them to.
     
// try{ //input reading statement here}catch (Exception e){} ->this is syntax;
   
   