package org.wiperdog.restapi.service;

import java.util.HashMap;
import java.util.Map;

import com.strategicgains.restexpress.Request;
import com.strategicgains.restexpress.Response;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class EchoService {

	// POST request go in here
	public Map create(Request request, Response respone) {
		String id = request.getUrlDecodedHeader("userId");
		String name = request.getUrlDecodedHeader("userName");
		Map params = new HashMap();
		params.put("id", id);
		params.put("name", name);
		System.out.println(params);

		Map result = new HashMap();
		result.put("result", "create");
		return result;
	}

	// PUT request go in here
	public Map update(Request request, Response respone) {
		Map result = new HashMap();
		result.put("result", "update");
		return result;
	}

	// DELETE request go in here
	public Map delete(Request request, Response respone) {
		Map result = new HashMap();
		result.put("result", "delete");
		return result;
	}

	// GET request go in here
	public Map read(Request request, Response respone) {
		Map result = new HashMap();
		result.put("result", "read");
		return result;
	}
}
