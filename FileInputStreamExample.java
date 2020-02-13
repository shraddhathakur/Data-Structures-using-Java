import java.io.FileInputStream;
class FileInputStreamExample
{
public static void main(String[] args) 
{
try
{
FileInputStream fin = new FileInputStream("C:/Users/SHRADDHA THAKUR/Desktop/yy.txt");
int data;
while((data = fin.read())!= -1)
{
System.out.println((char)data);
}
fin.close();
}
catch (Exception e)
{
System.out.println(e);
}
}
}