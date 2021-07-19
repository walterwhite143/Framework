package com.automation.supporters;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XMLReader {
	private String filePath;
	private File file ;
	private SAXReader saxReader;
	private Document document;
	
	public 	XMLReader(String filePath) throws DocumentException {
		this.filePath = filePath;
		File file = new File(filePath);
		SAXReader saxReader = new SAXReader();
		 Document  document =  saxReader.read(file);		
	}
	public  String getSingleNode(String nodePath) {
		Node node = document.selectSingleNode(nodePath); 	            
		  String nodeData  =  node.getText();		                     
		return nodeData;	
	}
	public List<String> getAllNodes(String rootNode) {
		 List<String> nodesData  = new ArrayList<>();
		List nodes = document.selectNodes(rootNode);
		    for(Object obj :nodes) {
		    	 Node node = (Node)obj;
		    	      String    nodeData =    node.getText();
		    	        nodesData.add(nodeData);
		    }
		    return  nodesData ;				
	}

	public static void main(String[] args) throws DocumentException {
		
		File file = new File("C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\supporters\\NewFile.xml");
		SAXReader saxReader = new SAXReader();
		             Document  document =  saxReader.read(file);
		             Node node =    document.selectSingleNode("//MEN//POP_UP");	                   		                                             
		             String data = node.getText();		                           
		             System.out.println("menvalidation"+data);
		                                
		                 Document   document2 =  saxReader.read(file);
		                 Node  node2 =     document2.selectSingleNode("//MEN/BU_xpath");
		                 String     data2 =      node2.getText();
		                 System.out.println("menvalidation"+data2);
		                     
		                      Document    document3 =  saxReader.read(file);
		                      Node   node3  =   document3.selectSingleNode("//MEN/L_XPATH");
		                      String   data3 = node3.getText();
		                       System.out.println("men validation"+data3);
	}

}
