import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HORSES {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int T = fr.nextInt();
		for(int i =0;i<T;i++){
			int N = fr.nextInt();
			String [] s = fr.nextLine().split(" ");
			if(s.length>N)
				return;
			int[] numbers = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(numbers);
			int min=Integer.MAX_VALUE, temp=Integer.MAX_VALUE;
			for(int j=0;j<N/2;j++){
				temp=Math.min(numbers[j+1]-numbers[j],numbers[N-(j+1)]-numbers[N-(j+2)]);
				
				if(min>temp)
					min=temp;
			}
			System.out.println(min);
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
