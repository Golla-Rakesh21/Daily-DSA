public class Backtracking_palindrome {
    public static void main(String args[]){
        String ques="NITIN";
        sub(ques, "");
    }
    public static void sub(String ques,String ans) {
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(palindrome(s)==true){
            sub(ques.substring(i), ans+s+"|");
            }
        }
    }
    public static boolean palindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean x=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                x=false;
            }
            i++;
            j--;
        }
        return x;
    }
}
