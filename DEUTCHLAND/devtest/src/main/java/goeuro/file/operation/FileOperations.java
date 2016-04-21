package goeuro.file.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import goeuro.model.City;

public class FileOperations {
	public static final String FILE_NAME = "output.csv";
	private static Logger log = LoggerFactory.getLogger(FileOperations.class);
	
	// TODO: Can refactor the application.properties into a static utility class
	public List<Boolean> writeFileFromObjectArray(City[] cityArray) {
		log.info("Writing into the file");
		List<Boolean> statusList = new ArrayList<>();
		try (InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream("application.properties");) {
			Properties prop = new Properties();
			prop.load(inputStream);

			String outputPath = prop.getProperty("file.out.path");
			String fileNameWithPath = outputPath + FILE_NAME;
			File outputFile = new File(fileNameWithPath);
			FileWriter fileWriter = new FileWriter(outputFile);
			
			log.info("OUTPUT FILE: " + fileNameWithPath);
			// Parse the list and write into the file
			Arrays.stream(cityArray).forEach((city) -> {
				try {
					fileWriter.write(String.join(",", city.get_id(), city.getName(), city.getName(), city.getType(),
							city.getGeo_position().getLatitude().toString(),
							city.getGeo_position().getLongitude().toString()));
					fileWriter.write("\n");
					statusList.add(Boolean.TRUE);
				} catch (Exception e) {
					statusList.add(Boolean.FALSE);
					e.printStackTrace();
				} 
			});
			
			fileWriter.close();
		} catch (Exception e) {
			// TODO: Could handle more specific exception handling
			e.printStackTrace();
		}
		return statusList;
	}

}
