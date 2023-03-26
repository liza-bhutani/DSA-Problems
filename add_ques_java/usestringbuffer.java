// q2)  use string buffer to print this line ,, "hey everyone what's  up?"
public class usestringbuffer{
    public static void main(String[]args){
        StringBuffer sentence = new StringBuffer();
        System.out.println(" \n StringBuffer object capacity is "+sentence.capacity()+ "and string length  is" + sentence.length());
        // append the words  to the StringBuffer object
        sentence.append("hey" );
        sentence.append("everyone");
        sentence.append("what's  up");
        //print these/...
        System.out.println("\n string in StringBuffer object is : \n "+ sentence.toString());
        System.out.println("the StringBuffer object capacity is now " +sentence.capacity()+ "and string length is " + sentence.length());
        
        
        
    }
}