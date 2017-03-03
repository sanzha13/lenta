package ru.sanzha.lenta.xml;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author sanzha
 */
public interface DataSource {

    public InputStream getXml() throws IOException;

}
