package proxy;

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

    public static Object getBean() throws ParserConfigurationException,
            ClassNotFoundException, IllegalAccessException, InstantiationException,
            IOException, SAXException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document;
        document = builder.parse(new File("src\\xml\\configproxy.xml"));

        NodeList nodeList = document.getElementsByTagName("className");
        Node node = nodeList.item(0).getFirstChild();
        String proxyName = node.getNodeValue();

        Class c = Class.forName(proxyName);
        Object obj = c.newInstance();

        return obj;
    }
}
