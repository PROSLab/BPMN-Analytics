
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;
import java.util.ArrayList;


public class BPMNSchemaValidator {

	static boolean fromFolder = true;
	static int conta=0;

	
	/*
	 * args[0] = resources folder
	 * args[1] = source folder with .bpmn models
	 * args[2] = destination path 
	 */
	public static void main(String[] args) throws IOException {


		String resources=args[0];
		
		String folderPath = args[1];
				
		String destinationPath= args[2];
		
		File folder = new File(folderPath);
		ArrayList<String> exp = null;

		BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath+"_SchemaValidationResults.csv"));
		writer.write("ModelName"+","+"Validation"+","+"Exception"+"\n");


			//SCORRI FILE NELLA CARTELLA

			for (final File fileEntry : folder.listFiles()) {
				
			
				try {
					SchemaFactory factory = 
							SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
					Schema schema = factory.newSchema(
							new Source[] {
									new StreamSource(new File(resources+"/schema/DC.xsd")),
									new StreamSource(new File(resources+"/schema/DI.xsd")),
									new StreamSource(new File(resources+"/schema/BPMNDI.xsd")),
									new StreamSource(new File(resources+"/schema/BPMN20.xsd"))
							}

							);
					Validator validator = schema.newValidator();


					var errorHandler = new ForgivingErrorHandler();
					validator.setErrorHandler(errorHandler);
					
					System.out.println(fileEntry.getName());

					if(!fileEntry.getName().contains("bpmn"))continue;
					validator.validate(new StreamSource(new File(folderPath+"/"+fileEntry.getName())));
					exp = errorHandler.getExceptions();

					
					if(!exp.isEmpty()) {
						conta++;
						
						writer.write(conta+"^"+fileEntry.getName()+"^"+"invalid"+"^ "+exp+"\n");
					}
					else {
						conta++;
						writer.write(conta+"^"+fileEntry.getName()+"^"+"valid"+"^ "+"\n");
					}



				} catch (Exception e) {
					System.out.println(folderPath+fileEntry.getName()+"^"+e.getMessage());
					writer.write(fileEntry.getName()+","+"invalid"+", "+e.getMessage().replace(",", "-")+"\n");            
					writer.write(fileEntry.getName()+","+"invalid"+", "+exp+"\n"); 
					continue;

				}

			}//CHIUSURA FOR FILE IN FOLDER
			System.out.println(conta);

		
		writer.flush();
		writer.close();
	}
	
}


