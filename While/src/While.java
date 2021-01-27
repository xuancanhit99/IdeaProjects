public class While {
    public static void main(String args[]) {
       int [] a;
       a = new int[3];
       a[0]=1;
       a[1]=2;
       a[2]=3;
       System.out.println(a);
       for(int i=0; i<a.length; i++) {
           System.out.println(a[i]);
       }
    }
}
