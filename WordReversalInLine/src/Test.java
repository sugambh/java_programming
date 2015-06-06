import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int len=line.length();
		//System.out.println("length :"+len);
		char[] characters=new char[len];
		for(int i=0;i<len;i++){
			characters[i]=line.charAt(len-1-i);
		}
		int i=0,j=0;
		while(j<len){
			if(characters[j]==' '|| j==len-1){
				int k;
				if(j==len-1){
					k=j;
				}
				else
				{
					k=j-1;
				}
				for(;k>=i;k--){
					System.out.print(characters[k]);
				}
				System.out.print(" ");
				i=j+1;
				j++;
			}
			else
				j++;
		}
		
	}

}
