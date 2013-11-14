package org.talend.designer.codegen.translators.file.input;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.metadata.types.JavaType;
import java.util.List;
import java.util.Map;
import org.talend.core.model.process.IProcess;

public class TFileInputDelimitedBeginJava
{
  protected static String nl;
  public static synchronized TFileInputDelimitedBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TFileInputDelimitedBeginJava result = new TFileInputDelimitedBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL + "\t";
  protected final String TEXT_3 = NL + "\t\t\trowHelper_";
  protected final String TEXT_4 = ".valueToConn(";
  protected final String TEXT_5 = ", ";
  protected final String TEXT_6 = ");" + NL + "\t\t";
  protected final String TEXT_7 = NL + "\t\t\trowHelper_";
  protected final String TEXT_8 = ".valueToConnWithD(";
  protected final String TEXT_9 = ", ";
  protected final String TEXT_10 = ", ";
  protected final String TEXT_11 = ");" + NL + "\t\t";
  protected final String TEXT_12 = NL + "\t\t\trowHelper_";
  protected final String TEXT_13 = ".connToConn(";
  protected final String TEXT_14 = ",";
  protected final String TEXT_15 = ");" + NL + "\t\t";
  protected final String TEXT_16 = NL + "\t\t\t\tclass RowHelper_";
  protected final String TEXT_17 = "{" + NL + "\t\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\t\t\tpublic void valueToConn_";
  protected final String TEXT_19 = "(";
  protected final String TEXT_20 = " ";
  protected final String TEXT_21 = ",";
  protected final String TEXT_22 = "Struct ";
  protected final String TEXT_23 = ") throws java.lang.Exception{" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_24 = NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_25 = NL + "\t\t\t\t\tpublic void valueToConnWithD_";
  protected final String TEXT_26 = "(";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = ",";
  protected final String TEXT_29 = "Struct ";
  protected final String TEXT_30 = ", routines.system.Dynamic ";
  protected final String TEXT_31 = ") throws java.lang.Exception{" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_32 = NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_33 = NL + "\t\t\t\t\tpublic void connToConn_";
  protected final String TEXT_34 = "(";
  protected final String TEXT_35 = "Struct ";
  protected final String TEXT_36 = ",";
  protected final String TEXT_37 = "Struct ";
  protected final String TEXT_38 = ") throws java.lang.Exception{" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_39 = NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_40 = NL + "\t\t\t\t\tpublic void valueToConn(";
  protected final String TEXT_41 = " ";
  protected final String TEXT_42 = ",";
  protected final String TEXT_43 = "Struct ";
  protected final String TEXT_44 = ") throws java.lang.Exception{" + NL + "\t\t\t\t";
  protected final String TEXT_45 = NL + "\t\t\t\t\tpublic void valueToConnWithD(";
  protected final String TEXT_46 = " ";
  protected final String TEXT_47 = ",";
  protected final String TEXT_48 = "Struct ";
  protected final String TEXT_49 = ", routines.system.Dynamic ";
  protected final String TEXT_50 = ") throws java.lang.Exception{" + NL + "\t\t\t\t";
  protected final String TEXT_51 = NL + "\t\t\t\t\t\tvalueToConn_";
  protected final String TEXT_52 = "(";
  protected final String TEXT_53 = ",";
  protected final String TEXT_54 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_55 = NL + "\t\t\t\t\t\tvalueToConnWithD_";
  protected final String TEXT_56 = "(";
  protected final String TEXT_57 = ",";
  protected final String TEXT_58 = ",";
  protected final String TEXT_59 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_60 = NL + "\t\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_61 = NL + "\t\t\t\t\tpublic void connToConn(";
  protected final String TEXT_62 = "Struct ";
  protected final String TEXT_63 = ",";
  protected final String TEXT_64 = "Struct ";
  protected final String TEXT_65 = ") throws java.lang.Exception{" + NL + "\t\t\t\t\t";
  protected final String TEXT_66 = NL + "\t\t\t\t\t\tconnToConn_";
  protected final String TEXT_67 = "(";
  protected final String TEXT_68 = ",";
  protected final String TEXT_69 = ");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_70 = NL + "\t\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_71 = NL + "\t\t\t\t}" + NL + "\t\t\t\tRowHelper_";
  protected final String TEXT_72 = " rowHelper_";
  protected final String TEXT_73 = "  = new RowHelper_";
  protected final String TEXT_74 = "();" + NL + "\t\t\t";
  protected final String TEXT_75 = NL + "\t";
  protected final String TEXT_76 = NL + "\t\tString log4jFileInputDelimitedParamters_";
  protected final String TEXT_77 = " = \"\";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_78 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_79 = " + \"FILENAME = \" + ";
  protected final String TEXT_80 = " + \" | \";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_81 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_82 = " + \"CSV_OPTION = \" + ";
  protected final String TEXT_83 = " + \" | \";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_84 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_85 = " + \"FIELDSEPARATOR = \" + ";
  protected final String TEXT_86 = " + \" | \";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_87 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_88 = " + \"HEADER = \" + ";
  protected final String TEXT_89 = " + \" | \";" + NL + "\t\t";
  protected final String TEXT_90 = NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_91 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_92 = " + \"FOOTER = \" + ";
  protected final String TEXT_93 = " + \" | \";" + NL + "\t\t";
  protected final String TEXT_94 = NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_95 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_96 = " + \"LIMIT = \" + ";
  protected final String TEXT_97 = " + \" | \";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_98 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_99 = " + \"REMOVE_EMPTY_ROW = \" + ";
  protected final String TEXT_100 = " + \" | \";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_101 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_102 = " + \"UNCOMPRESS = \" + ";
  protected final String TEXT_103 = " + \" | \";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_104 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_105 = " + \"DIE_ON_ERROR = \" + ";
  protected final String TEXT_106 = " + \" | \";" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_107 = " = log4jFileInputDelimitedParamters_";
  protected final String TEXT_108 = " + \"REMOVE_EMPTY_ROW = \" + ";
  protected final String TEXT_109 = " + \" | \";" + NL + "\t\t" + NL + "\t\tlog4jFileInputDelimitedParamters_";
  protected final String TEXT_110 = " = \"";
  protected final String TEXT_111 = " - Parameters:\" + log4jFileInputDelimitedParamters_";
  protected final String TEXT_112 = ";" + NL + "\t\tlog.debug(log4jFileInputDelimitedParamters_";
  protected final String TEXT_113 = ");";
  protected final String TEXT_114 = NL + "\t\t\tif(isFirstCheckDyn_";
  protected final String TEXT_115 = "){// for the header line" + NL + "\t\t\t\t";
  protected final String TEXT_116 = NL + "\t\t\t\t\tint colsLen_";
  protected final String TEXT_117 = " = row";
  protected final String TEXT_118 = ".length;" + NL + "\t\t\t\t";
  protected final String TEXT_119 = NL + "\t\t\t\t\tint colsLen_";
  protected final String TEXT_120 = " = fid_";
  protected final String TEXT_121 = ".getColumnsCountOfCurrentRow();" + NL + "\t\t\t\t";
  protected final String TEXT_122 = NL + "    \t\t\tfor (int i = ";
  protected final String TEXT_123 = "; i < colsLen_";
  protected final String TEXT_124 = "-";
  protected final String TEXT_125 = "; i++) {" + NL + "\t\t\t    \troutines.system.DynamicMetadata dynamicMetadata_";
  protected final String TEXT_126 = " = new routines.system.DynamicMetadata();" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_127 = ".setName(";
  protected final String TEXT_128 = "row";
  protected final String TEXT_129 = "[i]";
  protected final String TEXT_130 = "fid_";
  protected final String TEXT_131 = ".get(i)";
  protected final String TEXT_132 = ".replaceAll(\"[ .-]+\", \"_\"));" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_133 = ".setDbName(dynamicMetadata_";
  protected final String TEXT_134 = ".getName());" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_135 = ".setType(\"id_String\");" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_136 = ".setDbType(\"VARCHAR\");" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_137 = ".setLength(100);" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_138 = ".setPrecision(0);" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_139 = ".setNullable(true);" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_140 = ".setKey(false);" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_141 = ".setSourceType(routines.system.DynamicMetadata.sourceTypes.demilitedFile);" + NL + "\t\t\t    \tdynamicMetadata_";
  protected final String TEXT_142 = ".setColumnPosition(i);" + NL + "\t\t\t    \tdynamic_";
  protected final String TEXT_143 = ".metadatas.add(dynamicMetadata_";
  protected final String TEXT_144 = ");" + NL + "\t\t\t    }" + NL + "    \t\t\tisFirstCheckDyn_";
  protected final String TEXT_145 = " = false;" + NL + "    \t\t\tcontinue;" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_146 = NL + "\t\t\tint footer_value_";
  protected final String TEXT_147 = " = ";
  protected final String TEXT_148 = ", random_value_";
  protected final String TEXT_149 = " = ";
  protected final String TEXT_150 = ";" + NL + "\t\t\tif(footer_value_";
  protected final String TEXT_151 = " >0 || random_value_";
  protected final String TEXT_152 = " > 0){" + NL + "\t\t\t\t";
  protected final String TEXT_153 = NL + "\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_154 = " - When the input source is a stream,footer and random shouldn't be bigger than 0.\");" + NL + "\t\t\t\t";
  protected final String TEXT_155 = NL + "\t\t\t\tthrow new java.lang.Exception(\"When the input source is a stream,footer and random shouldn't be bigger than 0.\");\t\t\t\t" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_156 = NL + "\t\t\tint footer_value_";
  protected final String TEXT_157 = " = ";
  protected final String TEXT_158 = ";" + NL + "\t\t\tif(footer_value_";
  protected final String TEXT_159 = " > 0){" + NL + "\t\t\t\t";
  protected final String TEXT_160 = NL + "\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_161 = " - When the input source is a stream,footer shouldn't be bigger than 0.\");" + NL + "\t\t\t\t";
  protected final String TEXT_162 = NL + "\t\t\t\tthrow new java.lang.Exception(\"When the input source is a stream,footer shouldn't be bigger than 0.\");" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_163 = NL + "\t";
  protected final String TEXT_164 = NL + "\t\tlog.info(\"";
  protected final String TEXT_165 = " - Start to work.\");" + NL + "\t";
  protected final String TEXT_166 = NL + "\t";
  protected final String TEXT_167 = NL + "\t\t\t\tint dynamic_column_count_";
  protected final String TEXT_168 = "=";
  protected final String TEXT_169 = ".getColumnCount()";
  protected final String TEXT_170 = "1";
  protected final String TEXT_171 = ";" + NL + "\t\t\t\t";
  protected final String TEXT_172 = NL + "\t\t\t\tint columnIndexWithD_";
  protected final String TEXT_173 = " = 0;" + NL + "\t\t\t\t";
  protected final String TEXT_174 = NL + "\t\t\t\t\tString temp = \"\"; " + NL + "\t\t\t\t";
  protected final String TEXT_175 = NL + "\t\t\t\t\tcolumnIndexWithD_";
  protected final String TEXT_176 = " = ";
  protected final String TEXT_177 = "+dynamic_column_count_";
  protected final String TEXT_178 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_179 = NL + "\t\t\t\t\tcolumnIndexWithD_";
  protected final String TEXT_180 = " = ";
  protected final String TEXT_181 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_182 = NL + "\t\t\t\t\t\t\ttemp  = ";
  protected final String TEXT_183 = ".get(columnIndexWithD_";
  protected final String TEXT_184 = ")";
  protected final String TEXT_185 = ";" + NL + "\t\t\t\t\t\t\tif(temp.length() > 0){" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_186 = ".";
  protected final String TEXT_187 = " = temp;" + NL + "\t\t\t\t\t\t\t}else{" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_188 = ".";
  protected final String TEXT_189 = " = ";
  protected final String TEXT_190 = ";" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_191 = NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_192 = ".";
  protected final String TEXT_193 = " = ";
  protected final String TEXT_194 = ".get(columnIndexWithD_";
  protected final String TEXT_195 = ")";
  protected final String TEXT_196 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_197 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_198 = ".clearColumnValues();" + NL + "\t\t\t\t\t\tint fieldCount = ";
  protected final String TEXT_199 = ".getColumnsCountOfCurrentRow();" + NL + "\t\t\t\t\t\tdynamic_column_count_";
  protected final String TEXT_200 = " = ";
  protected final String TEXT_201 = ".getColumnCount();" + NL + "\t\t\t\t\t\tfor (int i = 0; i < dynamic_column_count_";
  protected final String TEXT_202 = " ; i++) {" + NL + "\t\t\t\t\t\t\tif ((";
  protected final String TEXT_203 = "+i) < fieldCount){" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_204 = ".addColumnValue(";
  protected final String TEXT_205 = ".get(";
  protected final String TEXT_206 = "+i)";
  protected final String TEXT_207 = ");" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\telse{" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_208 = ".addColumnValue(\"\");" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_209 = ".";
  protected final String TEXT_210 = "=";
  protected final String TEXT_211 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_212 = NL + "\t\t\t\t\t\ttemp = ";
  protected final String TEXT_213 = ".get(columnIndexWithD_";
  protected final String TEXT_214 = ")";
  protected final String TEXT_215 = ";" + NL + "\t\t\t\t\t\tif(temp.length() > 0) {" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_216 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_217 = ".";
  protected final String TEXT_218 = " = temp.getBytes(";
  protected final String TEXT_219 = ");" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_220 = NL + "                                ";
  protected final String TEXT_221 = ".";
  protected final String TEXT_222 = " = ParserUtils.parseTo_List(temp, ";
  protected final String TEXT_223 = ");";
  protected final String TEXT_224 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_225 = ".";
  protected final String TEXT_226 = " = ParserUtils.parseTo_Date(temp, ";
  protected final String TEXT_227 = ", false);" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_228 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_229 = ".";
  protected final String TEXT_230 = " = ParserUtils.parseTo_Date(temp, ";
  protected final String TEXT_231 = ");" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_232 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_233 = ".";
  protected final String TEXT_234 = " = ParserUtils.parseTo_";
  protected final String TEXT_235 = "(ParserUtils.parseTo_Number(temp, ";
  protected final String TEXT_236 = ", ";
  protected final String TEXT_237 = "));" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_238 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_239 = ".";
  protected final String TEXT_240 = " = ParserUtils.parseTo_";
  protected final String TEXT_241 = "(temp);" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_242 = NL + "\t\t\t\t\t\t} else {\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_243 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_244 = NL + "\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_245 = " - Value is empty for column : '";
  protected final String TEXT_246 = "' in '";
  protected final String TEXT_247 = "' connection, value is invalid or this column should be nullable or have a default value.\");" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_248 = NL + "\t\t\t\t\t\t\t\tthrow new RuntimeException(\"Value is empty for column : '";
  protected final String TEXT_249 = "' in '";
  protected final String TEXT_250 = "' connection, value is invalid or this column should be nullable or have a default value.\");" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_251 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_252 = ".";
  protected final String TEXT_253 = " = ";
  protected final String TEXT_254 = ";" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_255 = NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_256 = NL + "\t\t\t\t\t";
  protected final String TEXT_257 = NL + "\t\t               \tlog4jSb_";
  protected final String TEXT_258 = ".append(";
  protected final String TEXT_259 = ".";
  protected final String TEXT_260 = ");" + NL + "\t\t\t               if(columnIndexWithD_";
  protected final String TEXT_261 = " < ";
  protected final String TEXT_262 = "-1){" + NL + "\t\t\t               \tlog4jSb_";
  protected final String TEXT_263 = ".append(\"|\");" + NL + "\t\t\t               }" + NL + "\t\t\t\t\t";
  protected final String TEXT_264 = NL + "\t\t\t\t";
  protected final String TEXT_265 = NL + "\t\t\t\t";
  protected final String TEXT_266 = NL + "\t\t\t\t \tint filedsum = ";
  protected final String TEXT_267 = ".getColumnsCountOfCurrentRow();" + NL + "\t\t\t\t \tif(filedsum < (";
  protected final String TEXT_268 = " ";
  protected final String TEXT_269 = "+ dynamic_column_count_";
  protected final String TEXT_270 = " -1";
  protected final String TEXT_271 = ")){" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_272 = NL + "\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_273 = " - Column(s) missing\");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_274 = NL + "\t\t\t\t\t \tthrow new RuntimeException(\"Column(s) missing\");" + NL + "\t\t\t\t\t } else if(filedsum > (";
  protected final String TEXT_275 = " ";
  protected final String TEXT_276 = "+ dynamic_column_count_";
  protected final String TEXT_277 = " -1";
  protected final String TEXT_278 = ")) {" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_279 = NL + "\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_280 = " - Too many columns\");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_281 = NL + "\t\t\t\t\t \tthrow new RuntimeException(\"Too many columns\");" + NL + "\t\t\t\t\t }     " + NL + "\t\t\t\t";
  protected final String TEXT_282 = NL + "    \t\t\t\t";
  protected final String TEXT_283 = ".";
  protected final String TEXT_284 = " = ";
  protected final String TEXT_285 = ".";
  protected final String TEXT_286 = ";" + NL + "\t\t\t\t";
  protected final String TEXT_287 = NL + "\t\t\t";
  protected final String TEXT_288 = NL + "\t\t\t\t\t\t\tboolean isFirstCheckDyn_";
  protected final String TEXT_289 = " = true;" + NL + "\t\t\t\t\t\t\troutines.system.Dynamic dynamic_";
  protected final String TEXT_290 = " = new routines.system.Dynamic();" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_291 = NL + "\t\t\t\tint nb_line_";
  protected final String TEXT_292 = " = 0;" + NL + "\t\t\t\torg.talend.fileprocess.FileInputDelimited fid_";
  protected final String TEXT_293 = " = null;" + NL + "\t\t\t\ttry{" + NL + "\t\t\t\t\t";
  protected final String TEXT_294 = NL + "\t\t\t\t\t\tObject filename_";
  protected final String TEXT_295 = " = ";
  protected final String TEXT_296 = ";\t" + NL + "\t\t\t\t\t\tjava.util.zip.ZipInputStream zis_";
  protected final String TEXT_297 = " = null;" + NL + "\t\t\t\t\t\ttry {" + NL + "\t\t\t\t\t\t\tif(filename_";
  protected final String TEXT_298 = " instanceof java.io.InputStream){" + NL + "\t\t\t\t\t\t\t\tzis_";
  protected final String TEXT_299 = " = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_";
  protected final String TEXT_300 = "));" + NL + "\t\t\t\t\t\t\t}else{" + NL + "\t\t\t\t\t\t\t\tzis_";
  protected final String TEXT_301 = " = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_";
  protected final String TEXT_302 = "))));" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_303 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_304 = NL + "\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_305 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_306 = NL + "\t\t\t\t\t\t\t\tthrow e;" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_307 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_308 = NL + "\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_309 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_310 = NL + "\t\t\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_311 = NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\tjava.util.zip.ZipEntry entry_";
  protected final String TEXT_312 = " = null;" + NL + "\t\t" + NL + "\t\t\t\t\t\twhile (true) {" + NL + "\t\t\t\t\t\t\ttry {" + NL + "\t\t\t\t\t\t\t\tentry_";
  protected final String TEXT_313 = " = zis_";
  protected final String TEXT_314 = ".getNextEntry();" + NL + "\t\t\t\t\t\t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_315 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_316 = NL + "\t\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_317 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_318 = NL + "\t\t\t\t\t\t\t\t\tthrow e;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_319 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_320 = NL + "\t\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_321 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_322 = NL + "\t\t\t\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_323 = NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\tif(entry_";
  protected final String TEXT_324 = " == null) {" + NL + "\t\t\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\tif(entry_";
  protected final String TEXT_325 = ".isDirectory()){ //directory" + NL + "\t\t\t\t\t\t\t\tcontinue;" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\ttry {" + NL + "\t\t\t\t\t\t\t\tfid_";
  protected final String TEXT_326 = " = new org.talend.fileprocess.FileInputDelimited(zis_";
  protected final String TEXT_327 = ", ";
  protected final String TEXT_328 = ",";
  protected final String TEXT_329 = ",";
  protected final String TEXT_330 = ",";
  protected final String TEXT_331 = ",";
  protected final String TEXT_332 = ",";
  protected final String TEXT_333 = ",";
  protected final String TEXT_334 = ",";
  protected final String TEXT_335 = ", ";
  protected final String TEXT_336 = ");" + NL + "\t\t\t\t\t\t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_337 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_338 = NL + "\t\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_339 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_340 = NL + "\t\t\t\t\t\t\t\t\tthrow e;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_341 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_342 = NL + "\t\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_343 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_344 = NL + "\t\t\t\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_345 = NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_346 = NL + "\t\t\t\t\t\tObject filename_";
  protected final String TEXT_347 = " = ";
  protected final String TEXT_348 = ";" + NL + "\t\t\t\t\t\tif(filename_";
  protected final String TEXT_349 = " instanceof java.io.InputStream){" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_350 = NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\ttry {" + NL + "\t\t\t\t\t\t\tfid_";
  protected final String TEXT_351 = " = new org.talend.fileprocess.FileInputDelimited(";
  protected final String TEXT_352 = ", ";
  protected final String TEXT_353 = ",";
  protected final String TEXT_354 = ",";
  protected final String TEXT_355 = ",";
  protected final String TEXT_356 = ",";
  protected final String TEXT_357 = ",";
  protected final String TEXT_358 = ",";
  protected final String TEXT_359 = ",";
  protected final String TEXT_360 = ", ";
  protected final String TEXT_361 = ");" + NL + "\t\t\t\t\t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_362 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_363 = NL + "\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_364 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_365 = NL + "\t\t\t\t\t\t\t\tthrow e;" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_366 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_367 = NL + "\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_368 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_369 = NL + "\t\t\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_370 = NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_371 = NL + "\t\t\t\t    ";
  protected final String TEXT_372 = NL + "\t\t\t\t\t\tStringBuffer log4jSb_";
  protected final String TEXT_373 = " = new StringBuffer();" + NL + "\t\t\t\t    \tlog.info(\"";
  protected final String TEXT_374 = " - Retrieving records from the datasource.\");" + NL + "\t\t\t\t    ";
  protected final String TEXT_375 = NL + "\t\t\t\t\twhile (fid_";
  protected final String TEXT_376 = "!=null && fid_";
  protected final String TEXT_377 = ".nextRecord()) {" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_378 = NL + "\t\t\t    \t\t\t\t\t\t";
  protected final String TEXT_379 = " = null;\t\t\t" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_380 = "\t\t\t" + NL + "\t\t\t\t\t\t\t\t\tboolean whetherReject_";
  protected final String TEXT_381 = " = false;" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_382 = " = new ";
  protected final String TEXT_383 = "Struct();" + NL + "\t\t\t\t\t\t\t\t\ttry {" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_384 = " " + NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_385 = " = null; " + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_386 = NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t    \t\t\t\t\t} catch (java.lang.Exception e) {" + NL + "\t\t\t        \t\t\t\t\twhetherReject_";
  protected final String TEXT_387 = " = true;" + NL + "\t\t\t        \t\t\t\t\t";
  protected final String TEXT_388 = NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_389 = NL + "\t\t\t\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_390 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_391 = NL + "\t\t\t            \t\t\t\t\tthrow(e);" + NL + "\t\t\t            \t\t\t\t";
  protected final String TEXT_392 = NL + "\t\t\t\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_393 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_394 = "                    " + NL + "\t\t\t                    \t\t\t\t";
  protected final String TEXT_395 = " = new ";
  protected final String TEXT_396 = "Struct();" + NL + "\t\t\t\t                \t\t\t\t";
  protected final String TEXT_397 = NL + "\t\t\t\t                \t\t\t\t";
  protected final String TEXT_398 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_399 = ";" + NL + "\t\t\t                \t\t\t\t\t";
  protected final String TEXT_400 = " = null;" + NL + "\t\t\t                \t\t\t\t";
  protected final String TEXT_401 = NL + "\t\t\t                \t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t                \t\t\t\t\t";
  protected final String TEXT_402 = " = null;" + NL + "\t\t\t                \t\t\t\t";
  protected final String TEXT_403 = NL + "\t\t\t            \t\t\t\t\t\t";
  protected final String TEXT_404 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_405 = ";" + NL + "\t\t\t            \t\t\t\t\t";
  protected final String TEXT_406 = NL + "\t\t\t    \t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_407 = NL + "\t\t\t\t\t\t\t\t\t\t\tif(!whetherReject_";
  protected final String TEXT_408 = ") { " + NL + "\t\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_409 = "      " + NL + "\t\t\t             \t\t\t\tif(";
  protected final String TEXT_410 = " == null){ " + NL + "\t\t\t            \t \t\t\t\t";
  protected final String TEXT_411 = " = new ";
  protected final String TEXT_412 = "Struct();" + NL + "\t\t\t             \t\t\t\t}\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_413 = " " + NL + "\t\t\t\t\t\t\t\t\t} " + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_414 = NL + "\t\t\tlog.debug(\"";
  protected final String TEXT_415 = " - Retrieving the record \" + fid_";
  protected final String TEXT_416 = ".getRowNumber() + \".\");" + NL + "\t\t\tlog.trace(\"";
  protected final String TEXT_417 = " - Content of the record \" + fid_";
  protected final String TEXT_418 = ".getRowNumber() + \": \" + log4jSb_";
  protected final String TEXT_419 = ");" + NL + "\t\t\tlog4jSb_";
  protected final String TEXT_420 = ".delete(0,log4jSb_";
  protected final String TEXT_421 = ".length());" + NL + "\t\t";
  protected final String TEXT_422 = "\t\t\t\t" + NL + "\t                int dynamic_column_count_";
  protected final String TEXT_423 = "=";
  protected final String TEXT_424 = ".getColumnCount()";
  protected final String TEXT_425 = "1";
  protected final String TEXT_426 = ";" + NL + "\t\t\t\t";
  protected final String TEXT_427 = NL + "\t\t\t\tchar fieldSeparator_";
  protected final String TEXT_428 = "_ListType[] = null;" + NL + "\t\t\t\t//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get(\"fs\")'. " + NL + "\t\t\t\tif ( ((String)";
  protected final String TEXT_429 = ").length() > 0 ){" + NL + "\t\t\t\t\tfieldSeparator_";
  protected final String TEXT_430 = "_ListType = ((String)";
  protected final String TEXT_431 = ").toCharArray();" + NL + "\t\t\t\t}else {\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_432 = NL + "\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_433 = " - Field Separator must be assigned a char.\" );" + NL + "\t\t\t\t\t";
  protected final String TEXT_434 = "\t\t" + NL + "\t\t\t\t\tthrow new IllegalArgumentException(\"Field Separator must be assigned a char.\"); " + NL + "\t\t\t\t}" + NL + "\t\t\t\tif(";
  protected final String TEXT_435 = ".length == 1 && (\"\\015\").equals(";
  protected final String TEXT_436 = "[0])){//empty line when row separator is '\\n'" + NL + "\t\t\t\t\t";
  protected final String TEXT_437 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_438 = ".";
  protected final String TEXT_439 = " = ";
  protected final String TEXT_440 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_441 = NL + "\t\t\t\t}else{" + NL + "\t\t\t\t\t";
  protected final String TEXT_442 = NL + "\t\t\t\t\tfor(int i_";
  protected final String TEXT_443 = "=0;i_";
  protected final String TEXT_444 = "<";
  protected final String TEXT_445 = ".length;i_";
  protected final String TEXT_446 = "++){" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_447 = "[i_";
  protected final String TEXT_448 = "]=";
  protected final String TEXT_449 = "[i_";
  protected final String TEXT_450 = "].trim();" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_451 = NL + "\t\t\t\t\t\tString temp = \"\";" + NL + "\t\t\t\t\t";
  protected final String TEXT_452 = NL + "\t                int columnIndexWithD_";
  protected final String TEXT_453 = " = 0; //Column Index " + NL + "\t                ";
  protected final String TEXT_454 = NL + "\t\t\t\t\t\tcolumnIndexWithD_";
  protected final String TEXT_455 = " = ";
  protected final String TEXT_456 = " + dynamic_column_count_";
  protected final String TEXT_457 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_458 = NL + "\t\t\t\t\t\tcolumnIndexWithD_";
  protected final String TEXT_459 = " = ";
  protected final String TEXT_460 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_461 = NL + "\t\t\t\t\t\tif(columnIndexWithD_";
  protected final String TEXT_462 = " < ";
  protected final String TEXT_463 = ".length){" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_464 = "\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_465 = "[columnIndexWithD_";
  protected final String TEXT_466 = "]=";
  protected final String TEXT_467 = "[columnIndexWithD_";
  protected final String TEXT_468 = "].trim();\t\t\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_469 = NL + "\t\t\t\t\t\t\t\t\ttemp = ";
  protected final String TEXT_470 = "[columnIndexWithD_";
  protected final String TEXT_471 = "];" + NL + "\t\t\t\t\t\t\t\t\tif(temp.length() > 0){" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_472 = ".";
  protected final String TEXT_473 = " = temp;" + NL + "\t\t\t\t\t\t\t\t\t}else{" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_474 = ".";
  protected final String TEXT_475 = " = ";
  protected final String TEXT_476 = ";" + NL + "\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_477 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_478 = ".";
  protected final String TEXT_479 = " = ";
  protected final String TEXT_480 = "[columnIndexWithD_";
  protected final String TEXT_481 = "];" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_482 = NL + "\t\t\t\t\t\t\t\tif(";
  protected final String TEXT_483 = "[columnIndexWithD_";
  protected final String TEXT_484 = "].length() > 0) {" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_485 = NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_486 = ".";
  protected final String TEXT_487 = " = ParserUtils.parseTo_Date(";
  protected final String TEXT_488 = "[columnIndexWithD_";
  protected final String TEXT_489 = "], ";
  protected final String TEXT_490 = ", false);" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_491 = NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_492 = ".";
  protected final String TEXT_493 = " = ParserUtils.parseTo_Date(";
  protected final String TEXT_494 = "[columnIndexWithD_";
  protected final String TEXT_495 = "], ";
  protected final String TEXT_496 = ");" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_497 = NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_498 = ".";
  protected final String TEXT_499 = " = ParserUtils.parseTo_";
  protected final String TEXT_500 = "(ParserUtils.parseTo_Number(";
  protected final String TEXT_501 = "[columnIndexWithD_";
  protected final String TEXT_502 = "], ";
  protected final String TEXT_503 = ", ";
  protected final String TEXT_504 = "));" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_505 = "\t\t\t\t\t\t\t" + NL + "\t\t    \t\t\t\t\t\t\t";
  protected final String TEXT_506 = ".";
  protected final String TEXT_507 = " = ";
  protected final String TEXT_508 = "[columnIndexWithD_";
  protected final String TEXT_509 = "].getBytes(";
  protected final String TEXT_510 = ");" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_511 = "                          ";
  protected final String TEXT_512 = NL + "                                        ";
  protected final String TEXT_513 = ".";
  protected final String TEXT_514 = " = ParserUtils.parseTo_List(";
  protected final String TEXT_515 = "[columnIndexWithD_";
  protected final String TEXT_516 = "],String.valueOf(fieldSeparator_";
  protected final String TEXT_517 = "_ListType[0]));";
  protected final String TEXT_518 = NL + "\t\t\t\t\t\t\t\t\t    dynamic_column_count_";
  protected final String TEXT_519 = " = ";
  protected final String TEXT_520 = ".getColumnCount();" + NL + "\t\t\t\t\t\t\t\t\t\tfor (int i = 0; i < dynamic_column_count_";
  protected final String TEXT_521 = "; i++) {" + NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_522 = ".clearColumnValues();" + NL + "\t\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t\t\tint fieldCount = ";
  protected final String TEXT_523 = ".length;\t" + NL + "\t\t\t\t\t\t\t\t\t\tfor (int i = 0; i < dynamic_column_count_";
  protected final String TEXT_524 = "; i++) {" + NL + "\t\t\t\t\t\t\t\t\t\t\tif ((";
  protected final String TEXT_525 = "+i) < fieldCount)" + NL + "\t\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_526 = ".addColumnValue(";
  protected final String TEXT_527 = "[";
  protected final String TEXT_528 = "+i]);" + NL + "\t\t\t\t\t\t\t\t\t\t\telse" + NL + "\t\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_529 = ".addColumnValue(\"\");" + NL + "\t\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_530 = ".";
  protected final String TEXT_531 = " = ";
  protected final String TEXT_532 = ";" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_533 = NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_534 = ".";
  protected final String TEXT_535 = " = ParserUtils.parseTo_";
  protected final String TEXT_536 = "(";
  protected final String TEXT_537 = "[columnIndexWithD_";
  protected final String TEXT_538 = "]);" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_539 = "\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t}else{" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_540 = ".";
  protected final String TEXT_541 = " = ";
  protected final String TEXT_542 = ";" + NL + "\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_543 = "\t" + NL + "\t\t\t\t\t\t}else{" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_544 = ".";
  protected final String TEXT_545 = " = ";
  protected final String TEXT_546 = ";" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_547 = NL + "\t\t                \tlog4jSb_";
  protected final String TEXT_548 = ".append(";
  protected final String TEXT_549 = ".";
  protected final String TEXT_550 = ");" + NL + "\t\t\t                if(columnIndexWithD_";
  protected final String TEXT_551 = "< ";
  protected final String TEXT_552 = "-1){" + NL + "\t\t\t                \tlog4jSb_";
  protected final String TEXT_553 = ".append(\"|\");" + NL + "\t\t\t                }" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_554 = NL + "\t\t\t\t\t";
  protected final String TEXT_555 = NL + "\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_556 = NL + " \t\t\t\t\tint filedsum = ";
  protected final String TEXT_557 = ".length;" + NL + " \t\t\t\t\tif(filedsum < (";
  protected final String TEXT_558 = " ";
  protected final String TEXT_559 = "+ dynamic_column_count_";
  protected final String TEXT_560 = "-1";
  protected final String TEXT_561 = ")){" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_562 = NL + "\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_563 = " - Column(s) missing\" );" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_564 = NL + " \t\t\t\t\t\tthrow new java.lang.Exception(\"Column(s) missing\");" + NL + " \t\t\t\t\t} else if(filedsum > (";
  protected final String TEXT_565 = " ";
  protected final String TEXT_566 = "+ dynamic_column_count_";
  protected final String TEXT_567 = " -1";
  protected final String TEXT_568 = ")) {" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_569 = NL + "\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_570 = " - Too many columns\" );" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_571 = NL + " \t\t\t\t\t\tthrow new RuntimeException(\"Too many columns\");" + NL + " \t\t\t\t\t}     " + NL + "\t\t\t\t";
  protected final String TEXT_572 = NL + "    \t\t\t\t";
  protected final String TEXT_573 = ".";
  protected final String TEXT_574 = " = ";
  protected final String TEXT_575 = ".";
  protected final String TEXT_576 = ";" + NL + "\t\t\t\t";
  protected final String TEXT_577 = NL + "\t\t\t";
  protected final String TEXT_578 = NL + "\t\t\t\t\t\t\tboolean isFirstCheckDyn_";
  protected final String TEXT_579 = " = true;" + NL + "\t\t\t\t\t\t\troutines.system.Dynamic dynamic_";
  protected final String TEXT_580 = " = new routines.system.Dynamic();" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_581 = NL + "\t\t\t\tint nb_line_";
  protected final String TEXT_582 = " = 0;" + NL + "\t\t\t\tint footer_";
  protected final String TEXT_583 = " = ";
  protected final String TEXT_584 = ";" + NL + "\t\t\t\tint totalLine";
  protected final String TEXT_585 = " = 0;" + NL + "\t\t\t\tint limit";
  protected final String TEXT_586 = " = ";
  protected final String TEXT_587 = ";" + NL + "\t\t\t\tint lastLine";
  protected final String TEXT_588 = " = -1;\t" + NL + "\t\t\t\t" + NL + "\t\t\t\tchar fieldSeparator_";
  protected final String TEXT_589 = "[] = null;" + NL + "\t\t\t\t" + NL + "\t\t\t\t//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get(\"fs\")'. " + NL + "\t\t\t\tif ( ((String)";
  protected final String TEXT_590 = ").length() > 0 ){" + NL + "\t\t\t\t\tfieldSeparator_";
  protected final String TEXT_591 = " = ((String)";
  protected final String TEXT_592 = ").toCharArray();" + NL + "\t\t\t\t}else {\t\t\t" + NL + "\t\t\t\t";
  protected final String TEXT_593 = NL + "\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_594 = " - Field Separator must be assigned a char.\" );" + NL + "\t\t\t\t";
  protected final String TEXT_595 = "\t\t" + NL + "\t\t\t\t\tthrow new IllegalArgumentException(\"Field Separator must be assigned a char.\"); " + NL + "\t\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t\tchar rowSeparator_";
  protected final String TEXT_596 = "[] = null;" + NL + "\t\t\t" + NL + "\t\t\t\t//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get(\"rs\")'. " + NL + "\t\t\t\tif ( ((String)";
  protected final String TEXT_597 = ").length() > 0 ){" + NL + "\t\t\t\t\trowSeparator_";
  protected final String TEXT_598 = " = ((String)";
  protected final String TEXT_599 = ").toCharArray();" + NL + "\t\t\t\t}else {" + NL + "\t\t\t\t\t";
  protected final String TEXT_600 = NL + "\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_601 = " - Row Separator must be assigned a char.\" );" + NL + "\t\t\t\t\t";
  protected final String TEXT_602 = NL + "\t\t\t\t\tthrow new IllegalArgumentException(\"Row Separator must be assigned a char.\"); " + NL + "\t\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t\tObject filename_";
  protected final String TEXT_603 = " = ";
  protected final String TEXT_604 = ";\t\t" + NL + "\t\t\t\tcom.talend.csv.CSVReader csvReader";
  protected final String TEXT_605 = " = null;" + NL + "\t" + NL + "\t\t\t\ttry{" + NL + "\t\t\t\t\t";
  protected final String TEXT_606 = NL + "\t        \t\t\tjava.util.zip.ZipInputStream zis_";
  protected final String TEXT_607 = " = null;" + NL + "\t        \t\t\ttry {" + NL + "\t\t        \t\t\tif(filename_";
  protected final String TEXT_608 = " instanceof java.io.InputStream){" + NL + "\t\t        \t\t\t\tzis_";
  protected final String TEXT_609 = " = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_";
  protected final String TEXT_610 = "));" + NL + "\t\t        \t\t\t}else{" + NL + "\t\t        \t\t\t\tzis_";
  protected final String TEXT_611 = " = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_";
  protected final String TEXT_612 = "))));" + NL + "\t\t        \t\t\t}" + NL + "\t        \t\t\t} catch(java.lang.Exception e) {" + NL + "\t        \t\t\t\t";
  protected final String TEXT_613 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_614 = NL + "\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_615 = " - \" + e.getMessage());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_616 = NL + "\t\t\t\t\t\t\t\tthrow e;" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_617 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_618 = NL + "\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_619 = " - \" + e.getMessage());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_620 = NL + "\t\t\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_621 = NL + "\t        \t\t\t}" + NL + "\t        \t\t\tjava.util.zip.ZipEntry entry_";
  protected final String TEXT_622 = " = null;" + NL + "\t\t        " + NL + "\t\t\t\t        while (true) {" + NL + "\t\t\t        \t\ttry {" + NL + "\t        \t\t\t\t\tentry_";
  protected final String TEXT_623 = " = zis_";
  protected final String TEXT_624 = ".getNextEntry();" + NL + "\t        \t\t\t\t} catch(java.lang.Exception e) {" + NL + "\t        \t\t\t\t\t";
  protected final String TEXT_625 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_626 = NL + "\t\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_627 = " - \" + e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_628 = NL + "\t\t\t\t\t\t\t\t\tthrow e;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_629 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_630 = NL + "\t\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_631 = " - \" + e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_632 = NL + "\t\t\t\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_633 = NL + "\t        \t\t\t\t}" + NL + "\t        \t\t\t\tif(entry_";
  protected final String TEXT_634 = " == null) {" + NL + "\t\t\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t\t\t}" + NL + "\t        \t\t\t\tif(entry_";
  protected final String TEXT_635 = ".isDirectory()){ //directory" + NL + "\t        \t\t\t\t\tcontinue;" + NL + "\t        \t\t\t\t}" + NL + "\t        \t\t\t\tString[] row";
  protected final String TEXT_636 = "=null;" + NL + "\t        \t\t\t\tint currentLine";
  protected final String TEXT_637 = " = 0;" + NL + "\t        \t\t\t\tint outputLine";
  protected final String TEXT_638 = " = 0;" + NL + "\t        \t\t\t\ttry {//TD110 begin" + NL + "\t        \t\t\t\t\tcsvReader";
  protected final String TEXT_639 = "=new com.talend.csv.CSVReader(zis_";
  protected final String TEXT_640 = ", fieldSeparator_";
  protected final String TEXT_641 = "[0], ";
  protected final String TEXT_642 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_643 = NL + "\t\t\t\t\t\tString[] row";
  protected final String TEXT_644 = "=null;" + NL + "\t\t\t\t\t\tint currentLine";
  protected final String TEXT_645 = " = 0;" + NL + "\t        \t\t\tint outputLine";
  protected final String TEXT_646 = " = 0;" + NL + "\t\t\t\t\t\ttry {//TD110 begin" + NL + "\t\t\t\t\t\t\tif(filename_";
  protected final String TEXT_647 = " instanceof java.io.InputStream){" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_648 = NL + "\t\t\t\t\t\t\t\tcsvReader";
  protected final String TEXT_649 = "=new com.talend.csv.CSVReader((java.io.InputStream)filename_";
  protected final String TEXT_650 = ", fieldSeparator_";
  protected final String TEXT_651 = "[0], ";
  protected final String TEXT_652 = ");" + NL + "\t\t\t\t\t\t\t}else{" + NL + "\t\t\t\t\t\t\t\tcsvReader";
  protected final String TEXT_653 = "=new com.talend.csv.CSVReader(new java.io.BufferedReader(new java.io.InputStreamReader(" + NL + "\t\t                \t\tnew java.io.FileInputStream(String.valueOf(filename_";
  protected final String TEXT_654 = ")),";
  protected final String TEXT_655 = ")), fieldSeparator_";
  protected final String TEXT_656 = "[0]);" + NL + "\t\t        \t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_657 = NL + "\t\t\t\t\t" + NL + "\t\t\t\t\tcsvReader";
  protected final String TEXT_658 = ".setTrimWhitespace(false);" + NL + "\t\t\t\t\tif ( (rowSeparator_";
  protected final String TEXT_659 = "[0] != '\\n') && (rowSeparator_";
  protected final String TEXT_660 = "[0] != '\\r') )" + NL + "\t        \t\t\tcsvReader";
  protected final String TEXT_661 = ".setLineEnd(\"\"+rowSeparator_";
  protected final String TEXT_662 = "[0]);" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_663 = NL + "\t        \t\t\t\tcsvReader";
  protected final String TEXT_664 = ".setQuoteChar('";
  protected final String TEXT_665 = "');" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_666 = NL + "\t\t\t\t\t\t\tString textEnclosure1_";
  protected final String TEXT_667 = " = ";
  protected final String TEXT_668 = "; " + NL + "\t\t\t\t\t\t\tchar textEnclosure_";
  protected final String TEXT_669 = "[] = null;" + NL + "\t\t\t        " + NL + "\t    \t\t\t\t    if(((String)textEnclosure1_";
  protected final String TEXT_670 = ").length() > 0 ){ " + NL + "\t  \t\t\t\t\t\t\ttextEnclosure_";
  protected final String TEXT_671 = " = ((String)textEnclosure1_";
  protected final String TEXT_672 = ").toCharArray(); " + NL + "\t\t\t\t\t\t\t}else { " + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_673 = NL + "\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_674 = " - Text Enclosure must be assigned a char.\"); " + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_675 = NL + "\t            \t\t\t\tthrow new IllegalArgumentException(\"Text Enclosure must be assigned a char.\"); " + NL + "\t        \t\t\t\t}" + NL + "\t\t\t\t\t\t\tcsvReader";
  protected final String TEXT_676 = ".setQuoteChar(textEnclosure_";
  protected final String TEXT_677 = "[0]); " + NL + "\t\t\t\t\t\t";
  protected final String TEXT_678 = NL + "\t            \t\t\t\tcsvReader";
  protected final String TEXT_679 = ".setEscapeChar('\\\\');" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_680 = NL + "\t            \t\t\t\tcsvReader";
  protected final String TEXT_681 = ".setEscapeChar(csvReader";
  protected final String TEXT_682 = ".getQuoteChar());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_683 = NL + "\t            \t\t\t\t//?????doesn't work for other escapeChar" + NL + "\t            \t\t\t\t//the default escape mode is double escape" + NL + "\t            \t\t\t\tcsvReader";
  protected final String TEXT_684 = ".setEscapeChar(csvReader";
  protected final String TEXT_685 = ".getQuoteChar());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_686 = " " + NL + "\t\t        \t\t\tString escapeChar1_";
  protected final String TEXT_687 = " = ";
  protected final String TEXT_688 = ";          " + NL + "\t\t        \t\t\tchar escapeChar_";
  protected final String TEXT_689 = "[] = null;" + NL + "\t\t\t        " + NL + "\t\t\t\t\t        if(((String)escapeChar1_";
  protected final String TEXT_690 = ").length() > 0 ){ " + NL + "\t\t\t\t\t        \tescapeChar_";
  protected final String TEXT_691 = " = ((String)escapeChar1_";
  protected final String TEXT_692 = ").toCharArray(); " + NL + "\t\t\t\t\t  \t\t}else { " + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_693 = NL + "\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_694 = " - Escape Char must be assigned a char.\"); " + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_695 = NL + "\t\t        \t\t\t    throw new IllegalArgumentException(\"Escape Char must be assigned a char.\"); " + NL + "\t\t        \t\t\t}" + NL + "\t\t       \t\t\t\tif(escapeChar_";
  protected final String TEXT_696 = "[0] == '\\\\'){" + NL + "\t\t       \t\t\t\t\tcsvReader";
  protected final String TEXT_697 = ".setEscapeChar('\\\\');" + NL + "\t\t       \t\t\t\t}else if(escapeChar_";
  protected final String TEXT_698 = "[0] ==";
  protected final String TEXT_699 = "'";
  protected final String TEXT_700 = "'";
  protected final String TEXT_701 = "textEnclosure_";
  protected final String TEXT_702 = "[0]";
  protected final String TEXT_703 = "){" + NL + "\t\t       \t\t\t\t\tcsvReader";
  protected final String TEXT_704 = ".setEscapeChar(csvReader";
  protected final String TEXT_705 = ".getQuoteChar());" + NL + "\t\t       \t\t\t\t} else {" + NL + "\t\t       \t\t\t\t\t//the default escape mode is double escape" + NL + "\t\t       \t\t\t\t\tcsvReader";
  protected final String TEXT_706 = ".setEscapeChar(csvReader";
  protected final String TEXT_707 = ".getQuoteChar());" + NL + "\t\t       \t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_708 = "      " + NL + "\t\t" + NL + "\t\t\t" + NL + "\t\t\t\t\t\tif(footer_";
  protected final String TEXT_709 = " > 0){" + NL + "\t\t\t\t\t\tfor(totalLine";
  protected final String TEXT_710 = "=0;totalLine";
  protected final String TEXT_711 = " < ";
  protected final String TEXT_712 = "; totalLine";
  protected final String TEXT_713 = "++){" + NL + "\t\t\t\t\t\t\tcsvReader";
  protected final String TEXT_714 = ".readNext();" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\tcsvReader";
  protected final String TEXT_715 = ".setSkipEmptyRecords(";
  protected final String TEXT_716 = ");" + NL + "\t\t\t            while (csvReader";
  protected final String TEXT_717 = ".readNext()) {" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_718 = NL + "\t\t\t\t\t\t\t\trow";
  protected final String TEXT_719 = "=csvReader";
  protected final String TEXT_720 = ".getValues();" + NL + "\t\t\t\t\t\t\t\tif(!(row";
  protected final String TEXT_721 = ".length == 1 && (\"\\015\").equals(row";
  protected final String TEXT_722 = "[0]))){//empty line when row separator is '\\n'" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_723 = NL + "\t                " + NL + "\t                \t\ttotalLine";
  protected final String TEXT_724 = "++;" + NL + "\t                " + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_725 = NL + "\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_726 = NL + "\t                " + NL + "\t\t\t            }" + NL + "\t            \t\tint lastLineTemp";
  protected final String TEXT_727 = " = totalLine";
  protected final String TEXT_728 = " - footer_";
  protected final String TEXT_729 = "   < 0? 0 : totalLine";
  protected final String TEXT_730 = " - footer_";
  protected final String TEXT_731 = " ;" + NL + "\t            \t\tif(lastLine";
  protected final String TEXT_732 = " > 0){" + NL + "\t                \t\tlastLine";
  protected final String TEXT_733 = " = lastLine";
  protected final String TEXT_734 = " < lastLineTemp";
  protected final String TEXT_735 = " ? lastLine";
  protected final String TEXT_736 = " : lastLineTemp";
  protected final String TEXT_737 = "; " + NL + "\t            \t\t}else {" + NL + "\t                \t\tlastLine";
  protected final String TEXT_738 = " = lastLineTemp";
  protected final String TEXT_739 = ";" + NL + "\t            \t\t}" + NL + "\t         " + NL + "\t\t\t          \tcsvReader";
  protected final String TEXT_740 = ".close();" + NL + "\t\t\t\t        if(filename_";
  protected final String TEXT_741 = " instanceof java.io.InputStream){" + NL + "\t\t\t\t \t\t\tcsvReader";
  protected final String TEXT_742 = "=new com.talend.csv.CSVReader((java.io.InputStream)filename_";
  protected final String TEXT_743 = ", fieldSeparator_";
  protected final String TEXT_744 = "[0], ";
  protected final String TEXT_745 = ");" + NL + "\t\t        \t\t}else{" + NL + "\t\t\t\t \t\t\tcsvReader";
  protected final String TEXT_746 = "=new com.talend.csv.CSVReader(new java.io.BufferedReader(new java.io.InputStreamReader(" + NL + "\t\t\t\t          \tnew java.io.FileInputStream(String.valueOf(filename_";
  protected final String TEXT_747 = ")),";
  protected final String TEXT_748 = ")), fieldSeparator_";
  protected final String TEXT_749 = "[0]);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\tcsvReader";
  protected final String TEXT_750 = ".setTrimWhitespace(false);" + NL + "\t\t\t\t\t\tif ( (rowSeparator_";
  protected final String TEXT_751 = "[0] != '\\n') && (rowSeparator_";
  protected final String TEXT_752 = "[0] != '\\r') )\t" + NL + "\t        \t\t\t\tcsvReader";
  protected final String TEXT_753 = ".setLineEnd(\"\"+rowSeparator_";
  protected final String TEXT_754 = "[0]);" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_755 = NL + "\t\t\t\t\t\t\tcsvReader";
  protected final String TEXT_756 = ".setQuoteChar('";
  protected final String TEXT_757 = "');" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_758 = NL + "\t\t\t\t\t\t\tcsvReader";
  protected final String TEXT_759 = ".setQuoteChar(textEnclosure_";
  protected final String TEXT_760 = "[0]);" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_761 = NL + "\t        \t\t\t\tcsvReader";
  protected final String TEXT_762 = ".setEscapeChar('\\\\');" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_763 = NL + "\t        \t\t\t\tcsvReader";
  protected final String TEXT_764 = ".setEscapeChar(csvReader";
  protected final String TEXT_765 = ".getQuoteChar());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_766 = NL + "\t        \t\t\t\t//?????doesn't work for other escapeChar" + NL + "\t        \t\t\t\t//the default escape mode is double escape" + NL + "\t        \t\t\t\tcsvReader";
  protected final String TEXT_767 = ".setEscapeChar(csvReader";
  protected final String TEXT_768 = ".getQuoteChar());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_769 = " " + NL + "\t       \t\t\t\t\tif(escapeChar_";
  protected final String TEXT_770 = "[0] == '\\\\'){" + NL + "\t       \t\t\t\t\t\tcsvReader";
  protected final String TEXT_771 = ".setEscapeChar('\\\\');" + NL + "\t       \t\t\t\t\t}else if(escapeChar_";
  protected final String TEXT_772 = "[0] == ";
  protected final String TEXT_773 = "'";
  protected final String TEXT_774 = "'";
  protected final String TEXT_775 = "textEnclosure_";
  protected final String TEXT_776 = "[0]";
  protected final String TEXT_777 = "){" + NL + "\t       \t\t\t\t\t\tcsvReader";
  protected final String TEXT_778 = ".setEscapeChar(csvReader";
  protected final String TEXT_779 = ".getQuoteChar());" + NL + "\t       \t\t\t\t\t} else {" + NL + "\t       \t\t\t\t\t\t//the default escape mode is double escape" + NL + "\t        \t\t\t\t\tcsvReader";
  protected final String TEXT_780 = ".setEscapeChar(csvReader";
  protected final String TEXT_781 = ".getQuoteChar());" + NL + "\t       \t\t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_782 = "  " + NL + "\t        \t\t}" + NL + "\t        " + NL + "\t\t\t        if(limit";
  protected final String TEXT_783 = " != 0){" + NL + "\t\t\t        \tfor(currentLine";
  protected final String TEXT_784 = "=0;currentLine";
  protected final String TEXT_785 = " < ";
  protected final String TEXT_786 = ";currentLine";
  protected final String TEXT_787 = "++){" + NL + "\t\t\t        \t\tcsvReader";
  protected final String TEXT_788 = ".readNext();" + NL + "\t\t\t        \t}" + NL + "\t\t\t        }" + NL + "\t\t\t        csvReader";
  protected final String TEXT_789 = ".setSkipEmptyRecords(";
  protected final String TEXT_790 = ");" + NL + "\t        " + NL + "\t    \t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_791 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_792 = NL + "\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_793 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_794 = NL + "\t\t\t\t\t\tthrow e;" + NL + "\t\t\t\t\t";
  protected final String TEXT_795 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_796 = NL + "\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_797 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_798 = NL + "\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "\t\t\t\t\t";
  protected final String TEXT_799 = NL + "\t    \t\t}//TD110 end" + NL + "\t        " + NL + "\t\t\t    ";
  protected final String TEXT_800 = NL + "\t\t\t\t\tStringBuffer log4jSb_";
  protected final String TEXT_801 = " = new StringBuffer();" + NL + "\t\t\t    \tlog.info(\"";
  protected final String TEXT_802 = " - Retrieving records from the datasource.\");" + NL + "\t\t\t    ";
  protected final String TEXT_803 = NL + "\t        \twhile ( limit";
  protected final String TEXT_804 = " != 0 && csvReader";
  protected final String TEXT_805 = "!=null && csvReader";
  protected final String TEXT_806 = ".readNext() ) { " + NL + "\t        " + NL + "\t\t        \trow";
  protected final String TEXT_807 = "=csvReader";
  protected final String TEXT_808 = ".getValues();" + NL + "\t        \t" + NL + "\t\t\t\t\t";
  protected final String TEXT_809 = NL + "\t        \t\t\tif(row";
  protected final String TEXT_810 = ".length == 1 && (\"\\015\").equals(row";
  protected final String TEXT_811 = "[0])){//empty line when row separator is '\\n'" + NL + "\t        \t\t\t\tcontinue;" + NL + "\t        \t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_812 = NL + "\t        \t" + NL + "\t        \t" + NL + "\t        \t\tcurrentLine";
  protected final String TEXT_813 = "++;" + NL + "\t            " + NL + "\t\t            if(lastLine";
  protected final String TEXT_814 = " > -1 && currentLine";
  protected final String TEXT_815 = " > lastLine";
  protected final String TEXT_816 = ") {" + NL + "\t\t                break;" + NL + "\t    \t        }" + NL + "\t        \t    outputLine";
  protected final String TEXT_817 = "++;" + NL + "\t            \tif (limit";
  protected final String TEXT_818 = " > 0 && outputLine";
  protected final String TEXT_819 = " > limit";
  protected final String TEXT_820 = ") {" + NL + "\t                \tbreak;" + NL + "\t            \t}  " + NL + "\t                                                                      " + NL + "\t\t\t\t\t";
  protected final String TEXT_821 = NL + "\t    \t\t\t\t\t\t\t";
  protected final String TEXT_822 = " = null;\t\t\t" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_823 = NL + "\t\t\t\t\t\t\t\tboolean whetherReject_";
  protected final String TEXT_824 = " = false;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_825 = " = new ";
  protected final String TEXT_826 = "Struct();" + NL + "\t\t\t\t\t\t\t\ttry {\t\t\t" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_827 = " " + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_828 = " = null; " + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_829 = NL + "\t    \t\t\t\t\t\t} catch (java.lang.Exception e) {" + NL + "\t\t\t\t\t\t\t        whetherReject_";
  protected final String TEXT_830 = " = true;" + NL + "        \t\t\t\t\t\t\t";
  protected final String TEXT_831 = NL + "\t\t\t\t\t\t\t\t        ";
  protected final String TEXT_832 = NL + "\t\t\t\t\t\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_833 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_834 = NL + "            \t\t\t\t\t\t\tthrow(e);" + NL + "            \t\t\t\t\t\t";
  protected final String TEXT_835 = NL + "\t\t\t\t\t\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_836 = " - \" +e.getMessage());" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_837 = NL + "\t\t\t\t\t\t                    ";
  protected final String TEXT_838 = " = new ";
  protected final String TEXT_839 = "Struct();" + NL + "                \t\t\t\t\t\t\t";
  protected final String TEXT_840 = NL + "                \t\t\t\t\t\t\t";
  protected final String TEXT_841 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_842 = ";" + NL + "                \t\t\t\t\t\t\t";
  protected final String TEXT_843 = " = null;" + NL + "                \t\t\t\t\t\t";
  protected final String TEXT_844 = NL + "                \t\t\t\t\t\t\tSystem.err.println(e.getMessage());" + NL + "                \t\t\t\t\t\t\t";
  protected final String TEXT_845 = " = null;" + NL + "                \t\t\t\t\t\t";
  protected final String TEXT_846 = NL + "            \t\t\t\t\t\t\t\t";
  protected final String TEXT_847 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_848 = ";" + NL + "            \t\t\t\t\t\t\t";
  protected final String TEXT_849 = NL + "\t    \t\t\t\t\t\t}" + NL + "\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_850 = NL + "\t\t\t\t\t\t\t\t\t\tif(!whetherReject_";
  protected final String TEXT_851 = ") { " + NL + "\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_852 = "      " + NL + "\t             \t\t\t\t\tif(";
  protected final String TEXT_853 = " == null){ " + NL + "\t            \t \t\t\t\t\t";
  protected final String TEXT_854 = " = new ";
  protected final String TEXT_855 = "Struct();" + NL + "\t             \t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_856 = " " + NL + "\t\t\t\t\t\t\t\t} " + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_857 = NL + "\t\t\tlog.debug(\"";
  protected final String TEXT_858 = " - Retrieving the record \" + (nb_line_";
  protected final String TEXT_859 = "+1) + \".\");" + NL + "\t\t\tlog.trace(\"";
  protected final String TEXT_860 = " - Content of the record \" + (nb_line_";
  protected final String TEXT_861 = "+1) + \": \" + log4jSb_";
  protected final String TEXT_862 = ");" + NL + "\t\t\tlog4jSb_";
  protected final String TEXT_863 = ".delete(0,log4jSb_";
  protected final String TEXT_864 = ".length());" + NL + "\t\t";
  protected final String TEXT_865 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    
	class DefaultRowUtil {
		String cid = "";
		INode node;
		int schemaOptNum;
		int columnListSize;
		boolean isOptimizeCode;
		boolean isBehindDynamic;
	
		boolean useV2C = false;
		IMetadataTable V2CMetadata;
		String V2CTargetConnName;
		String V2CSourceValueClass;
		String V2CSourceValueName;
		
		public void prepareOptimizeParam(IMetadataTable metadata,int schemaOptNum){
			this.schemaOptNum=schemaOptNum;
			this.columnListSize = metadata.getListColumns().size();
			this.isOptimizeCode = schemaOptNum < this.columnListSize;
		}
		
		public void prepareValueToConn(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, int schemaOptNum){
			this.node = node;
			this.V2CMetadata = metadata;
			this.V2CTargetConnName = targetConnName;
			this.V2CSourceValueClass = sourceValueClass;
			this.V2CSourceValueName = sourceValueName;
			this.useV2C = true;
			prepareOptimizeParam(metadata, schemaOptNum);
		}
		
		public void codeForValueToConn(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, int start , int end){
		}
		
		public void callValueToConn(String sourceValueName, String targetConnName){
			if(isOptimizeCode){
		
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(targetConnName);
    stringBuffer.append(TEXT_6);
    
			}else{
				codeForValueToConn(node, V2CMetadata, V2CSourceValueClass, V2CSourceValueName, V2CTargetConnName, 0, columnListSize);
			}
		}
		
		boolean useV2CWithD = false;
		IMetadataTable V2CWithDMetadata;
		String V2CWithDTargetConnName;
		String V2CWithDSourceValueClass;
		String V2CWithDSourceValueName;
		String V2CWithDDynamicName;
		public void prepareValueToConnWithD(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, String dynamicName, int schemaOptNum){
			this.node = node;
			this.V2CWithDMetadata = metadata;
			this.V2CWithDTargetConnName = targetConnName;
			this.V2CWithDSourceValueClass = sourceValueClass;
			this.V2CWithDSourceValueName = sourceValueName;
			this.V2CWithDDynamicName = dynamicName;
			this.useV2CWithD = true;
			prepareOptimizeParam(metadata, schemaOptNum);
		}
		
		public boolean codeForValueToConnWithD(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, String dynamicName ,int start , int end){
			return false;
		}
		
		public void callValueToConnWithD(String sourceValueName, String targetConnName, String dynamicName){
			if(isOptimizeCode){
		
    stringBuffer.append(TEXT_7);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(targetConnName);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_11);
    
			}else{
				codeForValueToConnWithD(node, V2CWithDMetadata, V2CWithDSourceValueClass, V2CWithDSourceValueName, V2CWithDTargetConnName, V2CWithDDynamicName, 0, columnListSize);
			}
		}
		
		IMetadataTable C2CMetadata;
		String C2CTargetConnName;
		String C2CSourceConnName;
		boolean useC2C = false;
		public void prepareConnToConn(IMetadataTable metadata, String sourceConnName, String targetConnName){
			this.C2CMetadata = metadata;
			this.C2CTargetConnName = targetConnName;
			this.C2CSourceConnName = sourceConnName;
			this.useC2C = true;
		}
		
		public void codeForConnToConn(INode node, IMetadataTable metadata, String sourceConnName, String targetConnName, int start ,int end){
		}
		
		public void callConnToConn(String sourceConnName, String targetConnName){
			if(isOptimizeCode){
		
    stringBuffer.append(TEXT_12);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(sourceConnName);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(targetConnName);
    stringBuffer.append(TEXT_15);
    
			}else{
				codeForConnToConn(node, C2CMetadata, C2CSourceConnName, C2CTargetConnName, 0, columnListSize);
			}
		}
		
		
		public void generateClass(){
		  	if(isOptimizeCode){
				cid = node.getUniqueName();
				int methodNum=(columnListSize%schemaOptNum==0?columnListSize/schemaOptNum:(columnListSize/schemaOptNum)+1);
				
    stringBuffer.append(TEXT_16);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_17);
    
				int start=0;
				int end=0;
				for(int i=0;i<methodNum;i++){
					start=i*schemaOptNum;
					if(i==(methodNum-1)){
						end=columnListSize;
					}else{
						end=(i+1)*schemaOptNum;
					}
					if(useV2C){
					
    stringBuffer.append(TEXT_18);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(V2CSourceValueClass);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(V2CSourceValueName);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(V2CTargetConnName);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(V2CTargetConnName);
    stringBuffer.append(TEXT_23);
    codeForValueToConn(node, V2CMetadata, V2CSourceValueClass, V2CSourceValueName, V2CTargetConnName, start, end);
    stringBuffer.append(TEXT_24);
    	
					}
					if(useV2CWithD){
					
    stringBuffer.append(TEXT_25);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(V2CWithDSourceValueClass);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(V2CWithDSourceValueName);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(V2CWithDTargetConnName);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(V2CWithDTargetConnName);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(V2CWithDDynamicName);
    stringBuffer.append(TEXT_31);
    this.isBehindDynamic = codeForValueToConnWithD(node, V2CWithDMetadata, V2CWithDSourceValueClass, V2CWithDSourceValueName, V2CWithDTargetConnName, V2CWithDDynamicName, start, end);
    stringBuffer.append(TEXT_32);
    		
					}
					if(useC2C){
					
    stringBuffer.append(TEXT_33);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(C2CSourceConnName);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(C2CSourceConnName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(C2CTargetConnName);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(C2CTargetConnName);
    stringBuffer.append(TEXT_38);
    codeForConnToConn(node, C2CMetadata, C2CSourceConnName, C2CTargetConnName, start, end);
    stringBuffer.append(TEXT_39);
    
					}
				}
				if(useV2C){//Call all split methods in one method
				
    stringBuffer.append(TEXT_40);
    stringBuffer.append(V2CSourceValueClass);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(V2CSourceValueName);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(V2CTargetConnName);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(V2CTargetConnName);
    stringBuffer.append(TEXT_44);
    	
				}
				if(useV2CWithD){
				
    stringBuffer.append(TEXT_45);
    stringBuffer.append(V2CWithDSourceValueClass);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(V2CWithDSourceValueName);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(V2CWithDTargetConnName);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(V2CWithDTargetConnName);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(V2CWithDDynamicName);
    stringBuffer.append(TEXT_50);
    
				}
				for(int i=0;i<methodNum;i++){
					if(useV2C){
					
    stringBuffer.append(TEXT_51);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(V2CSourceValueName);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(V2CTargetConnName);
    stringBuffer.append(TEXT_54);
    
					}
					if(useV2CWithD){
					
    stringBuffer.append(TEXT_55);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(V2CWithDSourceValueName);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(V2CWithDTargetConnName);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(V2CWithDDynamicName);
    stringBuffer.append(TEXT_59);
    
					}
				}
				if(useV2C || useV2CWithD){
				
    stringBuffer.append(TEXT_60);
    
				}
				if(useC2C){
				
    stringBuffer.append(TEXT_61);
    stringBuffer.append(C2CSourceConnName);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(C2CSourceConnName);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(C2CTargetConnName);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(C2CTargetConnName);
    stringBuffer.append(TEXT_65);
    
					for(int i=0;i<methodNum;i++){
						if(useC2C){
						
    stringBuffer.append(TEXT_66);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(C2CSourceConnName);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(C2CTargetConnName);
    stringBuffer.append(TEXT_69);
    
						}
					}
					
    stringBuffer.append(TEXT_70);
    
				}
				
    stringBuffer.append(TEXT_71);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_74);
    
		  	}
		}
	}
	
    stringBuffer.append(TEXT_75);
     
    CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
    INode node = (INode)codeGenArgument.getArgument();
    final String cid = node.getUniqueName();	
	
	String projectName = codeGenArgument.getCurrentProjectName();
	String jobName = codeGenArgument.getJobName();
	String jobVersion = codeGenArgument.getJobVersion();
	
	String tempDir = ElementParameterParser.getValue(node, "__TEMP_DIR__");
	
	String vcid = "";
	IProcess process = node.getProcess();
	final boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(process, "__LOG4J_ACTIVATE__"));
	
	/* Build the Log4J message for the different parameters */
	
	if(isLog4jEnabled) {

    stringBuffer.append(TEXT_76);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(ElementParameterParser.getValue(node, "__FILENAME__"));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(ElementParameterParser.getValue(node, "__CSV_OPTION__"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(ElementParameterParser.getValue(node, "__FIELDSEPARATOR__"));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(ElementParameterParser.getValue(node, "__HEADER__"));
    stringBuffer.append(TEXT_89);
     if("false".equals(ElementParameterParser.getValue(node, "__UNCOMPRESS__"))) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ElementParameterParser.getValue(node, "__FOOTER__"));
    stringBuffer.append(TEXT_93);
     } 
    stringBuffer.append(TEXT_94);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_95);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_96);
    stringBuffer.append("".equals(ElementParameterParser.getValue(node, "__LIMIT__"))?"\"\"":ElementParameterParser.getValue(node, "__LIMIT__"));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ElementParameterParser.getValue(node, "__REMOVE_EMPTY_ROW__"));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(ElementParameterParser.getValue(node, "__UNCOMPRESS__"));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_105);
    stringBuffer.append(ElementParameterParser.getValue(node, "__DIE_ON_ERROR__"));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_107);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_108);
    stringBuffer.append(ElementParameterParser.getValue(node, "__REMOVE_EMPTY_ROW__"));
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_113);
    
	}
	
	/* -------------------------- */

	String destination = ElementParameterParser.getValue(node, "__DESTINATION__");
	if(destination!=null && !"".equals(destination)){
		vcid = destination;
	}
	int dynamic_index = -1;
	boolean hasDynamic = false;
	List<IMetadataColumn> columnList = null;
	List<IMetadataTable> metadatas = node.getMetadataList();
	IMetadataTable metadata = null;
	int sizeListColumns = 0;
	if ((metadatas!=null)&&(metadatas.size()>0)) {
		metadata = metadatas.get(0);
		if (metadata!=null) {
			columnList = metadata.getListColumns();
			sizeListColumns = columnList.size();
		}
	}
	for(int i=0; columnList!=null && i< columnList.size(); i++) {
        if(columnList.get(i).getTalendType().equals("id_Dynamic")){
            dynamic_index = i+1;
            hasDynamic = true;
            break;
        }
	}
	int schemaOptNum=100;
	String schemaOptNumStr=ElementParameterParser.getValue(node, "__SCHEMA_OPT_NUM__");
	if(schemaOptNumStr!=null && !"".equals(schemaOptNumStr) && !"\"\"".equals(schemaOptNumStr)){
		schemaOptNum  = Integer.parseInt(schemaOptNumStr);
	}
		
		
	class GenerateCode{
		public int dynamic_index = -1;
		public int colLen = 0; // the length of the column in the input schema
		public void generateDynamicSchemaCode(boolean isCsv){
		
    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_115);
    
				if(isCsv){
				
    stringBuffer.append(TEXT_116);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_118);
    
				}else{
				
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_121);
    
				}
				
    stringBuffer.append(TEXT_122);
    stringBuffer.append(dynamic_index-1);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_124);
    stringBuffer.append(colLen-dynamic_index);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_126);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_127);
    if(isCsv){
    stringBuffer.append(TEXT_128);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_129);
    }else{
    stringBuffer.append(TEXT_130);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_131);
    }
    stringBuffer.append(TEXT_132);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_133);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_134);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_135);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_137);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_139);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_140);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_141);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_142);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_143);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    
		}
		public void checkFooterAndRandom(String footer,String random){
		
    stringBuffer.append(TEXT_146);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_147);
    stringBuffer.append(footer );
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_149);
    stringBuffer.append(random );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_151);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_152);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_153);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_154);
    }
    stringBuffer.append(TEXT_155);
    
		}
		
		public void checkFooter(String footer){
		
    stringBuffer.append(TEXT_156);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_157);
    stringBuffer.append(footer );
    stringBuffer.append(TEXT_158);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_159);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_160);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_161);
    }
    stringBuffer.append(TEXT_162);
    	
		}
	}
	GenerateCode generateCode = new GenerateCode();
	
    stringBuffer.append(TEXT_163);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_164);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_165);
    }
    stringBuffer.append(TEXT_166);
    

	if(("false").equals(ElementParameterParser.getValue(node,"__CSV_OPTION__"))) {	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final String fieldSeparator = ElementParameterParser.getValue(node, "__FIELDSEPARATOR__");
		class RowUtil extends DefaultRowUtil{
			public void codeForValueToConn(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, int start , int end){
				codeForValueToConnWithD(node, metadata, sourceValueClass, sourceValueName, targetConnName, null, start ,end);
			}
			public boolean codeForValueToConnWithD(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, String dynamicName, int start , int end){
				cid = node.getUniqueName();
				String encoding = ElementParameterParser.getValue(node,"__ENCODING__");
				
				List<Map<String, String>> trimSelects = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__TRIMSELECT__");
				String isTrimAllStr = ElementParameterParser.getValue(node,"__TRIMALL__");
				boolean isTrimAll = (isTrimAllStr!=null&&!("").equals(isTrimAllStr))?("true").equals(isTrimAllStr):true;
				
				String checkDateStr = ElementParameterParser.getValue(node,"__CHECK_DATE__");
				boolean checkDate = (checkDateStr!=null&&!("").equals(checkDateStr))?("true").equals(checkDateStr):false;
				
				String checkNumStr = ElementParameterParser.getValue(node, "__CHECK_FIELDS_NUM__");
				boolean checkNum = (checkNumStr!=null&&!("").equals(checkNumStr))?("true").equals(checkNumStr):false; 
				
				String advancedSeparatorStr = ElementParameterParser.getValue(node, "__ADVANCED_SEPARATOR__");
				boolean advancedSeparator = (advancedSeparatorStr!=null&&!("").equals(advancedSeparatorStr))?("true").equals(advancedSeparatorStr):false;
				String thousandsSeparator = ElementParameterParser.getValueWithJavaType(node, "__THOUSANDS_SEPARATOR__", JavaTypesManager.CHARACTER);
				String decimalSeparator = ElementParameterParser.getValueWithJavaType(node, "__DECIMAL_SEPARATOR__", JavaTypesManager.CHARACTER);
				
				List<IMetadataColumn> listColumns = metadata.getListColumns();
				int sizeListColumns = listColumns.size();
				boolean noStringTypeExist = false;
				int dynamic_index = -1;
				if(metadata.isDynamicSchema()){
				
    stringBuffer.append(TEXT_167);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_168);
    if(this.isBehindDynamic){
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_169);
    }else{
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    
				}
				
    stringBuffer.append(TEXT_172);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_173);
    
				for (int valueN=0; valueN<sizeListColumns; valueN++) {
					IMetadataColumn column = listColumns.get(valueN);
					JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
					if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
					}else{
						noStringTypeExist = true;
						break;
					}
				}
				boolean hasStringDefault = false;
				for (int valueM=0; valueM<sizeListColumns; valueM++) {
					IMetadataColumn column = listColumns.get(valueM);
					JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
					if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
						if(hasStringDefault==false && column.getDefault()!=null && column.getDefault().length() > 0 ){
							hasStringDefault = true;
							break;
						}
					}
				}
				if(noStringTypeExist || hasStringDefault){
				
    stringBuffer.append(TEXT_174);
    
				}
				for (int valueN=start; valueN<end; valueN++) {
					IMetadataColumn column = listColumns.get(valueN);
					String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable());
					JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
					String patternValue = column.getPattern() == null || column.getPattern().trim().length() == 0 ? null : column.getPattern();
					if(metadata.isDynamicSchema()){
					
    stringBuffer.append(TEXT_175);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_176);
    stringBuffer.append(valueN-1);
    stringBuffer.append(TEXT_177);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_178);
    
					}else{
					
    stringBuffer.append(TEXT_179);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_180);
    stringBuffer.append(valueN);
    stringBuffer.append(TEXT_181);
    
					}
					if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
						String defaultValue = column.getDefault();
						if(defaultValue!=null && defaultValue.length()>0){
						
    stringBuffer.append(TEXT_182);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_183);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_184);
    stringBuffer.append((isTrimAll || (!trimSelects.isEmpty() && ("true").equals(trimSelects.get(valueN).get("TRIM"))))?".trim()":"" );
    stringBuffer.append(TEXT_185);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_186);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_188);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_189);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_190);
    
						}else{
						
    stringBuffer.append(TEXT_191);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_192);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_193);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_194);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_195);
    stringBuffer.append((isTrimAll || (!trimSelects.isEmpty() && ("true").equals(trimSelects.get(valueN).get("TRIM"))))?".trim()":"" );
    stringBuffer.append(TEXT_196);
    
						}
					}else if(column.getTalendType().equals("id_Dynamic")){
						this.isBehindDynamic=true;
						dynamic_index = valueN;
					
    stringBuffer.append(TEXT_197);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_198);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_199);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_200);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_201);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_202);
    stringBuffer.append(dynamic_index);
    stringBuffer.append(TEXT_203);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_204);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_205);
    stringBuffer.append(dynamic_index);
    stringBuffer.append(TEXT_206);
    stringBuffer.append((isTrimAll || (!trimSelects.isEmpty() && ("true").equals(trimSelects.get(valueN).get("TRIM"))))?".trim()":"" );
    stringBuffer.append(TEXT_207);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_208);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_209);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_210);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_211);
    
					}else{
					
    stringBuffer.append(TEXT_212);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_213);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_214);
    stringBuffer.append((isTrimAll || (!trimSelects.isEmpty() && ("true").equals(trimSelects.get(valueN).get("TRIM"))))?".trim()":"" );
    stringBuffer.append(TEXT_215);
    
							if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {
							} else if(javaType == JavaTypesManager.BYTE_ARRAY){ 
							
    stringBuffer.append(TEXT_216);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_217);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_218);
    stringBuffer.append(encoding);
    stringBuffer.append(TEXT_219);
    
							} else if(javaType == JavaTypesManager.LIST){ 
                            
    stringBuffer.append(TEXT_220);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_221);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_222);
    stringBuffer.append( fieldSeparator );
    stringBuffer.append(TEXT_223);
    
							}else if(javaType == JavaTypesManager.DATE) { 
								if(checkNum || checkDate){
								
    stringBuffer.append(TEXT_224);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_225);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_226);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_227);
    
								}else{
								
    stringBuffer.append(TEXT_228);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_229);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_230);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_231);
    
								}
							}else if(advancedSeparator && JavaTypesManager.isNumberType(javaType, column.isNullable())) { 
							
    stringBuffer.append(TEXT_232);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_233);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_234);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_235);
    stringBuffer.append( thousandsSeparator );
    stringBuffer.append(TEXT_236);
    stringBuffer.append( decimalSeparator );
    stringBuffer.append(TEXT_237);
    
							} else { 
							
    stringBuffer.append(TEXT_238);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_239);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_240);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_241);
    
							}
							
    stringBuffer.append(TEXT_242);
    
							String defaultValue = JavaTypesManager.getDefaultValueFromJavaType(typeToGenerate, column.getDefault());
							if(defaultValue == null) {
							
    stringBuffer.append(TEXT_243);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_244);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_245);
    stringBuffer.append( column.getLabel() );
    stringBuffer.append(TEXT_246);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_247);
    }
    stringBuffer.append(TEXT_248);
    stringBuffer.append( column.getLabel() );
    stringBuffer.append(TEXT_249);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_250);
    
							} else {
							
    stringBuffer.append(TEXT_251);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_252);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_253);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_254);
    
							}
							
    stringBuffer.append(TEXT_255);
    
					}
					
    stringBuffer.append(TEXT_256);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_257);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_258);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_259);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_260);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_261);
    stringBuffer.append(end);
    stringBuffer.append(TEXT_262);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_263);
    }
    stringBuffer.append(TEXT_264);
    }
				
    stringBuffer.append(TEXT_265);
    if(checkNum) {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_267);
    stringBuffer.append(metadata.getListColumns().size() );
    stringBuffer.append(TEXT_268);
    if(metadata.isDynamicSchema()){
    stringBuffer.append(TEXT_269);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_270);
    }
    stringBuffer.append(TEXT_271);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_272);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(TEXT_274);
    stringBuffer.append(metadata.getListColumns().size() );
    stringBuffer.append(TEXT_275);
    if(metadata.isDynamicSchema()){
    stringBuffer.append(TEXT_276);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_277);
    }
    stringBuffer.append(TEXT_278);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_279);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_280);
    }
    stringBuffer.append(TEXT_281);
    
				}
				return this.isBehindDynamic;
			}
			
			public void codeForConnToConn(INode node, IMetadataTable metadata, String sourceConnName, String targetConnName, int start , int end){
    			for(int colNum=start;colNum<end;colNum++) {
    				IMetadataColumn column=metadata.getListColumns().get(colNum);
    			
    stringBuffer.append(TEXT_282);
    stringBuffer.append(targetConnName);
    stringBuffer.append(TEXT_283);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(sourceConnName);
    stringBuffer.append(TEXT_285);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_286);
    
				}
				
    stringBuffer.append(TEXT_287);
    
			}
		}//class defined end

		if ((metadatas!=null)&&(metadatas.size()>0)) {
			if (metadata!=null) {
				String filename = ElementParameterParser.getValue(node,"__FILENAME__");
				
				if(!("".equals(vcid))) {
					filename = "\"/"+filename.substring(1, filename.length()-1)+vcid+"_"+projectName+"_"+jobName+"_"+jobVersion+"\"";
					filename = tempDir+"+"+filename;
				}
				
		    	String encoding = ElementParameterParser.getValue(node,"__ENCODING__");
		    	String header = ElementParameterParser.getValue(node, "__HEADER__");
		    	if(("").equals(header)){
		    		header="0";
		    	}
		    	String limit = ElementParameterParser.getValue(node, "__LIMIT__");
				if(("").equals(limit)){
					limit = "-1";
				}
		    	String footer = ElementParameterParser.getValue(node, "__FOOTER__");
				boolean uncompress = ("true").equals(ElementParameterParser.getValue(node,"__UNCOMPRESS__"));
		    	if(("").equals(footer) || uncompress){
		    		footer="0";
		    	}
		    	String random = "-1";
		    	String ran = ElementParameterParser.getValue(node, "__RANDOM__");
		    	if(("true").equals(ran)){
		    		random = ElementParameterParser.getValue(node, "__NB_RANDOM__");
		    		if(("").equals(random)){
		    			random="0";
		    		}
		    	}
		    	if(uncompress){
		    		random="-1";
		    	}
				
		    	String rowSeparator = ElementParameterParser.getValue(node, "__ROWSEPARATOR__");
		    	String removeEmptyRowFlag =  ElementParameterParser.getValue(node, "__REMOVE_EMPTY_ROW__");
		    	String dieOnErrorStr = ElementParameterParser.getValue(node, "__DIE_ON_ERROR__");
				boolean dieOnError = (dieOnErrorStr!=null&&!("").equals(dieOnErrorStr))?("true").equals(dieOnErrorStr):false; 
				
				String splitRecordStr = ElementParameterParser.getValue(node, "__SPLITRECORD__");
				boolean splitRecord = (splitRecordStr!=null&&!("").equals(splitRecordStr))?("true").equals(splitRecordStr):false;
				
				//find main & reject conns;
				List< ? extends IConnection> conns = node.getOutgoingSortedConnections();
			    String rejectConnName = "";
			    List<? extends IConnection> rejectConns = node.getOutgoingConnections("REJECT");
			    if(rejectConns != null && rejectConns.size() > 0) {
			        IConnection rejectConn = rejectConns.get(0);
			        rejectConnName = rejectConn.getName();
			    }
			    List<IMetadataColumn> rejectColumnList = null;
			    IMetadataTable metadataTable = node.getMetadataFromConnector("REJECT");
			    if(metadataTable != null) {
			        rejectColumnList = metadataTable.getListColumns();      
			    }
			    String firstConnName = "";
				if (conns!=null) {
					if (conns.size()>0) {
						IConnection conn = conns.get(0);
						if(conn!=null && conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)){
							firstConnName = conn.getName();
						}
					}
				}			    
				
				RowUtil rowUtil = new RowUtil(); 
				if (conns!=null) {
				    if (conns.size()>0 && firstConnName != null && firstConnName.length()>0) {
						if(hasDynamic){
							rowUtil.prepareValueToConnWithD(node, metadata, "org.talend.fileprocess.FileInputDelimited", "fid_"+cid, firstConnName, "dynamic_"+cid, schemaOptNum);
							
    stringBuffer.append(TEXT_288);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_289);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_290);
    
						}else{
							rowUtil.prepareValueToConn(node, metadata, "org.talend.fileprocess.FileInputDelimited", "fid_"+cid, firstConnName, schemaOptNum);
						}
						if(!("").equals(rejectConnName)&&!rejectConnName.equals(firstConnName)&&rejectColumnList != null && rejectColumnList.size() > 0) {
							rowUtil.prepareConnToConn(metadata, firstConnName, rejectConnName);
						}
						rowUtil.generateClass();
					}
				}
				
    stringBuffer.append(TEXT_291);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_292);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_293);
    
					if(uncompress){
					
    stringBuffer.append(TEXT_294);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_295);
    stringBuffer.append(filename );
    stringBuffer.append(TEXT_296);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_297);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_298);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_299);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_300);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_301);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_302);
     if(dieOnError) {
    stringBuffer.append(TEXT_303);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_304);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_305);
    }
    stringBuffer.append(TEXT_306);
     } else { 
    stringBuffer.append(TEXT_307);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_308);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_309);
    }
    stringBuffer.append(TEXT_310);
     } 
    stringBuffer.append(TEXT_311);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_312);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_313);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_314);
     if(dieOnError) {
    stringBuffer.append(TEXT_315);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_316);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_317);
    }
    stringBuffer.append(TEXT_318);
     } else { 
    stringBuffer.append(TEXT_319);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_320);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_322);
     } 
    stringBuffer.append(TEXT_323);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_324);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_325);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_326);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_327);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_328);
    stringBuffer.append(fieldSeparator );
    stringBuffer.append(TEXT_329);
    stringBuffer.append(rowSeparator );
    stringBuffer.append(TEXT_330);
    stringBuffer.append(removeEmptyRowFlag );
    stringBuffer.append(TEXT_331);
    stringBuffer.append(header );
    stringBuffer.append(hasDynamic?"-1":"");
    stringBuffer.append(TEXT_332);
    stringBuffer.append(footer );
    stringBuffer.append(TEXT_333);
    stringBuffer.append(limit );
    stringBuffer.append(TEXT_334);
    stringBuffer.append(random );
    stringBuffer.append(TEXT_335);
    stringBuffer.append( splitRecord);
    stringBuffer.append(TEXT_336);
     if(dieOnError) {
    stringBuffer.append(TEXT_337);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_338);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_339);
    }
    stringBuffer.append(TEXT_340);
     } else { 
    stringBuffer.append(TEXT_341);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_342);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_343);
    }
    stringBuffer.append(TEXT_344);
     } 
    stringBuffer.append(TEXT_345);
    
					}else{
					
    stringBuffer.append(TEXT_346);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_347);
    stringBuffer.append(filename );
    stringBuffer.append(TEXT_348);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_349);
    
									generateCode.checkFooterAndRandom(footer,random);
							
    stringBuffer.append(TEXT_350);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_351);
    stringBuffer.append(filename );
    stringBuffer.append(TEXT_352);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_353);
    stringBuffer.append(fieldSeparator );
    stringBuffer.append(TEXT_354);
    stringBuffer.append(rowSeparator );
    stringBuffer.append(TEXT_355);
    stringBuffer.append(removeEmptyRowFlag );
    stringBuffer.append(TEXT_356);
    stringBuffer.append(header );
    stringBuffer.append(hasDynamic?"-1":"");
    stringBuffer.append(TEXT_357);
    stringBuffer.append(footer );
    stringBuffer.append(TEXT_358);
    stringBuffer.append(limit );
    stringBuffer.append(TEXT_359);
    stringBuffer.append(random );
    stringBuffer.append(TEXT_360);
    stringBuffer.append( splitRecord);
    stringBuffer.append(TEXT_361);
     if(dieOnError) {
    stringBuffer.append(TEXT_362);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_363);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_364);
    }
    stringBuffer.append(TEXT_365);
     } else { 
    stringBuffer.append(TEXT_366);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_367);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_368);
    }
    stringBuffer.append(TEXT_369);
     } 
    stringBuffer.append(TEXT_370);
    
					}
					
    stringBuffer.append(TEXT_371);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_372);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_373);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_374);
    }
    stringBuffer.append(TEXT_375);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_376);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_377);
    
				    	if (conns!=null) {
				    		if (conns.size()>0 && firstConnName != null && firstConnName.length()>0) {
				    			for (int i=0;i<conns.size();i++) {
				    				IConnection connTemp = conns.get(i);
				    				if (connTemp.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
									
    stringBuffer.append(TEXT_378);
    stringBuffer.append(connTemp.getName() );
    stringBuffer.append(TEXT_379);
    
				    				}
				    			}
				    	
								IConnection conn = conns.get(0);
								if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
								
    stringBuffer.append(TEXT_380);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_381);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_382);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_383);
    
										if(hasDynamic){// generate the dynamic schema code
											generateCode.colLen = sizeListColumns;
											generateCode.dynamic_index = dynamic_index;
											generateCode.generateDynamicSchemaCode(false); //false: delimited mode
											rowUtil.callValueToConnWithD("fid_"+cid, firstConnName, "dynamic_"+cid);
										}else{
											rowUtil.callValueToConn("fid_"+cid, firstConnName);
										}
										
			
										
										if(rejectConnName.equals(firstConnName)) {
										
    stringBuffer.append(TEXT_384);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_385);
    
										}
										
    stringBuffer.append(TEXT_386);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_387);
    
			        					if (dieOnError) {
			            				
    stringBuffer.append(TEXT_388);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_389);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(TEXT_391);
    
			        					} else {
											if(isLog4jEnabled){
    stringBuffer.append(TEXT_392);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_393);
    }
			            					if(!("").equals(rejectConnName)&&!rejectConnName.equals(firstConnName)&&rejectColumnList != null && rejectColumnList.size() > 0) {
							                
    stringBuffer.append(TEXT_394);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_395);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_396);
    rowUtil.callConnToConn(firstConnName, rejectConnName);
    stringBuffer.append(TEXT_397);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_398);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_399);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_400);
    
			            					} else if(("").equals(rejectConnName)){
			                				
    stringBuffer.append(TEXT_401);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_402);
    
			            					} else if(rejectConnName.equals(firstConnName)){
    stringBuffer.append(TEXT_403);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_404);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_405);
    
									}
			        					} 
			        					
    stringBuffer.append(TEXT_406);
    
								}
							}
							if (conns.size()>0 && firstConnName != null && firstConnName.length()>0) {//no use code, we can link only one main line now.
								boolean isFirstEnter = true;
								for (int i=0;i<conns.size();i++) {
									IConnection conn = conns.get(i);
									if ((conn.getName().compareTo(firstConnName)!=0)&&(conn.getName().compareTo(rejectConnName)!=0)&&(conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA))) {
									
										if(isFirstEnter) {
										
    stringBuffer.append(TEXT_407);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_408);
    isFirstEnter = false; 
										}
										
    stringBuffer.append(TEXT_409);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_410);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_411);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_412);
    
						    	 		rowUtil.callConnToConn(firstConnName, conn.getName());
									}
								}
								 
								if(!isFirstEnter) {
								
    stringBuffer.append(TEXT_413);
    
								}
								
							}
				  		}
			}
		}
		if(isLog4jEnabled){
    stringBuffer.append(TEXT_414);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_415);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_416);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_417);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_418);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_419);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_420);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_421);
    }

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}else{//the following is the tFileInputCSV component
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final String delim1 = ElementParameterParser.getValue(node, "__FIELDSEPARATOR__");
		class RowUtil extends DefaultRowUtil{
			public void codeForValueToConn(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, int start , int end){
				codeForValueToConnWithD(node, metadata, sourceValueClass, sourceValueName, targetConnName, null, start ,end);
			}
			public boolean codeForValueToConnWithD(INode node, IMetadataTable metadata, String sourceValueClass, String sourceValueName, String targetConnName, String dynamicName, int start , int end){
				cid = node.getUniqueName();
				String encoding = ElementParameterParser.getValue(node,"__ENCODING__");
				
				List<Map<String, String>> trimSelects = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__TRIMSELECT__");
				String isTrimAllStr = ElementParameterParser.getValue(node,"__TRIMALL__");
				boolean isTrimAll = (isTrimAllStr!=null&&!("").equals(isTrimAllStr))?("true").equals(isTrimAllStr):true;
				
				String checkDateStr = ElementParameterParser.getValue(node,"__CHECK_DATE__");
				boolean checkDate = (checkDateStr!=null&&!("").equals(checkDateStr))?("true").equals(checkDateStr):false;
				
				String checkNumStr = ElementParameterParser.getValue(node, "__CHECK_FIELDS_NUM__");
				boolean checkNum = (checkNumStr!=null&&!("").equals(checkNumStr))?("true").equals(checkNumStr):false; 
				
				String advancedSeparatorStr = ElementParameterParser.getValue(node, "__ADVANCED_SEPARATOR__");
				boolean advancedSeparator = (advancedSeparatorStr!=null&&!("").equals(advancedSeparatorStr))?("true").equals(advancedSeparatorStr):false;
				String thousandsSeparator = ElementParameterParser.getValueWithJavaType(node, "__THOUSANDS_SEPARATOR__", JavaTypesManager.CHARACTER);
				String decimalSeparator = ElementParameterParser.getValueWithJavaType(node, "__DECIMAL_SEPARATOR__", JavaTypesManager.CHARACTER);
				
				List<IMetadataColumn> columns=metadata.getListColumns();
				int columnSize = columns.size();
				if(metadata.isDynamicSchema()){
				
    stringBuffer.append(TEXT_422);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_423);
    if(this.isBehindDynamic){
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_424);
    }else{
    stringBuffer.append(TEXT_425);
    }
    stringBuffer.append(TEXT_426);
    
				}
				
    stringBuffer.append(TEXT_427);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_428);
    stringBuffer.append(delim1);
    stringBuffer.append(TEXT_429);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_430);
    stringBuffer.append(delim1);
    stringBuffer.append(TEXT_431);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_432);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_433);
    }
    stringBuffer.append(TEXT_434);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_435);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_436);
    
					for(int colNo=start;colNo<end;colNo++) {
						IMetadataColumn column1 =metadata.getListColumns().get(colNo);
					
    stringBuffer.append(TEXT_437);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_438);
    stringBuffer.append(column1.getLabel() );
    stringBuffer.append(TEXT_439);
    stringBuffer.append(JavaTypesManager.getDefaultValueFromJavaIdType(column1.getTalendType(), column1.isNullable()));
    stringBuffer.append(TEXT_440);
    
					}
					
    stringBuffer.append(TEXT_441);
    if(isTrimAll){
    stringBuffer.append(TEXT_442);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_443);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_444);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_445);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_446);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_447);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_448);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_449);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_450);
    
					}
					boolean hasStringDefault = false;
					for (int valueM=0; valueM<columnSize; valueM++) {
						IMetadataColumn column = columns.get(valueM);
						JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
						if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
							if(hasStringDefault==false && column.getDefault()!=null && column.getDefault().length() > 0 ){
								hasStringDefault = true;
								break;
							}
						}
					}
					
					if(hasStringDefault==true){
					
    stringBuffer.append(TEXT_451);
    
					}
					int dynamic_index = 1;
	                
    stringBuffer.append(TEXT_452);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_453);
    
					for (int i=start;i<end;i++) {
						IMetadataColumn column=columns.get(i);
						String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable());
						JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
						String patternValue = column.getPattern() == null || column.getPattern().trim().length() == 0 ? null : column.getPattern();
						if(metadata.isDynamicSchema()){
						
    stringBuffer.append(TEXT_454);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_455);
    stringBuffer.append(i-1 );
    stringBuffer.append(TEXT_456);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_457);
    
						}else{
						
    stringBuffer.append(TEXT_458);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_459);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_460);
    
						}
						
    stringBuffer.append(TEXT_461);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_462);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_463);
    if((!isTrimAll && (!trimSelects.isEmpty() && ("true").equals(trimSelects.get(i).get("TRIM"))))){
    stringBuffer.append(TEXT_464);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_465);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_466);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_467);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_468);
    
							}
							if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {
								String defaultValue = column.getDefault();
								if(defaultValue!=null && defaultValue.length()>0){
								
    stringBuffer.append(TEXT_469);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_470);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_471);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_472);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_473);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_474);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_475);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_476);
    
								}else{
								
    stringBuffer.append(TEXT_477);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_478);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_479);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_480);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_481);
    
								}
							} else {
							
    stringBuffer.append(TEXT_482);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_483);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_484);
    
									if(javaType == JavaTypesManager.DATE) {
										if(checkNum || checkDate){
										
    stringBuffer.append(TEXT_485);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_486);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_487);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_488);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_489);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_490);
    
										}else{
										
    stringBuffer.append(TEXT_491);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_492);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_493);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_494);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_495);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_496);
    
										}
									} else if(advancedSeparator && JavaTypesManager.isNumberType(javaType, column.isNullable())) { 
									
    stringBuffer.append(TEXT_497);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_498);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_499);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_500);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_501);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_502);
    stringBuffer.append( thousandsSeparator );
    stringBuffer.append(TEXT_503);
    stringBuffer.append( decimalSeparator );
    stringBuffer.append(TEXT_504);
    
									}else if(javaType == JavaTypesManager.BYTE_ARRAY){ 
									
    stringBuffer.append(TEXT_505);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_506);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_507);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_508);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_509);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_510);
    
									}else if(javaType == JavaTypesManager.LIST){ 
                                    
    stringBuffer.append(TEXT_511);
    stringBuffer.append(TEXT_512);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_513);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_514);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_515);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_516);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_517);
    
									}else if(column.getTalendType().equals("id_Dynamic")){
										this.isBehindDynamic=true;
										dynamic_index = i;
									
    stringBuffer.append(TEXT_518);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_519);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_520);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_521);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_522);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_523);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_524);
    stringBuffer.append(dynamic_index);
    stringBuffer.append(TEXT_525);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_526);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_527);
    stringBuffer.append(dynamic_index);
    stringBuffer.append(TEXT_528);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_529);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_530);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_531);
    stringBuffer.append(dynamicName);
    stringBuffer.append(TEXT_532);
    
									}else {
									
    stringBuffer.append(TEXT_533);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_534);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_535);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_536);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_537);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_538);
    
									}
									
    stringBuffer.append(TEXT_539);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_540);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_541);
    stringBuffer.append(JavaTypesManager.getDefaultValueFromJavaType(typeToGenerate, column.getDefault()));
    stringBuffer.append(TEXT_542);
    					
							}
							
    stringBuffer.append(TEXT_543);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_544);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_545);
    stringBuffer.append(JavaTypesManager.getDefaultValueFromJavaType(typeToGenerate, column.getDefault()) );
    stringBuffer.append(TEXT_546);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_547);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_548);
    stringBuffer.append(targetConnName );
    stringBuffer.append(TEXT_549);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_550);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_551);
    stringBuffer.append(end);
    stringBuffer.append(TEXT_552);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_553);
    }
    stringBuffer.append(TEXT_554);
    
					}
					
    stringBuffer.append(TEXT_555);
    if(checkNum) {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(sourceValueName);
    stringBuffer.append(TEXT_557);
    stringBuffer.append(metadata.getListColumns().size() );
    stringBuffer.append(TEXT_558);
    if(metadata.isDynamicSchema()){
    stringBuffer.append(TEXT_559);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_560);
    }
    stringBuffer.append(TEXT_561);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_562);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_563);
    }
    stringBuffer.append(TEXT_564);
    stringBuffer.append(metadata.getListColumns().size() );
    stringBuffer.append(TEXT_565);
    if(metadata.isDynamicSchema()){
    stringBuffer.append(TEXT_566);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_567);
    }
    stringBuffer.append(TEXT_568);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_569);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_570);
    }
    stringBuffer.append(TEXT_571);
    
				}
				return this.isBehindDynamic;
			}
			
			public void codeForConnToConn(INode node, IMetadataTable metadata, String sourceConnName, String targetConnName, int start , int end){
    			for(int colNum=start;colNum<end;colNum++) {
    				IMetadataColumn column=metadata.getListColumns().get(colNum);
    			
    stringBuffer.append(TEXT_572);
    stringBuffer.append(targetConnName);
    stringBuffer.append(TEXT_573);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(sourceConnName);
    stringBuffer.append(TEXT_575);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_576);
    
				}
				
    stringBuffer.append(TEXT_577);
    
			}
		}//class defined end
		
		if ((metadatas!=null)&&(metadatas.size()>0)) {
		    if (metadata!=null) {
		    
		        String filename = ElementParameterParser.getValueWithUIFieldKey(node,"__FILENAME__", "FILENAME");
		    	String encoding = ElementParameterParser.getValue(node,"__ENCODING__");
		    	String header = ElementParameterParser.getValue(node, "__HEADER__");
		    	String footer = ElementParameterParser.getValue(node, "__FOOTER__");
		    	String limit = ElementParameterParser.getValue(node, "__LIMIT__");
		    	if(("").equals(limit)){
		    		limit="-1";
		    	}
		    	  	
		    	String rowSeparator1 = ElementParameterParser.getValue(node, "__CSVROWSEPARATOR__");
		    	
		    	
		    	String escapeChar1 = ElementParameterParser.getValue(node, "__ESCAPE_CHAR__");
		    	
		    	if(("").equals(escapeChar1)){
		    		escapeChar1 = "\"\"";
		    	}
		    	String escapeChar = escapeChar1.substring(1,escapeChar1.length()-1);
		    	if(("'").equals(escapeChar)){
		    		escapeChar = "\\'";
		    	}
		    	String textEnclosure1 = ElementParameterParser.getValue(node, "__TEXT_ENCLOSURE__");
		    	if(("").equals(textEnclosure1)){
		    		textEnclosure1 = "\"\"";
		    	}
		    	String textEnclosure = textEnclosure1.substring(1,textEnclosure1.length()-1);
		    	if ("".equals(textEnclosure)) 
		    		textEnclosure = "\0";
		    	if(("'").equals(textEnclosure)){
		    		textEnclosure = "\\'";
		    	}
		    	
		    	String removeEmptyRow = ElementParameterParser.getValue(node, "__REMOVE_EMPTY_ROW__");
		    	
		    	String dieOnErrorStr = ElementParameterParser.getValue(node, "__DIE_ON_ERROR__");
				boolean dieOnError = (dieOnErrorStr!=null&&!("").equals(dieOnErrorStr))?("true").equals(dieOnErrorStr):false;
				
				boolean uncompress = ("true").equals(ElementParameterParser.getValue(node,"__UNCOMPRESS__"));
				if(uncompress){
					footer = "0";
				}
				
				List< ? extends IConnection> conns = node.getOutgoingSortedConnections();
			    String rejectConnName = "";
    			List<? extends IConnection> rejectConns = node.getOutgoingConnections("REJECT");
    			if(rejectConns != null && rejectConns.size() > 0) {
        			IConnection rejectConn = rejectConns.get(0);
        			rejectConnName = rejectConn.getName();
   				}
    			List<IMetadataColumn> rejectColumnList = null;
    			IMetadataTable metadataTable = node.getMetadataFromConnector("REJECT");
    			if(metadataTable != null) {
        			rejectColumnList = metadataTable.getListColumns();      
    			}
    			String firstConnName = "";
				if (conns!=null) {
					if (conns.size()>0) {
						IConnection conn = conns.get(0);
						if(conn!=null && conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)){
							firstConnName = conn.getName();		
						}
					}
				}
				
				RowUtil rowUtil = new RowUtil(); 
				if (conns!=null) {
				    if (conns.size()>0 && firstConnName != null && firstConnName.length()>0) {
						if(hasDynamic){
							rowUtil.prepareValueToConnWithD(node, metadata, "String[]", "row"+cid, firstConnName, "dynamic_"+cid, schemaOptNum);
							
    stringBuffer.append(TEXT_578);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_579);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_580);
    
						}else{
							rowUtil.prepareValueToConn(node, metadata, "String[]", "row"+cid, firstConnName, schemaOptNum);
						}
						if(!("").equals(rejectConnName)&&!rejectConnName.equals(firstConnName)&&rejectColumnList != null && rejectColumnList.size() > 0) {
							rowUtil.prepareConnToConn(metadata, firstConnName, rejectConnName);
						}
						rowUtil.generateClass();
					}
				}	
				
    stringBuffer.append(TEXT_581);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_582);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_583);
    stringBuffer.append( footer);
    stringBuffer.append(TEXT_584);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_585);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_586);
    stringBuffer.append( limit );
    stringBuffer.append(TEXT_587);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_588);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_589);
    stringBuffer.append(delim1);
    stringBuffer.append(TEXT_590);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_591);
    stringBuffer.append(delim1);
    stringBuffer.append(TEXT_592);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_593);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_594);
    }
    stringBuffer.append(TEXT_595);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_596);
    stringBuffer.append(rowSeparator1);
    stringBuffer.append(TEXT_597);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_598);
    stringBuffer.append(rowSeparator1);
    stringBuffer.append(TEXT_599);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_600);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_601);
    }
    stringBuffer.append(TEXT_602);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_603);
    stringBuffer.append(filename );
    stringBuffer.append(TEXT_604);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_605);
    
					if(uncompress){
					
    stringBuffer.append(TEXT_606);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_607);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_608);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_609);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_610);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_611);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_612);
     if(dieOnError) {
    stringBuffer.append(TEXT_613);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_614);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_615);
    }
    stringBuffer.append(TEXT_616);
     } else { 
    stringBuffer.append(TEXT_617);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_618);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_619);
    }
    stringBuffer.append(TEXT_620);
     } 
    stringBuffer.append(TEXT_621);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_622);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_623);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_624);
     if(dieOnError) {
    stringBuffer.append(TEXT_625);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_626);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_627);
    }
    stringBuffer.append(TEXT_628);
     } else { 
    stringBuffer.append(TEXT_629);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_630);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_631);
    }
    stringBuffer.append(TEXT_632);
     } 
    stringBuffer.append(TEXT_633);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_634);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_635);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_636);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_637);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_638);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_639);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_640);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_641);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_642);
    
					}else{
					
    stringBuffer.append(TEXT_643);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_644);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_645);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_646);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_647);
    
								generateCode.checkFooter(footer);
							
    stringBuffer.append(TEXT_648);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_649);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_650);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_651);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_652);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_653);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_654);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_655);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_656);
    
					}
					
    stringBuffer.append(TEXT_657);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_658);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_659);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_660);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_661);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_662);
    
						if(("").equals(textEnclosure1) || textEnclosure1.startsWith("\"")){//normal situation
						
    stringBuffer.append(TEXT_663);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_664);
    stringBuffer.append(textEnclosure );
    stringBuffer.append(TEXT_665);
    
						}else{ //context and global variables
						
    stringBuffer.append(TEXT_666);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_667);
    stringBuffer.append(textEnclosure1 );
    stringBuffer.append(TEXT_668);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_669);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_670);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_671);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_672);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_673);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_676);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_677);
    
						}
					
						if(("").equals(escapeChar1) || escapeChar1.startsWith("\"")){//normal situation
	        				if(("\\\\").equals(escapeChar)){
	        				
    stringBuffer.append(TEXT_678);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_679);
    
	        				}else if(escapeChar.equals(textEnclosure)){
	        				
    stringBuffer.append(TEXT_680);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_681);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_682);
    
	        				}else{
	        				
    stringBuffer.append(TEXT_683);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_684);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_685);
    
	        				}
	        			}else{//context and global variables
	 					
    stringBuffer.append(TEXT_686);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_687);
    stringBuffer.append(escapeChar1 );
    stringBuffer.append(TEXT_688);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_689);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_690);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_691);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_692);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_693);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_694);
    }
    stringBuffer.append(TEXT_695);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_696);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_697);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_698);
    if(("").equals(textEnclosure1) || textEnclosure1.startsWith("\"")){
    stringBuffer.append(TEXT_699);
    stringBuffer.append(textEnclosure );
    stringBuffer.append(TEXT_700);
    }else{
    stringBuffer.append(TEXT_701);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_702);
    }
    stringBuffer.append(TEXT_703);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_704);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_705);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_706);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_707);
    
						}
						
    stringBuffer.append(TEXT_708);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_709);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_710);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_711);
    stringBuffer.append( header );
    stringBuffer.append(TEXT_712);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_713);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_714);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_715);
    stringBuffer.append(removeEmptyRow );
    stringBuffer.append(TEXT_716);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_717);
    
						   	if(("true").equals(removeEmptyRow)){
						   	
    stringBuffer.append(TEXT_718);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_719);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_720);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_721);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_722);
    
							}
							
    stringBuffer.append(TEXT_723);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_724);
    
							if(("true").equals(removeEmptyRow)){
							
    stringBuffer.append(TEXT_725);
    
							}
							
    stringBuffer.append(TEXT_726);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_727);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_728);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_729);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_730);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_731);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_732);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_733);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_734);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_735);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_736);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_737);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_738);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_739);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_740);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_741);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_742);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_743);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_744);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_745);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_746);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_747);
    stringBuffer.append(encoding );
    stringBuffer.append(TEXT_748);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_749);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_750);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_751);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_752);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_753);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_754);
    
						if(("").equals(textEnclosure1) || textEnclosure1.startsWith("\"")){//normal situation
						
    stringBuffer.append(TEXT_755);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_756);
    stringBuffer.append(textEnclosure );
    stringBuffer.append(TEXT_757);
    
						}else{
						
    stringBuffer.append(TEXT_758);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_759);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_760);
    
						}
						if(("").equals(escapeChar1) || escapeChar1.startsWith("\"")){//normal situation
	        				if(("\\\\").equals(escapeChar)){
	        				
    stringBuffer.append(TEXT_761);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_762);
    
	        				}else if(escapeChar.equals(textEnclosure)){
	        				
    stringBuffer.append(TEXT_763);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_764);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_765);
    
	        				}else{
	        				
    stringBuffer.append(TEXT_766);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_767);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_768);
    
	        				}
	        			}else{//context and global variables
						
    stringBuffer.append(TEXT_769);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_770);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_771);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_772);
    if(("").equals(textEnclosure1) || textEnclosure1.startsWith("\"")){
    stringBuffer.append(TEXT_773);
    stringBuffer.append(textEnclosure );
    stringBuffer.append(TEXT_774);
    }else{
    stringBuffer.append(TEXT_775);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_776);
    }
    stringBuffer.append(TEXT_777);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_778);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_779);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_780);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_781);
    
	        			}
	        			
    stringBuffer.append(TEXT_782);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_783);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_784);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_785);
    stringBuffer.append( header );
    stringBuffer.append(hasDynamic?"-1":"");
    stringBuffer.append(TEXT_786);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_787);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_788);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_789);
    stringBuffer.append(removeEmptyRow );
    stringBuffer.append(TEXT_790);
     if(dieOnError) {
    stringBuffer.append(TEXT_791);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_792);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_793);
    }
    stringBuffer.append(TEXT_794);
     } else { 
    stringBuffer.append(TEXT_795);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_796);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_797);
    }
    stringBuffer.append(TEXT_798);
     } 
    stringBuffer.append(TEXT_799);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_800);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_801);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_802);
    }
    stringBuffer.append(TEXT_803);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_804);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_805);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_806);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_807);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_808);
    
	   				if(("true").equals(removeEmptyRow)){
	   				
    stringBuffer.append(TEXT_809);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_810);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_811);
    
					}
					
    stringBuffer.append(TEXT_812);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_813);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_814);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_815);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_816);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_817);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_818);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_819);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_820);
    
			    	if (conns!=null) {
	    				if (conns.size()>0 && firstConnName != null && firstConnName.length()>0) {
	    					for (int i=0;i<conns.size();i++) {
	    						IConnection connTemp = conns.get(i);
	    						if (connTemp.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
								
    stringBuffer.append(TEXT_821);
    stringBuffer.append(connTemp.getName() );
    stringBuffer.append(TEXT_822);
    
	    						}
	    					}
	    					
							IConnection conn = conns.get(0);
							if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
							
    stringBuffer.append(TEXT_823);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_824);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_825);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_826);
    
									List<IMetadataColumn> columns=metadata.getListColumns();
									int columnSize = columns.size();
									if(hasDynamic){// generate the dynamic schema code
										generateCode.colLen = columnSize;
										generateCode.dynamic_index = dynamic_index;
										generateCode.generateDynamicSchemaCode(true); //true: CSV mode
										rowUtil.callValueToConnWithD("row"+cid, firstConnName, "dynamic_"+cid);
									}else{
										rowUtil.callValueToConn("row"+cid, firstConnName);
									}
										
	
									if(rejectConnName.equals(firstConnName)) {
									
    stringBuffer.append(TEXT_827);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_828);
    
									}
									
    stringBuffer.append(TEXT_829);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_830);
    
        							if (dieOnError) {
            						
    stringBuffer.append(TEXT_831);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_832);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_833);
    }
    stringBuffer.append(TEXT_834);
    
        							} else {
								        if(isLog4jEnabled){
    stringBuffer.append(TEXT_835);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_836);
    }
            							if(!("").equals(rejectConnName)&&!rejectConnName.equals(firstConnName)&&rejectColumnList != null && rejectColumnList.size() > 0) {
						                
    stringBuffer.append(TEXT_837);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_838);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_839);
    
                							rowUtil.callConnToConn(firstConnName, rejectConnName);
                							
    stringBuffer.append(TEXT_840);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_841);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_842);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_843);
    
            							} else if(("").equals(rejectConnName)){
                						
    stringBuffer.append(TEXT_844);
    stringBuffer.append(firstConnName );
    stringBuffer.append(TEXT_845);
    	
            							} else if(rejectConnName.equals(firstConnName)){
            							
    stringBuffer.append(TEXT_846);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_847);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_848);
    
            							}
        							} 
        							
    stringBuffer.append(TEXT_849);
    			
							}
						}
						if (conns.size()>0) {	
							boolean isFirstEnter = true;
							for (int i=0;i<conns.size();i++) {
								IConnection conn = conns.get(i);
								if ((conn.getName().compareTo(firstConnName)!=0)&&(conn.getName().compareTo(rejectConnName)!=0)&&(conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA))) {
									if(isFirstEnter) {
									
    stringBuffer.append(TEXT_850);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_851);
    isFirstEnter = false; 
									}
									
    stringBuffer.append(TEXT_852);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_853);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_854);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_855);
    
        							rowUtil.callConnToConn(firstConnName, conn.getName());
								}
							}
							if(!isFirstEnter) {
							
    stringBuffer.append(TEXT_856);
    
							}
						}
					}
			}
		}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(isLog4jEnabled){
    stringBuffer.append(TEXT_857);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_858);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_859);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_860);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_861);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_862);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_863);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_864);
    }
  	}
	
    stringBuffer.append(TEXT_865);
    return stringBuffer.toString();
  }
}
