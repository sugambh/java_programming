import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	private static String readString() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String result=br.readLine();
		return result;
	}
	public static void naivePatternSearch(String text,String pattern){
		int n=text.length();
		int m=pattern.length();
		for(int i=0;i<=n-m-1;i++){
			int j;
			for(j=0;j<m;j++){
				if(text.charAt(i+j)!=pattern.charAt(j)){
					break;
				}
				
			}
			if(j==m){
				System.out.println("found substring at index"+i);
			}
		}
		
		
	}

	public static void main(String[] args) throws Exception{
		System.out.println("Enter the text String\n");
		String text=readString();
		System.out.println("Enter the pattern\n");
		String pattern=readString();
		naivePatternSearch(text,pattern);

	}


}
