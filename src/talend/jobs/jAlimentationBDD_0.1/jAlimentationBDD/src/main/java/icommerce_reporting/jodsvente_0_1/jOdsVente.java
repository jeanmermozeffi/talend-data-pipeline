// ============================================================================
//
// Copyright (c) 2006-2015, Talend SA
//
// Ce code source a été automatiquement généré par_Talend Open Studio for Data Integration
// / Soumis à la Licence Apache, Version 2.0 (la "Licence") ;
// votre utilisation de ce fichier doit respecter les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Sauf lorsqu'explicitement prévu par la loi en vigueur ou accepté par écrit, le logiciel
// distribué sous la Licence est distribué "TEL QUEL",
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour connaître la terminologie spécifique régissant les autorisations et
// les limites prévues par la Licence.


package icommerce_reporting.jodsvente_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendStringUtil;
import routines.TalendDataGenerator;
import routines.TalendString;
import routines.StringHandling;
import routines.TalendDate;
import routines.Relational;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;

	//the import part of tJava_2
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: jOdsVente Purpose: jOdsCategorie<br>
 * Description: jOdsCategorie <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jOdsVente implements TalendJob {

protected static void logIgnoredError(String message, Throwable cause) {
       System.err.println(message);
       if (cause != null) {
               cause.printStackTrace();
       }

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(additinal_params != null){
				
					this.setProperty("additinal_params", additinal_params.toString());
				
			}
			
			if(database != null){
				
					this.setProperty("database", database.toString());
				
			}
			
			if(port != null){
				
					this.setProperty("port", port.toString());
				
			}
			
			if(postgres_password != null){
				
					this.setProperty("postgres_password", postgres_password.toString());
				
			}
			
			if(postgres_user != null){
				
					this.setProperty("postgres_user", postgres_user.toString());
				
			}
			
			if(schema_ods != null){
				
					this.setProperty("schema_ods", schema_ods.toString());
				
			}
			
			if(server_name != null){
				
					this.setProperty("server_name", server_name.toString());
				
			}
			
			if(schema_params != null){
				
					this.setProperty("schema_params", schema_params.toString());
				
			}
			
			if(encodage != null){
				
					this.setProperty("encodage", encodage.toString());
				
			}
			
			if(fieldSeparator != null){
				
					this.setProperty("fieldSeparator", fieldSeparator.toString());
				
			}
			
			if(projectFolder != null){
				
					this.setProperty("projectFolder", projectFolder.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String additinal_params;
public String getAdditinal_params(){
	return this.additinal_params;
}
public String database;
public String getDatabase(){
	return this.database;
}
public String port;
public String getPort(){
	return this.port;
}
public java.lang.String postgres_password;
public java.lang.String getPostgres_password(){
	return this.postgres_password;
}
public String postgres_user;
public String getPostgres_user(){
	return this.postgres_user;
}
public String schema_ods;
public String getSchema_ods(){
	return this.schema_ods;
}
public String server_name;
public String getServer_name(){
	return this.server_name;
}
public String schema_params;
public String getSchema_params(){
	return this.schema_params;
}
public String encodage;
public String getEncodage(){
	return this.encodage;
}
public String fieldSeparator;
public String getFieldSeparator(){
	return this.fieldSeparator;
}
		public String projectFolder;
		public String getProjectFolder(){
			return this.projectFolder;
		}
		
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "jOdsVente";
	private final String projectName = "ICOMMERCE_REPORTING";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				jOdsVente.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jOdsVente.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void Implicit_Context_Database_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							Implicit_Context_Context_error(exception, errorComponent, globalMap);
						
						}
					
			public void Implicit_Context_Context_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					Implicit_Context_Database_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileList_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDie_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void Implicit_Context_Database_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileList_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	






public static class row_Implicit_Context_DatabaseStruct implements routines.system.IPersistableRow<row_Implicit_Context_DatabaseStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row_Implicit_Context_DatabaseStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void Implicit_Context_DatabaseProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_Implicit_Context_DatabaseStruct row_Implicit_Context_Database = new row_Implicit_Context_DatabaseStruct();




	
	/**
	 * [Implicit_Context_Context begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Context", false);
		start_Hash.put("Implicit_Context_Context", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_Implicit_Context_Context = 0;
		
	java.util.List<String> assignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	int nb_line_Implicit_Context_Context = 0;

 



/**
 * [Implicit_Context_Context begin ] stop
 */



	
	/**
	 * [Implicit_Context_Database begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Database", false);
		start_Hash.put("Implicit_Context_Database", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	
		int tos_count_Implicit_Context_Database = 0;
		
	
    
	
		    int nb_line_Implicit_Context_Database = 0;
		    java.sql.Connection conn_Implicit_Context_Database = null;
				String driverClass_Implicit_Context_Database = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_Implicit_Context_Database = java.lang.Class.forName(driverClass_Implicit_Context_Database);
				String dbUser_Implicit_Context_Database = context.postgres_user;
				
				
	final String decryptedPassword_Implicit_Context_Database = context.postgres_password; 
				
				String dbPwd_Implicit_Context_Database = decryptedPassword_Implicit_Context_Database;
				
				String url_Implicit_Context_Database = "jdbc:postgresql://" + context.server_name + ":" + context.port + "/" + context.database + "?" + context.additinal_params;
				
				conn_Implicit_Context_Database = java.sql.DriverManager.getConnection(url_Implicit_Context_Database,dbUser_Implicit_Context_Database,dbPwd_Implicit_Context_Database);
		        
				conn_Implicit_Context_Database.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_Implicit_Context_Database = conn_Implicit_Context_Database.createStatement();

		    String dbquery_Implicit_Context_Database = "SELECT \n  \""+context.schema_params+"\".\"CONTEXTE\".\"key\", \n  \""+context.schema_params+"\".\"CONTEXTE\".\"value\"\nFROM \""+context.schema_params+"\".\"CONTEXTE\"";
		    

            	globalMap.put("Implicit_Context_Database_QUERY",dbquery_Implicit_Context_Database);
		    java.sql.ResultSet rs_Implicit_Context_Database = null;

		    try {
		    	rs_Implicit_Context_Database = stmt_Implicit_Context_Database.executeQuery(dbquery_Implicit_Context_Database);
		    	java.sql.ResultSetMetaData rsmd_Implicit_Context_Database = rs_Implicit_Context_Database.getMetaData();
		    	int colQtyInRs_Implicit_Context_Database = rsmd_Implicit_Context_Database.getColumnCount();

		    String tmpContent_Implicit_Context_Database = null;
		    
		    
		    while (rs_Implicit_Context_Database.next()) {
		        nb_line_Implicit_Context_Database++;
		        
							if(colQtyInRs_Implicit_Context_Database < 1) {
								row_Implicit_Context_Database.key = null;
							} else {
	                         		
        	row_Implicit_Context_Database.key = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 1, false);
		                    }
							if(colQtyInRs_Implicit_Context_Database < 2) {
								row_Implicit_Context_Database.value = null;
							} else {
	                         		
        	row_Implicit_Context_Database.value = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 2, false);
		                    }
					


 



/**
 * [Implicit_Context_Database begin ] stop
 */
	
	/**
	 * [Implicit_Context_Database main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 


	tos_count_Implicit_Context_Database++;

/**
 * [Implicit_Context_Database main ] stop
 */
	
	/**
	 * [Implicit_Context_Database process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database process_data_begin ] stop
 */

	
	/**
	 * [Implicit_Context_Context main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					
        //////////////////////////
        String tmp_key_Implicit_Context_Context = null;
                    String key_Implicit_Context_Context = null;
                      if (row_Implicit_Context_Database.key != null){
                          tmp_key_Implicit_Context_Context = row_Implicit_Context_Database.key.trim();
                        if ((tmp_key_Implicit_Context_Context.startsWith("#") || tmp_key_Implicit_Context_Context.startsWith("!") )){
                          tmp_key_Implicit_Context_Context = null;
                        } else {
                          row_Implicit_Context_Database.key = tmp_key_Implicit_Context_Context;
                        }
                      }
                        if(row_Implicit_Context_Database.key != null) {
                    key_Implicit_Context_Context =
                        row_Implicit_Context_Database.key;
                        }
                    String value_Implicit_Context_Context = null;
                        if(row_Implicit_Context_Database.value != null) {
                    value_Implicit_Context_Context =
                        row_Implicit_Context_Database.value;
                        }
				
				String currentValue_Implicit_Context_Context = value_Implicit_Context_Context;
										
						if ((key_Implicit_Context_Context != null) && ("postgres_password".equals(key_Implicit_Context_Context)) ) currentValue_Implicit_Context_Context = currentValue_Implicit_Context_Context.replaceAll(".", "*");

  if (tmp_key_Implicit_Context_Context != null){
  try{
        if(key_Implicit_Context_Context!=null && "additinal_params".equals(key_Implicit_Context_Context))
        {
           context.additinal_params=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "database".equals(key_Implicit_Context_Context))
        {
           context.database=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "port".equals(key_Implicit_Context_Context))
        {
           context.port=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "postgres_password".equals(key_Implicit_Context_Context))
        {
           context.postgres_password=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "postgres_user".equals(key_Implicit_Context_Context))
        {
           context.postgres_user=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_ods".equals(key_Implicit_Context_Context))
        {
           context.schema_ods=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "server_name".equals(key_Implicit_Context_Context))
        {
           context.server_name=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_params".equals(key_Implicit_Context_Context))
        {
           context.schema_params=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "encodage".equals(key_Implicit_Context_Context))
        {
           context.encodage=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "fieldSeparator".equals(key_Implicit_Context_Context))
        {
           context.fieldSeparator=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "projectFolder".equals(key_Implicit_Context_Context))
        {
           context.projectFolder=value_Implicit_Context_Context;
        }


        if (context.getProperty(key_Implicit_Context_Context)!=null)
        {
            assignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }else  {
            newPropertyList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }
        if(value_Implicit_Context_Context == null){
            context.setProperty(key_Implicit_Context_Context, "");
        }else{
            context.setProperty(key_Implicit_Context_Context,value_Implicit_Context_Context);
        }
    }catch(java.lang.Exception e){
globalMap.put("Implicit_Context_Context_ERROR_MESSAGE",e.getMessage());
        System.err.println("Setting a value for the key \"" + key_Implicit_Context_Context + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_Implicit_Context_Context++;
    }
        //////////////////////////

 


	tos_count_Implicit_Context_Context++;

/**
 * [Implicit_Context_Context main ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_begin ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_end ] stop
 */



	
	/**
	 * [Implicit_Context_Database process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database process_data_end ] stop
 */
	
	/**
	 * [Implicit_Context_Database end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

	}
}finally{
	if (rs_Implicit_Context_Database != null) {
		rs_Implicit_Context_Database.close();
	}
	if (stmt_Implicit_Context_Database != null) {
		stmt_Implicit_Context_Database.close();
	}
	if(conn_Implicit_Context_Database != null && !conn_Implicit_Context_Database.isClosed()) {
		
			conn_Implicit_Context_Database.commit();
			
		
			conn_Implicit_Context_Database.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("Implicit_Context_Database_NB_LINE",nb_line_Implicit_Context_Database);
 

ok_Hash.put("Implicit_Context_Database", true);
end_Hash.put("Implicit_Context_Database", System.currentTimeMillis());




/**
 * [Implicit_Context_Database end ] stop
 */

	
	/**
	 * [Implicit_Context_Context end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
	
	java.util.Enumeration<?> enu_Implicit_Context_Context = context.propertyNames();
    while(enu_Implicit_Context_Context.hasMoreElements())
    {           
    	String key_Implicit_Context_Context = (String)enu_Implicit_Context_Context.nextElement();
        if(!assignList_Implicit_Context_Context.contains(key_Implicit_Context_Context) && !newPropertyList_Implicit_Context_Context.contains(key_Implicit_Context_Context))
        {
            noAssignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }          
    } 

    String newPropertyStr_Implicit_Context_Context = newPropertyList_Implicit_Context_Context.toString();
    String newProperty_Implicit_Context_Context = newPropertyStr_Implicit_Context_Context.substring(1, newPropertyStr_Implicit_Context_Context.length() - 1);
    
    String noAssignStr_Implicit_Context_Context = noAssignList_Implicit_Context_Context.toString();
    String noAssign_Implicit_Context_Context = noAssignStr_Implicit_Context_Context.substring(1, noAssignStr_Implicit_Context_Context.length() - 1);
    
    globalMap.put("Implicit_Context_Context_KEY_NOT_INCONTEXT", newProperty_Implicit_Context_Context);
    globalMap.put("Implicit_Context_Context_KEY_NOT_LOADED", noAssign_Implicit_Context_Context);

    globalMap.put("Implicit_Context_Context_NB_LINE",nb_line_Implicit_Context_Context);

	List<String> parametersToEncrypt_Implicit_Context_Context = new java.util.ArrayList<String>();
	
		parametersToEncrypt_Implicit_Context_Context.add("postgres_password");
		
	
	resumeUtil.addLog("NODE", "NODE:Implicit_Context_Context", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_Implicit_Context_Context));    
    
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 

ok_Hash.put("Implicit_Context_Context", true);
end_Hash.put("Implicit_Context_Context", System.currentTimeMillis());




/**
 * [Implicit_Context_Context end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [Implicit_Context_Database finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database finally ] stop
 */

	
	/**
	 * [Implicit_Context_Context finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 1);
	}
	

public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tChronometerStart_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";

	
		int tos_count_tChronometerStart_1 = 0;
		

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tChronometerStart_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		


	
            String dbProperties_tDBConnection_1 = context.additinal_params;
            String url_tDBConnection_1 = "jdbc:postgresql://"+context.server_name+":"+context.port+"/"+context.database;
            
            if(dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
                url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
            }
	String dbUser_tDBConnection_1 = context.postgres_user;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.postgres_password; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_1 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_1 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_1.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_1 = drivers_tDBConnection_1.nextElement();
        if (redShiftDriverNames_tDBConnection_1.contains(d_tDBConnection_1.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_1);
                java.sql.DriverManager.registerDriver(d_tDBConnection_1);
            } catch (java.lang.Exception e_tDBConnection_1) {
globalMap.put("tDBConnection_1_ERROR_MESSAGE",e_tDBConnection_1.getMessage());
                    //do nothing
            }
        }
    }
	
			String sharedConnectionName_tDBConnection_1 = "VENTE_ODS";
			conn_tDBConnection_1 = SharedDBConnection.getDBConnection("org.postgresql.Driver",url_tDBConnection_1,dbUser_tDBConnection_1 , dbPwd_tDBConnection_1 , sharedConnectionName_tDBConnection_1);
			globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("schema_" + "tDBConnection_1",context.schema_ods);

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tSetGlobalVar_1Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tSetGlobalVar_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_1", false);
		start_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_1";

	
		int tos_count_tSetGlobalVar_1 = 0;
		

 



/**
 * [tSetGlobalVar_1 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

globalMap.put("masque_fichier", "ICOM_*_VENTE.csv");
globalMap.put("nom_flux", "VENTE");

 


	tos_count_tSetGlobalVar_1++;

/**
 * [tSetGlobalVar_1 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 

ok_Hash.put("tSetGlobalVar_1", true);
end_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tSetGlobalVar_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSetGlobalVar_1 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		


System.out.println("-----------------------------------------------------------------------------");
System.out.println("Début d'exécution du job "+jobName+ "        : " + 
TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",new java.util.Date(((Long)globalMap.get("tChronometerStart_1_STARTTIME"))))
);
System.out.println("-----------------------------------------------------------------------------");

 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tFileList_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileList_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileList_1", false);
		start_Hash.put("tFileList_1", System.currentTimeMillis());
		
	
	currentComponent="tFileList_1";

	
		int tos_count_tFileList_1 = 0;
		
	
 
     
    
  String directory_tFileList_1 = context.projectFolder + TalendDate.getDate("YYYYMMDD");
  final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
  final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>(); 
    maskList_tFileList_1.add(((String)globalMap.get("masque_fichier")));  
  for (final String filemask_tFileList_1 : maskList_tFileList_1) {
	String filemask_compile_tFileList_1 = filemask_tFileList_1;
	
		filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler.globToPerl5(filemask_tFileList_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
	
		java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern.compile(filemask_compile_tFileList_1);
	patternList_tFileList_1.add(fileNamePattern_tFileList_1);
  }
  int NB_FILEtFileList_1 = 0;

  final boolean case_sensitive_tFileList_1 = true;
	
	
	
    final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
    final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
	java.io.File file_tFileList_1 = new java.io.File(directory_tFileList_1);
     
		file_tFileList_1.listFiles(new java.io.FilenameFilter() {
			public boolean accept(java.io.File dir, String name) {
				java.io.File file = new java.io.File(dir, name);
                if (!file.isDirectory()) {
                	
    	String fileName_tFileList_1 = file.getName();
		for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
          	if (fileNamePattern_tFileList_1.matcher(fileName_tFileList_1).matches()){
					if(!filePath_tFileList_1.contains(file.getAbsolutePath())) {
			          list_tFileList_1.add(file);
			          filePath_tFileList_1.add(file.getAbsolutePath());
			        }
			}
		}
                }
              return true;
            }
          }
      ); 
      java.util.Collections.sort(list_tFileList_1);
    
    for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++){
      java.io.File files_tFileList_1 = list_tFileList_1.get(i_tFileList_1);
      String fileName_tFileList_1 = files_tFileList_1.getName();
      
      String currentFileName_tFileList_1 = files_tFileList_1.getName(); 
      String currentFilePath_tFileList_1 = files_tFileList_1.getAbsolutePath();
      String currentFileDirectory_tFileList_1 = files_tFileList_1.getParent();
      String currentFileExtension_tFileList_1 = null;
      
      if (files_tFileList_1.getName().contains(".") && files_tFileList_1.isFile()){
        currentFileExtension_tFileList_1 = files_tFileList_1.getName().substring(files_tFileList_1.getName().lastIndexOf(".") + 1);
      } else{
        currentFileExtension_tFileList_1 = "";
      }
      
      NB_FILEtFileList_1 ++;
      globalMap.put("tFileList_1_CURRENT_FILE", currentFileName_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEPATH", currentFilePath_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_1);
      globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
      
 



/**
 * [tFileList_1 begin ] stop
 */
	
	/**
	 * [tFileList_1 main ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 


	tos_count_tFileList_1++;

/**
 * [tFileList_1 main ] stop
 */
	
	/**
	 * [tFileList_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileList_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_end ] stop
 */
	
	/**
	 * [tFileList_1 end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

  
    }
  globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
  

    if (NB_FILEtFileList_1 == 0) throw new RuntimeException("No file found in directory " + directory_tFileList_1);
  
 

 

ok_Hash.put("tFileList_1", true);
end_Hash.put("tFileList_1", System.currentTimeMillis());

   			if (((Integer)globalMap.get("tFileList_1_NB_FILE"))==1) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tFileInputDelimited_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}



/**
 * [tFileList_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileList_1 finally ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";

	
		int tos_count_tDie_1 = 0;
		

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

	try {
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Le répertoire" + TalendDate.getDate("YYYYMMDD") + "ne contient pas de fichier" +  ((String)globalMap.get("nom_flux")) +  "." + " Veuillez déposer le fichier du jour et relancer l'intégration.");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le répertoire" + TalendDate.getDate("YYYYMMDD") + "ne contient pas de fichier" +  ((String)globalMap.get("nom_flux")) +  "." + " Veuillez déposer le fichier du jour et relancer l'intégration.");
	globalMap.put("tDie_1_DIE_MESSAGES", "Le répertoire" + TalendDate.getDate("YYYYMMDD") + "ne contient pas de fichier" +  ((String)globalMap.get("nom_flux")) +  "." + " Veuillez déposer le fichier du jour et relancer l'intégration.");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	
	System.exit(4);

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	


public static class InsertRejectStruct implements routines.system.IPersistableRow<InsertRejectStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertRejectStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class InsertDuplicateStruct implements routines.system.IPersistableRow<InsertDuplicateStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertDuplicateStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class InsertDataStruct implements routines.system.IPersistableRow<InsertDataStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				
			    public boolean BL_LIGNE_IN_DWH;

				public boolean getBL_LIGNE_IN_DWH () {
					return this.BL_LIGNE_IN_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
		sb.append(",BL_LIGNE_IN_DWH="+String.valueOf(BL_LIGNE_IN_DWH));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertDataStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class VenteExistantStruct implements routines.system.IPersistableRow<VenteExistantStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(VenteExistantStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class VenteAsProduitStruct implements routines.system.IPersistableRow<VenteAsProduitStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(VenteAsProduitStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class VenteNotProduitStruct implements routines.system.IPersistableRow<VenteNotProduitStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(VenteNotProduitStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class VenteAsClientStruct implements routines.system.IPersistableRow<VenteAsClientStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(VenteAsClientStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class VenteNotClientStruct implements routines.system.IPersistableRow<VenteNotClientStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(VenteNotClientStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				
			    public String errorMessage;

				public String getErrorMessage () {
					return this.errorMessage;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
		sb.append(",errorMessage="+errorMessage);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class ListeVenteStruct implements routines.system.IPersistableRow<ListeVenteStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(ListeVenteStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tFileInputDelimited_1Struct implements routines.system.IPersistableRow<after_tFileInputDelimited_1Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
						this.PRIX_ACHAT = (BigDecimal) dis.readObject();
					
						this.PRIX_VENTE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_ACHAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_VENTE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tFileInputDelimited_1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tDBInput_2Process(globalMap);
		tDBInput_1Process(globalMap);
		tDBInput_3Process(globalMap);

		row1Struct row1 = new row1Struct();
ListeVenteStruct ListeVente = new ListeVenteStruct();
row2Struct row2 = new row2Struct();
row3Struct row3 = new row3Struct();
VenteAsClientStruct VenteAsClient = new VenteAsClientStruct();
VenteAsProduitStruct VenteAsProduit = new VenteAsProduitStruct();
InsertDataStruct InsertData = new InsertDataStruct();
VenteExistantStruct VenteExistant = new VenteExistantStruct();
VenteNotProduitStruct VenteNotProduit = new VenteNotProduitStruct();
VenteNotClientStruct VenteNotClient = new VenteNotClientStruct();
row6Struct row6 = new row6Struct();
InsertDuplicateStruct InsertDuplicate = new InsertDuplicateStruct();
row5Struct row5 = new row5Struct();
InsertRejectStruct InsertReject = new InsertRejectStruct();










	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertData");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = context.schema_ods;
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("ODS_VENTE");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("ODS_VENTE");
}


int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;

boolean whetherReject_tDBOutput_1 = false;

java.sql.Connection conn_tDBOutput_1 = null;
String dbUser_tDBOutput_1 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_1 = "jdbc:postgresql://"+context.server_name+":"+context.port+"/"+context.database + "?" + context.additinal_params;
    dbUser_tDBOutput_1 = context.postgres_user;

	final String decryptedPassword_tDBOutput_1 = context.postgres_password; 

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 10000;
        int commitCounter_tDBOutput_1 = 0;


   int batchSize_tDBOutput_1 = 10000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"ID_VENTE\",\"CD_PRODUIT\",\"DT_VENTE\",\"ID_CLIENT\",\"QTE_VENTE\",\"PRIX_ACHAT\",\"PRIX_VENTE\",\"LB_NOM_FICHIER\",\"DT_INSERTION\",\"LB_JOB_NAME\",\"BL_LIGNE_IN_DWH\") VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */




	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"VenteExistant");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("ODS_REJET");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("ODS_REJET");
}


int nb_line_tDBOutput_2 = 0;
int nb_line_update_tDBOutput_2 = 0;
int nb_line_inserted_tDBOutput_2 = 0;
int nb_line_deleted_tDBOutput_2 = 0;
int nb_line_rejected_tDBOutput_2 = 0;

int deletedCount_tDBOutput_2=0;
int updatedCount_tDBOutput_2=0;
int insertedCount_tDBOutput_2=0;
int rowsToCommitCount_tDBOutput_2=0;
int rejectedCount_tDBOutput_2=0;

boolean whetherReject_tDBOutput_2 = false;

java.sql.Connection conn_tDBOutput_2 = null;
String dbUser_tDBOutput_2 = null;

	conn_tDBOutput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
	


   int batchSize_tDBOutput_2 = 10000;
   int batchSizeCounter_tDBOutput_2=0;

int count_tDBOutput_2=0;
	    String insert_tDBOutput_2 = "INSERT INTO \"" + tableName_tDBOutput_2 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"VenteAsProduit");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
