import java.util.logging.*;
import java.io.*;
public class LogMng {
	PrintWriter fileLog;
	private boolean logToFile,logToConsole;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	private final static Logger log = Logger.getLogger(LogMng.class.getName()); //TODO: I don't know how this works 
	public LogMng() {
		info("Logging Initiated at " + dateFormat.format(date));
		logToFile = true;
		logToConsole = false;	
	}

	/*
		Sets bool value, true being enable logging and false disables logging
	**/
	public logMng(boolean logToFile, boolean logToConsole) {
		this.logToFile = logToFile;
		this.logToConsole = logToConsole;
		if (logToFile) {
			fileLog = new PrintWriter("log" + dateFormat.format(date) + ".txt");
		}
	}
	public void info(String info) {
		if(logToConsole && !logToFile) {
			log.info(info);
		}
		else if(logToConsole && logToFile) {
			log.info(info);
			logFile(info,"info");
		}
	}
	public void config(String info) {
		if(logToConsole && !logToFile) {
			log.config(info);
		}
		else if(logToConsole && logToFile) {
			log.config(info);
			logFile(info,"config");
		}
	}
	public void warning(String info) {
		if(logToConsole && !logToFile) {
			log.warning(info);
		}
		else if(logToConsole && logToFile) {
			log.warning(info);
			logFile(info,"WARNING");
		}
	}
	public void severe(String info) {
		if(logToConsole && !logToFile) {
			log.severe(info);
		}
		else if(logToConsole && logToFile) {
			log.severe(info);
			logFile(info,"SEVERE");
		}
	}
	private void logFile(String info, String level = "info") {
		fileLog.println("Level: " + level);
		fileLog.println();
		fileLog.println("Message:\n" + info + "\nEnd of Message");
		fileLog.println("Time of Message: " + dateFormat.format(date));
		fileLog.println();
	}
}
