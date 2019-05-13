package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompilerVersion {
	/*
	 * Best Submission
	 * public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        final String SEPARATOR = System.getProperty("line.separator");
        String tempString;
        StringBuilder line = new StringBuilder();
        int i, minIndex, maxIndex;
 
        while((tempString = br.readLine()) != null){
            if(line.length() != 0){
                line.append(SEPARATOR);
            }
 
            minIndex = line.length();
            line.append(tempString);
 
            maxIndex = line.indexOf("//", minIndex);
 
            if(maxIndex == minIndex){
                continue;
            }else if(maxIndex == -1){
                maxIndex = line.length();
            }
 
            while(((i = line.indexOf("->", minIndex)) != -1) && (i < maxIndex)){
                //replace the -> with . between min and max bounds
                line.replace(i, i+2, ".");
                maxIndex--;
            }
        }
        System.out.println(line);
    }
	 */
	
	public static void main(String[] args) {
		FastReader dr = new FastReader();
		boolean flag=false;
		
		while (true) {
			flag=false;
			String s = dr.nextLine();
			if(null==s) {
				break;
			}
			char[] c = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				if (c[i] == '-') {
					if(i+1 < s.length() && c[i + 1] == '>' && !flag) {
						i++;
						System.out.print(".");
					}
					else
						System.out.print(c[i]);
				} else if (c[i] == '/' ) {
					if(i+1 < s.length() && c[i + 1] == '/') {
						System.out.print(c[i]);
						flag = true;
					}
					else
						System.out.print(c[i]);
				}
				else
					System.out.print(c[i]);
			}
			System.out.println();
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