InsertDataStruct InsertData_tmp = new InsertDataStruct();
VenteExistantStruct VenteExistant_tmp = new VenteExistantStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */




	
	/**
	 * [tDBOutput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_6", false);
		start_Hash.put("tDBOutput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"VenteNotProduit");
					}
				
		int tos_count_tDBOutput_6 = 0;
		





String dbschema_tDBOutput_6 = null;
	dbschema_tDBOutput_6 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_6 = null;
if(dbschema_tDBOutput_6 == null || dbschema_tDBOutput_6.trim().length() == 0) {
	tableName_tDBOutput_6 = ("ODS_REJET");
} else {
	tableName_tDBOutput_6 = dbschema_tDBOutput_6 + "\".\"" + ("ODS_REJET");
}


int nb_line_tDBOutput_6 = 0;
int nb_line_update_tDBOutput_6 = 0;
int nb_line_inserted_tDBOutput_6 = 0;
int nb_line_deleted_tDBOutput_6 = 0;
int nb_line_rejected_tDBOutput_6 = 0;

int deletedCount_tDBOutput_6=0;
int updatedCount_tDBOutput_6=0;
int insertedCount_tDBOutput_6=0;
int rowsToCommitCount_tDBOutput_6=0;
int rejectedCount_tDBOutput_6=0;

boolean whetherReject_tDBOutput_6 = false;

java.sql.Connection conn_tDBOutput_6 = null;
String dbUser_tDBOutput_6 = null;

	conn_tDBOutput_6 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
	


   int batchSize_tDBOutput_6 = 10000;
   int batchSizeCounter_tDBOutput_6=0;

int count_tDBOutput_6=0;
	    String insert_tDBOutput_6 = "INSERT INTO \"" + tableName_tDBOutput_6 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_6 = conn_tDBOutput_6.prepareStatement(insert_tDBOutput_6);
	    resourceMap.put("pstmt_tDBOutput_6", pstmt_tDBOutput_6);
	    

 



/**
 * [tDBOutput_6 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"VenteAsClient");
					}
				
		int tos_count_tMap_5 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
					globalMap.get( "tHash_Lookup_row8" ))
					;					
					
	

row8Struct row8HashKey = new row8Struct();
row8Struct row8Default = new row8Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_5__Struct  {
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
VenteAsProduitStruct VenteAsProduit_tmp = new VenteAsProduitStruct();
VenteNotProduitStruct VenteNotProduit_tmp = new VenteNotProduitStruct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
 */




	
	/**
	 * [tDBOutput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_7", false);
		start_Hash.put("tDBOutput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"VenteNotClient");
					}
				
		int tos_count_tDBOutput_7 = 0;
		





String dbschema_tDBOutput_7 = null;
	dbschema_tDBOutput_7 = context.schema_ods;
	

String tableName_tDBOutput_7 = null;
if(dbschema_tDBOutput_7 == null || dbschema_tDBOutput_7.trim().length() == 0) {
	tableName_tDBOutput_7 = ("ODS_REJET");
} else {
	tableName_tDBOutput_7 = dbschema_tDBOutput_7 + "\".\"" + ("ODS_REJET");
}


int nb_line_tDBOutput_7 = 0;
int nb_line_update_tDBOutput_7 = 0;
int nb_line_inserted_tDBOutput_7 = 0;
int nb_line_deleted_tDBOutput_7 = 0;
int nb_line_rejected_tDBOutput_7 = 0;

int deletedCount_tDBOutput_7=0;
int updatedCount_tDBOutput_7=0;
int insertedCount_tDBOutput_7=0;
int rowsToCommitCount_tDBOutput_7=0;
int rejectedCount_tDBOutput_7=0;

boolean whetherReject_tDBOutput_7 = false;

java.sql.Connection conn_tDBOutput_7 = null;
String dbUser_tDBOutput_7 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_7 = "jdbc:postgresql://"+context.server_name+":"+context.port+"/"+context.database + "?" + context.additinal_params;
    dbUser_tDBOutput_7 = context.postgres_user;

	final String decryptedPassword_tDBOutput_7 = context.postgres_password; 

    String dbPwd_tDBOutput_7 = decryptedPassword_tDBOutput_7;

    conn_tDBOutput_7 = java.sql.DriverManager.getConnection(url_tDBOutput_7,dbUser_tDBOutput_7,dbPwd_tDBOutput_7);
	
	resourceMap.put("conn_tDBOutput_7", conn_tDBOutput_7);
        conn_tDBOutput_7.setAutoCommit(false);
        int commitEvery_tDBOutput_7 = 10000;
        int commitCounter_tDBOutput_7 = 0;


   int batchSize_tDBOutput_7 = 10000;
   int batchSizeCounter_tDBOutput_7=0;

int count_tDBOutput_7=0;
	    String insert_tDBOutput_7 = "INSERT INTO \"" + tableName_tDBOutput_7 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_7 = conn_tDBOutput_7.prepareStatement(insert_tDBOutput_7);
	    resourceMap.put("pstmt_tDBOutput_7", pstmt_tDBOutput_7);
	    

 



/**
 * [tDBOutput_7 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
					}
				
		int tos_count_tMap_6 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
					globalMap.get( "tHash_Lookup_row7" ))
					;					
					
	

row7Struct row7HashKey = new row7Struct();
row7Struct row7Default = new row7Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6__Struct  {
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
VenteAsClientStruct VenteAsClient_tmp = new VenteAsClientStruct();
VenteNotClientStruct VenteNotClient_tmp = new VenteNotClientStruct();
// ###############################

        
        



        









 



/**
 * [tMap_6 begin ] stop
 */





	
	/**
	 * [tDBOutput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_5", false);
		start_Hash.put("tDBOutput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertDuplicate");
					}
				
		int tos_count_tDBOutput_5 = 0;
		





String dbschema_tDBOutput_5 = null;
	dbschema_tDBOutput_5 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_5 = null;
if(dbschema_tDBOutput_5 == null || dbschema_tDBOutput_5.trim().length() == 0) {
	tableName_tDBOutput_5 = ("ODS_REJET");
} else {
	tableName_tDBOutput_5 = dbschema_tDBOutput_5 + "\".\"" + ("ODS_REJET");
}


int nb_line_tDBOutput_5 = 0;
int nb_line_update_tDBOutput_5 = 0;
int nb_line_inserted_tDBOutput_5 = 0;
int nb_line_deleted_tDBOutput_5 = 0;
int nb_line_rejected_tDBOutput_5 = 0;

int deletedCount_tDBOutput_5=0;
int updatedCount_tDBOutput_5=0;
int insertedCount_tDBOutput_5=0;
int rowsToCommitCount_tDBOutput_5=0;
int rejectedCount_tDBOutput_5=0;

boolean whetherReject_tDBOutput_5 = false;

java.sql.Connection conn_tDBOutput_5 = null;
String dbUser_tDBOutput_5 = null;

	conn_tDBOutput_5 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
	


   int batchSize_tDBOutput_5 = 10000;
   int batchSizeCounter_tDBOutput_5=0;

int count_tDBOutput_5=0;
	    String insert_tDBOutput_5 = "INSERT INTO \"" + tableName_tDBOutput_5 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(insert_tDBOutput_5);
	    resourceMap.put("pstmt_tDBOutput_5", pstmt_tDBOutput_5);
	    

 



/**
 * [tDBOutput_5 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
InsertDuplicateStruct InsertDuplicate_tmp = new InsertDuplicateStruct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tUniqRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_1", false);
		start_Hash.put("tUniqRow_1", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tUniqRow_1 = 0;
		

	
		class KeyStruct_tUniqRow_1 {
	
			private static final int DEFAULT_HASHCODE = 1;
		    private static final int PRIME = 31;
		    private int hashCode = DEFAULT_HASHCODE;
		    public boolean hashCodeDirty = true;
	
	        
					String ID_VENTE;
					String CD_PRODUIT;        
	        
		    @Override
			public int hashCode() {
				if (this.hashCodeDirty) {
					final int prime = PRIME;
					int result = DEFAULT_HASHCODE;
			
								result = prime * result + ((this.ID_VENTE == null) ? 0 : this.ID_VENTE.hashCode());
								
								result = prime * result + ((this.CD_PRODUIT == null) ? 0 : this.CD_PRODUIT.hashCode());
								
		    		this.hashCode = result;
		    		this.hashCodeDirty = false;		
				}
				return this.hashCode;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj) return true;
				if (obj == null) return false;
				if (getClass() != obj.getClass()) return false;
				final KeyStruct_tUniqRow_1 other = (KeyStruct_tUniqRow_1) obj;
				
									if (this.ID_VENTE == null) {
										if (other.ID_VENTE != null) 
											return false;
								
									} else if (!this.ID_VENTE.equals(other.ID_VENTE))
								 
										return false;
								
									if (this.CD_PRODUIT == null) {
										if (other.CD_PRODUIT != null) 
											return false;
								
									} else if (!this.CD_PRODUIT.equals(other.CD_PRODUIT))
								 
										return false;
								
				
				return true;
			}
	  
	        
		}

	
int nb_uniques_tUniqRow_1 = 0;
int nb_duplicates_tUniqRow_1 = 0;
KeyStruct_tUniqRow_1 finder_tUniqRow_1 = new KeyStruct_tUniqRow_1();
java.util.Set<KeyStruct_tUniqRow_1> keystUniqRow_1 = new java.util.HashSet<KeyStruct_tUniqRow_1>(); 

 



/**
 * [tUniqRow_1 begin ] stop
 */





	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertReject");
					}
				
		int tos_count_tDBOutput_4 = 0;
		





