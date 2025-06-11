
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String name = "Tony";
        String fullName = "Rakesh";
        String sentence = "My name is Tony Stark";
        System.out.println(name);
        Scanner sc=new Scanner(System.in);//for input form user
        String name2=sc.next();//for input a string a word with out spaces
        sc.nextLine();
        String name3=sc.nextLine();
        System.out.println("Your name is: "+name2);
        System.out.println("Your name is: "+name3);
        concatination(name, name2);
        System.out.println(name.length());//prints the length of the string 

        //charAt
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        //compareTo
        //s1>s2 : +value
        //s1==s2 : 0
        //s1 <s2 : -1
        if(name.compareTo(fullName)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
            System.out.println(name.compareTo(fullName));
        }

        // == operater checks two objects not the content of the string 
        //== checks the two references of the string but not the content of the string 
          
         if(name==fullName){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        //output : Strings are not equal
        //         2
        if(new String("Tony")==new String("Tony")){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        //output : Strings are not equal 
        //because the objects are not same and the addres for two new strings are seperate 

        String name7=sentence.substring(0,5); //
        System.out.println(name7);
    }


    public static void concatination(String name,String name2){
        String result = name + name2; // Concatenate strings
        System.out.println("Concatenated result: " + result);
    }
}
