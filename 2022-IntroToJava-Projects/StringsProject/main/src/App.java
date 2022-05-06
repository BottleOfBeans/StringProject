package main.src;

public class App {
    public static void main(String[] args) throws Exception {
        String TestString = "The Most Amazing String";
        System.out.println(TestString);
        pigLatinSentence(TestString);
    }

    //Making a Function that makes the string backwards
    public static void backwards(String givenString){
        for(int i=givenString.length()-1; i>=0; i--){
            System.out.print(givenString.charAt(i));
        }
    }

    //Making a function that returns true if the first letter is a vowel
    public static boolean vowel(String givenString){
        return(givenString.charAt(0) == 'a' || givenString.charAt(0) == 'e' || givenString.charAt(0) == 'i' || givenString.charAt(0) == 'o' || givenString.charAt(0) == 'u');
    }

    //Making a function to turn a word into pig latin
    public static void pigLatin(String givenString){
        if(vowel(givenString)){
            System.out.print(givenString + "ay");
        }
        else{
            System.out.print(givenString.substring(1) + givenString.charAt(0) + "ay");
        }
    }

    //Making a function that splits the string into 2 and displays it flip flopped
    public static void flipflop(String givenString){
        int lengthHalfed = givenString.length()/2;
        System.out.println(givenString.substring(lengthHalfed) + givenString.substring(0, lengthHalfed));
    }

    //Making a function that removes a string from another string
    public static String remove(String givenString, String removeString){
        int startingIndex = givenString.lastIndexOf(removeString);
        String tempString = "";
        if(startingIndex != 0){
            tempString = tempString.concat(givenString.substring(0, startingIndex));
            tempString = tempString.concat(givenString.substring(startingIndex+removeString.length(),givenString.length()));
        }
        return tempString;
        
        
    }

    //Making a function that looks for a string inside of a string and returns 2 if it exists otherwise reuturns -1
    public static int contains(String givenString, String lookinString){
        int startingIndex = givenString.indexOf(lookinString);
        if(startingIndex != -1){
            return 2;
        }
        else{
            return -1;
        }
    }

    //Making a function that removes all of a signle character from a string
    public static String removeall(String givenString, String removeString){
        String tempString = givenString;
        while(tempString.contains(removeString)){
            tempString = remove(tempString, removeString);
        }
        return tempString;
    }

    public static void pigLatinSentence(String givenString){
        String[] tempString = givenString.split(" ");
        for(int i=0; i<tempString.length; i++){
            pigLatin(tempString[i]);
            System.out.print(" ");
        }
        System.out.print(tempString);
    }
}
