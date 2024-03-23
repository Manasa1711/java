
//suppose u joined in a company .u need a laptop.u r a developer. so developer work is to do applications .so it is coding
//so ur creating navin as obj and calling it devapp.output is coding 
//i make application but i need laptop first
//i create class laptop 
/*

abstract class Computer
{
//	public void code()
//	{
//		
//	}
	public abstract void code();
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}
*/



interface Computer  // u are creating just computer because it can be either laptop or desktop
{
	 void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class NeedOfInterface {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        navin.devApp(desk);
        
    }
}
