// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ArrayListDemo.java

package cn.itcast.test;

import java.io.PrintStream;
import java.util.ArrayList;

public class ArrayListDemo
{

	public ArrayListDemo()
	{
	}

	public static void main(String args[])
	{
		ArrayList array = new ArrayList();
		array.add(Integer.valueOf(10));
		System.out.println(array);
	}
}
