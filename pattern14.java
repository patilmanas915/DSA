public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(char j='A';j<='A'+n-i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    
}
