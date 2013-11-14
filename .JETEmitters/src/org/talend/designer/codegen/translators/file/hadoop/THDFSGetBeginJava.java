package org.talend.designer.codegen.translators.file.hadoop;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import java.util.List;
import java.util.Map;

public class THDFSGetBeginJava
{
  protected static String nl;
  public static synchronized THDFSGetBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    THDFSGetBeginJava result = new THDFSGetBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "\t";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + "String username_";
  protected final String TEXT_4 = " = \"\";" + NL + "org.apache.hadoop.fs.FileSystem fs_";
  protected final String TEXT_5 = " = null;";
  protected final String TEXT_6 = NL + "\torg.apache.hadoop.conf.Configuration conf_";
  protected final String TEXT_7 = " = new org.apache.hadoop.conf.Configuration();" + NL + "\tconf_";
  protected final String TEXT_8 = ".set(\"";
  protected final String TEXT_9 = "\", ";
  protected final String TEXT_10 = ");" + NL + "\t";
  protected final String TEXT_11 = NL + "\t\t\tconf_";
  protected final String TEXT_12 = ".set(";
  protected final String TEXT_13 = " ,";
  protected final String TEXT_14 = ");" + NL + "\t\t";
  protected final String TEXT_15 = NL + "\t\tconf_";
  protected final String TEXT_16 = ".set(\"dfs.namenode.kerberos.principal\", ";
  protected final String TEXT_17 = ");";
  protected final String TEXT_18 = NL + "\t\t\torg.apache.hadoop.security.UserGroupInformation.loginUserFromKeytab(";
  protected final String TEXT_19 = ", ";
  protected final String TEXT_20 = ");";
  protected final String TEXT_21 = NL + "    \tconf_";
  protected final String TEXT_22 = ".set(\"hadoop.job.ugi\",";
  protected final String TEXT_23 = "+\",\"+";
  protected final String TEXT_24 = ");" + NL + "    \tfs_";
  protected final String TEXT_25 = " = org.apache.hadoop.fs.FileSystem.get(conf_";
  protected final String TEXT_26 = ");" + NL + "\t";
  protected final String TEXT_27 = NL + "\t\tusername_";
  protected final String TEXT_28 = " = ";
  protected final String TEXT_29 = ";" + NL + "\t\tif(username_";
  protected final String TEXT_30 = " == null || \"\".equals(username_";
  protected final String TEXT_31 = ")){" + NL + "\t\t\tfs_";
  protected final String TEXT_32 = " = org.apache.hadoop.fs.FileSystem.get(conf_";
  protected final String TEXT_33 = ");" + NL + "\t\t}else{" + NL + "\t\t\tfs_";
  protected final String TEXT_34 = " = org.apache.hadoop.fs.FileSystem.get(new java.net.URI(conf_";
  protected final String TEXT_35 = ".get(\"";
  protected final String TEXT_36 = "\")),conf_";
  protected final String TEXT_37 = ",username_";
  protected final String TEXT_38 = ");" + NL + "\t\t}\t" + NL + "\t";
  protected final String TEXT_39 = NL + "\torg.apache.hadoop.conf.Configuration conf_";
  protected final String TEXT_40 = " = (org.apache.hadoop.conf.Configuration)globalMap.get(\"conn_";
  protected final String TEXT_41 = "\");" + NL + "\t";
  protected final String TEXT_42 = NL + "\t\t    \tfs_";
  protected final String TEXT_43 = " = org.apache.hadoop.fs.FileSystem.get(conf_";
  protected final String TEXT_44 = ");" + NL + "\t\t\t";
  protected final String TEXT_45 = NL + "\t\t\t\t\tconf_";
  protected final String TEXT_46 = ".set(\"dfs.namenode.kerberos.principal\", ";
  protected final String TEXT_47 = ");";
  protected final String TEXT_48 = NL + "\t\t\t\tusername_";
  protected final String TEXT_49 = " = ";
  protected final String TEXT_50 = ";" + NL + "\t\t\t\tif(username_";
  protected final String TEXT_51 = " == null || \"\".equals(username_";
  protected final String TEXT_52 = ")){" + NL + "\t\t\t\t\tfs_";
  protected final String TEXT_53 = " = org.apache.hadoop.fs.FileSystem.get(conf_";
  protected final String TEXT_54 = ");" + NL + "\t\t\t\t}else{" + NL + "\t\t\t\t\tfs_";
  protected final String TEXT_55 = " = org.apache.hadoop.fs.FileSystem.get(new java.net.URI(conf_";
  protected final String TEXT_56 = ".get(\"";
  protected final String TEXT_57 = "\")),conf_";
  protected final String TEXT_58 = ",username_";
  protected final String TEXT_59 = ");" + NL + "\t\t\t\t}\t\t\t  \t\t" + NL + "\t\t  \t";
  protected final String TEXT_60 = NL + "\t";
  protected final String TEXT_61 = NL + "\tint nb_file_";
  protected final String TEXT_62 = " = 0;" + NL + "\tint nb_success_";
  protected final String TEXT_63 = " = 0;" + NL + "\t" + NL + "\tString localPath_";
  protected final String TEXT_64 = " = ";
  protected final String TEXT_65 = ";" + NL + "\tif(localPath_";
  protected final String TEXT_66 = "!=null&&!\"\".equals(localPath_";
  protected final String TEXT_67 = ")){" + NL + "\t\tjava.io.File localDir_";
  protected final String TEXT_68 = " = new java.io.File(localPath_";
  protected final String TEXT_69 = ");" + NL + "\t\tlocalDir_";
  protected final String TEXT_70 = ".mkdirs();" + NL + "\t}else{" + NL + "\t\tthrow new RuntimeException(\"The local Dir required\");" + NL + "\t}" + NL + "\tjava.util.List<String> msg_";
  protected final String TEXT_71 = " = new java.util.ArrayList<String>();" + NL + "    java.util.List<java.util.Map<String,String>> list_";
  protected final String TEXT_72 = " = new java.util.ArrayList<java.util.Map<String,String>>();" + NL + "\t";
  protected final String TEXT_73 = "    " + NL + "\t\tjava.util.Map<String,String> map_";
  protected final String TEXT_74 = "_";
  protected final String TEXT_75 = " = new java.util.HashMap<String,String>();" + NL + "\t\tmap_";
  protected final String TEXT_76 = "_";
  protected final String TEXT_77 = ".put(";
  protected final String TEXT_78 = ",";
  protected final String TEXT_79 = ");\t\t" + NL + "\t \tlist_";
  protected final String TEXT_80 = ".add(map_";
  protected final String TEXT_81 = "_";
  protected final String TEXT_82 = ");       " + NL + "\t";
  protected final String TEXT_83 = "\t    " + NL + "" + NL + "    class FileUtil_";
  protected final String TEXT_84 = " {" + NL + "" + NL + "\t\tprivate long size = 0;" + NL + "\t\t" + NL + "    \t// copy from :" + NL + "    \t// directory or file of some file system" + NL + "    \t// to" + NL + "    \t// file or directory of local file system" + NL + "    \t// not support dir to file" + NL + "    \tpublic boolean copyToLocal(org.apache.hadoop.fs.FileSystem srcFS, org.apache.hadoop.fs.Path src, java.io.File dst," + NL + "\t\t\t\tboolean overwrite, boolean append, boolean copyDirectory)" + NL + "    \t\t\tthrows java.io.IOException {" + NL + "    " + NL + "    \t\tboolean srcIsDir = srcFS.getFileStatus(src).isDir();" + NL + "    " + NL + "    \t\tif (srcIsDir && !copyDirectory) {" + NL + "    \t\t\treturn false;" + NL + "    \t\t}" + NL + "    " + NL + "    \t\tdst = checkDest(src.getName(), srcIsDir, dst, overwrite);" + NL + "    \t\t" + NL + "    \t\tif(dst == null) {" + NL + "    \t\t\treturn false;" + NL + "    \t\t}" + NL + "    " + NL + "    \t\tif (srcIsDir) {" + NL + "    \t\t\tif (!dst.exists() && !dst.mkdirs()) {" + NL + "    \t\t\t\treturn false;" + NL + "    \t\t\t}" + NL + "    \t\t\torg.apache.hadoop.fs.FileStatus contents[] = srcFS.listStatus(src);" + NL + "    \t\t\tfor (int i = 0; i < contents.length; i++) {" + NL + "    \t\t\t\tcopyToLocal(srcFS, contents[i].getPath(), new java.io.File(dst, contents[i]" + NL + "    \t\t\t\t\t\t.getPath().getName()), overwrite, append, copyDirectory);" + NL + "    \t\t\t}" + NL + "    \t\t} else if (srcFS.isFile(src)) {" + NL + "    \t\t\tjava.io.InputStream in = null;" + NL + "    \t\t\tjava.io.OutputStream out = null;" + NL + "    \t\t\ttry {" + NL + "    \t\t\t\tin = srcFS.open(src, 10000);" + NL + "    \t\t\t\tout = new java.io.FileOutputStream(dst, append);" + NL + "    \t\t\t\torg.apache.hadoop.io.IOUtils.copyBytes(in, out, 10000, true);" + NL + "    \t\t\t\tsize += srcFS.getFileStatus(src).getLen();" + NL + "    \t\t\t} catch (java.io.IOException e) {" + NL + "    \t\t\t\torg.apache.hadoop.io.IOUtils.closeStream(out);" + NL + "    \t\t\t\torg.apache.hadoop.io.IOUtils.closeStream(in);" + NL + "    \t\t\t\tthrow e;" + NL + "    \t\t\t}" + NL + "    \t\t} else {" + NL + "    \t\t\tthrow new java.io.IOException(src.toString()" + NL + "    \t\t\t\t\t+ \": No such file or directory\");" + NL + "    \t\t}" + NL + "    " + NL + "    \t\treturn true;" + NL + "    " + NL + "    \t}" + NL + "    " + NL + "    \tprivate java.io.File checkDest(String srcName, boolean srcIsDir, java.io.File dst, boolean overwrite) {" + NL + "    \t\tif (dst.exists()) {" + NL + "    \t\t\tif (dst.isDirectory()) {" + NL + "    \t\t\t\tif (null == srcName) {" + NL + "    \t\t\t\t\treturn null;" + NL + "    \t\t\t\t}" + NL + "    \t\t\t\t" + NL + "    \t\t\t\tif(srcIsDir) {" + NL + "\t\t\t\t\t\treturn dst;" + NL + "\t\t\t\t\t}" + NL + "    \t\t\t\t" + NL + "    \t\t\t\treturn checkDest(null, srcIsDir, new java.io.File(dst, srcName), overwrite);" + NL + "    \t\t\t} else if (!overwrite) {" + NL + "    \t\t\t\tSystem.err.print(dst+\" exist, didn't overwrite.\");" + NL + "    \t\t\t\treturn null;" + NL + "    \t\t\t}" + NL + "    \t\t}" + NL + "    \t\treturn dst;" + NL + "    \t}" + NL + "    \t" + NL + "    \tpublic long getSize() {" + NL + "    \t\treturn size;" + NL + "    \t}" + NL + "" + NL + "\t}" + NL + "" + NL + "\tfor (java.util.Map<String, String> map_";
  protected final String TEXT_85 = " : list_";
  protected final String TEXT_86 = ") " + NL + "\t{" + NL;
  protected final String TEXT_87 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
String cid = node.getUniqueName();

String fsDefaultName = ElementParameterParser.getValue(node, "__FS_DEFAULT_NAME__");
boolean useExistingConnection = "true".equals(ElementParameterParser.getValue(node, "__USE_EXISTING_CONNECTION__"));
List<Map<String, String>> hadoopProps = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__HADOOP_ADVANCED_PROPERTIES__");
String user = null;

String fsDefalutName = "fs.default.name";

    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_5);
       
