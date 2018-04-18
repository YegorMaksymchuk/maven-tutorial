package com.company.main;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("java", "-version");

		try {
			pb.inheritIO();
			Process ps = pb.start();
			ps.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
