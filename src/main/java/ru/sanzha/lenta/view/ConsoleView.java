package ru.sanzha.lenta.view;

import ru.sanzha.lenta.xml.DataSource;
import ru.sanzha.lenta.xml.XmlParser;

/**
 *
 * @author sanzha
 */
public class ConsoleView extends View {

    public ConsoleView(DataSource ds, XmlParser parser) {
        super(ds, parser);
    }

    @Override
    protected void viewTitle(String title) {
        System.out.println(title);
    }

}