String dbschema_tDBOutput_4 = null;
	dbschema_tDBOutput_4 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_4 = null;
if(dbschema_tDBOutput_4 == null || dbschema_tDBOutput_4.trim().length() == 0) {
	tableName_tDBOutput_4 = ("ODS_REJET");
} else {
	tableName_tDBOutput_4 = dbschema_tDBOutput_4 + "\".\"" + ("ODS_REJET");
}


int nb_line_tDBOutput_4 = 0;
int nb_line_update_tDBOutput_4 = 0;
int nb_line_inserted_tDBOutput_4 = 0;
int nb_line_deleted_tDBOutput_4 = 0;
int nb_line_rejected_tDBOutput_4 = 0;

int deletedCount_tDBOutput_4=0;
int updatedCount_tDBOutput_4=0;
int insertedCount_tDBOutput_4=0;
int rowsToCommitCount_tDBOutput_4=0;
int rejectedCount_tDBOutput_4=0;

boolean whetherReject_tDBOutput_4 = false;

java.sql.Connection conn_tDBOutput_4 = null;
String dbUser_tDBOutput_4 = null;

	conn_tDBOutput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
	


   int batchSize_tDBOutput_4 = 10000;
   int batchSizeCounter_tDBOutput_4=0;

int count_tDBOutput_4=0;
	    String insert_tDBOutput_4 = "INSERT INTO \"" + tableName_tDBOutput_4 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(insert_tDBOutput_4);
	    resourceMap.put("pstmt_tDBOutput_4", pstmt_tDBOutput_4);
	    

 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row5");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
InsertRejectStruct InsertReject_tmp = new InsertRejectStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tFilterRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_1", false);
		start_Hash.put("tFilterRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"ListeVente");
					}
				
		int tos_count_tFilterRow_1 = 0;
		
    int nb_line_tFilterRow_1 = 0;
    int nb_line_ok_tFilterRow_1 = 0;
    int nb_line_reject_tFilterRow_1 = 0;

    class Operator_tFilterRow_1 {
      private String sErrorMsg = "";
      private boolean bMatchFlag = true;
      private String sUnionFlag = "&&";

      public Operator_tFilterRow_1(String unionFlag){
        sUnionFlag = unionFlag;
        bMatchFlag =  "||".equals(unionFlag) ? false : true;
      }

      public String getErrorMsg() {
        if (sErrorMsg != null && sErrorMsg.length() > 1)
          return sErrorMsg.substring(1);
        else 
          return null;
      }

      public boolean getMatchFlag() {
        return bMatchFlag;
      }

      public void matches(boolean partMatched, String reason) {
        // no need to care about the next judgement
        if ("||".equals(sUnionFlag) && bMatchFlag){
          return;
        }

        if (!partMatched) {
          sErrorMsg += "|" + reason;
        }

        if ("||".equals(sUnionFlag))
          bMatchFlag = bMatchFlag || partMatched;
        else
          bMatchFlag = bMatchFlag && partMatched;
      }
    }

 



/**
 * [tFilterRow_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
ListeVenteStruct ListeVente_tmp = new ListeVenteStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";

	
		int tos_count_tFileInputDelimited_1 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(((String)globalMap.get("tFileList_1_CURRENT_FILEPATH")), context.encodage,context.fieldSeparator,"\n",true,1,0,
									limit_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								
								System.err.println(e.getMessage());
							
						}
					
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row1.ID_VENTE = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
							row1.CD_PRODUIT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 2;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    									row1.DT_VENTE = ParserUtils.parseTo_Date(temp, "dd/MM/yyyy");
    								
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"DT_VENTE", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.DT_VENTE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 3;
					
							row1.ID_CLIENT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 4;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.QTE_VENTE = ParserUtils.parseTo_Integer(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"QTE_VENTE", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.QTE_VENTE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 5;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.PRIX_ACHAT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"PRIX_ACHAT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.PRIX_ACHAT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 6;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.PRIX_VENTE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"PRIX_VENTE", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.PRIX_VENTE = null;
								
							
						}
					
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
			                					System.err.println(e.getMessage());
			                					row1 = null;
			                				
										
			    					}
								

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row1"
if(row1 != null) { 
			row5 = null;



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

ListeVente = null;


// # Output table : 'ListeVente'
ListeVente_tmp.ID_VENTE = row1.ID_VENTE ;
ListeVente_tmp.CD_PRODUIT = row1.CD_PRODUIT ;
ListeVente_tmp.DT_VENTE = row1.DT_VENTE ;
ListeVente_tmp.ID_CLIENT = row1.ID_CLIENT ;
ListeVente_tmp.QTE_VENTE = row1.QTE_VENTE ;
ListeVente_tmp.PRIX_ACHAT = row1.PRIX_ACHAT ;
ListeVente_tmp.PRIX_VENTE = row1.PRIX_VENTE ;
ListeVente_tmp.NUM_LIGNE = Numeric.sequence("s1",1,1) ;
ListeVente = ListeVente_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "ListeVente"
if(ListeVente != null) { 
			row5 = null;



	
	/**
	 * [tFilterRow_1 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"ListeVente"
						
						);
					}
					

          row5 = null;
          row2 = null;
    Operator_tFilterRow_1 ope_tFilterRow_1 = new Operator_tFilterRow_1("&&");
      ope_tFilterRow_1.matches((!ListeVente.ID_VENTE.isEmpty() 
&& !ListeVente.CD_PRODUIT.isEmpty() 
&& ListeVente.DT_VENTE!=null
&& !ListeVente.ID_CLIENT.isEmpty()
&& ListeVente.QTE_VENTE!=null
&& ListeVente.PRIX_ACHAT!=null
&& ListeVente.PRIX_VENTE!=null
			
			), "advanced condition failed");
    
    if (ope_tFilterRow_1.getMatchFlag()) {
              if(row2 == null){ 
                row2 = new row2Struct();
              }
               row2.ID_VENTE = ListeVente.ID_VENTE;
               row2.CD_PRODUIT = ListeVente.CD_PRODUIT;
               row2.DT_VENTE = ListeVente.DT_VENTE;
               row2.ID_CLIENT = ListeVente.ID_CLIENT;
               row2.QTE_VENTE = ListeVente.QTE_VENTE;
               row2.PRIX_ACHAT = ListeVente.PRIX_ACHAT;
               row2.PRIX_VENTE = ListeVente.PRIX_VENTE;
               row2.NUM_LIGNE = ListeVente.NUM_LIGNE;    
      nb_line_ok_tFilterRow_1++;
    } else {
            if (row5 == null){
              row5 = new row5Struct();
            }
                row5.ID_VENTE = ListeVente.ID_VENTE;
                row5.CD_PRODUIT = ListeVente.CD_PRODUIT;
                row5.DT_VENTE = ListeVente.DT_VENTE;
                row5.ID_CLIENT = ListeVente.ID_CLIENT;
                row5.QTE_VENTE = ListeVente.QTE_VENTE;
                row5.PRIX_ACHAT = ListeVente.PRIX_ACHAT;
                row5.PRIX_VENTE = ListeVente.PRIX_VENTE;
                row5.NUM_LIGNE = ListeVente.NUM_LIGNE;
	            row5.errorMessage = ope_tFilterRow_1.getErrorMsg();
      nb_line_reject_tFilterRow_1++;
    }

nb_line_tFilterRow_1++;

 


	tos_count_tFilterRow_1++;

/**
 * [tFilterRow_1 main ] stop
 */
	
	/**
	 * [tFilterRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_begin ] stop
 */
