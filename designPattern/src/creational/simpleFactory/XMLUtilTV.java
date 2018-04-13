/**
 * 
 */
package creational.simpleFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/** 
 * @ClassName: XMLUtilTV 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-08 09:43
 */
public class XMLUtilTV {

	public static String getBrandName(int num){
		try{
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();			
			Document d=db.parse("D:/project/MyEclipse2017/git/designPattern/designPattern/src/creational/simpleFactory/configTV.xml");
			
			NodeList nl=d.getElementsByTagName("brandName");
			Node node = null;
			for(int i=0;i<num;i++)
				node=nl.item(0).getNextSibling();
			String brandName=node.getNodeValue().trim();
			return brandName;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}		
	}
}
