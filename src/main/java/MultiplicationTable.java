public class MultiplicationTable {
    public static void main(String args[]){
        int n=9;
        table(n);
    }
    private static void table(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();

        }
    }
}
