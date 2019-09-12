package ua.lviv.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationFixedThreadPool {

	public static void main(String[] args) throws Exception {

		System.out.println("������ ������� ����� Գ������, �� ������� �������");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ExecutorService executable = Executors.newFixedThreadPool(1);
		executable.execute(new MyThread("myThread", n));
		executable.execute(new MyRunnable("myRunnable", n));

		executable.shutdown();

		sc.close();

	}
}