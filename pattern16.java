public class pattern16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char print='A';
            for(int j=0;j<i+(i+1);j++){
                System.out.print(print+" ");
                int middle=(2*i+1)/2;
                print=(char)((middle<j+1)?print-1:print+1);
            }
            
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
