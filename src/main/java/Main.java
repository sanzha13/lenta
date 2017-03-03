
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import ru.sanzha.lenta.view.ConsoleView;
import ru.sanzha.lenta.view.View;
import ru.sanzha.lenta.xml.DataSource;
import ru.sanzha.lenta.xml.HttpsDataSource;
import ru.sanzha.lenta.xml.XmlParser;

/**
 *
 * @author sanzha
 */
public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        DataSource ds = new HttpsDataSource();
        XmlParser parser = new XmlParser();
        View view = new ConsoleView(ds, parser);
        view.view();
    }
}