if(!useExistingConnection) { // if we don't use an existing connection, we create a new hadoop configuration
	String hadoopVersion = ElementParameterParser.getValue(node, "__DB_VERSION__");
	boolean useKrb = "true".equals(ElementParameterParser.getValue(node, "__USE_KRB__"));
	String kerberosPrincipal = ElementParameterParser.getValue(node, "__NAMENODE_PRINCIPAL__");
	boolean useKeytab = "true".equals(ElementParameterParser.getValue(node, "__USE_KEYTAB__"));
	String userPrincipal = ElementParameterParser.getValue(node, "__PRINCIPAL__");
	String keytabPath = ElementParameterParser.getValue(node, "__KEYTAB_PATH__");
	
	boolean isCustom = "CUSTOM".equals(ElementParameterParser.getValue(node, "__DISTRIBUTION__"));
	String auth = ElementParameterParser.getValue(node, "__AUTHENTICATION_MODE__");
	
    stringBuffer.append(TEXT_6);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(fsDefalutName);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(fsDefaultName);
    stringBuffer.append(TEXT_10);
    
	if(hadoopProps!=null && hadoopProps.size() > 0){
		for(Map<String, String> item : hadoopProps){
		
    stringBuffer.append(TEXT_11);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(item.get("PROPERTY") );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(item.get("VALUE") );
    stringBuffer.append(TEXT_14);
     
		}
	}
	
	if(!(((("HDP_1_0").equals(hadoopVersion) || ("HDP_1_2").equals(hadoopVersion) || ("HDP_1_3").equals(hadoopVersion) || ("HDP_2_0").equals(hadoopVersion) || ("APACHE_1_0_0").equals(hadoopVersion) || ("APACHE_1_0_3_EMR").equals(hadoopVersion) || ("Cloudera_CDH4").equals(hadoopVersion) || ("Cloudera_CDH4_YARN").equals(hadoopVersion)) && useKrb && !isCustom)
	   || (isCustom && "KRB".equals(auth)))) {
		user = ElementParameterParser.getValue(node, "__USERNAME__");
	} else {

    stringBuffer.append(TEXT_15);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(kerberosPrincipal);
    stringBuffer.append(TEXT_17);
    
		if(useKeytab) {

    stringBuffer.append(TEXT_18);
    stringBuffer.append(userPrincipal);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(keytabPath);
    stringBuffer.append(TEXT_20);
    
		}
	}
	
	if(((("APACHE_0_20_2").equals(hadoopVersion) || ("MAPR1").equals(hadoopVersion) || ("MAPR2").equals(hadoopVersion) || ("MAPR212").equals(hadoopVersion) || ("MAPR213").equals(hadoopVersion) || ("MAPR301").equals(hadoopVersion) || ("MapR_EMR").equals(hadoopVersion)) && !isCustom) || (isCustom && "UGI".equals(auth))){
		String group = ElementParameterParser.getValue(node, "__GROUP__");
	
    stringBuffer.append(TEXT_21);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(group);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_26);
    
	}else{
	
    stringBuffer.append(TEXT_27);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(fsDefalutName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_38);
    
	}
	
} else { // We re use the existing connection, coming from the component learned.
	String connectionSid = ElementParameterParser.getValue(node, "__CONNECTION__");
	
    stringBuffer.append(TEXT_39);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(connectionSid);
    stringBuffer.append(TEXT_41);
    
	List<? extends INode> nodes = node.getProcess().getGeneratingNodes();
    for(INode targetNode : nodes){
		if (targetNode.getUniqueName().equals(connectionSid)) {
        	String hadoopVersion = ElementParameterParser.getValue(targetNode, "__DB_VERSION__"); 
    		boolean useKrb = "true".equals(ElementParameterParser.getValue(targetNode, "__USE_KRB__"));
    		String kerberosPrincipal = ElementParameterParser.getValue(targetNode, "__NAMENODE_PRINCIPAL__");
    		
    		boolean isCustom = "CUSTOM".equals(ElementParameterParser.getValue(targetNode, "__DISTRIBUTION__"));
    		String auth = ElementParameterParser.getValue(targetNode, "__AUTHENTICATION_MODE__");
		
	      	if(((("APACHE_0_20_2").equals(hadoopVersion) || ("MAPR1").equals(hadoopVersion) || ("MAPR2").equals(hadoopVersion) || ("MAPR212").equals(hadoopVersion) || ("MAPR213").equals(hadoopVersion) || ("MAPR301").equals(hadoopVersion) || ("MapR_EMR").equals(hadoopVersion)) && !isCustom) || (isCustom && "UGI".equals(auth))){
		    
    stringBuffer.append(TEXT_42);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_44);
    
		  	}else{
				if(!(((("HDP_1_0").equals(hadoopVersion) || ("HDP_1_2").equals(hadoopVersion) || ("HDP_1_3").equals(hadoopVersion) || ("APACHE_1_0_0").equals(hadoopVersion) || ("APACHE_1_0_3_EMR").equals(hadoopVersion) || ("Cloudera_CDH4").equals(hadoopVersion) || ("Cloudera_CDH4_YARN").equals(hadoopVersion)) && !isCustom && useKrb) || (isCustom && "KRB".equals(auth)))) {
					user = ElementParameterParser.getValue(targetNode, "__USERNAME__");
				} else {

    stringBuffer.append(TEXT_45);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(kerberosPrincipal);
    stringBuffer.append(TEXT_47);
    
				}
			  	
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(fsDefalutName);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_59);
    
		  	}
	      	break;
	    }
    }
}

    stringBuffer.append(TEXT_60);
    
	String localdir = ElementParameterParser.getValue(node, "__LOCALDIR__");	
	List<Map<String, String>> files = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__FILES__");

    stringBuffer.append(TEXT_61);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(localdir);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_72);
    
    for (int i=0; i<files.size(); i++) {
       	Map<String, String> line = files.get(i);
	
    stringBuffer.append(TEXT_73);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_74);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_75);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_76);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( line.get("FILEMASK") );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( line.get("NEWNAME") );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_81);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_82);
    
  	}
	
    stringBuffer.append(TEXT_83);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_86);
    stringBuffer.append(TEXT_87);
    return stringBuffer.toString();
  }
}
