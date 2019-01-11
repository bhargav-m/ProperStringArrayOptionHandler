package main.java.BhargavTest;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.Messages;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

public class ProperStringArrayOptionHandler extends OptionHandler<String> {
	  public ProperStringArrayOptionHandler(
	      CmdLineParser parser, OptionDef option, Setter<String> setter) {
	    super(parser, option, setter);
	  }

	  @Override
	  public String getDefaultMetaVariable() {
	    return Messages.DEFAULT_META_STRING_ARRAY_OPTION_HANDLER.format();            
	  }

	  @Override
	  public int parseArguments(Parameters params) throws CmdLineException {
	    int counter;
	    for (counter = 0; counter < params.size(); counter++) {
	      String param = params.getParameter(counter);
	      if(param.startsWith("-")) {
	        break;
	      }
	      setter.addValue(param);
	    }
	    return counter;
	  }
	}
