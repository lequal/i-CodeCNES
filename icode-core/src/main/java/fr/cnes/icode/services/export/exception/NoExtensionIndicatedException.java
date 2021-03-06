/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/

package fr.cnes.icode.services.export.exception;

/**
 * This exception should be thrown when trying to export data without precision
 * on the output format.
 */
public class NoExtensionIndicatedException extends Exception {
    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 278236194829027896L;

    /**
     * Default constructor.
     */
    public NoExtensionIndicatedException() {
        super();
    }

    /**
     * Constructor with a message as parameter.
     * 
     * @param message
     *            The exception message.
     */
    public NoExtensionIndicatedException(final String message) {
        super(message);
    }
}
