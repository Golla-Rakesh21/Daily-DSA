public class StringBuilderPractice{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'p');//to replace a letter at a specified index
        System.out.println(sb);
        sb.insert(0,'n');
        System.out.println(sb);//insert the letter at an index
        sb.delete(0,1);//delete a letter at a specified index,ending index is not inclusive Parameters-starting,ending
        System.out.println(sb);
        sb.append("r");//adds a letter at the end in same object with out creating the other objects 
        System.out.println(sb);

        //string to array-char
        String str = "hello";
        char[] charArray = str.toCharArray();
        
        // Print the character array
        for (char c : charArray) {
            System.out.println(c + " "); // Output: h e l l o
        }

    }
}



