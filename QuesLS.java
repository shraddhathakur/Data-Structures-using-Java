import java.io.*;
import java.util.Scanner;

public class QuesLS {

public static void main(String[] args) throws IOException {
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
int num = Integer.parseInt(b.readLine());
int l = 0;

char ch;
String r = "";
String w = "";
String s[] = new String[num];
int count=0;
for(int j=0;j<num;j++)
{
s[j] = b.readLine();
r = r + s[j];

}

for(int i=0; i<=r.length()-1; i++)
{

ch = r.charAt(i);

if(ch!=' ')
w = w + ch;

r = r.replace(ch,' '); 
count = w.length();
}

System.out.println(count);
}

}