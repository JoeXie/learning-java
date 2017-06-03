package com.huawei;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
	String name();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Description{
	String value();
}

@Author(name = "xie")
class Book{
	@Override
	@Description("Writted in huawei hangzhou.")
	public String toString() {
		return "This is a book.";
	}
}