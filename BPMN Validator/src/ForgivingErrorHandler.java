import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.util.ArrayList;

public class ForgivingErrorHandler implements ErrorHandler {

	private ArrayList<String> exceptions = new ArrayList<String>();
	
	public ArrayList<String> getExceptions(){
		return exceptions;	
	}	
    public void warning(SAXParseException ex) {
        exceptions.add(ex.getMessage());
    }

    public void error(SAXParseException ex) {
        exceptions.add(ex.getMessage());
    }

    public void fatalError(SAXParseException ex) throws SAXException {
        exceptions.add(ex.getMessage());
    }

}