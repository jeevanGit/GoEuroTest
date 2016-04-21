package goeuro.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpClient {
	public static final String PATH = "path";
	public static final String SERVER_NAME = "servername";
	public static final String EMPTY_STRING = "";

	private static Logger log = LoggerFactory.getLogger(HttpClient.class);
	
	// Variable initialized at stack level, as this can be reused in the case of
	// system scaling to multi-threading
	public String executeApi(String cityName) throws MalformedURLException {
		log.info("Executing the API call...");
		String urlString = buildUrlFromServerAndApiPath(cityName);
		
		log.info("Api call: ", urlString);
		if (!"".equals(urlString)) {

			URL url = new URL(urlString);
			try {
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

				StringBuffer finalString = new StringBuffer();
				String line = null;
				while ((line = bufferedReader.readLine()) != null) {
					finalString.append(line);
				}
				log.info("Api call is successful");
				return finalString.toString();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return EMPTY_STRING;
	}

	// Build the url based on the application settings
	String buildUrlFromServerAndApiPath(String cityName) {
		final String protocol = "http://";
		Properties prop = new Properties();
		try (InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream("application.properties");) {
			prop.load(inputStream);
			return protocol + prop.getProperty(SERVER_NAME) + prop.getProperty(PATH) + cityName;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
