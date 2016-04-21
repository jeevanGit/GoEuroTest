package devtest;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import goeuro.file.operation.FileOperations;
import goeuro.httpclient.HttpClient;
import goeuro.model.City;

public class Driver {

	private static Logger log = LoggerFactory.getLogger(Driver.class);

	public static void main(String[] args) throws IOException {
		log.info("Started Processing....");
		HttpClient client = new HttpClient();
		FileOperations fileOps = new FileOperations();
		
		String cityName = args[0];
		
		// Execute the api call
		String json = client.executeApi(cityName);

		// Map the json to Object
		ObjectMapper objectmapper = new ObjectMapper();
		City[] city = objectmapper.readValue(json, City[].class);

		// Write to file using the object
		fileOps.writeFileFromObjectArray(city);

	}

}
