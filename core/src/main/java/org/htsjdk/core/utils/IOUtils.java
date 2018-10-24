package org.htsjdk.core.utils;

import java.io.File;
import java.io.IOException;

public class IOUtils {

    /**
     * Create a temporary file using a given name prefix and name suffix.
     * @param prefix
     * @param suffix
     * @return temp File that will be deleted on exit
     * @throws IOException
     */
    public static File createTempFile(final String prefix, final String suffix) throws IOException {
        final File tempFile = File.createTempFile("testOutputStream", ".txt");
        tempFile.deleteOnExit();
        return tempFile;
    }

}
