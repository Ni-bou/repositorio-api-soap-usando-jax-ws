package audifonos;

import javax.xml.ws.Endpoint;

public class MacMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/WS/Panasonic", new Panasonic());
	}

}
