/*
 * CODENVY CONFIDENTIAL
 * __________________
 *
 *  [2012] - [2013] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.cli;

import com.beust.jcommander.*;
import com.beust.jcommander.converters.*;


/**
 * Set of commands and parameters for 'codenvy remote'.
 *
 */ 
@Parameters(commandDescription = "Commands on remote clouds: codenvy.com or Codenvy Enterprise")
public class CommandRemote implements CommandInterface {

    @Parameter(names = { "-h", "--help" }, description = "Prints this help")
	private boolean help;
    public boolean getHelp() { return help; }

    public boolean hasSubCommands() {
        return true;
    }

    public boolean hasMandatoryParameters() {
        return true;
    }

    public String getCommandName(){
        return "remote";
    }

    public String getParentCommandName(){
        return "codenvy";
    }

    public String getUsageLongDescription() {
		return("The remote subcommand is used to interact with a remote Codenvy system.");
	}

    public String getUsageDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usage: codenvy remote <subcommand> <args>");
        return sb.toString();
    }

    public String getHelpDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("For help on a subcommand run 'codenvy remote COMMAND --help'");
        return sb.toString();
    }

    public void execute() {
	}
}

