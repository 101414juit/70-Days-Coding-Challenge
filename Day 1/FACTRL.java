import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author inyamar
 *
 */
public class FACTRL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		Integer T = fr.nextInt();
		if(T<1 || T>100000)
			return;
		int trailingZeros=0;
		List<Integer> Z = new ArrayList<Integer>();
		while(T!=0){
			Integer n = fr.nextInt();
			if(n<1 || n>1000000000)
				return;
			while(n/5 >=1 ){
				trailingZeros += n/5;
				n=n/5;
			}
			Z.add(trailingZeros);
			T--;
			trailingZeros=0;
		}
		Z.forEach(System.out::println);

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
	                st = new StringTokenizer(br.readLine()); 
	            } 
	            catch (IOException  e) 
	            { 
	                e.printStackTrace(); 
	            } 
	        } 
	        return st.nextToken(); 
	    } 

	    Integer nextInt() 
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
