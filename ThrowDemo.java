package com.kd.e;

import java.text.ParseException;


 * throws
 * 如果抛出的是运行时异常，那么也不需要提示处理
 * 可以抛出多个异常
 * 
 * throw 一般用于开发者主动抛出异常
 * 抛出的一个具体的异常对象
 * 
 * 区别
 * throws
 * 	  方法名上，后面跟的是异常的类名
 *   异常的处理方式之一，用于标记出异常的处理，逐层往上抛出
 *   后面可以跟多个异常名
 * throw
 * 	 方法体内，后面跟的是异常的对象
 *   创建一个具体的异常对象，并主动抛出
 *   只能跟一个异常对象
 *
public class ThrowDemo {
	public static void main(String[] args) {
		
		try {
			fun1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//throws 标注出处理异常的方式
	//throw  直接产生了一个异常
	public static void fun1() throws Exception{
		int a=10;
		int b=0;
		if (b==0) {
			throw new Exception();
		}else {
			System.out.println(a/10);
		}
	}
}
