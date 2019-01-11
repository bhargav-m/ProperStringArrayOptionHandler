package main.java.BhargavTest;

import java.util.List;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class ColonSepratedInputStringTestMainClass {
	
	@Option(name = "-pgList", required = false, handler = ProperStringArrayOptionHandler.class, usage = "List of Processing Groups seperated by commas Ex: TP,MIA,BOS")
	public static List<String> pgList;
	
	@Option(name = "-zkq", required = true, usage = "Zookeeper Quorum name")
	public static String zkq = "";
	
	@Option(name = "-jt", required = true, usage = "Job Tracker name")
	private static String jobTracker = "";

	public static void main(String[] args) throws CmdLineException {
		ColonSepratedInputStringTestMainClass testMain = new ColonSepratedInputStringTestMainClass();
		CmdLineParser parser = new CmdLineParser(testMain);
		parser.parseArgument(args);
		System.out.println("-zkq "+zkq+" -test "+pgList+" -jt "+jobTracker);
		
		System.out.println(pgList.size());
		StringBuilder pg = new StringBuilder();
		if(pgList.size()>1) {
			for(String temp: pgList) {
				pg.append(temp);
				pg.append(" ");
			}
		}
		System.out.println(pg.length());
		pg.delete(pg.length()-1, pg.length());
		System.out.println(pg.length());
		System.out.println(pg.toString());
	}

}
