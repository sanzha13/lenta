package ru.sanzha.lenta.xml;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author sanzha
 */
public class HttpsDataSource implements DataSource {

    @Override
    public InputStream getXml() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("https://lenta.ru/rss/news");
        CloseableHttpResponse response = httpclient.execute(httpget);
        return response.getEntity().getContent();
    }

}
