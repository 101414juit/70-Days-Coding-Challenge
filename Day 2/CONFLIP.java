package codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CONFLIP {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int T = fr.nextInt();
		for(int k=0;k<T;k++) {
			int G = fr.nextInt();
			for(int g=0;g<G;g++) {
				String[] s = fr.nextLine().split(" ");
				int[] numbers = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
				int [] a = new int[numbers[1]];
				if(numbers[0]==1)// All Head
					Arrays.fill(a, 1);
				else if(numbers[0]==2)// All tail
					Arrays.fill(a, 0);
				System.out.println("Input\t"+Arrays.toString(a));
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<=i;j++) {
						if(a[j]==0)
							a[j]=1;
						else if(a[j]==1)
							a[j]=0;
					}
				}
				System.out.println("Output\t"+Arrays.toString(a));
			}
		}

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
