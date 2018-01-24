package io.jenkins.plugins.analysis.warnings;

import edu.hm.hafner.analysis.IssueParser;
import edu.hm.hafner.analysis.parser.IarParser;
import io.jenkins.plugins.analysis.core.model.DefaultLabelProvider;
import io.jenkins.plugins.analysis.core.model.StaticAnalysisLabelProvider;
import io.jenkins.plugins.analysis.core.model.StaticAnalysisTool;

import hudson.Extension;

/**
 * Provides a parser and customized messages for the IAR C/C++ compiler.
 *
 * @author Ullrich Hafner
 */
@Extension
public class Iar extends StaticAnalysisTool {
    static final String ID = "iar";
    private static final String PARSER_NAME = Messages.Warnings_iar_ParserName();

    @Override
    public IssueParser createParser() {
return new IarParser();
}

    @Override
    public StaticAnalysisLabelProvider getLabelProvider() {
        return new DefaultLabelProvider(ID, PARSER_NAME);
   }
}