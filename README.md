<h1 align="center">BPMN Analytics Tools</h1>

This repository contain analytics tools for extracting informations from BPMN models.

### Table of contents

1. [BPMN Element Counter](#counter)
2. [BPMN Validator](#validator)
3. [Pearson Correlation script](#pearson)
4. [Zipfian Distribution script](#zipfian)


# 1. BPMN Element Counter <a name="counter"/>

A Java application to extract informations from a *.bpmn* file.

**Extracted elements:**
- 267 BPMN Elements from the standard xml schema definition;
- Modeler Type;
- Model Type;
- File Size;
- Model's Size and Practical Complexity.

**Requirements:**
- Java 1.8 and above

**How to use the Java Application:**

- The Main.java class, calls the method countElements within ElementCounter.java
- Run Main.java as a Java application to execute it or export the project as a Runnable jar file then run "java -jar BPMN-Element-Counter.jar"  

**How to use the Java Web Application:**
- Build the project with maven running "mvn clean install" to generate the BPMN-Element-Counter.war file
- Deploy the web application on a Web Server such as Apache Tomcat.


# 2. BPMN Validator <a name="validator"/>

A java application for verify the integrity of the xml schema in a *.bpmn* file.

**How to use the Java Application:**

Generate a Runnable .jar file 

Import Project from Folder --> Export BPMNSchemaValidator.java as a Runnable jar file 

args[0] = resources folder 

args[1] = source folder with .bpmn models 

args[2] = destination path 

java -jar BPMN-SchemaValidator.jar PathToResourceFolder PathToSourceFolderWithBPMNModels DestinationPath 

# 3. Pearson Correlation script <a name="pearson"/>

A jupyter notebook script for evalute the Pearson Correlation coefficient between BPMN elements.

The script uses the following [data set](https://drive.google.com/drive/folders/1iA7VSMK5ikp_OIkcSz2FIXxPO89WcmQQ5) as input data.

[Link to the script](https://b10200cbde7d/r/BPMN-Analytics-Tools/Correlation%20between%20pairs%20of%20BPMN%20elements/BPMNPearsonCorrelation.ipynb)

# 4. Zipfian Distribution script <a name="zipfian"/>

A jupyter notebook script for fitting the Zipfian distribution considering a set of BPMN elements.

The script uses the following [data set](https://drive.google.com/drive/folders/1iA7VSMK5ikp_OIkcSz2FIXxPO89WcmQQ5) as input data.

[Link to the script](https://b10200cbde7d/r/BPMN-Analytics-Tools/BPMN%20Zipfian%20Distribution/ZipfianDistribution.ipynb)
