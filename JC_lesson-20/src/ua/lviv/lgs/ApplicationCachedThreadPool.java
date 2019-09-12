package ua.lviv.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationCachedThreadPool {

	public static void main(String[] args) throws Exception {

		System.out.println("Введіть кількість чисел Фібоначі, які потрібно вивести");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ExecutorService executable = Executors.newCachedThreadPool();
		executable.execute(new MyThread("myThread", n));
		executable.execute(new MyRunnable("myRunnable", n));

		executable.shutdown();

		sc.close();

	}

}
