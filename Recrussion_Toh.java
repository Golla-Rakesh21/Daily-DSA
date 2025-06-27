public class Recrussion_Toh {
    public static void main(String[] args) {
        int n=3;
        Toh(n, "A", "B", "C");
    }
    public static void Toh(int n,String src,String hel,String des){
        if(n==0){
            return;
        }
        Toh(n-1, src, des, hel);
        System.out.println("send "+n+"th from the "+src+" to "+des);
        Toh(n-1,hel,src,des);
    }
}
