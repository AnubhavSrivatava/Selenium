import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice {

	public static void main(String[] args) throws IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		String str = "anubhav", s1 = " ";
		int l = str.length(), i, j, c = 0,k;
		final int j1=100;
		j1=0;
		System.out.println(j1);
		System.out.println("Enter k");
		k=Integer.parseInt(obj.readLine());
		System.out.println(k);
		for (i = 0; i < l; i++) {
			s1 = str.charAt(i) + s1;
			System.out.println(s1);

		}
//		System.out.println(s1);	
		System.out.println("Enter Name");
		String s2 = obj.readLine();
		System.out.println(s2);
		for (j = 0; j < s2.length(); j++) {
			char ch = s2.charAt(j);
			System.out.println(ch);
			if (ch == 'a')
				c++;

		}
		System.out.println("Frequency of a=" + c);

	}

}
