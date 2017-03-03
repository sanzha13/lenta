package ru.sanzha.lenta.xml;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author sanzha
 */
public class XmlParser {

    protected Document parse(InputStream is) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(is);
    }

    public List<String> getTitles(InputStream is) throws ParserConfigurationException, SAXException, IOException {
        Document doc = parse(is);
        List<String> list = new ArrayList<>();
        NodeList nodeList = doc.getElementsByTagName("title");
        for (int i = 0; i < nodeList.getLength(); i++) {
            list.add(nodeList.item(i).getTextContent());
        }

        return list;

    }
}
