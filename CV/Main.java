import java.util.*;

class Main {
    public static void main(String args[] ) throws Exception {
        try {
        	Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0) {
            	int n=sc.nextInt();
            	String s=sc.next();
            	int count=0;
            	for(int i=0;i<n-1;i++) {
            		if( (s.charAt(i)!='a'&&
            			s.charAt(i)!='e' &&
            			s.charAt(i)!='i' &&
            			s.charAt(i)!='o' &&
            			s.charAt(i)!='u' ) && (s.charAt(i+1)=='a' || s.charAt(i+1)=='e' || s.charAt(i+1)=='i' || s.charAt(i+1)=='o' || s.charAt(i+1)=='u')) {
            			count++;
            		}
            	}
            	System.out.println(count);
            	t--;
            }
        }catch(Exception e) {
        	return;
        }
        

    }
}
