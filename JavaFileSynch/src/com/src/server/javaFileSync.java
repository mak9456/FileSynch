package com.src.server;

import java.io.File;

public class javaFileSync {
	private static final int PORT_NUMBER = 17555;
	
	public static void main(String[] args) {
		try {
			if(args.length > 0) {
				if (args[0].equalsIgnoreCase("-s")) {
					server();
				}
			} 
			else {
			System.out.println("Invalid entry. Usage: java javaFileSync [-s] [-c [server IP] [dir to sync OR -ls]]");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void server() throws Exception {
		Server s = new Server(PORT_NUMBER);
		s.startServer();
	}
	
}
