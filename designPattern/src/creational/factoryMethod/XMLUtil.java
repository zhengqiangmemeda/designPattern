/**
 * 
 */
package creational.factoryMethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/** 
 * @ClassName: XMLUtil 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-08 16:06
 */
public class XMLUtil {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static Object getBean() {
		// TODO Auto-generated method stub
		try
		{
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("D:/project/MyEclipse2017/git/designPattern/designPattern/src/creational/factoryMethod/config.xml")); 
		
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue().trim();
            
            //ͨ����������ʵ�����󲢽��䷵��
            Class c=Class.forName(cName);
	  	    Object obj=c.newInstance();
            return obj;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
	}

}
