package diedaiqi;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {

    public static void display(ShangPing shangPing){
        MyIterator iterator = shangPing.creatIterator();
        System.out.println("商品:");
        while (!iterator.isLast()){
            System.out.println(iterator.currentShangping().toString());
            iterator.next();
        }
    }

    public static void reverseDisplay(ShangPing shangPing){
        MyIterator iterator = shangPing.creatIterator();
        iterator.setShangping(5);
        System.out.println("逆向商品:");
        while (!iterator.isFirst()){
            iterator.previous();
            System.out.println(iterator.currentShangping().toString());
        }
    }

    public static void main(String[] args) throws SAXException, IllegalAccessException, IOException, InstantiationException, ParserConfigurationException, ClassNotFoundException {
        ShangPing shangPing;
        shangPing = (ShangPing) XmlUtil.getBean();
        display(shangPing);
        System.out.println("======================");
        reverseDisplay(shangPing);
    }
}
