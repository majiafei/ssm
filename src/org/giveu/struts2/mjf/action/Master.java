package org.giveu.struts2.mjf.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.core.StandardPipeline;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.core.StandardService;
import org.apache.catalina.deploy.WebXml;
import org.apache.catalina.startup.Bootstrap;
import org.apache.catalina.startup.Catalina;
import org.apache.catalina.startup.ContextConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.tomcat.util.digester.CallParamRule;
import org.apache.tomcat.util.digester.Digester;
import org.apache.tomcat.util.digester.ObjectCreateRule;
import org.apache.tomcat.util.net.AbstractEndpoint.Acceptor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {
	// StandardContext
	// ContextConfig
	// Bootstrap
//	Catalina
//	SetNextRule
//	ObjectCreateRule
//	SetPropertiesRule
//	Http11Protocol
//	NamingContextListener
//	AprLifecycleListener
//	JasperListener
//	GlobalResourcesLifecycleListener
//	ThreadLocalLeakPreventionListener
//	StandardService
//	StandardEngine
//	StandardHost
//	HostConfig
//	ContextConfig
//	StandardContext
//	CallMethodRule
//	WebXml
//	CallParamRule
//	ServletDefCreateRule
//	SetNextRule
//	ServletDef
//	ServletDefCreateRule
//	TldConfig
//	NamingContextListener
//	StandardPipeline
//	NonLoginAuthenticator
//	StandardServer
//	ContextConfig
//	StandardServer
//	WebXml
//	Digester
//	VersionLoggerListener
//	TldConfig

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(System.getProperty("catalina.home")); // Catalina //
	 * StandardServer // NamingContextListener // AprLifecycleListener //
	 * JasperListener // JreMemoryLeakPreventionListener //
	 * GlobalResourcesLifecycleListener // ThreadLocalLeakPreventionListener //
	 * StandardServer // StandardService // StandardEngine // Connector //
	 * MapperListener }
	 * 
	 * public static void main(String[] args) { Callable<Integer> callable = new
	 * Callable<Integer>() { public Integer call() throws Exception { return new
	 * Random().nextInt(100); } }; FutureTask<Integer> future = new
	 * FutureTask<Integer>(callable); new Thread(future).start(); try {
	 * Thread.sleep(5000);// 可能做一些事情 System.out.println(future.get()); } catch
	 * (InterruptedException e) { e.printStackTrace(); } catch
	 * (ExecutionException e) { e.printStackTrace(); } }
	 * 
	 * 
	 * ThreadPoolExecutor
	 */

	private static int produceTaskSleepTime = 2;
	private static int produceTaskMaxNumber = 10;

	public static void main(
			String[] args) {/*
							 * // 构造一个线程池 ThreadPoolExecutor threadPool = new
							 * ThreadPoolExecutor(2, 4, 3, TimeUnit.SECONDS, new
							 * ArrayBlockingQueue<Runnable>(3), new
							 * ThreadPoolExecutor.DiscardOldestPolicy());
							 * 
							 * for (int i = 1; i <= produceTaskMaxNumber; i++) {
							 * try { // 产生一个任务，并将其加入到线程池 String task = "task@ "
							 * + i; System.out.println("put " + task);
							 * threadPool.execute(new ThreadPoolTask(task));
							 * 
							 * // 便于观察，等待一段时间
							 * Thread.sleep(produceTaskSleepTime); } catch
							 * (Exception e) { e.printStackTrace(); } } }
							 */
		
		
		System.out.println(Thread.currentThread().getContextClassLoader());
		
	}

	/**
	 * 线程池执行的任务
	 *//*
		 * class ThreadPoolTask implements Runnable, Serializable { private
		 * static final long serialVersionUID = 0; private static int
		 * consumeTaskSleepTime = 2000; // 保存任务所需要的数据 private Object
		 * threadPoolTaskData;
		 * 
		 * ThreadPoolTask(Object tasks) { this.threadPoolTaskData = tasks; }
		 * 
		 * public void run() { // 处理一个任务，这里的处理方式太简单了，仅仅是一个打印语句
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println("start .." + threadPoolTaskData);
		 * 
		 * try { // //便于观察，等待一段时间 Thread.sleep(consumeTaskSleepTime); } catch
		 * (Exception e) { e.printStackTrace(); } threadPoolTaskData = null; }
		 * 
		 * public Object getTask() { return this.threadPoolTaskData; }
		 */
}
