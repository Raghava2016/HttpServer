package com.sideprojects.httpserver;

import java.io.InputStream;
import java.io.OutputStream;

public class Exchange implements AutoCloseable {

	private final InputStream in;
	private final OutputStream out;

	Exchange(InputStream in, OutputStream out) {
		
		if (in == null || out == null) {
			throw new IllegalArgumentException();
		}
		this.in = in;
		this.out = out;
	}

	public void close() throws Exception {
		in.close();
		out.close();
	}
}
