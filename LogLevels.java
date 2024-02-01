package packageSketch;
public class LogLevels {
	
    public static String message(String logLine) {
    	String[] x =  logLine.split(":", 2);
    	String y = x[1].trim();
    	return y;
}// end of message method
    
    public static String logLevel(String logLine) {
    	String[] x =  logLine.split(":", 2);
    	String y = x[0];
    	switch(y) {
    	case "[INFO]":
    		return "info";
    	case "[WARNING]":
    		return "warning";
    	case "[ERROR]":
    		return "error";
    	default:
    		return "something went wrong";
    	}// end of switch
    	
    	 
}// end of log*LEVEL* method

    public static String reformat(String logLine) {
    	// separate and turn INFO to lower case
    	String[] x = logLine.split(":", 2);
        String x1 = x[0].replace("[","(").replace("]", ")").trim().toLowerCase();
        // put info text after "operation completed"
        String x2 = x[1].trim();
        String x3 = x2 +" "+ x1;
        return x3;
}// end of reformat method
}// end of class log*LEVELS*

    

