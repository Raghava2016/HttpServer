package com.sideprojects.httpserver;

import java.io.IOException;

public interface ExchangeFactory extends AutoCloseable {
	public Exchange create() throws IOException;

	public boolean isClosed() throws IOException;
}
