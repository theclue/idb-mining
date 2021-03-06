package org.talend.designer.codegen.translators.databases.interbase;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TInterbaseRollbackMainJava
{
  protected static String nl;
  public static synchronized TInterbaseRollbackMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TInterbaseRollbackMainJava result = new TInterbaseRollbackMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " \t";
  protected final String TEXT_2 = NL + " \tjava.sql.Connection conn_";
  protected final String TEXT_3 = " = (java.sql.Connection)globalMap.get(\"";
  protected final String TEXT_4 = "\");" + NL + " \t" + NL + " \tif(conn_";
  protected final String TEXT_5 = " != null && !conn_";
  protected final String TEXT_6 = ".isClosed()) {" + NL + " \t        conn_";
  protected final String TEXT_7 = ".rollback();";
  protected final String TEXT_8 = NL + " \t    conn_";
  protected final String TEXT_9 = ".close();";
  protected final String TEXT_10 = NL + "\t}";
  protected final String TEXT_11 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
 	    CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
 	    INode node = (INode)codeGenArgument.getArgument();
 	
 	    String cid = node.getUniqueName();
 	
 	    String connection = ElementParameterParser.getValue(node, "__CONNECTION__");
 	
 	    boolean close = ("true").equals(ElementParameterParser.getValue(node,"__CLOSE__"));
 	
 	    String conn = "conn_" + connection;

    stringBuffer.append(TEXT_2);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(conn);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_7);
      if(close){
    stringBuffer.append(TEXT_8);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_9);
     }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
