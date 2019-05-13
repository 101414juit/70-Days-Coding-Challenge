package codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CLEANUP {

	public static void main(String[] args) {

		FastReader fr = new FastReader();
		int T = fr.nextInt();
		int n,m;
		boolean chef,assistant;
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> chefList= new ArrayList<>() ;
		ArrayList<Integer> assistantList= new ArrayList<>(); 
		
		if(T>50||T<0)
			System.exit(0);
		
		for(int i=0;i<T;i++) {
			n= fr.nextInt();
			m= fr.nextInt();
			chef=assistant=false;
			al.clear();
			chefList.clear();
			assistantList.clear();
			
			for(int j =0;j<m;j++)
				al.add(fr.nextInt());
			Collections.sort(al);
			
			for(int j=1;j<=n;j++) {
				if(!al.contains(j) && !chef) {
					chefList.add(j);
					chef=true;
					assistant=false;
				} else if(!al.contains(j) && !assistant) {
					assistantList.add(j);
					chef=false;
					assistant=true;
				}
			}
			chefList.forEach((value) -> System.out.print(value+" "));
			System.out.println();
			assistantList.forEach((value) -> System.out.print(value+" "));
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
