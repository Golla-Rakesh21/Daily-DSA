public class Recrussion_maze {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int z=maze(0,0,n-1,m-1,"");
        System.out.println(z);
    }
    public static int  maze(int cc,int cr,int er,int ec,String ans) {
        if( cc==ec && cr==er){
            System.out.print(ans+ " ");
           // return; to return normallu
           return 1;

        }
        if(cc>ec || cr>er){
            return 0;
        }
        int a1=maze(cc+1,cr,er,ec,ans+"h");
        int a2=maze(cc,cr+1,er,ec,ans+"v");
        return a1+a2;
    }
}
