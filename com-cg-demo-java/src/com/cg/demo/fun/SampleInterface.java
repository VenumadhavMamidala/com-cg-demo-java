package com.cg.demo.fun;

// java 8 onwards - 
// interface can also contain - 
// static (concrete) methods 
// default (concrete non static) methods 

public abstract interface SampleInterface
{
	public abstract void anAbstratMethod();
	public abstract void anotherAbstractMethod();
	public static void aStaticMethod()
	{
		System.out.println("yes");
	}
	public static void anotherStaticMethod()
	{
		System.out.println("yess");
	}
	public default void aDefaultMethod()
	{
		System.out.println("yup");
	}
	public default void anotherDefaultMethod()
	{
		System.out.println("yupp");
	}	
}