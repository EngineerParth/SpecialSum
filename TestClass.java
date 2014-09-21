/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int tCases[]=new int[line];
        
        for(int j=0;j<line;j++){
        	tCases[j]=Integer.parseInt(br.readLine());
        }
		
		for(int k=0;k<line;k++){
			int N = tCases[k];
			int ret = 0;
			
			for(int i=1;i<=N;i++){
				if (N%i==0)
	         		ret += foo(i);
	 		}
	
	        System.out.println(ret);
		}
    }
    
    public static int foo(int n){
    	int ret = 0;

  		for(int i=1;i<=n;i++)
  		{
     		if(gcd(n,i) == 1)
             ret += 1;
   		}
  		return ret;
    }
    
    public static int gcd(int a, int b){
    	int temp;
    	while (b!= 0){
    		temp=b;
    		b=a%b;
    		a=temp;
    	}
    	return a;
    }
}
