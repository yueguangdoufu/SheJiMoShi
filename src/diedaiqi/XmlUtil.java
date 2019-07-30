package diedaiqi;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlUtil {
    public static Object getBean() throws ParserConfigurationException, ClassNotFoundException, IOException, SAXException, IllegalAccessException, InstantiationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document;
        document = builder.parse(new File("src/xml/configDiedai.xml"));

        NodeList nodeList = document.getElementsByTagName("diedaiName");
        Node node = nodeList.item(0).getFirstChild();
        String c = node.getNodeValue();

        Class c1 = Class.forName(c);
        Object object = c1.newInstance();
        return object;

    }
}
