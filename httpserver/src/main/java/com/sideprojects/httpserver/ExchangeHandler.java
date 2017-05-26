package com.sideprojects.httpserver;

import java.io.IOException;

public interface ExchangeHandler {
	public void accept(Exchange exchange) throws IOException;
}
