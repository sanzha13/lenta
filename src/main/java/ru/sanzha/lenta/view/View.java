package ru.sanzha.lenta.view;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import ru.sanzha.lenta.xml.DataSource;
import ru.sanzha.lenta.xml.XmlParser;

/**
 *
 * @author sanzha
 */
public abstract class View {

    private final DataSource ds;
    private final XmlParser parser;

    public View(DataSource ds, XmlParser parser) {
        this.ds = ds;
        this.parser = parser;
    }

    public void view() throws IOException, ParserConfigurationException, SAXException {
        InputStream xml = ds.getXml();
        List<String> listTitles = parser.getTitles(xml);
        for (String title : listTitles) {
            viewTitle(title);
        }
    }

    protected abstract void viewTitle(String title);

}
