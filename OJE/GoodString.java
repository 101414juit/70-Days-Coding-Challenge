import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoodString {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int T = fr.nextInt();
		String s = fr.next();
		int length = s.length();
		if(length!=T)
			System.exit(0);
			
		char[] c = s.toCharArray();
		int count=s.length();
		
		for(int i=0;i<T;i++) {
			length=s.length();
			if(length%2!=0) {
				s=s.substring(0,s.length()-1);
				T=s.length();
				i=0;
			}
			else if(i%2==0 && i<length && s.charAt(i)==s.charAt(i+1)) {
				count--;
				char [] x = new char[length-(i+1)]; 
				for(int j=i+1;j<length;j++) {
					x[j-1]=c[j];
				}
				s=String.copyValueOf(x);
			}
			
		}
		System.out.println(s.length()-count);
		System.out.println(s);
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
	                String s1 = br.readLine();
	                if(null==s1){
	                    System.exit(0);
	                }
                	st = new StringTokenizer(s1);
	            } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
