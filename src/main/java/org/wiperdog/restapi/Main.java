package org.wiperdog.restapi;

import org.jboss.netty.handler.codec.http.HttpMethod;
import org.wiperdog.restapi.service.EchoService;

import com.strategicgains.restexpress.Parameters;
import com.strategicgains.restexpress.RestExpress;
import com.strategicgains.restexpress.pipeline.SimpleConsoleLogMessageObserver;

public class Main {
	private static EchoService echo = new EchoService();

	public static void main(String[] args) {

		RestExpress server = new RestExpress().setName("WiperdogRestAPI")
				// .addPostprocessor(new LastModifiedHeaderPostprocessor())
				.addMessageObserver(new SimpleConsoleLogMessageObserver());

		server.uri("/echo/{userId}/{userName}", echo).method(HttpMethod.POST);

		server.uri("/echo", echo)
				.method(HttpMethod.GET, HttpMethod.PUT, HttpMethod.DELETE)
				.parameter(Parameters.Cache.MAX_AGE, 3600);

		server.bind(8888);
		server.awaitShutdown();
	}

}
