package com.cg.demo.conc;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmpDemo implements Callable<Employee> {

	public static void main(String[] args) {
		System.out.println("main()");

		EmpDemo empDemo = new EmpDemo();
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Employee> future = service.submit(empDemo);
		try {
			future.get().work();
			future.get().work();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee call() throws Exception {
		System.out.println("call()");

		return Employee.getEmployee();
	}

}