// Start of branch "row2"
if(row2 != null) { 



	
	/**
	 * [tUniqRow_1 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					
row6 = null;			row3 = null;			
if(row2.ID_VENTE == null){
	finder_tUniqRow_1.ID_VENTE = null;
}else{
	finder_tUniqRow_1.ID_VENTE = row2.ID_VENTE.toLowerCase();
}
if(row2.CD_PRODUIT == null){
	finder_tUniqRow_1.CD_PRODUIT = null;
}else{
	finder_tUniqRow_1.CD_PRODUIT = row2.CD_PRODUIT.toLowerCase();
}	
finder_tUniqRow_1.hashCodeDirty = true;
if (!keystUniqRow_1.contains(finder_tUniqRow_1)) {
		KeyStruct_tUniqRow_1 new_tUniqRow_1 = new KeyStruct_tUniqRow_1();

		
if(row2.ID_VENTE == null){
	new_tUniqRow_1.ID_VENTE = null;
}else{
	new_tUniqRow_1.ID_VENTE = row2.ID_VENTE.toLowerCase();
}
if(row2.CD_PRODUIT == null){
	new_tUniqRow_1.CD_PRODUIT = null;
}else{
	new_tUniqRow_1.CD_PRODUIT = row2.CD_PRODUIT.toLowerCase();
}
		
		keystUniqRow_1.add(new_tUniqRow_1);if(row3 == null){ 
	
	row3 = new row3Struct();
}row3.ID_VENTE = row2.ID_VENTE;			row3.CD_PRODUIT = row2.CD_PRODUIT;			row3.DT_VENTE = row2.DT_VENTE;			row3.ID_CLIENT = row2.ID_CLIENT;			row3.QTE_VENTE = row2.QTE_VENTE;			row3.PRIX_ACHAT = row2.PRIX_ACHAT;			row3.PRIX_VENTE = row2.PRIX_VENTE;			row3.NUM_LIGNE = row2.NUM_LIGNE;					
		nb_uniques_tUniqRow_1++;
	} else {
if(row6 == null){ 
	
	row6 = new row6Struct();
}				row6.ID_VENTE = row2.ID_VENTE;			row6.CD_PRODUIT = row2.CD_PRODUIT;			row6.DT_VENTE = row2.DT_VENTE;			row6.ID_CLIENT = row2.ID_CLIENT;			row6.QTE_VENTE = row2.QTE_VENTE;			row6.PRIX_ACHAT = row2.PRIX_ACHAT;			row6.PRIX_VENTE = row2.PRIX_VENTE;			row6.NUM_LIGNE = row2.NUM_LIGNE;			
	  nb_duplicates_tUniqRow_1++;
	}

 


	tos_count_tUniqRow_1++;

/**
 * [tUniqRow_1 main ] stop
 */
	
	/**
	 * [tUniqRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 process_data_begin ] stop
 */
// Start of branch "row3"
if(row3 != null) { 



	
	/**
	 * [tMap_6 main ] start
	 */

	

	
	
	currentComponent="tMap_6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6 = false;
		  boolean mainRowRejected_tMap_6 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row7" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow7 = false;
       		  	    	
       		  	    	
 							row7Struct row7ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_6) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_6 = false;
								
                        		    		    row7HashKey.ID_CLIENT = row3.ID_CLIENT ;
                        		    		

								
		                        	row7HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row7.lookup( row7HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row7.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_6 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row7 != null && tHash_Lookup_row7.getCount(row7HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row7' and it contains more one result from keys :  row7.ID_CLIENT = '" + row7HashKey.ID_CLIENT + "'");
								} // G 071
							

							row7Struct row7 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row7Struct fromLookup_row7 = null;
							row7 = row7Default;
										 
							
								 
							
							
								if (tHash_Lookup_row7 !=null && tHash_Lookup_row7.hasNext()) { // G 099
								
							
								
								fromLookup_row7 = tHash_Lookup_row7.next();

							
							
								} // G 099
							
							

							if(fromLookup_row7 != null) {
								row7 = fromLookup_row7;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_6__Struct Var = Var__tMap_6;// ###############################
        // ###############################
        // # Output tables

VenteAsClient = null;
VenteNotClient = null;

if(!rejectedInnerJoin_tMap_6 ) {

// # Output table : 'VenteAsClient'
VenteAsClient_tmp.ID_VENTE = row3.ID_VENTE ;
VenteAsClient_tmp.CD_PRODUIT = row3.CD_PRODUIT ;
VenteAsClient_tmp.DT_VENTE = row3.DT_VENTE ;
VenteAsClient_tmp.ID_CLIENT = row3.ID_CLIENT ;
VenteAsClient_tmp.QTE_VENTE = row3.QTE_VENTE ;
VenteAsClient_tmp.PRIX_ACHAT = row3.PRIX_ACHAT ;
VenteAsClient_tmp.PRIX_VENTE = row3.PRIX_VENTE ;
VenteAsClient_tmp.NUM_LIGNE = row3.NUM_LIGNE ;
VenteAsClient = VenteAsClient_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'VenteNotClient'
// # Filter conditions 
if( rejectedInnerJoin_tMap_6 ) {
VenteNotClient_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
VenteNotClient_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
VenteNotClient_tmp.NUM_LIGNE_REJET = row3.NUM_LIGNE ;
VenteNotClient_tmp.LB_LIGNE_REJET = row3.ID_VENTE +'|'+ row3.CD_PRODUIT +'|'+  row3.DT_VENTE  +'|'+ row3.ID_CLIENT +'|'+  row3.QTE_VENTE  +'|'+ row3.PRIX_ACHAT +'|'+ row3.PRIX_VENTE ;
VenteNotClient_tmp.LB_MESSAGE_REJET = "La dépendance ==> :" + row3.ID_CLIENT + "n'existe pas dans cette ligne." ;
VenteNotClient_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
VenteNotClient_tmp.DT_REJET = TalendDate.getCurrentDate();
VenteNotClient_tmp.LB_JOB_NAME = jobName;
VenteNotClient = VenteNotClient_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_6 = false;










 


	tos_count_tMap_6++;

/**
 * [tMap_6 main ] stop
 */
	
	/**
	 * [tMap_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_begin ] stop
 */
// Start of branch "VenteAsClient"
if(VenteAsClient != null) { 



	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"VenteAsClient"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_5 = false;
		  boolean mainRowRejected_tMap_5 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row8" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow8 = false;
       		  	    	
       		  	    	
 							row8Struct row8ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_5) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_5 = false;
								
                        		    		    row8HashKey.CD_PRODUIT = VenteAsClient.CD_PRODUIT ;
                        		    		

								
		                        	row8HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row8.lookup( row8HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row8.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_5 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row8 != null && tHash_Lookup_row8.getCount(row8HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row8' and it contains more one result from keys :  row8.CD_PRODUIT = '" + row8HashKey.CD_PRODUIT + "'");
								} // G 071
							

							row8Struct row8 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row8Struct fromLookup_row8 = null;
							row8 = row8Default;
										 
							
								 
							
							
								if (tHash_Lookup_row8 !=null && tHash_Lookup_row8.hasNext()) { // G 099
								
							
								
								fromLookup_row8 = tHash_Lookup_row8.next();

							
							
								} // G 099
							
							

							if(fromLookup_row8 != null) {
								row8 = fromLookup_row8;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_5__Struct Var = Var__tMap_5;// ###############################
        // ###############################
        // # Output tables

VenteAsProduit = null;
VenteNotProduit = null;

if(!rejectedInnerJoin_tMap_5 ) {

// # Output table : 'VenteAsProduit'
VenteAsProduit_tmp.ID_VENTE = VenteAsClient.ID_VENTE ;
VenteAsProduit_tmp.CD_PRODUIT = VenteAsClient.CD_PRODUIT ;
VenteAsProduit_tmp.DT_VENTE = VenteAsClient.DT_VENTE ;
VenteAsProduit_tmp.ID_CLIENT = VenteAsClient.ID_CLIENT ;
VenteAsProduit_tmp.QTE_VENTE = VenteAsClient.QTE_VENTE ;
VenteAsProduit_tmp.PRIX_ACHAT = VenteAsClient.PRIX_ACHAT ;
VenteAsProduit_tmp.PRIX_VENTE = VenteAsClient.PRIX_VENTE ;
VenteAsProduit_tmp.NUM_LIGNE = VenteAsClient.NUM_LIGNE ;
VenteAsProduit = VenteAsProduit_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'VenteNotProduit'
// # Filter conditions 
if( rejectedInnerJoin_tMap_5 ) {
VenteNotProduit_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
VenteNotProduit_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
VenteNotProduit_tmp.NUM_LIGNE_REJET = VenteAsClient.NUM_LIGNE   ;
VenteNotProduit_tmp.LB_LIGNE_REJET = VenteAsClient.ID_VENTE +'|'+ VenteAsClient.CD_PRODUIT  +'|'+VenteAsClient.DT_VENTE +'|'+ VenteAsClient.ID_CLIENT  +'|'+ VenteAsClient.QTE_VENTE  +'|'+ VenteAsClient.PRIX_ACHAT +'|'+ VenteAsClient.PRIX_VENTE ;
VenteNotProduit_tmp.LB_MESSAGE_REJET = "La dépendance ==> :" + VenteAsClient.CD_PRODUIT + "manque dans la ligne." ;
VenteNotProduit_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
VenteNotProduit_tmp.DT_REJET = TalendDate.getCurrentDate();
VenteNotProduit_tmp.LB_JOB_NAME = jobName;
VenteNotProduit = VenteNotProduit_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_5 = false;










 


	tos_count_tMap_5++;

/**
 * [tMap_5 main ] stop
 */
	
	/**
	 * [tMap_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_begin ] stop
 */
// Start of branch "VenteAsProduit"
if(VenteAsProduit != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"VenteAsProduit"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
                        		    		    row4HashKey.ID_VENTE = VenteAsProduit.ID_VENTE ;
                        		    		
                        		    		    row4HashKey.CD_PRODUIT = VenteAsProduit.CD_PRODUIT ;
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row4.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.ID_VENTE = '" + row4HashKey.ID_VENTE + "', row4.CD_PRODUIT = '" + row4HashKey.CD_PRODUIT + "'");
								} // G 071
							

							row4Struct row4 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row4Struct fromLookup_row4 = null;
							row4 = row4Default;
										 
							
								 
							
							
								if (tHash_Lookup_row4 !=null && tHash_Lookup_row4.hasNext()) { // G 099
								
							
								
								fromLookup_row4 = tHash_Lookup_row4.next();

							
							
								} // G 099
							
							

							if(fromLookup_row4 != null) {
								row4 = fromLookup_row4;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

VenteExistant = null;
InsertData = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'VenteExistant'
VenteExistant_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
VenteExistant_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
VenteExistant_tmp.NUM_LIGNE_REJET = VenteAsProduit.NUM_LIGNE   ;
VenteExistant_tmp.LB_LIGNE_REJET = VenteAsProduit.ID_VENTE +'|'+ VenteAsProduit.CD_PRODUIT  +'|'+ VenteAsProduit.DT_VENTE +'|'+ VenteAsProduit.ID_CLIENT +'|'+ VenteAsProduit.QTE_VENTE  +'|'+ VenteAsProduit.PRIX_ACHAT +'|'+ VenteAsProduit.PRIX_VENTE  +'|'+ VenteAsProduit.NUM_LIGNE ;
VenteExistant_tmp.LB_MESSAGE_REJET = "La ligne de donnée existe déjà.";
VenteExistant_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
VenteExistant_tmp.DT_REJET = TalendDate.getCurrentDate();
VenteExistant_tmp.LB_JOB_NAME = jobName;
VenteExistant = VenteExistant_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertData'
// # Filter conditions 
if( rejectedInnerJoin_tMap_2 ) {
InsertData_tmp.ID_VENTE = VenteAsProduit.ID_VENTE ;
InsertData_tmp.CD_PRODUIT = VenteAsProduit.CD_PRODUIT ;
InsertData_tmp.DT_VENTE = VenteAsProduit.DT_VENTE ;
InsertData_tmp.ID_CLIENT = VenteAsProduit.ID_CLIENT ;
InsertData_tmp.QTE_VENTE = VenteAsProduit.QTE_VENTE ;
InsertData_tmp.PRIX_ACHAT = VenteAsProduit.PRIX_ACHAT ;
InsertData_tmp.PRIX_VENTE = VenteAsProduit.PRIX_VENTE ;
InsertData_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
InsertData_tmp.DT_INSERTION = TalendDate.getCurrentDate();
InsertData_tmp.LB_JOB_NAME = jobName;
InsertData_tmp.BL_LIGNE_IN_DWH = false;
InsertData = InsertData_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "InsertData"
if(InsertData != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertData"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                    if(InsertData.ID_VENTE == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, InsertData.ID_VENTE);
}

                    if(InsertData.CD_PRODUIT == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2, InsertData.CD_PRODUIT);
}

                    if(InsertData.DT_VENTE != null) {
pstmt_tDBOutput_1.setTimestamp(3, new java.sql.Timestamp(InsertData.DT_VENTE.getTime()));
} else {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.TIMESTAMP);
}

                    if(InsertData.ID_CLIENT == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(4, InsertData.ID_CLIENT);
}

                    pstmt_tDBOutput_1.setInt(5, InsertData.QTE_VENTE);

                    pstmt_tDBOutput_1.setBigDecimal(6, InsertData.PRIX_ACHAT);

                    pstmt_tDBOutput_1.setBigDecimal(7, InsertData.PRIX_VENTE);

                    if(InsertData.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_1.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(8, InsertData.LB_NOM_FICHIER);
}

                    if(InsertData.DT_INSERTION != null) {
pstmt_tDBOutput_1.setTimestamp(9, new java.sql.Timestamp(InsertData.DT_INSERTION.getTime()));
} else {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.TIMESTAMP);
}

                    if(InsertData.LB_JOB_NAME == null) {
pstmt_tDBOutput_1.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(10, InsertData.LB_JOB_NAME);
}

                    pstmt_tDBOutput_1.setBoolean(11, InsertData.BL_LIGNE_IN_DWH);

			
    		pstmt_tDBOutput_1.addBatch();
    		nb_line_tDBOutput_1++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_1++;
    		  
    			if ((batchSize_tDBOutput_1 > 0) && (batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1)) {
                try {
						int countSum_tDBOutput_1 = 0;
						    
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
				    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
            	    	batchSizeCounter_tDBOutput_1 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
				    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
				    	String errormessage_tDBOutput_1;
						if (ne_tDBOutput_1 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
							errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
						}else{
							errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
						}
				    	
				    	int countSum_tDBOutput_1 = 0;
						for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
						rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    	System.err.println(errormessage_tDBOutput_1);
				    	
					}
    			}
    		
    		    commitCounter_tDBOutput_1++;
                if(commitEvery_tDBOutput_1 <= commitCounter_tDBOutput_1) {
                if ((batchSize_tDBOutput_1 > 0) && (batchSizeCounter_tDBOutput_1 > 0)) {
                try {
                		int countSum_tDBOutput_1 = 0;
                		    
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
            	    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
            	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
                batchSizeCounter_tDBOutput_1 = 0;
               }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
			    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
			    	String errormessage_tDBOutput_1;
					if (ne_tDBOutput_1 != null) {
						// build new exception to provide the original cause
						sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
						errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
					}else{
						errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
					}
			    	
			    	int countSum_tDBOutput_1 = 0;
					for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
					
			    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
			    	
			    	System.err.println(errormessage_tDBOutput_1);
			    	
				}
            }
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    }
                    conn_tDBOutput_1.commit();
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_1 = 0;
                    }
                    commitCounter_tDBOutput_1=0;
                }

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "InsertData"




// Start of branch "VenteExistant"
if(VenteExistant != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"VenteExistant"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                    if(VenteExistant.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(1, VenteExistant.LB_CHEMIN_FICHIER);
}

                    if(VenteExistant.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2, VenteExistant.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_2.setInt(3, VenteExistant.NUM_LIGNE_REJET);

                    if(VenteExistant.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(4, VenteExistant.LB_LIGNE_REJET);
}

                    if(VenteExistant.LB_MESSAGE_REJET == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(5, VenteExistant.LB_MESSAGE_REJET);
}

                    if(VenteExistant.LB_NOM_FLUX == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(6, VenteExistant.LB_NOM_FLUX);
}

                    if(VenteExistant.DT_REJET != null) {
pstmt_tDBOutput_2.setTimestamp(7, new java.sql.Timestamp(VenteExistant.DT_REJET.getTime()));
} else {
pstmt_tDBOutput_2.setNull(7, java.sql.Types.TIMESTAMP);
}

                    if(VenteExistant.LB_JOB_NAME == null) {
pstmt_tDBOutput_2.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(8, VenteExistant.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_2.addBatch();
    		nb_line_tDBOutput_2++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_2++;
    		  
    			if ((batchSize_tDBOutput_2 > 0) && (batchSize_tDBOutput_2 <= batchSizeCounter_tDBOutput_2)) {
                try {
						int countSum_tDBOutput_2 = 0;
						    
						for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
				    	rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
				    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
            	    	batchSizeCounter_tDBOutput_2 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
				    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
				    	String errormessage_tDBOutput_2;
						if (ne_tDBOutput_2 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
							errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
						}else{
							errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
						}
				    	
				    	int countSum_tDBOutput_2 = 0;
						for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
						rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
				    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
				    	System.err.println(errormessage_tDBOutput_2);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "VenteExistant"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "VenteAsProduit"




// Start of branch "VenteNotProduit"
if(VenteNotProduit != null) { 



	
	/**
	 * [tDBOutput_6 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"VenteNotProduit"
						
						);
					}
					



        whetherReject_tDBOutput_6 = false;
                    if(VenteNotProduit.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_6.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(1, VenteNotProduit.LB_CHEMIN_FICHIER);
}

                    if(VenteNotProduit.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_6.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(2, VenteNotProduit.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_6.setInt(3, VenteNotProduit.NUM_LIGNE_REJET);

                    if(VenteNotProduit.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_6.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(4, VenteNotProduit.LB_LIGNE_REJET);
}

                    if(VenteNotProduit.LB_MESSAGE_REJET == null) {
pstmt_tDBOutput_6.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(5, VenteNotProduit.LB_MESSAGE_REJET);
}

                    if(VenteNotProduit.LB_NOM_FLUX == null) {
pstmt_tDBOutput_6.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(6, VenteNotProduit.LB_NOM_FLUX);
}

                    if(VenteNotProduit.DT_REJET != null) {
pstmt_tDBOutput_6.setTimestamp(7, new java.sql.Timestamp(VenteNotProduit.DT_REJET.getTime()));
} else {
pstmt_tDBOutput_6.setNull(7, java.sql.Types.TIMESTAMP);
}

                    if(VenteNotProduit.LB_JOB_NAME == null) {
pstmt_tDBOutput_6.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(8, VenteNotProduit.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_6.addBatch();
    		nb_line_tDBOutput_6++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_6++;
    		  
    			if ((batchSize_tDBOutput_6 > 0) && (batchSize_tDBOutput_6 <= batchSizeCounter_tDBOutput_6)) {
                try {
						int countSum_tDBOutput_6 = 0;
						    
						for(int countEach_tDBOutput_6: pstmt_tDBOutput_6.executeBatch()) {
							countSum_tDBOutput_6 += (countEach_tDBOutput_6 < 0 ? 0 : countEach_tDBOutput_6);
						}
				    	rowsToCommitCount_tDBOutput_6 += countSum_tDBOutput_6;
				    	
				    		insertedCount_tDBOutput_6 += countSum_tDBOutput_6;
				    	
            	    	batchSizeCounter_tDBOutput_6 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_6){
globalMap.put("tDBOutput_6_ERROR_MESSAGE",e_tDBOutput_6.getMessage());
				    	java.sql.SQLException ne_tDBOutput_6 = e_tDBOutput_6.getNextException(),sqle_tDBOutput_6=null;
				    	String errormessage_tDBOutput_6;
						if (ne_tDBOutput_6 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_6 = new java.sql.SQLException(e_tDBOutput_6.getMessage() + "\ncaused by: " + ne_tDBOutput_6.getMessage(), ne_tDBOutput_6.getSQLState(), ne_tDBOutput_6.getErrorCode(), ne_tDBOutput_6);
							errormessage_tDBOutput_6 = sqle_tDBOutput_6.getMessage();
						}else{
							errormessage_tDBOutput_6 = e_tDBOutput_6.getMessage();
						}
				    	
				    	int countSum_tDBOutput_6 = 0;
						for(int countEach_tDBOutput_6: e_tDBOutput_6.getUpdateCounts()) {
							countSum_tDBOutput_6 += (countEach_tDBOutput_6 < 0 ? 0 : countEach_tDBOutput_6);
						}
						rowsToCommitCount_tDBOutput_6 += countSum_tDBOutput_6;
						
				    		insertedCount_tDBOutput_6 += countSum_tDBOutput_6;
				    	
				    	System.err.println(errormessage_tDBOutput_6);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_6++;

/**
 * [tDBOutput_6 main ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	

 



/**
 * [tDBOutput_6 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	

 



/**
 * [tDBOutput_6 process_data_end ] stop
 */

} // End of branch "VenteNotProduit"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
 */

} // End of branch "VenteAsClient"




// Start of branch "VenteNotClient"
if(VenteNotClient != null) { 



	
	/**
	 * [tDBOutput_7 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"VenteNotClient"
						
						);
					}
					



        whetherReject_tDBOutput_7 = false;
                    if(VenteNotClient.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_7.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(1, VenteNotClient.LB_CHEMIN_FICHIER);
}

                    if(VenteNotClient.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_7.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(2, VenteNotClient.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_7.setInt(3, VenteNotClient.NUM_LIGNE_REJET);

                    if(VenteNotClient.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_7.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(4, VenteNotClient.LB_LIGNE_REJET);
}

                    if(VenteNotClient.LB_MESSAGE_REJET == null) {
pstmt_tDBOutput_7.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(5, VenteNotClient.LB_MESSAGE_REJET);
}

                    if(VenteNotClient.LB_NOM_FLUX == null) {
pstmt_tDBOutput_7.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(6, VenteNotClient.LB_NOM_FLUX);
}

                    if(VenteNotClient.DT_REJET != null) {
pstmt_tDBOutput_7.setTimestamp(7, new java.sql.Timestamp(VenteNotClient.DT_REJET.getTime()));
} else {
pstmt_tDBOutput_7.setNull(7, java.sql.Types.TIMESTAMP);
}

                    if(VenteNotClient.LB_JOB_NAME == null) {
pstmt_tDBOutput_7.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(8, VenteNotClient.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_7.addBatch();
    		nb_line_tDBOutput_7++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_7++;
    		  
    			if ((batchSize_tDBOutput_7 > 0) && (batchSize_tDBOutput_7 <= batchSizeCounter_tDBOutput_7)) {
                try {
						int countSum_tDBOutput_7 = 0;
						    
						for(int countEach_tDBOutput_7: pstmt_tDBOutput_7.executeBatch()) {
							countSum_tDBOutput_7 += (countEach_tDBOutput_7 < 0 ? 0 : countEach_tDBOutput_7);
						}
				    	rowsToCommitCount_tDBOutput_7 += countSum_tDBOutput_7;
				    	
				    		insertedCount_tDBOutput_7 += countSum_tDBOutput_7;
				    	
            	    	batchSizeCounter_tDBOutput_7 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_7){
globalMap.put("tDBOutput_7_ERROR_MESSAGE",e_tDBOutput_7.getMessage());
				    	java.sql.SQLException ne_tDBOutput_7 = e_tDBOutput_7.getNextException(),sqle_tDBOutput_7=null;
				    	String errormessage_tDBOutput_7;
						if (ne_tDBOutput_7 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_7 = new java.sql.SQLException(e_tDBOutput_7.getMessage() + "\ncaused by: " + ne_tDBOutput_7.getMessage(), ne_tDBOutput_7.getSQLState(), ne_tDBOutput_7.getErrorCode(), ne_tDBOutput_7);
							errormessage_tDBOutput_7 = sqle_tDBOutput_7.getMessage();
						}else{
							errormessage_tDBOutput_7 = e_tDBOutput_7.getMessage();
						}
				    	
				    	int countSum_tDBOutput_7 = 0;
						for(int countEach_tDBOutput_7: e_tDBOutput_7.getUpdateCounts()) {
							countSum_tDBOutput_7 += (countEach_tDBOutput_7 < 0 ? 0 : countEach_tDBOutput_7);
						}
						rowsToCommitCount_tDBOutput_7 += countSum_tDBOutput_7;
						
				    		insertedCount_tDBOutput_7 += countSum_tDBOutput_7;
				    	
				    	System.err.println(errormessage_tDBOutput_7);
				    	
					}
    			}
    		
    		    commitCounter_tDBOutput_7++;
                if(commitEvery_tDBOutput_7 <= commitCounter_tDBOutput_7) {
                if ((batchSize_tDBOutput_7 > 0) && (batchSizeCounter_tDBOutput_7 > 0)) {
                try {
                		int countSum_tDBOutput_7 = 0;
                		    
						for(int countEach_tDBOutput_7: pstmt_tDBOutput_7.executeBatch()) {
							countSum_tDBOutput_7 += (countEach_tDBOutput_7 < 0 ? 0 : countEach_tDBOutput_7);
						}
            	    	rowsToCommitCount_tDBOutput_7 += countSum_tDBOutput_7;
            	    	
            	    		insertedCount_tDBOutput_7 += countSum_tDBOutput_7;
            	    	
                batchSizeCounter_tDBOutput_7 = 0;
               }catch (java.sql.BatchUpdateException e_tDBOutput_7){
globalMap.put("tDBOutput_7_ERROR_MESSAGE",e_tDBOutput_7.getMessage());
			    	java.sql.SQLException ne_tDBOutput_7 = e_tDBOutput_7.getNextException(),sqle_tDBOutput_7=null;
			    	String errormessage_tDBOutput_7;
					if (ne_tDBOutput_7 != null) {
						// build new exception to provide the original cause
						sqle_tDBOutput_7 = new java.sql.SQLException(e_tDBOutput_7.getMessage() + "\ncaused by: " + ne_tDBOutput_7.getMessage(), ne_tDBOutput_7.getSQLState(), ne_tDBOutput_7.getErrorCode(), ne_tDBOutput_7);
						errormessage_tDBOutput_7 = sqle_tDBOutput_7.getMessage();
					}else{
						errormessage_tDBOutput_7 = e_tDBOutput_7.getMessage();
					}
			    	
			    	int countSum_tDBOutput_7 = 0;
					for(int countEach_tDBOutput_7: e_tDBOutput_7.getUpdateCounts()) {
						countSum_tDBOutput_7 += (countEach_tDBOutput_7 < 0 ? 0 : countEach_tDBOutput_7);
					}
					rowsToCommitCount_tDBOutput_7 += countSum_tDBOutput_7;
					
			    		insertedCount_tDBOutput_7 += countSum_tDBOutput_7;
			    	
			    	System.err.println(errormessage_tDBOutput_7);
			    	
				}
            }
                    if(rowsToCommitCount_tDBOutput_7 != 0){
                    	
                    }
                    conn_tDBOutput_7.commit();
                    if(rowsToCommitCount_tDBOutput_7 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_7 = 0;
                    }
                    commitCounter_tDBOutput_7=0;
                }

 


	tos_count_tDBOutput_7++;

/**
 * [tDBOutput_7 main ] stop
 */
	
	/**
	 * [tDBOutput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	

 



/**
 * [tDBOutput_7 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	

 



/**
 * [tDBOutput_7 process_data_end ] stop
 */

} // End of branch "VenteNotClient"




	
	/**
	 * [tMap_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_end ] stop
 */

} // End of branch "row3"




// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

InsertDuplicate = null;


// # Output table : 'InsertDuplicate'
InsertDuplicate_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
InsertDuplicate_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
InsertDuplicate_tmp.NUM_LIGNE_REJET = row6.NUM_LIGNE   ;
InsertDuplicate_tmp.LB_LIGNE_REJET = row5.ID_VENTE +'|'+ row5.CD_PRODUIT +'|'+  row5.DT_VENTE  +'|'+ row5.ID_CLIENT +'|'+  row5.QTE_VENTE  +'|'+ row5.PRIX_ACHAT +'|'+ row5.PRIX_VENTE ;
InsertDuplicate_tmp.LB_MESSAGE_REJET = "Données en double";
InsertDuplicate_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
InsertDuplicate_tmp.DT_REJET = TalendDate.getCurrentDate();
InsertDuplicate_tmp.LB_JOB_NAME = jobName;
InsertDuplicate = InsertDuplicate_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "InsertDuplicate"
if(InsertDuplicate != null) { 



	
	/**
	 * [tDBOutput_5 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertDuplicate"
						
						);
					}
					



        whetherReject_tDBOutput_5 = false;
                    if(InsertDuplicate.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(1, InsertDuplicate.LB_CHEMIN_FICHIER);
}

                    if(InsertDuplicate.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(2, InsertDuplicate.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_5.setInt(3, InsertDuplicate.NUM_LIGNE_REJET);

                    if(InsertDuplicate.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(4, InsertDuplicate.LB_LIGNE_REJET);
}

                    if(InsertDuplicate.LB_MESSAGE_REJET == null) {
pstmt_tDBOutput_5.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(5, InsertDuplicate.LB_MESSAGE_REJET);
}

                    if(InsertDuplicate.LB_NOM_FLUX == null) {
pstmt_tDBOutput_5.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(6, InsertDuplicate.LB_NOM_FLUX);
}

                    if(InsertDuplicate.DT_REJET != null) {
pstmt_tDBOutput_5.setTimestamp(7, new java.sql.Timestamp(InsertDuplicate.DT_REJET.getTime()));
} else {
pstmt_tDBOutput_5.setNull(7, java.sql.Types.TIMESTAMP);
}

                    if(InsertDuplicate.LB_JOB_NAME == null) {
pstmt_tDBOutput_5.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(8, InsertDuplicate.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_5.addBatch();
    		nb_line_tDBOutput_5++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_5++;
    		  
    			if ((batchSize_tDBOutput_5 > 0) && (batchSize_tDBOutput_5 <= batchSizeCounter_tDBOutput_5)) {
                try {
						int countSum_tDBOutput_5 = 0;
						    
						for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
							countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
						}
				    	rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
				    	
				    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
				    	
            	    	batchSizeCounter_tDBOutput_5 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_5){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e_tDBOutput_5.getMessage());
				    	java.sql.SQLException ne_tDBOutput_5 = e_tDBOutput_5.getNextException(),sqle_tDBOutput_5=null;
				    	String errormessage_tDBOutput_5;
						if (ne_tDBOutput_5 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_5 = new java.sql.SQLException(e_tDBOutput_5.getMessage() + "\ncaused by: " + ne_tDBOutput_5.getMessage(), ne_tDBOutput_5.getSQLState(), ne_tDBOutput_5.getErrorCode(), ne_tDBOutput_5);
							errormessage_tDBOutput_5 = sqle_tDBOutput_5.getMessage();
						}else{
							errormessage_tDBOutput_5 = e_tDBOutput_5.getMessage();
						}
				    	
				    	int countSum_tDBOutput_5 = 0;
						for(int countEach_tDBOutput_5: e_tDBOutput_5.getUpdateCounts()) {
							countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
						}
						rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
						
				    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
				    	
				    	System.err.println(errormessage_tDBOutput_5);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_5++;

/**
 * [tDBOutput_5 main ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_end ] stop
 */

} // End of branch "InsertDuplicate"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "row6"




	
	/**
	 * [tUniqRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 process_data_end ] stop
 */

} // End of branch "row2"




// Start of branch "row5"
if(row5 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

InsertReject = null;


// # Output table : 'InsertReject'
InsertReject_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
InsertReject_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
InsertReject_tmp.NUM_LIGNE_REJET =  row5.NUM_LIGNE;
InsertReject_tmp.LB_LIGNE_REJET = row5.ID_VENTE +'|'+ row5.CD_PRODUIT +'|'+  row5.DT_VENTE  +'|'+ row5.ID_CLIENT +'|'+  row5.QTE_VENTE  +'|'+ row5.PRIX_ACHAT +'|'+ row5.PRIX_VENTE ;
InsertReject_tmp.LB_MESSAGE_REJET = "Valeur null pour certaines colonnes";
InsertReject_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
InsertReject_tmp.DT_REJET = TalendDate.getCurrentDate();
InsertReject_tmp.LB_JOB_NAME = jobName;
InsertReject = InsertReject_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "InsertReject"
if(InsertReject != null) { 



	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertReject"
						
						);
					}
					



        whetherReject_tDBOutput_4 = false;
                    if(InsertReject.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(1, InsertReject.LB_CHEMIN_FICHIER);
}

                    if(InsertReject.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(2, InsertReject.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_4.setInt(3, InsertReject.NUM_LIGNE_REJET);

                    if(InsertReject.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(4, InsertReject.LB_LIGNE_REJET);
}

                    if(InsertReject.LB_MESSAGE_REJET == null) {
pstmt_tDBOutput_4.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(5, InsertReject.LB_MESSAGE_REJET);
}

                    if(InsertReject.LB_NOM_FLUX == null) {
pstmt_tDBOutput_4.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(6, InsertReject.LB_NOM_FLUX);
}

                    if(InsertReject.DT_REJET != null) {
pstmt_tDBOutput_4.setTimestamp(7, new java.sql.Timestamp(InsertReject.DT_REJET.getTime()));
} else {
pstmt_tDBOutput_4.setNull(7, java.sql.Types.TIMESTAMP);
}

                    if(InsertReject.LB_JOB_NAME == null) {
pstmt_tDBOutput_4.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(8, InsertReject.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_4.addBatch();
    		nb_line_tDBOutput_4++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_4++;
    		  
    			if ((batchSize_tDBOutput_4 > 0) && (batchSize_tDBOutput_4 <= batchSizeCounter_tDBOutput_4)) {
                try {
						int countSum_tDBOutput_4 = 0;
						    
						for(int countEach_tDBOutput_4: pstmt_tDBOutput_4.executeBatch()) {
							countSum_tDBOutput_4 += (countEach_tDBOutput_4 < 0 ? 0 : countEach_tDBOutput_4);
						}
				    	rowsToCommitCount_tDBOutput_4 += countSum_tDBOutput_4;
				    	
				    		insertedCount_tDBOutput_4 += countSum_tDBOutput_4;
				    	
            	    	batchSizeCounter_tDBOutput_4 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_4){
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e_tDBOutput_4.getMessage());
				    	java.sql.SQLException ne_tDBOutput_4 = e_tDBOutput_4.getNextException(),sqle_tDBOutput_4=null;
				    	String errormessage_tDBOutput_4;
						if (ne_tDBOutput_4 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_4 = new java.sql.SQLException(e_tDBOutput_4.getMessage() + "\ncaused by: " + ne_tDBOutput_4.getMessage(), ne_tDBOutput_4.getSQLState(), ne_tDBOutput_4.getErrorCode(), ne_tDBOutput_4);
							errormessage_tDBOutput_4 = sqle_tDBOutput_4.getMessage();
						}else{
							errormessage_tDBOutput_4 = e_tDBOutput_4.getMessage();
						}
				    	
				    	int countSum_tDBOutput_4 = 0;
						for(int countEach_tDBOutput_4: e_tDBOutput_4.getUpdateCounts()) {
							countSum_tDBOutput_4 += (countEach_tDBOutput_4 < 0 ? 0 : countEach_tDBOutput_4);
						}
						rowsToCommitCount_tDBOutput_4 += countSum_tDBOutput_4;
						
				    		insertedCount_tDBOutput_4 += countSum_tDBOutput_4;
				    	
				    	System.err.println(errormessage_tDBOutput_4);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_end ] stop
 */

} // End of branch "InsertReject"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "row5"




	
	/**
	 * [tFilterRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_end ] stop
 */

} // End of branch "ListeVente"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row1"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	



            }
            }finally{
                if(!((Object)(((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"))) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
                }
			}
			  

 

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tFilterRow_1 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
    globalMap.put("tFilterRow_1_NB_LINE", nb_line_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_OK", nb_line_ok_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_REJECT", nb_line_reject_tFilterRow_1);
    

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"ListeVente");
			  	}
			  	
 

ok_Hash.put("tFilterRow_1", true);
end_Hash.put("tFilterRow_1", System.currentTimeMillis());




/**
 * [tFilterRow_1 end ] stop
 */

	
	/**
	 * [tUniqRow_1 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

globalMap.put("tUniqRow_1_NB_UNIQUES",nb_uniques_tUniqRow_1);
globalMap.put("tUniqRow_1_NB_DUPLICATES",nb_duplicates_tUniqRow_1);

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tUniqRow_1", true);
end_Hash.put("tUniqRow_1", System.currentTimeMillis());




/**
 * [tUniqRow_1 end ] stop
 */

	
	/**
	 * [tMap_6 end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row7 != null) {
						tHash_Lookup_row7.endGet();
					}
					globalMap.remove( "tHash_Lookup_row7" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tMap_6", true);
end_Hash.put("tMap_6", System.currentTimeMillis());




/**
 * [tMap_6 end ] stop
 */

	
	/**
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row8 != null) {
						tHash_Lookup_row8.endGet();
					}
					globalMap.remove( "tHash_Lookup_row8" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"VenteAsClient");
			  	}
			  	
 

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"VenteAsProduit");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



	    try {
				int countSum_tDBOutput_1 = 0;
				if (pstmt_tDBOutput_1 != null && batchSizeCounter_tDBOutput_1 > 0) {
						
					for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				}
		    	
		    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
	    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
	    	String errormessage_tDBOutput_1;
			if (ne_tDBOutput_1 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
				errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
			}else{
				errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
			}
	    	
	    	int countSum_tDBOutput_1 = 0;
			for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
				countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
			}
			rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
			
	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
	    	
	    	System.err.println(errormessage_tDBOutput_1);
	    	
		}
	    
        if(pstmt_tDBOutput_1 != null) {
        		
            pstmt_tDBOutput_1.close();
            resourceMap.remove("pstmt_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
			}
			conn_tDBOutput_1.commit();
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
				rowsToCommitCount_tDBOutput_1 = 0;
			}
			commitCounter_tDBOutput_1 = 0;
		
    	conn_tDBOutput_1 .close();
    	
    	resourceMap.put("finish_tDBOutput_1", true);
    	

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertData");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */




	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



	    try {
				int countSum_tDBOutput_2 = 0;
				if (pstmt_tDBOutput_2 != null && batchSizeCounter_tDBOutput_2 > 0) {
						
					for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
				}
		    	
		    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
	    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
	    	String errormessage_tDBOutput_2;
			if (ne_tDBOutput_2 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
				errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
			}else{
				errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
			}
	    	
	    	int countSum_tDBOutput_2 = 0;
			for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
				countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
			}
			rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
			
	    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
	    	
	    	System.err.println(errormessage_tDBOutput_2);
	    	
		}
	    
        if(pstmt_tDBOutput_2 != null) {
        		
            pstmt_tDBOutput_2.close();
            resourceMap.remove("pstmt_tDBOutput_2");
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);

	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"VenteExistant");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */







	
	/**
	 * [tDBOutput_6 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	



	    try {
				int countSum_tDBOutput_6 = 0;
				if (pstmt_tDBOutput_6 != null && batchSizeCounter_tDBOutput_6 > 0) {
						
					for(int countEach_tDBOutput_6: pstmt_tDBOutput_6.executeBatch()) {
						countSum_tDBOutput_6 += (countEach_tDBOutput_6 < 0 ? 0 : countEach_tDBOutput_6);
					}
					rowsToCommitCount_tDBOutput_6 += countSum_tDBOutput_6;
						
				}
		    	
		    		insertedCount_tDBOutput_6 += countSum_tDBOutput_6;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_6){
globalMap.put("tDBOutput_6_ERROR_MESSAGE",e_tDBOutput_6.getMessage());
	    	java.sql.SQLException ne_tDBOutput_6 = e_tDBOutput_6.getNextException(),sqle_tDBOutput_6=null;
	    	String errormessage_tDBOutput_6;
			if (ne_tDBOutput_6 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_6 = new java.sql.SQLException(e_tDBOutput_6.getMessage() + "\ncaused by: " + ne_tDBOutput_6.getMessage(), ne_tDBOutput_6.getSQLState(), ne_tDBOutput_6.getErrorCode(), ne_tDBOutput_6);
				errormessage_tDBOutput_6 = sqle_tDBOutput_6.getMessage();
			}else{
				errormessage_tDBOutput_6 = e_tDBOutput_6.getMessage();
			}
	    	
	    	int countSum_tDBOutput_6 = 0;
			for(int countEach_tDBOutput_6: e_tDBOutput_6.getUpdateCounts()) {
				countSum_tDBOutput_6 += (countEach_tDBOutput_6 < 0 ? 0 : countEach_tDBOutput_6);
			}
			rowsToCommitCount_tDBOutput_6 += countSum_tDBOutput_6;
			
	    		insertedCount_tDBOutput_6 += countSum_tDBOutput_6;
	    	
	    	System.err.println(errormessage_tDBOutput_6);
	    	
		}
	    
        if(pstmt_tDBOutput_6 != null) {
        		
            pstmt_tDBOutput_6.close();
            resourceMap.remove("pstmt_tDBOutput_6");
        }
    resourceMap.put("statementClosed_tDBOutput_6", true);

	nb_line_deleted_tDBOutput_6=nb_line_deleted_tDBOutput_6+ deletedCount_tDBOutput_6;
	nb_line_update_tDBOutput_6=nb_line_update_tDBOutput_6 + updatedCount_tDBOutput_6;
	nb_line_inserted_tDBOutput_6=nb_line_inserted_tDBOutput_6 + insertedCount_tDBOutput_6;
	nb_line_rejected_tDBOutput_6=nb_line_rejected_tDBOutput_6 + rejectedCount_tDBOutput_6;
	
        globalMap.put("tDBOutput_6_NB_LINE",nb_line_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_UPDATED",nb_line_update_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_DELETED",nb_line_deleted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_6);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"VenteNotProduit");
			  	}
			  	
 

ok_Hash.put("tDBOutput_6", true);
end_Hash.put("tDBOutput_6", System.currentTimeMillis());




/**
 * [tDBOutput_6 end ] stop
 */







	
	/**
	 * [tDBOutput_7 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	



	    try {
				int countSum_tDBOutput_7 = 0;
				if (pstmt_tDBOutput_7 != null && batchSizeCounter_tDBOutput_7 > 0) {
						
					for(int countEach_tDBOutput_7: pstmt_tDBOutput_7.executeBatch()) {
						countSum_tDBOutput_7 += (countEach_tDBOutput_7 < 0 ? 0 : countEach_tDBOutput_7);
					}
					rowsToCommitCount_tDBOutput_7 += countSum_tDBOutput_7;
						
				}
		    	
		    		insertedCount_tDBOutput_7 += countSum_tDBOutput_7;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_7){
globalMap.put("tDBOutput_7_ERROR_MESSAGE",e_tDBOutput_7.getMessage());
	    	java.sql.SQLException ne_tDBOutput_7 = e_tDBOutput_7.getNextException(),sqle_tDBOutput_7=null;
	    	String errormessage_tDBOutput_7;
			if (ne_tDBOutput_7 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_7 = new java.sql.SQLException(e_tDBOutput_7.getMessage() + "\ncaused by: " + ne_tDBOutput_7.getMessage(), ne_tDBOutput_7.getSQLState(), ne_tDBOutput_7.getErrorCode(), ne_tDBOutput_7);
				errormessage_tDBOutput_7 = sqle_tDBOutput_7.getMessage();
			}else{
				errormessage_tDBOutput_7 = e_tDBOutput_7.getMessage();
			}
	    	
	    	int countSum_tDBOutput_7 = 0;
			for(int countEach_tDBOutput_7: e_tDBOutput_7.getUpdateCounts()) {
				countSum_tDBOutput_7 += (countEach_tDBOutput_7 < 0 ? 0 : countEach_tDBOutput_7);
			}
			rowsToCommitCount_tDBOutput_7 += countSum_tDBOutput_7;
			
	    		insertedCount_tDBOutput_7 += countSum_tDBOutput_7;
	    	
	    	System.err.println(errormessage_tDBOutput_7);
	    	
		}
	    
        if(pstmt_tDBOutput_7 != null) {
        		
            pstmt_tDBOutput_7.close();
            resourceMap.remove("pstmt_tDBOutput_7");
        }
    resourceMap.put("statementClosed_tDBOutput_7", true);
			if(rowsToCommitCount_tDBOutput_7 != 0){
				
			}
			conn_tDBOutput_7.commit();
			if(rowsToCommitCount_tDBOutput_7 != 0){
				
				rowsToCommitCount_tDBOutput_7 = 0;
			}
			commitCounter_tDBOutput_7 = 0;
		
    	conn_tDBOutput_7 .close();
    	
    	resourceMap.put("finish_tDBOutput_7", true);
    	

	nb_line_deleted_tDBOutput_7=nb_line_deleted_tDBOutput_7+ deletedCount_tDBOutput_7;
	nb_line_update_tDBOutput_7=nb_line_update_tDBOutput_7 + updatedCount_tDBOutput_7;
	nb_line_inserted_tDBOutput_7=nb_line_inserted_tDBOutput_7 + insertedCount_tDBOutput_7;
	nb_line_rejected_tDBOutput_7=nb_line_rejected_tDBOutput_7 + rejectedCount_tDBOutput_7;
	
        globalMap.put("tDBOutput_7_NB_LINE",nb_line_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_UPDATED",nb_line_update_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_DELETED",nb_line_deleted_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_7);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"VenteNotClient");
			  	}
			  	
 

ok_Hash.put("tDBOutput_7", true);
end_Hash.put("tDBOutput_7", System.currentTimeMillis());




/**
 * [tDBOutput_7 end ] stop
 */







	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tDBOutput_5 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	



	    try {
				int countSum_tDBOutput_5 = 0;
				if (pstmt_tDBOutput_5 != null && batchSizeCounter_tDBOutput_5 > 0) {
						
					for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
						countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
					}
					rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
						
				}
		    	
		    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_5){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e_tDBOutput_5.getMessage());
	    	java.sql.SQLException ne_tDBOutput_5 = e_tDBOutput_5.getNextException(),sqle_tDBOutput_5=null;
	    	String errormessage_tDBOutput_5;
			if (ne_tDBOutput_5 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_5 = new java.sql.SQLException(e_tDBOutput_5.getMessage() + "\ncaused by: " + ne_tDBOutput_5.getMessage(), ne_tDBOutput_5.getSQLState(), ne_tDBOutput_5.getErrorCode(), ne_tDBOutput_5);
				errormessage_tDBOutput_5 = sqle_tDBOutput_5.getMessage();
			}else{
				errormessage_tDBOutput_5 = e_tDBOutput_5.getMessage();
			}
	    	
	    	int countSum_tDBOutput_5 = 0;
			for(int countEach_tDBOutput_5: e_tDBOutput_5.getUpdateCounts()) {
				countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
			}
			rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
			
	    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
	    	
	    	System.err.println(errormessage_tDBOutput_5);
	    	
		}
	    
        if(pstmt_tDBOutput_5 != null) {
        		
            pstmt_tDBOutput_5.close();
            resourceMap.remove("pstmt_tDBOutput_5");
        }
    resourceMap.put("statementClosed_tDBOutput_5", true);

	nb_line_deleted_tDBOutput_5=nb_line_deleted_tDBOutput_5+ deletedCount_tDBOutput_5;
	nb_line_update_tDBOutput_5=nb_line_update_tDBOutput_5 + updatedCount_tDBOutput_5;
	nb_line_inserted_tDBOutput_5=nb_line_inserted_tDBOutput_5 + insertedCount_tDBOutput_5;
	nb_line_rejected_tDBOutput_5=nb_line_rejected_tDBOutput_5 + rejectedCount_tDBOutput_5;
	
        globalMap.put("tDBOutput_5_NB_LINE",nb_line_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_UPDATED",nb_line_update_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_DELETED",nb_line_deleted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_5);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertDuplicate");
			  	}
			  	
 

ok_Hash.put("tDBOutput_5", true);
end_Hash.put("tDBOutput_5", System.currentTimeMillis());




/**
 * [tDBOutput_5 end ] stop
 */










	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row5");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



	    try {
				int countSum_tDBOutput_4 = 0;
				if (pstmt_tDBOutput_4 != null && batchSizeCounter_tDBOutput_4 > 0) {
						
					for(int countEach_tDBOutput_4: pstmt_tDBOutput_4.executeBatch()) {
						countSum_tDBOutput_4 += (countEach_tDBOutput_4 < 0 ? 0 : countEach_tDBOutput_4);
					}
					rowsToCommitCount_tDBOutput_4 += countSum_tDBOutput_4;
						
				}
		    	
		    		insertedCount_tDBOutput_4 += countSum_tDBOutput_4;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_4){
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e_tDBOutput_4.getMessage());
	    	java.sql.SQLException ne_tDBOutput_4 = e_tDBOutput_4.getNextException(),sqle_tDBOutput_4=null;
	    	String errormessage_tDBOutput_4;
			if (ne_tDBOutput_4 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_4 = new java.sql.SQLException(e_tDBOutput_4.getMessage() + "\ncaused by: " + ne_tDBOutput_4.getMessage(), ne_tDBOutput_4.getSQLState(), ne_tDBOutput_4.getErrorCode(), ne_tDBOutput_4);
				errormessage_tDBOutput_4 = sqle_tDBOutput_4.getMessage();
			}else{
				errormessage_tDBOutput_4 = e_tDBOutput_4.getMessage();
			}
	    	
	    	int countSum_tDBOutput_4 = 0;
			for(int countEach_tDBOutput_4: e_tDBOutput_4.getUpdateCounts()) {
				countSum_tDBOutput_4 += (countEach_tDBOutput_4 < 0 ? 0 : countEach_tDBOutput_4);
			}
			rowsToCommitCount_tDBOutput_4 += countSum_tDBOutput_4;
			
	    		insertedCount_tDBOutput_4 += countSum_tDBOutput_4;
	    	
	    	System.err.println(errormessage_tDBOutput_4);
	    	
		}
	    
        if(pstmt_tDBOutput_4 != null) {
        		
            pstmt_tDBOutput_4.close();
            resourceMap.remove("pstmt_tDBOutput_4");
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);

	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertReject");
			  	}
			  	
 

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());




/**
 * [tDBOutput_4 end ] stop
 */












				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
					     			//free memory for "tMap_5"
					     			globalMap.remove("tHash_Lookup_row8"); 
				     			
					     			//free memory for "tMap_6"
					     			globalMap.remove("tHash_Lookup_row7"); 
				     			
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tFilterRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 finally ] stop
 */

	
	/**
	 * [tUniqRow_1 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 finally ] stop
 */

	
	/**
	 * [tMap_6 finally ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 finally ] stop
 */

	
	/**
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_1") == null){
            java.sql.Connection ctn_tDBOutput_1 = null;
            if((ctn_tDBOutput_1 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_1")) != null){
                try {
                    ctn_tDBOutput_1.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_1) {
                    String errorMessage_tDBOutput_1 = "failed to close the connection in tDBOutput_1 :" + sqlEx_tDBOutput_1.getMessage();
                    System.err.println(errorMessage_tDBOutput_1);
                }
            }
        }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */




	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */







	
	/**
	 * [tDBOutput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	



    if (resourceMap.get("statementClosed_tDBOutput_6") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_6 = null;
                if ((pstmtToClose_tDBOutput_6 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_6")) != null) {
                    pstmtToClose_tDBOutput_6.close();
                }
    }
 



/**
 * [tDBOutput_6 finally ] stop
 */







	
	/**
	 * [tDBOutput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_7") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_7 = null;
                if ((pstmtToClose_tDBOutput_7 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_7")) != null) {
                    pstmtToClose_tDBOutput_7.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_7") == null){
            java.sql.Connection ctn_tDBOutput_7 = null;
            if((ctn_tDBOutput_7 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_7")) != null){
                try {
                    ctn_tDBOutput_7.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_7) {
                    String errorMessage_tDBOutput_7 = "failed to close the connection in tDBOutput_7 :" + sqlEx_tDBOutput_7.getMessage();
                    System.err.println(errorMessage_tDBOutput_7);
                }
            }
        }
    }
 



/**
 * [tDBOutput_7 finally ] stop
 */







	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	



    if (resourceMap.get("statementClosed_tDBOutput_5") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_5 = null;
                if ((pstmtToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_5")) != null) {
                    pstmtToClose_tDBOutput_5.close();
                }
    }
 



/**
 * [tDBOutput_5 finally ] stop
 */










	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_4 = null;
                if ((pstmtToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_4")) != null) {
                    pstmtToClose_tDBOutput_4.close();
                }
    }
 



/**
 * [tDBOutput_4 finally ] stop
 */












				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	


public static class row7Struct implements routines.system.IPersistableComparableLookupRow<row7Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public String NOM_CLIENT;

				public String getNOM_CLIENT () {
					return this.NOM_CLIENT;
				}
				
			    public String PREN_CLIENT;

				public String getPREN_CLIENT () {
					return this.PREN_CLIENT;
				}
				
			    public String CD_POSTAL_CLIENT;

				public String getCD_POSTAL_CLIENT () {
					return this.CD_POSTAL_CLIENT;
				}
				
			    public String VILLE_CLIENT;

				public String getVILLE_CLIENT () {
					return this.VILLE_CLIENT;
				}
				
			    public String PAYS_CLIENT;

				public String getPAYS_CLIENT () {
					return this.PAYS_CLIENT;
				}
				
			    public String REGION_CLIENT;

				public String getREGION_CLIENT () {
					return this.REGION_CLIENT;
				}
				
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_CLIENT == null) ? 0 : this.ID_CLIENT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row7Struct other = (row7Struct) obj;
		
						if (this.ID_CLIENT == null) {
							if (other.ID_CLIENT != null)
								return false;
						
						} else if (!this.ID_CLIENT.equals(other.ID_CLIENT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row7Struct other) {

		other.ID_CLIENT = this.ID_CLIENT;
	            other.NOM_CLIENT = this.NOM_CLIENT;
	            other.PREN_CLIENT = this.PREN_CLIENT;
	            other.CD_POSTAL_CLIENT = this.CD_POSTAL_CLIENT;
	            other.VILLE_CLIENT = this.VILLE_CLIENT;
	            other.PAYS_CLIENT = this.PAYS_CLIENT;
	            other.REGION_CLIENT = this.REGION_CLIENT;
	            other.CD_TYPE_CLIENT = this.CD_TYPE_CLIENT;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row7Struct other) {

		other.ID_CLIENT = this.ID_CLIENT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.NOM_CLIENT = readString(dis,ois);
					
						this.PREN_CLIENT = readString(dis,ois);
					
						this.CD_POSTAL_CLIENT = readString(dis,ois);
					
						this.VILLE_CLIENT = readString(dis,ois);
					
						this.PAYS_CLIENT = readString(dis,ois);
					
						this.REGION_CLIENT = readString(dis,ois);
					
						this.CD_TYPE_CLIENT = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
			            this.BL_LIGNE_ACTIVE = dis.readInt();
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.NOM_CLIENT = readString(dis,objectIn);
					
						this.PREN_CLIENT = readString(dis,objectIn);
					
						this.CD_POSTAL_CLIENT = readString(dis,objectIn);
					
						this.VILLE_CLIENT = readString(dis,objectIn);
					
						this.PAYS_CLIENT = readString(dis,objectIn);
					
						this.REGION_CLIENT = readString(dis,objectIn);
					
						this.CD_TYPE_CLIENT = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
			            this.BL_LIGNE_ACTIVE = objectIn.readInt();
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.NOM_CLIENT, dos, oos);
					
						writeString(this.PREN_CLIENT, dos, oos);
					
						writeString(this.CD_POSTAL_CLIENT, dos, oos);
					
						writeString(this.VILLE_CLIENT, dos, oos);
					
						writeString(this.PAYS_CLIENT, dos, oos);
					
						writeString(this.REGION_CLIENT, dos, oos);
					
						writeString(this.CD_TYPE_CLIENT, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.NOM_CLIENT, dos, objectOut);
					
						writeString(this.PREN_CLIENT, dos, objectOut);
					
						writeString(this.CD_POSTAL_CLIENT, dos, objectOut);
					
						writeString(this.VILLE_CLIENT, dos, objectOut);
					
						writeString(this.PAYS_CLIENT, dos, objectOut);
					
						writeString(this.REGION_CLIENT, dos, objectOut);
					
						writeString(this.CD_TYPE_CLIENT, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
					objectOut.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_CLIENT="+ID_CLIENT);
		sb.append(",NOM_CLIENT="+NOM_CLIENT);
		sb.append(",PREN_CLIENT="+PREN_CLIENT);
		sb.append(",CD_POSTAL_CLIENT="+CD_POSTAL_CLIENT);
		sb.append(",VILLE_CLIENT="+VILLE_CLIENT);
		sb.append(",PAYS_CLIENT="+PAYS_CLIENT);
		sb.append(",REGION_CLIENT="+REGION_CLIENT);
		sb.append(",CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_CLIENT, other.ID_CLIENT);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row7Struct row7 = new row7Struct();




	
	/**
	 * [tAdvancedHash_row7 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row7", false);
		start_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row7");
					}
				
		int tos_count_tAdvancedHash_row7 = 0;
		

			   		// connection name:row7
			   		// source node:tDBInput_2 - inputs:(after_tFileInputDelimited_1) outputs:(row7,row7) | target node:tAdvancedHash_row7 - inputs:(row7) outputs:()
			   		// linked node: tMap_6 - inputs:(row3,row7) outputs:(VenteAsClient,VenteNotClient)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row7 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row7Struct>getLookup(matchingModeEnum_row7);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row7", tHash_Lookup_row7);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row7 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";

	
		int tos_count_tDBInput_2 = 0;
		
	
    
	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				conn_tDBInput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"ID_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"NOM_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"PREN_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"CD_POSTAL_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"VILLE_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"PAYS_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"REGION_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"CD_TYPE_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"LB_NOM_FICHIER\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"DT_INSERTION\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_ods+"\".\"ODS_CLIENT\".\"LB_JOB_NAME\"\nFROM \""+context.schema_ods+"\".\"ODS_CLIENT\"\nWHERE \"BL_LIGNE_ACTIVE\"=1;\n";
		    

            	globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);
		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row7.ID_CLIENT = null;
							} else {
	                         		
        	row7.ID_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 1, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row7.NOM_CLIENT = null;
							} else {
	                         		
        	row7.NOM_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row7.PREN_CLIENT = null;
							} else {
	                         		
        	row7.PREN_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row7.CD_POSTAL_CLIENT = null;
							} else {
	                         		
        	row7.CD_POSTAL_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row7.VILLE_CLIENT = null;
							} else {
	                         		
        	row7.VILLE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row7.PAYS_CLIENT = null;
							} else {
	                         		
        	row7.PAYS_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 6, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row7.REGION_CLIENT = null;
							} else {
	                         		
        	row7.REGION_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								row7.CD_TYPE_CLIENT = null;
							} else {
	                         		
        	row7.CD_TYPE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 8, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								row7.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row7.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_2, 9, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								row7.DT_INSERTION = null;
							} else {
										
			row7.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 10);
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								row7.BL_LIGNE_ACTIVE = 0;
							} else {
		                          
            row7.BL_LIGNE_ACTIVE = rs_tDBInput_2.getInt(11);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 12) {
								row7.LB_JOB_NAME = null;
							} else {
	                         		
        	row7.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_2, 12, false);
		                    }
					


 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row7 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					


			   
			   

					row7Struct row7_HashRow = new row7Struct();
		   	   	   
				
				row7_HashRow.ID_CLIENT = row7.ID_CLIENT;
				
				row7_HashRow.NOM_CLIENT = row7.NOM_CLIENT;
				
				row7_HashRow.PREN_CLIENT = row7.PREN_CLIENT;
				
				row7_HashRow.CD_POSTAL_CLIENT = row7.CD_POSTAL_CLIENT;
				
				row7_HashRow.VILLE_CLIENT = row7.VILLE_CLIENT;
				
				row7_HashRow.PAYS_CLIENT = row7.PAYS_CLIENT;
				
				row7_HashRow.REGION_CLIENT = row7.REGION_CLIENT;
				
				row7_HashRow.CD_TYPE_CLIENT = row7.CD_TYPE_CLIENT;
				
				row7_HashRow.LB_NOM_FICHIER = row7.LB_NOM_FICHIER;
				
				row7_HashRow.DT_INSERTION = row7.DT_INSERTION;
				
				row7_HashRow.BL_LIGNE_ACTIVE = row7.BL_LIGNE_ACTIVE;
				
				row7_HashRow.LB_JOB_NAME = row7.LB_JOB_NAME;
				
			tHash_Lookup_row7.put(row7_HashRow);
			
            




 


	tos_count_tAdvancedHash_row7++;

/**
 * [tAdvancedHash_row7 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row7 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
}
globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
 

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row7 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

tHash_Lookup_row7.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row7");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row7", true);
end_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());




/**
 * [tAdvancedHash_row7 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row7 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class row8Struct implements routines.system.IPersistableComparableLookupRow<row8Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String NOM_PRODUIT;

				public String getNOM_PRODUIT () {
					return this.NOM_PRODUIT;
				}
				
			    public BigDecimal PRIX_ACHAT_PRODUIT;

				public BigDecimal getPRIX_ACHAT_PRODUIT () {
					return this.PRIX_ACHAT_PRODUIT;
				}
				
			    public BigDecimal PRIX_VENTE_PRODUIT;

				public BigDecimal getPRIX_VENTE_PRODUIT () {
					return this.PRIX_VENTE_PRODUIT;
				}
				
			    public String CD_SOUS_CATEGORIE;

				public String getCD_SOUS_CATEGORIE () {
					return this.CD_SOUS_CATEGORIE;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CD_PRODUIT == null) ? 0 : this.CD_PRODUIT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row8Struct other = (row8Struct) obj;
		
						if (this.CD_PRODUIT == null) {
							if (other.CD_PRODUIT != null)
								return false;
						
						} else if (!this.CD_PRODUIT.equals(other.CD_PRODUIT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row8Struct other) {

		other.CD_PRODUIT = this.CD_PRODUIT;
	            other.NOM_PRODUIT = this.NOM_PRODUIT;
	            other.PRIX_ACHAT_PRODUIT = this.PRIX_ACHAT_PRODUIT;
	            other.PRIX_VENTE_PRODUIT = this.PRIX_VENTE_PRODUIT;
	            other.CD_SOUS_CATEGORIE = this.CD_SOUS_CATEGORIE;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row8Struct other) {

		other.CD_PRODUIT = this.CD_PRODUIT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.CD_PRODUIT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.CD_PRODUIT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.NOM_PRODUIT = readString(dis,ois);
					
       			    	this.PRIX_ACHAT_PRODUIT = (BigDecimal) ois.readObject();
					
       			    	this.PRIX_VENTE_PRODUIT = (BigDecimal) ois.readObject();
					
						this.CD_SOUS_CATEGORIE = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
			            this.BL_LIGNE_ACTIVE = dis.readInt();
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.NOM_PRODUIT = readString(dis,objectIn);
					
       			    	this.PRIX_ACHAT_PRODUIT = (BigDecimal) objectIn.readObject();
					
       			    	this.PRIX_VENTE_PRODUIT = (BigDecimal) objectIn.readObject();
					
						this.CD_SOUS_CATEGORIE = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
			            this.BL_LIGNE_ACTIVE = objectIn.readInt();
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.NOM_PRODUIT, dos, oos);
					
       			    	oos.writeObject(this.PRIX_ACHAT_PRODUIT);
					
       			    	oos.writeObject(this.PRIX_VENTE_PRODUIT);
					
						writeString(this.CD_SOUS_CATEGORIE, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.NOM_PRODUIT, dos, objectOut);
					
       			    	objectOut.writeObject(this.PRIX_ACHAT_PRODUIT);
					
       			    	objectOut.writeObject(this.PRIX_VENTE_PRODUIT);
					
						writeString(this.CD_SOUS_CATEGORIE, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
					objectOut.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_PRODUIT="+CD_PRODUIT);
		sb.append(",NOM_PRODUIT="+NOM_PRODUIT);
		sb.append(",PRIX_ACHAT_PRODUIT="+String.valueOf(PRIX_ACHAT_PRODUIT));
		sb.append(",PRIX_VENTE_PRODUIT="+String.valueOf(PRIX_VENTE_PRODUIT));
		sb.append(",CD_SOUS_CATEGORIE="+CD_SOUS_CATEGORIE);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CD_PRODUIT, other.CD_PRODUIT);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row8Struct row8 = new row8Struct();




	
	/**
	 * [tAdvancedHash_row8 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row8", false);
		start_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row8");
					}
				
		int tos_count_tAdvancedHash_row8 = 0;
		

			   		// connection name:row8
			   		// source node:tDBInput_1 - inputs:(after_tFileInputDelimited_1) outputs:(row8,row8) | target node:tAdvancedHash_row8 - inputs:(row8) outputs:()
			   		// linked node: tMap_5 - inputs:(VenteAsClient,row8) outputs:(VenteAsProduit,VenteNotProduit)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row8 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row8Struct>getLookup(matchingModeEnum_row8);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row8", tHash_Lookup_row8);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row8 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
	
    
	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"CD_PRODUIT\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"NOM_PRODUIT\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"PRIX_ACHAT_PRODUIT\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"PRIX_VENTE_PRODUIT\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"CD_SOUS_CATEGORIE\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"LB_NOM_FICHIER\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"DT_INSERTION\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_ods+"\".\"ODS_PRODUIT\".\"LB_JOB_NAME\"\nFROM \""+context.schema_ods+"\".\"ODS_PRODUIT\"\nWHERE \"BL_LIGNE_ACTIVE\"=1\n";
		    

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row8.CD_PRODUIT = null;
							} else {
	                         		
        	row8.CD_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row8.NOM_PRODUIT = null;
							} else {
	                         		
        	row8.NOM_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row8.PRIX_ACHAT_PRODUIT = null;
							} else {
		                          
            row8.PRIX_ACHAT_PRODUIT = rs_tDBInput_1.getBigDecimal(3);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row8.PRIX_VENTE_PRODUIT = null;
							} else {
		                          
            row8.PRIX_VENTE_PRODUIT = rs_tDBInput_1.getBigDecimal(4);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row8.CD_SOUS_CATEGORIE = null;
							} else {
	                         		
        	row8.CD_SOUS_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row8.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row8.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row8.DT_INSERTION = null;
							} else {
										
			row8.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 7);
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row8.BL_LIGNE_ACTIVE = 0;
							} else {
		                          
            row8.BL_LIGNE_ACTIVE = rs_tDBInput_1.getInt(8);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row8.LB_JOB_NAME = null;
							} else {
	                         		
        	row8.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 9, false);
		                    }
					


 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row8"
						
						);
					}
					


			   
			   

					row8Struct row8_HashRow = new row8Struct();
		   	   	   
				
				row8_HashRow.CD_PRODUIT = row8.CD_PRODUIT;
				
				row8_HashRow.NOM_PRODUIT = row8.NOM_PRODUIT;
				
				row8_HashRow.PRIX_ACHAT_PRODUIT = row8.PRIX_ACHAT_PRODUIT;
				
				row8_HashRow.PRIX_VENTE_PRODUIT = row8.PRIX_VENTE_PRODUIT;
				
				row8_HashRow.CD_SOUS_CATEGORIE = row8.CD_SOUS_CATEGORIE;
				
				row8_HashRow.LB_NOM_FICHIER = row8.LB_NOM_FICHIER;
				
				row8_HashRow.DT_INSERTION = row8.DT_INSERTION;
				
				row8_HashRow.BL_LIGNE_ACTIVE = row8.BL_LIGNE_ACTIVE;
				
				row8_HashRow.LB_JOB_NAME = row8.LB_JOB_NAME;
				
			tHash_Lookup_row8.put(row8_HashRow);
			
            




 


	tos_count_tAdvancedHash_row8++;

/**
 * [tAdvancedHash_row8 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

tHash_Lookup_row8.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row8");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row8", true);
end_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());




/**
 * [tAdvancedHash_row8 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public BigDecimal PRIX_ACHAT;

				public BigDecimal getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public BigDecimal PRIX_VENTE;

				public BigDecimal getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_VENTE == null) ? 0 : this.ID_VENTE.hashCode());
					
						result = prime * result + ((this.CD_PRODUIT == null) ? 0 : this.CD_PRODUIT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row4Struct other = (row4Struct) obj;
		
						if (this.ID_VENTE == null) {
							if (other.ID_VENTE != null)
								return false;
						
						} else if (!this.ID_VENTE.equals(other.ID_VENTE))
						
							return false;
					
						if (this.CD_PRODUIT == null) {
							if (other.CD_PRODUIT != null)
								return false;
						
						} else if (!this.CD_PRODUIT.equals(other.CD_PRODUIT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.ID_VENTE = this.ID_VENTE;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.DT_VENTE = this.DT_VENTE;
	            other.ID_CLIENT = this.ID_CLIENT;
	            other.QTE_VENTE = this.QTE_VENTE;
	            other.PRIX_ACHAT = this.PRIX_ACHAT;
	            other.PRIX_VENTE = this.PRIX_VENTE;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

		other.ID_VENTE = this.ID_VENTE;
	            	other.CD_PRODUIT = this.CD_PRODUIT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsVente, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.DT_VENTE = readDate(dis,ois);
					
						this.ID_CLIENT = readString(dis,ois);
					
			            this.QTE_VENTE = dis.readInt();
					
       			    	this.PRIX_ACHAT = (BigDecimal) ois.readObject();
					
       			    	this.PRIX_VENTE = (BigDecimal) ois.readObject();
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.DT_VENTE = readDate(dis,objectIn);
					
						this.ID_CLIENT = readString(dis,objectIn);
					
			            this.QTE_VENTE = objectIn.readInt();
					
       			    	this.PRIX_ACHAT = (BigDecimal) objectIn.readObject();
					
       			    	this.PRIX_VENTE = (BigDecimal) objectIn.readObject();
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeDate(this.DT_VENTE, dos, oos);
					
						writeString(this.ID_CLIENT, dos, oos);
					
		            	dos.writeInt(this.QTE_VENTE);
					
       			    	oos.writeObject(this.PRIX_ACHAT);
					
       			    	oos.writeObject(this.PRIX_VENTE);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeDate(this.DT_VENTE, dos, objectOut);
					
						writeString(this.ID_CLIENT, dos, objectOut);
					
					objectOut.writeInt(this.QTE_VENTE);
					
       			    	objectOut.writeObject(this.PRIX_ACHAT);
					
       			    	objectOut.writeObject(this.PRIX_VENTE);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_VENTE, other.ID_VENTE);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CD_PRODUIT, other.CD_PRODUIT);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tAdvancedHash_row4 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row4", false);
		start_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row4");
					}
				
		int tos_count_tAdvancedHash_row4 = 0;
		

			   		// connection name:row4
			   		// source node:tDBInput_3 - inputs:(after_tFileInputDelimited_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_2 - inputs:(VenteAsProduit,row4) outputs:(InsertData,VenteExistant)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";

	
		int tos_count_tDBInput_3 = 0;
		
	
    
	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_3 = java.lang.Class.forName(driverClass_tDBInput_3);
				String dbUser_tDBInput_3 = context.postgres_user;
				
				
	final String decryptedPassword_tDBInput_3 = context.postgres_password; 
				
				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;
				
				String url_tDBInput_3 = "jdbc:postgresql://" + context.server_name + ":" + context.port + "/" + context.database + "?" + context.additinal_params;
				
				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
		        
				conn_tDBInput_3.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"ID_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"CD_PRODUIT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"DT_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"ID_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"QTE_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"PRIX_ACHAT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"PRIX_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"LB_NOM_FICHIER\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"DT_INSERTION\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"LB_JOB_NAME\"\nFROM \""+context.schema_ods+"\".\"ODS_VENTE\"";
		    

            	globalMap.put("tDBInput_3_QUERY",dbquery_tDBInput_3);
		    java.sql.ResultSet rs_tDBInput_3 = null;

		    try {
		    	rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
		    	int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

		    String tmpContent_tDBInput_3 = null;
		    
		    
		    while (rs_tDBInput_3.next()) {
		        nb_line_tDBInput_3++;
		        
							if(colQtyInRs_tDBInput_3 < 1) {
								row4.ID_VENTE = null;
							} else {
	                         		
        	row4.ID_VENTE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 1, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row4.CD_PRODUIT = null;
							} else {
	                         		
        	row4.CD_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_3, 2, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row4.DT_VENTE = null;
							} else {
										
			row4.DT_VENTE = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 3);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row4.ID_CLIENT = null;
							} else {
	                         		
        	row4.ID_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_3, 4, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row4.QTE_VENTE = 0;
							} else {
		                          
            row4.QTE_VENTE = rs_tDBInput_3.getInt(5);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row4.PRIX_ACHAT = null;
							} else {
		                          
            row4.PRIX_ACHAT = rs_tDBInput_3.getBigDecimal(6);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 7) {
								row4.PRIX_VENTE = null;
							} else {
		                          
            row4.PRIX_VENTE = rs_tDBInput_3.getBigDecimal(7);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 8) {
								row4.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row4.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_3, 8, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 9) {
								row4.DT_INSERTION = null;
							} else {
										
			row4.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 9);
		                    }
							if(colQtyInRs_tDBInput_3 < 10) {
								row4.LB_JOB_NAME = null;
							} else {
	                         		
        	row4.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_3, 10, false);
		                    }
					


 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row4"
						
						);
					}
					


			   
			   

					row4Struct row4_HashRow = new row4Struct();
		   	   	   
				
				row4_HashRow.ID_VENTE = row4.ID_VENTE;
				
				row4_HashRow.CD_PRODUIT = row4.CD_PRODUIT;
				
				row4_HashRow.DT_VENTE = row4.DT_VENTE;
				
				row4_HashRow.ID_CLIENT = row4.ID_CLIENT;
				
				row4_HashRow.QTE_VENTE = row4.QTE_VENTE;
				
				row4_HashRow.PRIX_ACHAT = row4.PRIX_ACHAT;
				
				row4_HashRow.PRIX_VENTE = row4.PRIX_VENTE;
				
				row4_HashRow.LB_NOM_FICHIER = row4.LB_NOM_FICHIER;
				
				row4_HashRow.DT_INSERTION = row4.DT_INSERTION;
				
				row4_HashRow.LB_JOB_NAME = row4.LB_JOB_NAME;
				
			tHash_Lookup_row4.put(row4_HashRow);
			
            




 


	tos_count_tAdvancedHash_row4++;

/**
 * [tAdvancedHash_row4 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

	}
}finally{
	if (rs_tDBInput_3 != null) {
		rs_tDBInput_3.close();
	}
	if (stmt_tDBInput_3 != null) {
		stmt_tDBInput_3.close();
	}
	if(conn_tDBInput_3 != null && !conn_tDBInput_3.isClosed()) {
		
			conn_tDBInput_3.commit();
			
		
			conn_tDBInput_3.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_3_NB_LINE",nb_line_tDBInput_3);
 

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

tHash_Lookup_row4.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row4");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row4", true);
end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());




/**
 * [tAdvancedHash_row4 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";

	
		int tos_count_tDBCommit_1 = 0;
		

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
			
			conn_tDBCommit_1.commit();
			
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tDBCommit_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";

	
		int tos_count_tChronometerStop_1 = 0;
		
	
	long timetChronometerStop_1;
	
		timetChronometerStop_1 = System.currentTimeMillis() - startTime;
		
	   		System.out.print("[ tChronometerStop_1 ]  ");
		
	  	System.out.println("" + "  " + timetChronometerStop_1 + " milliseconds");
	  	 
	
	Long currentTimetChronometerStop_1 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);
	
	globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
	globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);
 



/**
 * [tChronometerStop_1 begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tJava_2Process(globalMap);



/**
 * [tChronometerStop_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";

	
		int tos_count_tJava_2 = 0;
		


System.out.println("Nombre de lignes reçues                       : "+((Integer)globalMap.get("tFileInputDelimited_1_NB_LINE")));

System.out.println("Nombre de lignes rejetées                     : "+((Integer)globalMap.get("tFilterRow_1_NB_LINE_REJECT")));
System.out.println("Nombre de lignes en double                    : "+((Integer)globalMap.get("tUniqRow_1_NB_DUPLICATES")));
System.out.println("-----------------------------------------------------------------------------");
System.out.println("Fin d'exécution du job "+jobName+ "          : "+ 
TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",new java.util.Date(((Long)globalMap.get("tChronometerStop_1_STOPTIME")))
));
 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final jOdsVente jOdsVenteClass = new jOdsVente();

        int exitCode = jOdsVenteClass.runJobInTOS(args);

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

    	
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        if (inOSGi) {
            java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

            if (jobProperties != null && jobProperties.get("context") != null) {
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = jOdsVente.class.getClassLoader().getResourceAsStream("icommerce_reporting/jodsvente_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jOdsVente.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("additinal_params", "id_String");
                        if(context.getStringValue("additinal_params") == null) {
                            context.additinal_params = null;
                        } else {
                            context.additinal_params=(String) context.getProperty("additinal_params");
                        }
                        context.setContextType("database", "id_String");
                        if(context.getStringValue("database") == null) {
                            context.database = null;
                        } else {
                            context.database=(String) context.getProperty("database");
                        }
                        context.setContextType("port", "id_String");
                        if(context.getStringValue("port") == null) {
                            context.port = null;
                        } else {
                            context.port=(String) context.getProperty("port");
                        }
                        context.setContextType("postgres_password", "id_Password");
                        if(context.getStringValue("postgres_password") == null) {
                            context.postgres_password = null;
                        } else {
                            String pwd_postgres_password_value = context.getProperty("postgres_password");
                            context.postgres_password = null;
                            if(pwd_postgres_password_value!=null) {
                                if(context_param.containsKey("postgres_password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.postgres_password = pwd_postgres_password_value;
                                } else if (!pwd_postgres_password_value.isEmpty()) {
                                    try {
                                        context.postgres_password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_postgres_password_value);
                                        context.put("postgres_password",context.postgres_password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("postgres_user", "id_String");
                        if(context.getStringValue("postgres_user") == null) {
                            context.postgres_user = null;
                        } else {
                            context.postgres_user=(String) context.getProperty("postgres_user");
                        }
                        context.setContextType("schema_ods", "id_String");
                        if(context.getStringValue("schema_ods") == null) {
                            context.schema_ods = null;
                        } else {
                            context.schema_ods=(String) context.getProperty("schema_ods");
                        }
                        context.setContextType("server_name", "id_String");
                        if(context.getStringValue("server_name") == null) {
                            context.server_name = null;
                        } else {
                            context.server_name=(String) context.getProperty("server_name");
                        }
                        context.setContextType("schema_params", "id_String");
                        if(context.getStringValue("schema_params") == null) {
                            context.schema_params = null;
                        } else {
                            context.schema_params=(String) context.getProperty("schema_params");
                        }
                        context.setContextType("encodage", "id_String");
                        if(context.getStringValue("encodage") == null) {
                            context.encodage = null;
                        } else {
                            context.encodage=(String) context.getProperty("encodage");
                        }
                        context.setContextType("fieldSeparator", "id_String");
                        if(context.getStringValue("fieldSeparator") == null) {
                            context.fieldSeparator = null;
                        } else {
                            context.fieldSeparator=(String) context.getProperty("fieldSeparator");
                        }
                        context.setContextType("projectFolder", "id_Directory");
                        if(context.getStringValue("projectFolder") == null) {
                            context.projectFolder = null;
                        } else {
                            context.projectFolder=(String) context.getProperty("projectFolder");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("additinal_params")) {
                context.additinal_params = (String) parentContextMap.get("additinal_params");
            }if (parentContextMap.containsKey("database")) {
                context.database = (String) parentContextMap.get("database");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("postgres_password")) {
                context.postgres_password = (java.lang.String) parentContextMap.get("postgres_password");
            }if (parentContextMap.containsKey("postgres_user")) {
                context.postgres_user = (String) parentContextMap.get("postgres_user");
            }if (parentContextMap.containsKey("schema_ods")) {
                context.schema_ods = (String) parentContextMap.get("schema_ods");
            }if (parentContextMap.containsKey("server_name")) {
                context.server_name = (String) parentContextMap.get("server_name");
            }if (parentContextMap.containsKey("schema_params")) {
                context.schema_params = (String) parentContextMap.get("schema_params");
            }if (parentContextMap.containsKey("encodage")) {
                context.encodage = (String) parentContextMap.get("encodage");
            }if (parentContextMap.containsKey("fieldSeparator")) {
                context.fieldSeparator = (String) parentContextMap.get("fieldSeparator");
            }if (parentContextMap.containsKey("projectFolder")) {
                context.projectFolder = (String) parentContextMap.get("projectFolder");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("postgres_password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();

try {
errorCode = null;Implicit_Context_DatabaseProcess(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_Implicit_Context_Database) {
globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", -1);

e_Implicit_Context_Database.printStackTrace();

}

this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}




this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tFileList_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tFileList_1) {
globalMap.put("tFileList_1_SUBPROCESS_STATE", -1);

e_tFileList_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jOdsVente");
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     437183 characters generated by Talend Open Studio for Data Integration 
 *     on the 28 février 2025 à 14:35:19 GMT
 ************************************************************************************************/