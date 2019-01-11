package main.java.BhargavTest;

import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.DelimitedOptionHandler;
import org.kohsuke.args4j.spi.OneArgumentOptionHandler;
import org.kohsuke.args4j.spi.Setter;

public final class ColonSeparatedStringOptionHandler extends DelimitedOptionHandler<String> {
	
	public ColonSeparatedStringOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter,
			String delimiter, OneArgumentOptionHandler<? extends String> individualOptionHandler) {
		super(parser, option, setter, delimiter, individualOptionHandler);
		// TODO Auto-generated constructor stub
	}


	public ColonSeparatedStringOptionHandler(final CmdLineParser parser, final OptionDef option,
                                             final Setter<? super String> setter) {
        super(parser, option, setter, ",", new SingleStringOptionHandler(parser, option, setter));
    }
	
    
}