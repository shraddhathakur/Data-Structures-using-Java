class One
{
public void print1()
{
System.out.println("hi");
}}

class Two extends One
{
public void print2()
{
System.out.println("hello");
}}

class Three extends One
{
public void print3()
{
System.out.println("World");
}}

class HInherit
{
public static void main(String[] args)
{
Two t = new Two();
One o = new One();
Three th = new Three();

t.print1();
o.print2();
th.print3();
}}