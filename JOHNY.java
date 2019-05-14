import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JOHNY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FastReader fr = new FastReader();
		int T = fr.nextInt();
		if (T > 1000 || T < 1)
			System.exit(0);

		for (int i = 0; i < T; i++) {
			int K = fr.nextInt();
			String[] s = fr.nextLine().split(" ");
			int[] numbers = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
			if (numbers.length != K)
				System.exit(0);
			int ai = fr.nextInt();
			int temp = numbers[ai-1];
			Arrays.sort(numbers);
			System.out.println(Arrays.binarySearch(numbers, temp)+1);
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
