public class Recrussion_prem_repe{
    public static void main(String[] args){
        String ques="abca";
        premutation(ques, "");
    }
    public static void premutation(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            boolean flag=false;
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            premutation(s1+s2, ans+ch);
            }
        }
    }
}