package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				//new AnnotationConfigApplicationContext(NewlecDiConfig.class); 
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");

		/*
		 * final Exam exam = new NewlecExam(1, 1, 1, 1);
		 * 
		 * Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),
		 * new Class[] {Exam.class},new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable {
		 * 
		 * long start = System.currentTimeMillis();
		 * 
		 * Object result = method.invoke(exam, args);
		 * 
		 * long end = System.currentTimeMillis();
		 * 
		 * String msg = (end - start) + "ms"; System.out.println(msg);
		 * 
		 * return result; } });
		 */
		
		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total : %d\n",exam.total());
		System.out.printf("avg : %f\n", exam.avg());

	}

}
