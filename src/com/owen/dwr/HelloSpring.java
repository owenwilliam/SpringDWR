package com.owen.dwr;

/**
 *服务器处理类
 * @author owenwilliam 2016-5-8
 * @version 1.0
 */

public class HelloSpring
{
	// 服务器处理方法
	public String hello(String name)
	{
		return name + "您好，您已经会调用Spring中的Bean了...";
	}
}
