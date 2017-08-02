package fr.cnes.analysis.tools.export.csv;

import fr.cnes.analysis.tools.analyzer.datas.CheckResult;

/************************************************************************************************/
/* i-Code CNES is a static code analyzer. */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */
/* http://www.eclipse.org/legal/epl-v10.html */
/************************************************************************************************/

import fr.cnes.analysis.tools.export.IExport;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * This class is an attribute of the {@code ExtensionPoint} implementing
 * {@link IExport} interface of the plugin <i>fr.cnes.analysis.tools.export</i>.
 * <p>
 * This class is also exported in the <i>fr.cnes.analysis.tools.export.csv</i>
 * plugin and could be used as a service from any third.
 * </p>
 * <p>
 * This class is responsible of the export in the format CSV of
 * {@link CheckResult} elements into a {@link File}.
 * </p>
 * 
 * @since 3.0
 */
public class ExportCsv implements IExport {

    /**
     * Default constructor. Required to execute a class from the contributed
     * extension point.
     */
    public ExportCsv() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.cnes.analysis.tools.export.IExport#export(java.util.List,
     * java.io.File)
     */
    @Override
    public void export(List<CheckResult> checkResults, File outputFile,
            Map<String, String> parameters) throws IOException {
        final FileWriter writer = new FileWriter(outputFile);
        writer.write("Rule, File, Location, Line, Value\n");
        for (final CheckResult checkResult : checkResults) {
            if(checkResult.getValue()!=null){
            	writer.write(checkResult.getName() + "," + checkResult.getFile().getAbsolutePath() + ","
                    + checkResult.getLocation() + "," + checkResult.getLine().toString() + "," + checkResult.getValue()+"\n");
            }else{
            	writer.write(checkResult.getName() + "," + checkResult.getFile().getAbsolutePath() + ","
                        + checkResult.getLocation() + "," + checkResult.getLine().toString() + ", -- \n");
            }
        }

        writer.close();

    }

    @Override
    public boolean hasParameters() {
        return false;
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }

}
