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


package icommerce_reporting.jdwhvente_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
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


@SuppressWarnings("unused")

/**
 * Job: jDwhVente Purpose: jDwhVente<br>
 * Description: jDwhVente <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jDwhVente implements TalendJob {

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
			
			if(schema_dwh != null){
				
					this.setProperty("schema_dwh", schema_dwh.toString());
				
			}
			
			if(schema_ods != null){
				
					this.setProperty("schema_ods", schema_ods.toString());
				
			}
			
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
			
			if(schema_params != null){
				
					this.setProperty("schema_params", schema_params.toString());
				
			}
			
			if(server_name != null){
				
					this.setProperty("server_name", server_name.toString());
				
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

public String schema_dwh;
public String getSchema_dwh(){
	return this.schema_dwh;
}
public String schema_ods;
public String getSchema_ods(){
	return this.schema_ods;
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
public String schema_params;
public String getSchema_params(){
	return this.schema_params;
}
public String server_name;
public String getServer_name(){
	return this.server_name;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "jDwhVente";
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
				jDwhVente.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jDwhVente.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_2_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Produit_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Client_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Calendrier_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAggregateRow_1_AGGOUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tAggregateRow_1_AGGIN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tAggregateRow_1_AGGIN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
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
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tHashInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tHashInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

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
				tDBConnection_2Process(globalMap);



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
	

public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

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
	 * [tDBConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_2", false);
		start_Hash.put("tDBConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_2";

	
		int tos_count_tDBConnection_2 = 0;
		


	
            String dbProperties_tDBConnection_2 = context.additinal_params;
            String url_tDBConnection_2 = "jdbc:postgresql://"+context.server_name+":"+context.port+"/"+context.database;
            
            if(dbProperties_tDBConnection_2 != null && !"".equals(dbProperties_tDBConnection_2.trim())) {
                url_tDBConnection_2 = url_tDBConnection_2 + "?" + dbProperties_tDBConnection_2;
            }
	String dbUser_tDBConnection_2 = context.postgres_user;
	
	
		
	final String decryptedPassword_tDBConnection_2 = context.postgres_password; 
		String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;
	
	
	java.sql.Connection conn_tDBConnection_2 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_2 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_2 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_2.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_2 = drivers_tDBConnection_2.nextElement();
        if (redShiftDriverNames_tDBConnection_2.contains(d_tDBConnection_2.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_2);
                java.sql.DriverManager.registerDriver(d_tDBConnection_2);
            } catch (java.lang.Exception e_tDBConnection_2) {
globalMap.put("tDBConnection_2_ERROR_MESSAGE",e_tDBConnection_2.getMessage());
                    //do nothing
            }
        }
    }
	
			String sharedConnectionName_tDBConnection_2 = "VENTE_DWH";
			conn_tDBConnection_2 = SharedDBConnection.getDBConnection("org.postgresql.Driver",url_tDBConnection_2,dbUser_tDBConnection_2 , dbPwd_tDBConnection_2 , sharedConnectionName_tDBConnection_2);
			globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
	if (null != conn_tDBConnection_2) {
		
			conn_tDBConnection_2.setAutoCommit(false);
	}

	globalMap.put("schema_" + "tDBConnection_2",context.schema_dwh);

 



/**
 * [tDBConnection_2 begin ] stop
 */
	
	/**
	 * [tDBConnection_2 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 

ok_Hash.put("tDBConnection_2", true);
end_Hash.put("tDBConnection_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tDBConnection_2 end ] stop
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
	 * [tDBConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
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
				tDBCommit_2Process(globalMap);



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
	

public void tDBCommit_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 0);

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
	 * [tDBCommit_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_2", false);
		start_Hash.put("tDBCommit_2", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_2";

	
		int tos_count_tDBCommit_2 = 0;
		

 



/**
 * [tDBCommit_2 begin ] stop
 */
	
	/**
	 * [tDBCommit_2 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

	java.sql.Connection conn_tDBCommit_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_2 != null && !conn_tDBCommit_2.isClosed())
	{
	
			
			conn_tDBCommit_2.commit();
			
	
	}

 


	tos_count_tDBCommit_2++;

/**
 * [tDBCommit_2 main ] stop
 */
	
	/**
	 * [tDBCommit_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_2 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 

ok_Hash.put("tDBCommit_2", true);
end_Hash.put("tDBCommit_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tDBCommit_2 end ] stop
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
	 * [tDBCommit_2 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 1);
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

	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
		try{
	
			
			conn_tDBCommit_1.commit();
			
	
		}finally{
			
			conn_tDBCommit_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_2"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    }
	
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
	


public static class InsertDataStruct implements routines.system.IPersistableRow<InsertDataStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public Double MT_ACHAT;

				public Double getMT_ACHAT () {
					return this.MT_ACHAT;
				}
				
			    public Double MT_VENTE;

				public Double getMT_VENTE () {
					return this.MT_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.ID_DIM_PRODUIT;
						
							result = prime * result + (int) this.ID_DIM_CLIENT;
						
							result = prime * result + (int) this.ID_DIM_CALENDRIER;
						
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
		final InsertDataStruct other = (InsertDataStruct) obj;
		
						if (this.ID_DIM_PRODUIT != other.ID_DIM_PRODUIT)
							return false;
					
						if (this.ID_DIM_CLIENT != other.ID_DIM_CLIENT)
							return false;
					
						if (this.ID_DIM_CALENDRIER != other.ID_DIM_CALENDRIER)
							return false;
					

		return true;
    }

	public void copyDataTo(InsertDataStruct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
	            other.ID_VENTE = this.ID_VENTE;
	            other.QTE_VENTE = this.QTE_VENTE;
	            other.MT_ACHAT = this.MT_ACHAT;
	            other.MT_VENTE = this.MT_VENTE;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.ID_CLIENT = this.ID_CLIENT;
	            
	}

	public void copyKeysDataTo(InsertDataStruct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            	other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            	other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",ID_VENTE="+ID_VENTE);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",MT_ACHAT="+String.valueOf(MT_ACHAT));
		sb.append(",MT_VENTE="+String.valueOf(MT_VENTE));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",ID_CLIENT="+ID_CLIENT);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertDataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_DIM_PRODUIT, other.ID_DIM_PRODUIT);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_DIM_CLIENT, other.ID_DIM_CLIENT);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_DIM_CALENDRIER, other.ID_DIM_CALENDRIER);
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

public static class VenteStruct implements routines.system.IPersistableRow<VenteStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
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
				
			    public double PRIX_ACHAT;

				public double getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public double PRIX_VENTE;

				public double getPRIX_VENTE () {
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

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
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
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
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
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
    public int compareTo(VenteStruct other) {

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

public static class after_tDBInput_1Struct implements routines.system.IPersistableRow<after_tDBInput_1Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
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
				
			    public double PRIX_ACHAT;

				public double getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public double PRIX_VENTE;

				public double getPRIX_VENTE () {
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

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
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
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
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
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
    public int compareTo(after_tDBInput_1Struct other) {

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


		tDBInput_7Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_2Process(globalMap);

		VenteStruct Vente = new VenteStruct();
InsertDataStruct InsertData = new InsertDataStruct();





	
	/**
	 * [tHashOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashOutput_1", false);
		start_Hash.put("tHashOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tHashOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertData");
					}
				
		int tos_count_tHashOutput_1 = 0;
		



org.talend.designer.components.hashfile.common.MapHashFile mf_tHashOutput_1=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();    
		org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<InsertDataStruct> tHashFile_tHashOutput_1 = null;
		String hashKey_tHashOutput_1 = "tHashFile_jDwhVente_" + pid + "_tHashOutput_1";
			synchronized(org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.get(hashKey_tHashOutput_1)){
			    if(mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1) == null){
	      		    mf_tHashOutput_1.getResourceMap().put(hashKey_tHashOutput_1, new org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<InsertDataStruct>(org.talend.designer.components.hashfile.common.MATCHING_MODE.KEEP_ALL));
	      		    tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
			    }else{
			    	tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
			    }
			}
        int nb_line_tHashOutput_1 = 0;

 



/**
 * [tHashOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Vente");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ProduitStruct> tHash_Lookup_Produit = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ProduitStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ProduitStruct>) 
					globalMap.get( "tHash_Lookup_Produit" ))
					;					
					
	

ProduitStruct ProduitHashKey = new ProduitStruct();
ProduitStruct ProduitDefault = new ProduitStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ClientStruct> tHash_Lookup_Client = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ClientStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ClientStruct>) 
					globalMap.get( "tHash_Lookup_Client" ))
					;					
					
	

ClientStruct ClientHashKey = new ClientStruct();
ClientStruct ClientDefault = new ClientStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<CalendrierStruct> tHash_Lookup_Calendrier = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<CalendrierStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<CalendrierStruct>) 
					globalMap.get( "tHash_Lookup_Calendrier" ))
					;					
					
	

CalendrierStruct CalendrierHashKey = new CalendrierStruct();
CalendrierStruct CalendrierDefault = new CalendrierStruct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
InsertDataStruct InsertData_tmp = new InsertDataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
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
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"ID_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"CD_PRODUIT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"DT_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"ID_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"QTE_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"PRIX_ACHAT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"PRIX_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"LB_NOM_FICHIER\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"DT_INSERTION\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"LB_JOB_NAME\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"BL_LIGNE_IN_DWH\"\nFROM \""+context.schema_ods+"\".\"ODS_VENTE\"\nWHERE \"BL_LIGNE_IN_DWH\"=False;\n";
		    

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
								Vente.ID_VENTE = null;
							} else {
	                         		
        	Vente.ID_VENTE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								Vente.CD_PRODUIT = null;
							} else {
	                         		
        	Vente.CD_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								Vente.DT_VENTE = null;
							} else {
										
			Vente.DT_VENTE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 3);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								Vente.ID_CLIENT = null;
							} else {
	                         		
        	Vente.ID_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								Vente.QTE_VENTE = 0;
							} else {
		                          
            Vente.QTE_VENTE = rs_tDBInput_1.getInt(5);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								Vente.PRIX_ACHAT = 0;
							} else {
	                         		
            Vente.PRIX_ACHAT = rs_tDBInput_1.getDouble(6);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								Vente.PRIX_VENTE = 0;
							} else {
	                         		
            Vente.PRIX_VENTE = rs_tDBInput_1.getDouble(7);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								Vente.LB_NOM_FICHIER = null;
							} else {
	                         		
        	Vente.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 8, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								Vente.DT_INSERTION = null;
							} else {
										
			Vente.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 9);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								Vente.LB_JOB_NAME = null;
							} else {
	                         		
        	Vente.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								Vente.BL_LIGNE_IN_DWH = false;
							} else {
	                         		
            Vente.BL_LIGNE_IN_DWH = rs_tDBInput_1.getBoolean(11);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
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
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Vente"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "Produit" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopProduit = false;
       		  	    	
       		  	    	
 							ProduitStruct ProduitObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    ProduitHashKey.CD_PRODUIT = Vente.CD_PRODUIT ;
                        		    		

								
		                        	ProduitHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Produit.lookup( ProduitHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Produit.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_Produit != null && tHash_Lookup_Produit.getCount(ProduitHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'Produit' and it contains more one result from keys :  Produit.CD_PRODUIT = '" + ProduitHashKey.CD_PRODUIT + "'");
								} // G 071
							

							ProduitStruct Produit = null;
                    		  	 
							   
                    		  	 
	       		  	    	ProduitStruct fromLookup_Produit = null;
							Produit = ProduitDefault;
										 
							
								 
							
							
								if (tHash_Lookup_Produit !=null && tHash_Lookup_Produit.hasNext()) { // G 099
								
							
								
								fromLookup_Produit = tHash_Lookup_Produit.next();

							
							
								} // G 099
							
							

							if(fromLookup_Produit != null) {
								Produit = fromLookup_Produit;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "Client" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopClient = false;
       		  	    	
       		  	    	
 							ClientStruct ClientObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    ClientHashKey.ID_CLIENT = Vente.ID_CLIENT ;
                        		    		

								
		                        	ClientHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Client.lookup( ClientHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Client.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_Client != null && tHash_Lookup_Client.getCount(ClientHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'Client' and it contains more one result from keys :  Client.ID_CLIENT = '" + ClientHashKey.ID_CLIENT + "'");
								} // G 071
							

							ClientStruct Client = null;
                    		  	 
							   
                    		  	 
	       		  	    	ClientStruct fromLookup_Client = null;
							Client = ClientDefault;
										 
							
								 
							
							
								if (tHash_Lookup_Client !=null && tHash_Lookup_Client.hasNext()) { // G 099
								
							
								
								fromLookup_Client = tHash_Lookup_Client.next();

							
							
								} // G 099
							
							

							if(fromLookup_Client != null) {
								Client = fromLookup_Client;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "Calendrier" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopCalendrier = false;
       		  	    	
       		  	    	
 							CalendrierStruct CalendrierObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    CalendrierHashKey.DT_JOUR = Vente.DT_VENTE  == null ? null : new java.util.Date(Vente.DT_VENTE .getTime());
                        		    		

								
		                        	CalendrierHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Calendrier.lookup( CalendrierHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Calendrier.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_Calendrier != null && tHash_Lookup_Calendrier.getCount(CalendrierHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'Calendrier' and it contains more one result from keys :  Calendrier.DT_JOUR = '" + CalendrierHashKey.DT_JOUR + "'");
								} // G 071
							

							CalendrierStruct Calendrier = null;
                    		  	 
							   
                    		  	 
	       		  	    	CalendrierStruct fromLookup_Calendrier = null;
							Calendrier = CalendrierDefault;
										 
							
								 
							
							
								if (tHash_Lookup_Calendrier !=null && tHash_Lookup_Calendrier.hasNext()) { // G 099
								
							
								
								fromLookup_Calendrier = tHash_Lookup_Calendrier.next();

							
							
								} // G 099
							
							

							if(fromLookup_Calendrier != null) {
								Calendrier = fromLookup_Calendrier;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

InsertData = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'InsertData'
InsertData_tmp.ID_DIM_PRODUIT = Produit.ID_DIM_PRODUIT ;
InsertData_tmp.ID_DIM_CLIENT = Client.ID_DIM_CLIENT ;
InsertData_tmp.ID_DIM_CALENDRIER = Calendrier.ID_DIM_CALENDRIER ;
InsertData_tmp.ID_VENTE = Vente.ID_VENTE ;
InsertData_tmp.QTE_VENTE = Vente.QTE_VENTE ;
InsertData_tmp.MT_ACHAT = Vente.QTE_VENTE *Vente.PRIX_ACHAT ;
InsertData_tmp.MT_VENTE = Vente.QTE_VENTE *Vente.PRIX_VENTE ;
InsertData_tmp.CD_PRODUIT = Vente.CD_PRODUIT ;
InsertData_tmp.ID_CLIENT = Vente.ID_CLIENT ;
InsertData = InsertData_tmp;
}  // closing inner join bracket (2)
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
// Start of branch "InsertData"
if(InsertData != null) { 



	
	/**
	 * [tHashOutput_1 main ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertData"
						
						);
					}
					



    
		InsertDataStruct oneRow_tHashOutput_1 = new InsertDataStruct();
				
					oneRow_tHashOutput_1.ID_DIM_PRODUIT = InsertData.ID_DIM_PRODUIT;
					oneRow_tHashOutput_1.ID_DIM_CLIENT = InsertData.ID_DIM_CLIENT;
					oneRow_tHashOutput_1.ID_DIM_CALENDRIER = InsertData.ID_DIM_CALENDRIER;
					oneRow_tHashOutput_1.ID_VENTE = InsertData.ID_VENTE;
					oneRow_tHashOutput_1.QTE_VENTE = InsertData.QTE_VENTE;
					oneRow_tHashOutput_1.MT_ACHAT = InsertData.MT_ACHAT;
					oneRow_tHashOutput_1.MT_VENTE = InsertData.MT_VENTE;
					oneRow_tHashOutput_1.CD_PRODUIT = InsertData.CD_PRODUIT;
					oneRow_tHashOutput_1.ID_CLIENT = InsertData.ID_CLIENT;
		
        tHashFile_tHashOutput_1.put(oneRow_tHashOutput_1);
        nb_line_tHashOutput_1 ++;

 


	tos_count_tHashOutput_1++;

/**
 * [tHashOutput_1 main ] stop
 */
	
	/**
	 * [tHashOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	

 



/**
 * [tHashOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tHashOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	

 



/**
 * [tHashOutput_1 process_data_end ] stop
 */

} // End of branch "InsertData"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
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
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_Produit != null) {
						tHash_Lookup_Produit.endGet();
					}
					globalMap.remove( "tHash_Lookup_Produit" );

					
					
				
					if(tHash_Lookup_Client != null) {
						tHash_Lookup_Client.endGet();
					}
					globalMap.remove( "tHash_Lookup_Client" );

					
					
				
					if(tHash_Lookup_Calendrier != null) {
						tHash_Lookup_Calendrier.endGet();
					}
					globalMap.remove( "tHash_Lookup_Calendrier" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Vente");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tHashOutput_1 end ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	
globalMap.put("tHashOutput_1_NB_LINE", nb_line_tHashOutput_1);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertData");
			  	}
			  	
 

ok_Hash.put("tHashOutput_1", true);
end_Hash.put("tHashOutput_1", System.currentTimeMillis());




/**
 * [tHashOutput_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tHashInput_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_Produit"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_Client"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_Calendrier"); 
				     			
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tHashOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	

 



/**
 * [tHashOutput_1 finally ] stop
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
	


public static class InsertVenteStruct implements routines.system.IPersistableRow<InsertVenteStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public int NB_VENTE;

				public int getNB_VENTE () {
					return this.NB_VENTE;
				}
				
			    public int NB_QTE_VENTE;

				public int getNB_QTE_VENTE () {
					return this.NB_QTE_VENTE;
				}
				
			    public double NB_MT_ACHAT;

				public double getNB_MT_ACHAT () {
					return this.NB_MT_ACHAT;
				}
				
			    public double NB_MT_VENTE;

				public double getNB_MT_VENTE () {
					return this.NB_MT_VENTE;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
			        this.NB_VENTE = dis.readInt();
					
			        this.NB_QTE_VENTE = dis.readInt();
					
			        this.NB_MT_ACHAT = dis.readDouble();
					
			        this.NB_MT_VENTE = dis.readDouble();
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
			        this.NB_VENTE = dis.readInt();
					
			        this.NB_QTE_VENTE = dis.readInt();
					
			        this.NB_MT_ACHAT = dis.readDouble();
					
			        this.NB_MT_VENTE = dis.readDouble();
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// int
				
		            	dos.writeInt(this.NB_VENTE);
					
					// int
				
		            	dos.writeInt(this.NB_QTE_VENTE);
					
					// double
				
		            	dos.writeDouble(this.NB_MT_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.NB_MT_VENTE);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// int
				
		            	dos.writeInt(this.NB_VENTE);
					
					// int
				
		            	dos.writeInt(this.NB_QTE_VENTE);
					
					// double
				
		            	dos.writeDouble(this.NB_MT_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.NB_MT_VENTE);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
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
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",NB_VENTE="+String.valueOf(NB_VENTE));
		sb.append(",NB_QTE_VENTE="+String.valueOf(NB_QTE_VENTE));
		sb.append(",NB_MT_ACHAT="+String.valueOf(NB_MT_ACHAT));
		sb.append(",NB_MT_VENTE="+String.valueOf(NB_MT_VENTE));
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertVenteStruct other) {

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
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public Integer NB_VENTE;

				public Integer getNB_VENTE () {
					return this.NB_VENTE;
				}
				
			    public Integer NB_QTE_VENTE;

				public Integer getNB_QTE_VENTE () {
					return this.NB_QTE_VENTE;
				}
				
			    public Double NB_MT_ACHAT;

				public Double getNB_MT_ACHAT () {
					return this.NB_MT_ACHAT;
				}
				
			    public Double NB_MT_VENTE;

				public Double getNB_MT_VENTE () {
					return this.NB_MT_VENTE;
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",NB_VENTE="+String.valueOf(NB_VENTE));
		sb.append(",NB_QTE_VENTE="+String.valueOf(NB_QTE_VENTE));
		sb.append(",NB_MT_ACHAT="+String.valueOf(NB_MT_ACHAT));
		sb.append(",NB_MT_VENTE="+String.valueOf(NB_MT_VENTE));
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

public static class OnRowsEndStructtAggregateRow_1 implements routines.system.IPersistableRow<OnRowsEndStructtAggregateRow_1> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public Integer NB_VENTE;

				public Integer getNB_VENTE () {
					return this.NB_VENTE;
				}
				
			    public Integer NB_QTE_VENTE;

				public Integer getNB_QTE_VENTE () {
					return this.NB_QTE_VENTE;
				}
				
			    public Double NB_MT_ACHAT;

				public Double getNB_MT_ACHAT () {
					return this.NB_MT_ACHAT;
				}
				
			    public Double NB_MT_VENTE;

				public Double getNB_MT_VENTE () {
					return this.NB_MT_VENTE;
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",NB_VENTE="+String.valueOf(NB_VENTE));
		sb.append(",NB_QTE_VENTE="+String.valueOf(NB_QTE_VENTE));
		sb.append(",NB_MT_ACHAT="+String.valueOf(NB_MT_ACHAT));
		sb.append(",NB_MT_VENTE="+String.valueOf(NB_MT_VENTE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtAggregateRow_1 other) {

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
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public Double MT_ACHAT;

				public Double getMT_ACHAT () {
					return this.MT_ACHAT;
				}
				
			    public Double MT_VENTE;

				public Double getMT_VENTE () {
					return this.MT_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.ID_DIM_PRODUIT;
						
							result = prime * result + (int) this.ID_DIM_CLIENT;
						
							result = prime * result + (int) this.ID_DIM_CALENDRIER;
						
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
		final row1Struct other = (row1Struct) obj;
		
						if (this.ID_DIM_PRODUIT != other.ID_DIM_PRODUIT)
							return false;
					
						if (this.ID_DIM_CLIENT != other.ID_DIM_CLIENT)
							return false;
					
						if (this.ID_DIM_CALENDRIER != other.ID_DIM_CALENDRIER)
							return false;
					

		return true;
    }

	public void copyDataTo(row1Struct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
	            other.ID_VENTE = this.ID_VENTE;
	            other.QTE_VENTE = this.QTE_VENTE;
	            other.MT_ACHAT = this.MT_ACHAT;
	            other.MT_VENTE = this.MT_VENTE;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.ID_CLIENT = this.ID_CLIENT;
	            
	}

	public void copyKeysDataTo(row1Struct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            	other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            	other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",ID_VENTE="+ID_VENTE);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",MT_ACHAT="+String.valueOf(MT_ACHAT));
		sb.append(",MT_VENTE="+String.valueOf(MT_VENTE));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",ID_CLIENT="+ID_CLIENT);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_DIM_PRODUIT, other.ID_DIM_PRODUIT);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_DIM_CLIENT, other.ID_DIM_CLIENT);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_DIM_CALENDRIER, other.ID_DIM_CALENDRIER);
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
public void tHashInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tHashInput_1_SUBPROCESS_STATE", 0);

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



		row1Struct row1 = new row1Struct();
row2Struct row2 = new row2Struct();
InsertVenteStruct InsertVente = new InsertVenteStruct();




	
	/**
	 * [tAggregateRow_1_AGGOUT begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGOUT", false);
		start_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tAggregateRow_1_AGGOUT = 0;
		

// ------------ Seems it is not used

java.util.Map hashAggreg_tAggregateRow_1 = new java.util.HashMap(); 

// ------------

	class UtilClass_tAggregateRow_1 { // G_OutBegin_AggR_144

		public double sd(Double[] data) {
	        final int n = data.length;
        	if (n < 2) {
	            return Double.NaN;
        	}
        	double d1 = 0d;
        	double d2 =0d;
	        
	        for (int i = 0; i < data.length; i++) {
            	d1 += (data[i]*data[i]);
            	d2 += data[i];
        	}
        
	        return Math.sqrt((n*d1 - d2*d2)/n/(n-1));
	    }
	    
		public void checkedIADD(byte a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		    byte r = (byte) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'short/Short'", "'byte/Byte'"));
		    }
		}
		
		public void checkedIADD(short a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		    short r = (short) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'int/Integer'", "'short/Short'"));
		    }
		}
		
		public void checkedIADD(int a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		    int r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'long/Long'", "'int/Integer'"));
		    }
		}
		
		public void checkedIADD(long a, long b, boolean checkTypeOverFlow, boolean checkUlp) {
		    long r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'long/Long'"));
		    }
		}
		
		public void checkedIADD(float a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    float minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
			    }
			}
			
		    if (checkTypeOverFlow && ((double) a + (double) b > (double) Float.MAX_VALUE) || ((double) a + (double) b < (double) -Float.MAX_VALUE)) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
		    }
		}
		
		public void checkedIADD(double a, double b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		private String buildOverflowMessage(String a, String b, String advicedTypes, String originalType) {
		    return "Type overflow when adding " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}
		
		private String buildPrecisionMessage(String a, String b, String advicedTypes, String originalType) {
		    return "The double precision is unsufficient to add the value " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}

	} // G_OutBegin_AggR_144

	UtilClass_tAggregateRow_1 utilClass_tAggregateRow_1 = new UtilClass_tAggregateRow_1();

	

	class AggOperationStruct_tAggregateRow_1 { // G_OutBegin_AggR_100

		private static final int DEFAULT_HASHCODE = 1;
	    private static final int PRIME = 31;
	    private int hashCode = DEFAULT_HASHCODE;
	    public boolean hashCodeDirty = true;

    				int ID_DIM_PRODUIT;
    				int ID_DIM_CLIENT;
    				int ID_DIM_CALENDRIER;int count = 0;
       			int NB_VENTE_clmCount = 0;
           			
         			Integer NB_QTE_VENTE_sum;BigDecimal NB_MT_ACHAT_sum;
           			
         			Double NB_MT_VENTE_sum;
        
	    @Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;
		
								result = prime * result + (int) this.ID_DIM_PRODUIT;
							
								result = prime * result + (int) this.ID_DIM_CLIENT;
							
								result = prime * result + (int) this.ID_DIM_CALENDRIER;
							
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
			final AggOperationStruct_tAggregateRow_1 other = (AggOperationStruct_tAggregateRow_1) obj;
			
							if (this.ID_DIM_PRODUIT != other.ID_DIM_PRODUIT) 
								return false;
						
							if (this.ID_DIM_CLIENT != other.ID_DIM_CLIENT) 
								return false;
						
							if (this.ID_DIM_CALENDRIER != other.ID_DIM_CALENDRIER) 
								return false;
						
			
			return true;
		}
  
        
	} // G_OutBegin_AggR_100

	AggOperationStruct_tAggregateRow_1 operation_result_tAggregateRow_1 = null;
	AggOperationStruct_tAggregateRow_1 operation_finder_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();
	java.util.Map<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1> hash_tAggregateRow_1 = new java.util.HashMap<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1>();
	

 



/**
 * [tAggregateRow_1_AGGOUT begin ] stop
 */



	
	/**
	 * [tHashInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashInput_1", false);
		start_Hash.put("tHashInput_1", System.currentTimeMillis());
		
	
	currentComponent="tHashInput_1";

	
		int tos_count_tHashInput_1 = 0;
		


int nb_line_tHashInput_1 = 0;
	
org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_1=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();
org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<InsertDataStruct> tHashFile_tHashInput_1 = mf_tHashInput_1.getAdvancedMemoryHashFile("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
if(tHashFile_tHashInput_1==null) {
	throw new RuntimeException("The hash is not initialized : The hash must exist before you read from it");
}
java.util.Iterator<InsertDataStruct> iterator_tHashInput_1 = tHashFile_tHashInput_1.iterator();
while (iterator_tHashInput_1.hasNext()) {
    InsertDataStruct next_tHashInput_1 = iterator_tHashInput_1.next();

	row1.ID_DIM_PRODUIT = next_tHashInput_1.ID_DIM_PRODUIT;
	row1.ID_DIM_CLIENT = next_tHashInput_1.ID_DIM_CLIENT;
	row1.ID_DIM_CALENDRIER = next_tHashInput_1.ID_DIM_CALENDRIER;
	row1.ID_VENTE = next_tHashInput_1.ID_VENTE;
	row1.QTE_VENTE = next_tHashInput_1.QTE_VENTE;
	row1.MT_ACHAT = next_tHashInput_1.MT_ACHAT;
	row1.MT_VENTE = next_tHashInput_1.MT_VENTE;
	row1.CD_PRODUIT = next_tHashInput_1.CD_PRODUIT;
	row1.ID_CLIENT = next_tHashInput_1.ID_CLIENT;

 



/**
 * [tHashInput_1 begin ] stop
 */
	
	/**
	 * [tHashInput_1 main ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 


	tos_count_tHashInput_1++;

/**
 * [tHashInput_1 main ] stop
 */
	
	/**
	 * [tHashInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 



/**
 * [tHashInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					
	
operation_finder_tAggregateRow_1.ID_DIM_PRODUIT = row1.ID_DIM_PRODUIT;
			operation_finder_tAggregateRow_1.ID_DIM_CLIENT = row1.ID_DIM_CLIENT;
			operation_finder_tAggregateRow_1.ID_DIM_CALENDRIER = row1.ID_DIM_CALENDRIER;
			

	operation_finder_tAggregateRow_1.hashCodeDirty = true;
	
	operation_result_tAggregateRow_1 = hash_tAggregateRow_1.get(operation_finder_tAggregateRow_1);

	

	if(operation_result_tAggregateRow_1 == null) { // G_OutMain_AggR_001

		operation_result_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();

		operation_result_tAggregateRow_1.ID_DIM_PRODUIT = operation_finder_tAggregateRow_1.ID_DIM_PRODUIT;
				operation_result_tAggregateRow_1.ID_DIM_CLIENT = operation_finder_tAggregateRow_1.ID_DIM_CLIENT;
				operation_result_tAggregateRow_1.ID_DIM_CALENDRIER = operation_finder_tAggregateRow_1.ID_DIM_CALENDRIER;
				
		
		

		hash_tAggregateRow_1.put(operation_result_tAggregateRow_1, operation_result_tAggregateRow_1);
	
	} // G_OutMain_AggR_001


	
				operation_result_tAggregateRow_1.NB_VENTE_clmCount++;
				operation_result_tAggregateRow_1.count++;
				
					if(operation_result_tAggregateRow_1.NB_QTE_VENTE_sum == null) {
						operation_result_tAggregateRow_1.NB_QTE_VENTE_sum = (int) 0;
					}
					
						operation_result_tAggregateRow_1.NB_QTE_VENTE_sum += row1.QTE_VENTE;
					
					if(operation_result_tAggregateRow_1.NB_MT_ACHAT_sum == null) {
						operation_result_tAggregateRow_1.NB_MT_ACHAT_sum = new BigDecimal(0);
					}
					operation_result_tAggregateRow_1.NB_MT_ACHAT_sum = operation_result_tAggregateRow_1.NB_MT_ACHAT_sum.add(
						new BigDecimal(
							String.valueOf(
								row1.MT_ACHAT
							)
						)
					);
					
					if(operation_result_tAggregateRow_1.NB_MT_VENTE_sum == null) {
						operation_result_tAggregateRow_1.NB_MT_VENTE_sum = (double) 0;
					}
					
						operation_result_tAggregateRow_1.NB_MT_VENTE_sum += row1.QTE_VENTE;
					


 


	tos_count_tAggregateRow_1_AGGOUT++;

/**
 * [tAggregateRow_1_AGGOUT main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_end ] stop
 */



	
	/**
	 * [tHashInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 



/**
 * [tHashInput_1 process_data_end ] stop
 */
	
	/**
	 * [tHashInput_1 end ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	
    

		
			nb_line_tHashInput_1++;
		}	
    	
		org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.remove("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
	


	globalMap.put("tHashInput_1_NB_LINE", nb_line_tHashInput_1);       

 

ok_Hash.put("tHashInput_1", true);
end_Hash.put("tHashInput_1", System.currentTimeMillis());




/**
 * [tHashInput_1 end ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tAggregateRow_1_AGGOUT", true);
end_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());




/**
 * [tAggregateRow_1_AGGOUT end ] stop
 */



	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertVente");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = (String)globalMap.get("schema_" + "tDBConnection_2");
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("FAIT_VENTE");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("FAIT_VENTE");
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

	conn_tDBOutput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
	
	


   int batchSize_tDBOutput_1 = 10000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"ID_DIM_PRODUIT\",\"ID_DIM_CLIENT\",\"ID_DIM_CALENDRIER\",\"NB_VENTE\",\"NB_QTE_VENTE\",\"NB_MT_ACHAT\",\"NB_MT_VENTE\",\"DT_INSERTION\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
InsertVenteStruct InsertVente_tmp = new InsertVenteStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tAggregateRow_1_AGGIN begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGIN", false);
		start_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	
		int tos_count_tAggregateRow_1_AGGIN = 0;
		

java.util.Collection<AggOperationStruct_tAggregateRow_1> values_tAggregateRow_1 = hash_tAggregateRow_1.values();

globalMap.put("tAggregateRow_1_NB_LINE", values_tAggregateRow_1.size());

for(AggOperationStruct_tAggregateRow_1 aggregated_row_tAggregateRow_1 : values_tAggregateRow_1) { // G_AggR_600



 



/**
 * [tAggregateRow_1_AGGIN begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

            				    row2.ID_DIM_PRODUIT = aggregated_row_tAggregateRow_1.ID_DIM_PRODUIT;
            				    
            				    row2.ID_DIM_CLIENT = aggregated_row_tAggregateRow_1.ID_DIM_CLIENT;
            				    
            				    row2.ID_DIM_CALENDRIER = aggregated_row_tAggregateRow_1.ID_DIM_CALENDRIER;
            				    row2.NB_VENTE = (int) aggregated_row_tAggregateRow_1.count;
	                                	row2.NB_VENTE = (int) aggregated_row_tAggregateRow_1.NB_VENTE_clmCount;
	                                	row2.NB_QTE_VENTE = aggregated_row_tAggregateRow_1.NB_QTE_VENTE_sum;
                                	
    								if(aggregated_row_tAggregateRow_1.NB_MT_ACHAT_sum != null) {
    								row2.NB_MT_ACHAT = aggregated_row_tAggregateRow_1.NB_MT_ACHAT_sum.doubleValue();
										
    								}else{
    								
    									row2.NB_MT_ACHAT = null;
    									
    								}
    								row2.NB_MT_VENTE = aggregated_row_tAggregateRow_1.NB_MT_VENTE_sum;
                                	

 


	tos_count_tAggregateRow_1_AGGIN++;

/**
 * [tAggregateRow_1_AGGIN main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

 



/**
 * [tAggregateRow_1_AGGIN process_data_begin ] stop
 */

	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

InsertVente = null;


// # Output table : 'InsertVente'
InsertVente_tmp.ID_DIM_PRODUIT = row2.ID_DIM_PRODUIT ;
InsertVente_tmp.ID_DIM_CLIENT = row2.ID_DIM_CLIENT ;
InsertVente_tmp.ID_DIM_CALENDRIER = row2.ID_DIM_CALENDRIER ;
InsertVente_tmp.NB_VENTE = row2.NB_VENTE ;
InsertVente_tmp.NB_QTE_VENTE = row2.NB_QTE_VENTE ;
InsertVente_tmp.NB_MT_ACHAT = row2.NB_MT_ACHAT ;
InsertVente_tmp.NB_MT_VENTE = row2.NB_MT_VENTE ;
InsertVente_tmp.DT_INSERTION = TalendDate.getCurrentDate();
InsertVente_tmp.LB_JOB_NAME = jobName;
InsertVente = InsertVente_tmp;
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
// Start of branch "InsertVente"
if(InsertVente != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertVente"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                    pstmt_tDBOutput_1.setInt(1, InsertVente.ID_DIM_PRODUIT);

                    pstmt_tDBOutput_1.setInt(2, InsertVente.ID_DIM_CLIENT);

                    pstmt_tDBOutput_1.setInt(3, InsertVente.ID_DIM_CALENDRIER);

                    pstmt_tDBOutput_1.setInt(4, InsertVente.NB_VENTE);

                    pstmt_tDBOutput_1.setInt(5, InsertVente.NB_QTE_VENTE);

                    pstmt_tDBOutput_1.setDouble(6, InsertVente.NB_MT_ACHAT);

                    pstmt_tDBOutput_1.setDouble(7, InsertVente.NB_MT_VENTE);

                    if(InsertVente.DT_INSERTION != null) {
pstmt_tDBOutput_1.setTimestamp(8, new java.sql.Timestamp(InsertVente.DT_INSERTION.getTime()));
} else {
pstmt_tDBOutput_1.setNull(8, java.sql.Types.TIMESTAMP);
}

                    if(InsertVente.LB_JOB_NAME == null) {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(9, InsertVente.LB_JOB_NAME);
}

			
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

} // End of branch "InsertVente"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */



	
	/**
	 * [tAggregateRow_1_AGGIN process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

 



/**
 * [tAggregateRow_1_AGGIN process_data_end ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

} // G_AggR_600

 

ok_Hash.put("tAggregateRow_1_AGGIN", true);
end_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());




/**
 * [tAggregateRow_1_AGGIN end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertVente");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */












				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tHashInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tHashInput_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
							//free memory for "tAggregateRow_1_AGGIN"
							globalMap.remove("tAggregateRow_1");
						
				try{
					
	
	/**
	 * [tHashInput_1 finally ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 



/**
 * [tHashInput_1 finally ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

 



/**
 * [tAggregateRow_1_AGGOUT finally ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGIN finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

 



/**
 * [tAggregateRow_1_AGGIN finally ] stop
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

	



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */












				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tHashInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class VenteToUpdateStruct implements routines.system.IPersistableRow<VenteToUpdateStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
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
				
			    public boolean BL_LIGNE_IN_DWH;

				public boolean getBL_LIGNE_IN_DWH () {
					return this.BL_LIGNE_IN_DWH;
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
		final VenteToUpdateStruct other = (VenteToUpdateStruct) obj;
		
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

	public void copyDataTo(VenteToUpdateStruct other) {

		other.ID_VENTE = this.ID_VENTE;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.BL_LIGNE_IN_DWH = this.BL_LIGNE_IN_DWH;
	            
	}

	public void copyKeysDataTo(VenteToUpdateStruct other) {

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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
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
		sb.append(",BL_LIGNE_IN_DWH="+String.valueOf(BL_LIGNE_IN_DWH));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(VenteToUpdateStruct other) {

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

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public Double MT_ACHAT;

				public Double getMT_ACHAT () {
					return this.MT_ACHAT;
				}
				
			    public Double MT_VENTE;

				public Double getMT_VENTE () {
					return this.MT_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",ID_VENTE="+ID_VENTE);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",MT_ACHAT="+String.valueOf(MT_ACHAT));
		sb.append(",MT_VENTE="+String.valueOf(MT_VENTE));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",ID_CLIENT="+ID_CLIENT);
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
public void tHashInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tHashInput_2_SUBPROCESS_STATE", 0);

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



		row3Struct row3 = new row3Struct();
VenteToUpdateStruct VenteToUpdate = new VenteToUpdateStruct();





	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"VenteToUpdate");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("ODS_VENTE");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("ODS_VENTE");
}

        int updateKeyCount_tDBOutput_2 = 2;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 3 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
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
	    String update_tDBOutput_2 = "UPDATE \"" + tableName_tDBOutput_2 + "\" SET \"BL_LIGNE_IN_DWH\" = ? WHERE \"ID_VENTE\" = ? AND \"CD_PRODUIT\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
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
VenteToUpdateStruct VenteToUpdate_tmp = new VenteToUpdateStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tHashInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashInput_2", false);
		start_Hash.put("tHashInput_2", System.currentTimeMillis());
		
	
	currentComponent="tHashInput_2";

	
		int tos_count_tHashInput_2 = 0;
		


int nb_line_tHashInput_2 = 0;
	
org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_2=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();
org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<InsertDataStruct> tHashFile_tHashInput_2 = mf_tHashInput_2.getAdvancedMemoryHashFile("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
if(tHashFile_tHashInput_2==null) {
	throw new RuntimeException("The hash is not initialized : The hash must exist before you read from it");
}
java.util.Iterator<InsertDataStruct> iterator_tHashInput_2 = tHashFile_tHashInput_2.iterator();
while (iterator_tHashInput_2.hasNext()) {
    InsertDataStruct next_tHashInput_2 = iterator_tHashInput_2.next();

	row3.ID_DIM_PRODUIT = next_tHashInput_2.ID_DIM_PRODUIT;
	row3.ID_DIM_CLIENT = next_tHashInput_2.ID_DIM_CLIENT;
	row3.ID_DIM_CALENDRIER = next_tHashInput_2.ID_DIM_CALENDRIER;
	row3.ID_VENTE = next_tHashInput_2.ID_VENTE;
	row3.QTE_VENTE = next_tHashInput_2.QTE_VENTE;
	row3.MT_ACHAT = next_tHashInput_2.MT_ACHAT;
	row3.MT_VENTE = next_tHashInput_2.MT_VENTE;
	row3.CD_PRODUIT = next_tHashInput_2.CD_PRODUIT;
	row3.ID_CLIENT = next_tHashInput_2.ID_CLIENT;

 



/**
 * [tHashInput_2 begin ] stop
 */
	
	/**
	 * [tHashInput_2 main ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 


	tos_count_tHashInput_2++;

/**
 * [tHashInput_2 main ] stop
 */
	
	/**
	 * [tHashInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 



/**
 * [tHashInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
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

VenteToUpdate = null;


// # Output table : 'VenteToUpdate'
VenteToUpdate_tmp.ID_VENTE = row3.ID_VENTE ;
VenteToUpdate_tmp.CD_PRODUIT = row3.CD_PRODUIT ;
VenteToUpdate_tmp.BL_LIGNE_IN_DWH = true;
VenteToUpdate = VenteToUpdate_tmp;
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
// Start of branch "VenteToUpdate"
if(VenteToUpdate != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"VenteToUpdate"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                    pstmt_tDBOutput_2.setBoolean(1, VenteToUpdate.BL_LIGNE_IN_DWH);

                    if(VenteToUpdate.ID_VENTE == null) {
pstmt_tDBOutput_2.setNull(2 + count_tDBOutput_2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2 + count_tDBOutput_2, VenteToUpdate.ID_VENTE);
}


                    if(VenteToUpdate.CD_PRODUIT == null) {
pstmt_tDBOutput_2.setNull(3 + count_tDBOutput_2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(3 + count_tDBOutput_2, VenteToUpdate.CD_PRODUIT);
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
				    	
				    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
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
						
				    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
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

} // End of branch "VenteToUpdate"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */



	
	/**
	 * [tHashInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 



/**
 * [tHashInput_2 process_data_end ] stop
 */
	
	/**
	 * [tHashInput_2 end ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	
    

		
			nb_line_tHashInput_2++;
		}	
    	
		org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.remove("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
	


	globalMap.put("tHashInput_2_NB_LINE", nb_line_tHashInput_2);       

 

ok_Hash.put("tHashInput_2", true);
end_Hash.put("tHashInput_2", System.currentTimeMillis());




/**
 * [tHashInput_2 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
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
		    	
		    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
		    	
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
			
	    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
	    	
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"VenteToUpdate");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
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
	 * [tHashInput_2 finally ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 



/**
 * [tHashInput_2 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
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






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tHashInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class ProduitStruct implements routines.system.IPersistableComparableLookupRow<ProduitStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
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
				
			    public String LB_SOUS_CATEGORIE;

				public String getLB_SOUS_CATEGORIE () {
					return this.LB_SOUS_CATEGORIE;
				}
				
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}
				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public java.util.Date DT_MISE_A_JOUR;

				public java.util.Date getDT_MISE_A_JOUR () {
					return this.DT_MISE_A_JOUR;
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
		final ProduitStruct other = (ProduitStruct) obj;
		
						if (this.CD_PRODUIT == null) {
							if (other.CD_PRODUIT != null)
								return false;
						
						} else if (!this.CD_PRODUIT.equals(other.CD_PRODUIT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(ProduitStruct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.NOM_PRODUIT = this.NOM_PRODUIT;
	            other.PRIX_ACHAT_PRODUIT = this.PRIX_ACHAT_PRODUIT;
	            other.PRIX_VENTE_PRODUIT = this.PRIX_VENTE_PRODUIT;
	            other.CD_SOUS_CATEGORIE = this.CD_SOUS_CATEGORIE;
	            other.LB_SOUS_CATEGORIE = this.LB_SOUS_CATEGORIE;
	            other.CD_CATEGORIE = this.CD_CATEGORIE;
	            other.LB_CATEGORIE = this.LB_CATEGORIE;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.DT_MISE_A_JOUR = this.DT_MISE_A_JOUR;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(ProduitStruct other) {

		other.CD_PRODUIT = this.CD_PRODUIT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.CD_PRODUIT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

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
		
			            this.ID_DIM_PRODUIT = dis.readInt();
					
						this.NOM_PRODUIT = readString(dis,ois);
					
       			    	this.PRIX_ACHAT_PRODUIT = (BigDecimal) ois.readObject();
					
       			    	this.PRIX_VENTE_PRODUIT = (BigDecimal) ois.readObject();
					
						this.CD_SOUS_CATEGORIE = readString(dis,ois);
					
						this.LB_SOUS_CATEGORIE = readString(dis,ois);
					
						this.CD_CATEGORIE = readString(dis,ois);
					
						this.LB_CATEGORIE = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.DT_MISE_A_JOUR = readDate(dis,ois);
					
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
		
			            this.ID_DIM_PRODUIT = objectIn.readInt();
					
						this.NOM_PRODUIT = readString(dis,objectIn);
					
       			    	this.PRIX_ACHAT_PRODUIT = (BigDecimal) objectIn.readObject();
					
       			    	this.PRIX_VENTE_PRODUIT = (BigDecimal) objectIn.readObject();
					
						this.CD_SOUS_CATEGORIE = readString(dis,objectIn);
					
						this.LB_SOUS_CATEGORIE = readString(dis,objectIn);
					
						this.CD_CATEGORIE = readString(dis,objectIn);
					
						this.LB_CATEGORIE = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.DT_MISE_A_JOUR = readDate(dis,objectIn);
					
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

		
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
						writeString(this.NOM_PRODUIT, dos, oos);
					
       			    	oos.writeObject(this.PRIX_ACHAT_PRODUIT);
					
       			    	oos.writeObject(this.PRIX_VENTE_PRODUIT);
					
						writeString(this.CD_SOUS_CATEGORIE, dos, oos);
					
						writeString(this.LB_SOUS_CATEGORIE, dos, oos);
					
						writeString(this.CD_CATEGORIE, dos, oos);
					
						writeString(this.LB_CATEGORIE, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeDate(this.DT_MISE_A_JOUR, dos, oos);
					
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.ID_DIM_PRODUIT);
					
						writeString(this.NOM_PRODUIT, dos, objectOut);
					
       			    	objectOut.writeObject(this.PRIX_ACHAT_PRODUIT);
					
       			    	objectOut.writeObject(this.PRIX_VENTE_PRODUIT);
					
						writeString(this.CD_SOUS_CATEGORIE, dos, objectOut);
					
						writeString(this.LB_SOUS_CATEGORIE, dos, objectOut);
					
						writeString(this.CD_CATEGORIE, dos, objectOut);
					
						writeString(this.LB_CATEGORIE, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeDate(this.DT_MISE_A_JOUR, dos, objectOut);
					
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
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",NOM_PRODUIT="+NOM_PRODUIT);
		sb.append(",PRIX_ACHAT_PRODUIT="+String.valueOf(PRIX_ACHAT_PRODUIT));
		sb.append(",PRIX_VENTE_PRODUIT="+String.valueOf(PRIX_VENTE_PRODUIT));
		sb.append(",CD_SOUS_CATEGORIE="+CD_SOUS_CATEGORIE);
		sb.append(",LB_SOUS_CATEGORIE="+LB_SOUS_CATEGORIE);
		sb.append(",CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",DT_MISE_A_JOUR="+String.valueOf(DT_MISE_A_JOUR));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(ProduitStruct other) {

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
public void tDBInput_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_7_SUBPROCESS_STATE", 0);

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



		ProduitStruct Produit = new ProduitStruct();




	
	/**
	 * [tAdvancedHash_Produit begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Produit", false);
		start_Hash.put("tAdvancedHash_Produit", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Produit";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Produit");
					}
				
		int tos_count_tAdvancedHash_Produit = 0;
		

			   		// connection name:Produit
			   		// source node:tDBInput_7 - inputs:(after_tDBInput_1) outputs:(Produit,Produit) | target node:tAdvancedHash_Produit - inputs:(Produit) outputs:()
			   		// linked node: tMap_1 - inputs:(Vente,Produit,Client,Calendrier) outputs:(InsertData)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Produit = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ProduitStruct> tHash_Lookup_Produit =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<ProduitStruct>getLookup(matchingModeEnum_Produit);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Produit", tHash_Lookup_Produit);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Produit begin ] stop
 */



	
	/**
	 * [tDBInput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_7", false);
		start_Hash.put("tDBInput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_7";

	
		int tos_count_tDBInput_7 = 0;
		
	
    
	
		    int nb_line_tDBInput_7 = 0;
		    java.sql.Connection conn_tDBInput_7 = null;
				conn_tDBInput_7 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"ID_DIM_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"CD_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"NOM_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"PRIX_ACHAT_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"PRIX_VENTE_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"CD_SOUS_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"LB_SOUS_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"CD_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"LB_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"DT_INSERTION\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"DT_MISE_A_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"LB_JOB_NAME\"\nFROM \""+context.schema_dwh+"\".\"DIM_PRODUIT\"\nWHERE \"BL_LIGNE_ACTIVE\"=1;\n";
		    

            	globalMap.put("tDBInput_7_QUERY",dbquery_tDBInput_7);
		    java.sql.ResultSet rs_tDBInput_7 = null;

		    try {
		    	rs_tDBInput_7 = stmt_tDBInput_7.executeQuery(dbquery_tDBInput_7);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_7 = rs_tDBInput_7.getMetaData();
		    	int colQtyInRs_tDBInput_7 = rsmd_tDBInput_7.getColumnCount();

		    String tmpContent_tDBInput_7 = null;
		    
		    
		    while (rs_tDBInput_7.next()) {
		        nb_line_tDBInput_7++;
		        
							if(colQtyInRs_tDBInput_7 < 1) {
								Produit.ID_DIM_PRODUIT = 0;
							} else {
		                          
            Produit.ID_DIM_PRODUIT = rs_tDBInput_7.getInt(1);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								Produit.CD_PRODUIT = null;
							} else {
	                         		
        	Produit.CD_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_7, 2, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 3) {
								Produit.NOM_PRODUIT = null;
							} else {
	                         		
        	Produit.NOM_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_7, 3, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 4) {
								Produit.PRIX_ACHAT_PRODUIT = null;
							} else {
		                          
            Produit.PRIX_ACHAT_PRODUIT = rs_tDBInput_7.getBigDecimal(4);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 5) {
								Produit.PRIX_VENTE_PRODUIT = null;
							} else {
		                          
            Produit.PRIX_VENTE_PRODUIT = rs_tDBInput_7.getBigDecimal(5);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 6) {
								Produit.CD_SOUS_CATEGORIE = null;
							} else {
	                         		
        	Produit.CD_SOUS_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_7, 6, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 7) {
								Produit.LB_SOUS_CATEGORIE = null;
							} else {
	                         		
        	Produit.LB_SOUS_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_7, 7, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 8) {
								Produit.CD_CATEGORIE = null;
							} else {
	                         		
        	Produit.CD_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_7, 8, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 9) {
								Produit.LB_CATEGORIE = null;
							} else {
	                         		
        	Produit.LB_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_7, 9, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 10) {
								Produit.DT_INSERTION = null;
							} else {
										
			Produit.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_7, 10);
		                    }
							if(colQtyInRs_tDBInput_7 < 11) {
								Produit.DT_MISE_A_JOUR = null;
							} else {
										
			Produit.DT_MISE_A_JOUR = routines.system.JDBCUtil.getDate(rs_tDBInput_7, 11);
		                    }
							if(colQtyInRs_tDBInput_7 < 12) {
								Produit.BL_LIGNE_ACTIVE = 0;
							} else {
		                          
            Produit.BL_LIGNE_ACTIVE = rs_tDBInput_7.getInt(12);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 13) {
								Produit.LB_JOB_NAME = null;
							} else {
	                         		
        	Produit.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_7, 13, false);
		                    }
					


 



/**
 * [tDBInput_7 begin ] stop
 */
	
	/**
	 * [tDBInput_7 main ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 


	tos_count_tDBInput_7++;

/**
 * [tDBInput_7 main ] stop
 */
	
	/**
	 * [tDBInput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_Produit main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Produit";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Produit"
						
						);
					}
					


			   
			   

					ProduitStruct Produit_HashRow = new ProduitStruct();
		   	   	   
				
				Produit_HashRow.ID_DIM_PRODUIT = Produit.ID_DIM_PRODUIT;
				
				Produit_HashRow.CD_PRODUIT = Produit.CD_PRODUIT;
				
				Produit_HashRow.NOM_PRODUIT = Produit.NOM_PRODUIT;
				
				Produit_HashRow.PRIX_ACHAT_PRODUIT = Produit.PRIX_ACHAT_PRODUIT;
				
				Produit_HashRow.PRIX_VENTE_PRODUIT = Produit.PRIX_VENTE_PRODUIT;
				
				Produit_HashRow.CD_SOUS_CATEGORIE = Produit.CD_SOUS_CATEGORIE;
				
				Produit_HashRow.LB_SOUS_CATEGORIE = Produit.LB_SOUS_CATEGORIE;
				
				Produit_HashRow.CD_CATEGORIE = Produit.CD_CATEGORIE;
				
				Produit_HashRow.LB_CATEGORIE = Produit.LB_CATEGORIE;
				
				Produit_HashRow.DT_INSERTION = Produit.DT_INSERTION;
				
				Produit_HashRow.DT_MISE_A_JOUR = Produit.DT_MISE_A_JOUR;
				
				Produit_HashRow.BL_LIGNE_ACTIVE = Produit.BL_LIGNE_ACTIVE;
				
				Produit_HashRow.LB_JOB_NAME = Produit.LB_JOB_NAME;
				
			tHash_Lookup_Produit.put(Produit_HashRow);
			
            




 


	tos_count_tAdvancedHash_Produit++;

/**
 * [tAdvancedHash_Produit main ] stop
 */
	
	/**
	 * [tAdvancedHash_Produit process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Produit";

	

 



/**
 * [tAdvancedHash_Produit process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Produit process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Produit";

	

 



/**
 * [tAdvancedHash_Produit process_data_end ] stop
 */



	
	/**
	 * [tDBInput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_7 end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

	}
}finally{
	if (rs_tDBInput_7 != null) {
		rs_tDBInput_7.close();
	}
	if (stmt_tDBInput_7 != null) {
		stmt_tDBInput_7.close();
	}
}
globalMap.put("tDBInput_7_NB_LINE",nb_line_tDBInput_7);
 

ok_Hash.put("tDBInput_7", true);
end_Hash.put("tDBInput_7", System.currentTimeMillis());




/**
 * [tDBInput_7 end ] stop
 */

	
	/**
	 * [tAdvancedHash_Produit end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Produit";

	

tHash_Lookup_Produit.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Produit");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_Produit", true);
end_Hash.put("tAdvancedHash_Produit", System.currentTimeMillis());




/**
 * [tAdvancedHash_Produit end ] stop
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
	 * [tDBInput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_Produit finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Produit";

	

 



/**
 * [tAdvancedHash_Produit finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_7_SUBPROCESS_STATE", 1);
	}
	


public static class ClientStruct implements routines.system.IPersistableComparableLookupRow<ClientStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
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
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public java.util.Date DT_MISE_A_JOUR;

				public java.util.Date getDT_MISE_A_JOUR () {
					return this.DT_MISE_A_JOUR;
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
		final ClientStruct other = (ClientStruct) obj;
		
						if (this.ID_CLIENT == null) {
							if (other.ID_CLIENT != null)
								return false;
						
						} else if (!this.ID_CLIENT.equals(other.ID_CLIENT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(ClientStruct other) {

		other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            other.ID_CLIENT = this.ID_CLIENT;
	            other.NOM_CLIENT = this.NOM_CLIENT;
	            other.PREN_CLIENT = this.PREN_CLIENT;
	            other.CD_POSTAL_CLIENT = this.CD_POSTAL_CLIENT;
	            other.VILLE_CLIENT = this.VILLE_CLIENT;
	            other.PAYS_CLIENT = this.PAYS_CLIENT;
	            other.REGION_CLIENT = this.REGION_CLIENT;
	            other.CD_TYPE_CLIENT = this.CD_TYPE_CLIENT;
	            other.LB_TYPE_CLIENT = this.LB_TYPE_CLIENT;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.DT_MISE_A_JOUR = this.DT_MISE_A_JOUR;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(ClientStruct other) {

		other.ID_CLIENT = this.ID_CLIENT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

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
		
			            this.ID_DIM_CLIENT = dis.readInt();
					
						this.NOM_CLIENT = readString(dis,ois);
					
						this.PREN_CLIENT = readString(dis,ois);
					
						this.CD_POSTAL_CLIENT = readString(dis,ois);
					
						this.VILLE_CLIENT = readString(dis,ois);
					
						this.PAYS_CLIENT = readString(dis,ois);
					
						this.REGION_CLIENT = readString(dis,ois);
					
						this.CD_TYPE_CLIENT = readString(dis,ois);
					
						this.LB_TYPE_CLIENT = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.DT_MISE_A_JOUR = readDate(dis,ois);
					
			            this.BL_LIGNE_ACTIVE = dis.readInt();
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.ID_DIM_CLIENT = objectIn.readInt();
					
						this.NOM_CLIENT = readString(dis,objectIn);
					
						this.PREN_CLIENT = readString(dis,objectIn);
					
						this.CD_POSTAL_CLIENT = readString(dis,objectIn);
					
						this.VILLE_CLIENT = readString(dis,objectIn);
					
						this.PAYS_CLIENT = readString(dis,objectIn);
					
						this.REGION_CLIENT = readString(dis,objectIn);
					
						this.CD_TYPE_CLIENT = readString(dis,objectIn);
					
						this.LB_TYPE_CLIENT = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.DT_MISE_A_JOUR = readDate(dis,objectIn);
					
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

		
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
						writeString(this.NOM_CLIENT, dos, oos);
					
						writeString(this.PREN_CLIENT, dos, oos);
					
						writeString(this.CD_POSTAL_CLIENT, dos, oos);
					
						writeString(this.VILLE_CLIENT, dos, oos);
					
						writeString(this.PAYS_CLIENT, dos, oos);
					
						writeString(this.REGION_CLIENT, dos, oos);
					
						writeString(this.CD_TYPE_CLIENT, dos, oos);
					
						writeString(this.LB_TYPE_CLIENT, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeDate(this.DT_MISE_A_JOUR, dos, oos);
					
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.ID_DIM_CLIENT);
					
						writeString(this.NOM_CLIENT, dos, objectOut);
					
						writeString(this.PREN_CLIENT, dos, objectOut);
					
						writeString(this.CD_POSTAL_CLIENT, dos, objectOut);
					
						writeString(this.VILLE_CLIENT, dos, objectOut);
					
						writeString(this.PAYS_CLIENT, dos, objectOut);
					
						writeString(this.REGION_CLIENT, dos, objectOut);
					
						writeString(this.CD_TYPE_CLIENT, dos, objectOut);
					
						writeString(this.LB_TYPE_CLIENT, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeDate(this.DT_MISE_A_JOUR, dos, objectOut);
					
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
		sb.append("ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",NOM_CLIENT="+NOM_CLIENT);
		sb.append(",PREN_CLIENT="+PREN_CLIENT);
		sb.append(",CD_POSTAL_CLIENT="+CD_POSTAL_CLIENT);
		sb.append(",VILLE_CLIENT="+VILLE_CLIENT);
		sb.append(",PAYS_CLIENT="+PAYS_CLIENT);
		sb.append(",REGION_CLIENT="+REGION_CLIENT);
		sb.append(",CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",DT_MISE_A_JOUR="+String.valueOf(DT_MISE_A_JOUR));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(ClientStruct other) {

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
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

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



		ClientStruct Client = new ClientStruct();




	
	/**
	 * [tAdvancedHash_Client begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Client", false);
		start_Hash.put("tAdvancedHash_Client", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Client";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Client");
					}
				
		int tos_count_tAdvancedHash_Client = 0;
		

			   		// connection name:Client
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(Client,Client) | target node:tAdvancedHash_Client - inputs:(Client) outputs:()
			   		// linked node: tMap_1 - inputs:(Vente,Produit,Client,Calendrier) outputs:(InsertData)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Client = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<ClientStruct> tHash_Lookup_Client =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<ClientStruct>getLookup(matchingModeEnum_Client);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Client", tHash_Lookup_Client);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Client begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";

	
		int tos_count_tDBInput_4 = 0;
		
	
    
	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				conn_tDBInput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"ID_DIM_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"ID_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"NOM_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"PREN_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"CD_POSTAL_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"VILLE_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"PAYS_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"REGION_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"CD_TYPE_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"LB_TYPE_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"DT_INSERTION\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"DT_MISE_A_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"LB_JOB_NAME\"\nFROM \""+context.schema_dwh+"\".\"DIM_CLIENT\"\nWHERE \"BL_LIGNE_ACTIVE\"=1;\n";
		    

            	globalMap.put("tDBInput_4_QUERY",dbquery_tDBInput_4);
		    java.sql.ResultSet rs_tDBInput_4 = null;

		    try {
		    	rs_tDBInput_4 = stmt_tDBInput_4.executeQuery(dbquery_tDBInput_4);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_4 = rs_tDBInput_4.getMetaData();
		    	int colQtyInRs_tDBInput_4 = rsmd_tDBInput_4.getColumnCount();

		    String tmpContent_tDBInput_4 = null;
		    
		    
		    while (rs_tDBInput_4.next()) {
		        nb_line_tDBInput_4++;
		        
							if(colQtyInRs_tDBInput_4 < 1) {
								Client.ID_DIM_CLIENT = 0;
							} else {
		                          
            Client.ID_DIM_CLIENT = rs_tDBInput_4.getInt(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								Client.ID_CLIENT = null;
							} else {
	                         		
        	Client.ID_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 2, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								Client.NOM_CLIENT = null;
							} else {
	                         		
        	Client.NOM_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 3, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								Client.PREN_CLIENT = null;
							} else {
	                         		
        	Client.PREN_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 4, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								Client.CD_POSTAL_CLIENT = null;
							} else {
	                         		
        	Client.CD_POSTAL_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 5, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								Client.VILLE_CLIENT = null;
							} else {
	                         		
        	Client.VILLE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 6, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 7) {
								Client.PAYS_CLIENT = null;
							} else {
	                         		
        	Client.PAYS_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 7, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 8) {
								Client.REGION_CLIENT = null;
							} else {
	                         		
        	Client.REGION_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 8, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 9) {
								Client.CD_TYPE_CLIENT = null;
							} else {
	                         		
        	Client.CD_TYPE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 9, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 10) {
								Client.LB_TYPE_CLIENT = null;
							} else {
	                         		
        	Client.LB_TYPE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 10, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 11) {
								Client.DT_INSERTION = null;
							} else {
										
			Client.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 11);
		                    }
							if(colQtyInRs_tDBInput_4 < 12) {
								Client.DT_MISE_A_JOUR = null;
							} else {
										
			Client.DT_MISE_A_JOUR = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 12);
		                    }
							if(colQtyInRs_tDBInput_4 < 13) {
								Client.BL_LIGNE_ACTIVE = 0;
							} else {
		                          
            Client.BL_LIGNE_ACTIVE = rs_tDBInput_4.getInt(13);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 14) {
								Client.LB_JOB_NAME = null;
							} else {
	                         		
        	Client.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_4, 14, false);
		                    }
					


 



/**
 * [tDBInput_4 begin ] stop
 */
	
	/**
	 * [tDBInput_4 main ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_Client main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Client";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Client"
						
						);
					}
					


			   
			   

					ClientStruct Client_HashRow = new ClientStruct();
		   	   	   
				
				Client_HashRow.ID_DIM_CLIENT = Client.ID_DIM_CLIENT;
				
				Client_HashRow.ID_CLIENT = Client.ID_CLIENT;
				
				Client_HashRow.NOM_CLIENT = Client.NOM_CLIENT;
				
				Client_HashRow.PREN_CLIENT = Client.PREN_CLIENT;
				
				Client_HashRow.CD_POSTAL_CLIENT = Client.CD_POSTAL_CLIENT;
				
				Client_HashRow.VILLE_CLIENT = Client.VILLE_CLIENT;
				
				Client_HashRow.PAYS_CLIENT = Client.PAYS_CLIENT;
				
				Client_HashRow.REGION_CLIENT = Client.REGION_CLIENT;
				
				Client_HashRow.CD_TYPE_CLIENT = Client.CD_TYPE_CLIENT;
				
				Client_HashRow.LB_TYPE_CLIENT = Client.LB_TYPE_CLIENT;
				
				Client_HashRow.DT_INSERTION = Client.DT_INSERTION;
				
				Client_HashRow.DT_MISE_A_JOUR = Client.DT_MISE_A_JOUR;
				
				Client_HashRow.BL_LIGNE_ACTIVE = Client.BL_LIGNE_ACTIVE;
				
				Client_HashRow.LB_JOB_NAME = Client.LB_JOB_NAME;
				
			tHash_Lookup_Client.put(Client_HashRow);
			
            




 


	tos_count_tAdvancedHash_Client++;

/**
 * [tAdvancedHash_Client main ] stop
 */
	
	/**
	 * [tAdvancedHash_Client process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Client";

	

 



/**
 * [tAdvancedHash_Client process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Client process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Client";

	

 



/**
 * [tAdvancedHash_Client process_data_end ] stop
 */



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

	}
}finally{
	if (rs_tDBInput_4 != null) {
		rs_tDBInput_4.close();
	}
	if (stmt_tDBInput_4 != null) {
		stmt_tDBInput_4.close();
	}
}
globalMap.put("tDBInput_4_NB_LINE",nb_line_tDBInput_4);
 

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
 */

	
	/**
	 * [tAdvancedHash_Client end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Client";

	

tHash_Lookup_Client.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Client");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_Client", true);
end_Hash.put("tAdvancedHash_Client", System.currentTimeMillis());




/**
 * [tAdvancedHash_Client end ] stop
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
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_Client finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Client";

	

 



/**
 * [tAdvancedHash_Client finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class CalendrierStruct implements routines.system.IPersistableComparableLookupRow<CalendrierStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public int NB_ANNEE;

				public int getNB_ANNEE () {
					return this.NB_ANNEE;
				}
				
			    public int NB_SEMESTRE;

				public int getNB_SEMESTRE () {
					return this.NB_SEMESTRE;
				}
				
			    public int NB_TRIMESTRE;

				public int getNB_TRIMESTRE () {
					return this.NB_TRIMESTRE;
				}
				
			    public int NB_MOIS;

				public int getNB_MOIS () {
					return this.NB_MOIS;
				}
				
			    public int NB_JOUR_ANNEE;

				public int getNB_JOUR_ANNEE () {
					return this.NB_JOUR_ANNEE;
				}
				
			    public int NB_JOUR_MOIS;

				public int getNB_JOUR_MOIS () {
					return this.NB_JOUR_MOIS;
				}
				
			    public int NB_JOUR_SEMAINE;

				public int getNB_JOUR_SEMAINE () {
					return this.NB_JOUR_SEMAINE;
				}
				
			    public int NB_SEMAINE_ANNEE;

				public int getNB_SEMAINE_ANNEE () {
					return this.NB_SEMAINE_ANNEE;
				}
				
			    public String LB_MOIS;

				public String getLB_MOIS () {
					return this.LB_MOIS;
				}
				
			    public String LB_JOUR;

				public String getLB_JOUR () {
					return this.LB_JOUR;
				}
				
			    public int BL_DERNIER_JOUR_MOIS;

				public int getBL_DERNIER_JOUR_MOIS () {
					return this.BL_DERNIER_JOUR_MOIS;
				}
				
			    public int BL_BISSEXTILE;

				public int getBL_BISSEXTILE () {
					return this.BL_BISSEXTILE;
				}
				
			    public int BL_WEEK_END;

				public int getBL_WEEK_END () {
					return this.BL_WEEK_END;
				}
				
			    public int BL_JOUR_FERIE;

				public int getBL_JOUR_FERIE () {
					return this.BL_JOUR_FERIE;
				}
				
			    public String LB_JOUR_FERIE;

				public String getLB_JOUR_FERIE () {
					return this.LB_JOUR_FERIE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.DT_JOUR == null) ? 0 : this.DT_JOUR.hashCode());
					
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
		final CalendrierStruct other = (CalendrierStruct) obj;
		
						if (this.DT_JOUR == null) {
							if (other.DT_JOUR != null)
								return false;
						
						} else if (!this.DT_JOUR.equals(other.DT_JOUR))
						
							return false;
					

		return true;
    }

	public void copyDataTo(CalendrierStruct other) {

		other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
	            other.DT_JOUR = this.DT_JOUR;
	            other.NB_ANNEE = this.NB_ANNEE;
	            other.NB_SEMESTRE = this.NB_SEMESTRE;
	            other.NB_TRIMESTRE = this.NB_TRIMESTRE;
	            other.NB_MOIS = this.NB_MOIS;
	            other.NB_JOUR_ANNEE = this.NB_JOUR_ANNEE;
	            other.NB_JOUR_MOIS = this.NB_JOUR_MOIS;
	            other.NB_JOUR_SEMAINE = this.NB_JOUR_SEMAINE;
	            other.NB_SEMAINE_ANNEE = this.NB_SEMAINE_ANNEE;
	            other.LB_MOIS = this.LB_MOIS;
	            other.LB_JOUR = this.LB_JOUR;
	            other.BL_DERNIER_JOUR_MOIS = this.BL_DERNIER_JOUR_MOIS;
	            other.BL_BISSEXTILE = this.BL_BISSEXTILE;
	            other.BL_WEEK_END = this.BL_WEEK_END;
	            other.BL_JOUR_FERIE = this.BL_JOUR_FERIE;
	            other.LB_JOUR_FERIE = this.LB_JOUR_FERIE;
	            
	}

	public void copyKeysDataTo(CalendrierStruct other) {

		other.DT_JOUR = this.DT_JOUR;
	            	
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
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
		
			            this.ID_DIM_CALENDRIER = dis.readInt();
					
			            this.NB_ANNEE = dis.readInt();
					
			            this.NB_SEMESTRE = dis.readInt();
					
			            this.NB_TRIMESTRE = dis.readInt();
					
			            this.NB_MOIS = dis.readInt();
					
			            this.NB_JOUR_ANNEE = dis.readInt();
					
			            this.NB_JOUR_MOIS = dis.readInt();
					
			            this.NB_JOUR_SEMAINE = dis.readInt();
					
			            this.NB_SEMAINE_ANNEE = dis.readInt();
					
						this.LB_MOIS = readString(dis,ois);
					
						this.LB_JOUR = readString(dis,ois);
					
			            this.BL_DERNIER_JOUR_MOIS = dis.readInt();
					
			            this.BL_BISSEXTILE = dis.readInt();
					
			            this.BL_WEEK_END = dis.readInt();
					
			            this.BL_JOUR_FERIE = dis.readInt();
					
						this.LB_JOUR_FERIE = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.ID_DIM_CALENDRIER = objectIn.readInt();
					
			            this.NB_ANNEE = objectIn.readInt();
					
			            this.NB_SEMESTRE = objectIn.readInt();
					
			            this.NB_TRIMESTRE = objectIn.readInt();
					
			            this.NB_MOIS = objectIn.readInt();
					
			            this.NB_JOUR_ANNEE = objectIn.readInt();
					
			            this.NB_JOUR_MOIS = objectIn.readInt();
					
			            this.NB_JOUR_SEMAINE = objectIn.readInt();
					
			            this.NB_SEMAINE_ANNEE = objectIn.readInt();
					
						this.LB_MOIS = readString(dis,objectIn);
					
						this.LB_JOUR = readString(dis,objectIn);
					
			            this.BL_DERNIER_JOUR_MOIS = objectIn.readInt();
					
			            this.BL_BISSEXTILE = objectIn.readInt();
					
			            this.BL_WEEK_END = objectIn.readInt();
					
			            this.BL_JOUR_FERIE = objectIn.readInt();
					
						this.LB_JOUR_FERIE = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
		            	dos.writeInt(this.NB_ANNEE);
					
		            	dos.writeInt(this.NB_SEMESTRE);
					
		            	dos.writeInt(this.NB_TRIMESTRE);
					
		            	dos.writeInt(this.NB_MOIS);
					
		            	dos.writeInt(this.NB_JOUR_ANNEE);
					
		            	dos.writeInt(this.NB_JOUR_MOIS);
					
		            	dos.writeInt(this.NB_JOUR_SEMAINE);
					
		            	dos.writeInt(this.NB_SEMAINE_ANNEE);
					
						writeString(this.LB_MOIS, dos, oos);
					
						writeString(this.LB_JOUR, dos, oos);
					
		            	dos.writeInt(this.BL_DERNIER_JOUR_MOIS);
					
		            	dos.writeInt(this.BL_BISSEXTILE);
					
		            	dos.writeInt(this.BL_WEEK_END);
					
		            	dos.writeInt(this.BL_JOUR_FERIE);
					
						writeString(this.LB_JOUR_FERIE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.ID_DIM_CALENDRIER);
					
					objectOut.writeInt(this.NB_ANNEE);
					
					objectOut.writeInt(this.NB_SEMESTRE);
					
					objectOut.writeInt(this.NB_TRIMESTRE);
					
					objectOut.writeInt(this.NB_MOIS);
					
					objectOut.writeInt(this.NB_JOUR_ANNEE);
					
					objectOut.writeInt(this.NB_JOUR_MOIS);
					
					objectOut.writeInt(this.NB_JOUR_SEMAINE);
					
					objectOut.writeInt(this.NB_SEMAINE_ANNEE);
					
						writeString(this.LB_MOIS, dos, objectOut);
					
						writeString(this.LB_JOUR, dos, objectOut);
					
					objectOut.writeInt(this.BL_DERNIER_JOUR_MOIS);
					
					objectOut.writeInt(this.BL_BISSEXTILE);
					
					objectOut.writeInt(this.BL_WEEK_END);
					
					objectOut.writeInt(this.BL_JOUR_FERIE);
					
						writeString(this.LB_JOUR_FERIE, dos, objectOut);
					
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
		sb.append("ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",NB_ANNEE="+String.valueOf(NB_ANNEE));
		sb.append(",NB_SEMESTRE="+String.valueOf(NB_SEMESTRE));
		sb.append(",NB_TRIMESTRE="+String.valueOf(NB_TRIMESTRE));
		sb.append(",NB_MOIS="+String.valueOf(NB_MOIS));
		sb.append(",NB_JOUR_ANNEE="+String.valueOf(NB_JOUR_ANNEE));
		sb.append(",NB_JOUR_MOIS="+String.valueOf(NB_JOUR_MOIS));
		sb.append(",NB_JOUR_SEMAINE="+String.valueOf(NB_JOUR_SEMAINE));
		sb.append(",NB_SEMAINE_ANNEE="+String.valueOf(NB_SEMAINE_ANNEE));
		sb.append(",LB_MOIS="+LB_MOIS);
		sb.append(",LB_JOUR="+LB_JOUR);
		sb.append(",BL_DERNIER_JOUR_MOIS="+String.valueOf(BL_DERNIER_JOUR_MOIS));
		sb.append(",BL_BISSEXTILE="+String.valueOf(BL_BISSEXTILE));
		sb.append(",BL_WEEK_END="+String.valueOf(BL_WEEK_END));
		sb.append(",BL_JOUR_FERIE="+String.valueOf(BL_JOUR_FERIE));
		sb.append(",LB_JOUR_FERIE="+LB_JOUR_FERIE);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(CalendrierStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.DT_JOUR, other.DT_JOUR);
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



		CalendrierStruct Calendrier = new CalendrierStruct();




	
	/**
	 * [tAdvancedHash_Calendrier begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Calendrier", false);
		start_Hash.put("tAdvancedHash_Calendrier", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Calendrier";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Calendrier");
					}
				
		int tos_count_tAdvancedHash_Calendrier = 0;
		

			   		// connection name:Calendrier
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(Calendrier,Calendrier) | target node:tAdvancedHash_Calendrier - inputs:(Calendrier) outputs:()
			   		// linked node: tMap_1 - inputs:(Vente,Produit,Client,Calendrier) outputs:(InsertData)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Calendrier = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<CalendrierStruct> tHash_Lookup_Calendrier =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<CalendrierStruct>getLookup(matchingModeEnum_Calendrier);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Calendrier", tHash_Lookup_Calendrier);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Calendrier begin ] stop
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
				conn_tDBInput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"ID_DIM_CALENDRIER\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"DT_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_ANNEE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_SEMESTRE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_TRIMESTRE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_JOUR_ANNEE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_JOUR_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_JOUR_SEMAINE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_SEMAINE_ANNEE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"LB_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"LB_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_DERNIER_JOUR_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_BISSEXTILE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_WEEK_END\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_JOUR_FERIE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"LB_JOUR_FERIE\"\nFROM \""+context.schema_dwh+"\".\"DIM_CALENDRIER\"\n";
		    

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
								Calendrier.ID_DIM_CALENDRIER = 0;
							} else {
		                          
            Calendrier.ID_DIM_CALENDRIER = rs_tDBInput_2.getInt(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								Calendrier.DT_JOUR = null;
							} else {
										
			Calendrier.DT_JOUR = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 2);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								Calendrier.NB_ANNEE = 0;
							} else {
		                          
            Calendrier.NB_ANNEE = rs_tDBInput_2.getInt(3);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								Calendrier.NB_SEMESTRE = 0;
							} else {
		                          
            Calendrier.NB_SEMESTRE = rs_tDBInput_2.getInt(4);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								Calendrier.NB_TRIMESTRE = 0;
							} else {
		                          
            Calendrier.NB_TRIMESTRE = rs_tDBInput_2.getInt(5);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								Calendrier.NB_MOIS = 0;
							} else {
		                          
            Calendrier.NB_MOIS = rs_tDBInput_2.getInt(6);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								Calendrier.NB_JOUR_ANNEE = 0;
							} else {
		                          
            Calendrier.NB_JOUR_ANNEE = rs_tDBInput_2.getInt(7);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								Calendrier.NB_JOUR_MOIS = 0;
							} else {
		                          
            Calendrier.NB_JOUR_MOIS = rs_tDBInput_2.getInt(8);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								Calendrier.NB_JOUR_SEMAINE = 0;
							} else {
		                          
            Calendrier.NB_JOUR_SEMAINE = rs_tDBInput_2.getInt(9);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								Calendrier.NB_SEMAINE_ANNEE = 0;
							} else {
		                          
            Calendrier.NB_SEMAINE_ANNEE = rs_tDBInput_2.getInt(10);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								Calendrier.LB_MOIS = null;
							} else {
	                         		
        	Calendrier.LB_MOIS = routines.system.JDBCUtil.getString(rs_tDBInput_2, 11, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 12) {
								Calendrier.LB_JOUR = null;
							} else {
	                         		
        	Calendrier.LB_JOUR = routines.system.JDBCUtil.getString(rs_tDBInput_2, 12, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 13) {
								Calendrier.BL_DERNIER_JOUR_MOIS = 0;
							} else {
		                          
            Calendrier.BL_DERNIER_JOUR_MOIS = rs_tDBInput_2.getInt(13);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 14) {
								Calendrier.BL_BISSEXTILE = 0;
							} else {
		                          
            Calendrier.BL_BISSEXTILE = rs_tDBInput_2.getInt(14);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 15) {
								Calendrier.BL_WEEK_END = 0;
							} else {
		                          
            Calendrier.BL_WEEK_END = rs_tDBInput_2.getInt(15);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 16) {
								Calendrier.BL_JOUR_FERIE = 0;
							} else {
		                          
            Calendrier.BL_JOUR_FERIE = rs_tDBInput_2.getInt(16);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 17) {
								Calendrier.LB_JOUR_FERIE = null;
							} else {
	                         		
        	Calendrier.LB_JOUR_FERIE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 17, false);
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
	 * [tAdvancedHash_Calendrier main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Calendrier";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Calendrier"
						
						);
					}
					


			   
			   

					CalendrierStruct Calendrier_HashRow = new CalendrierStruct();
		   	   	   
				
				Calendrier_HashRow.ID_DIM_CALENDRIER = Calendrier.ID_DIM_CALENDRIER;
				
				Calendrier_HashRow.DT_JOUR = Calendrier.DT_JOUR;
				
				Calendrier_HashRow.NB_ANNEE = Calendrier.NB_ANNEE;
				
				Calendrier_HashRow.NB_SEMESTRE = Calendrier.NB_SEMESTRE;
				
				Calendrier_HashRow.NB_TRIMESTRE = Calendrier.NB_TRIMESTRE;
				
				Calendrier_HashRow.NB_MOIS = Calendrier.NB_MOIS;
				
				Calendrier_HashRow.NB_JOUR_ANNEE = Calendrier.NB_JOUR_ANNEE;
				
				Calendrier_HashRow.NB_JOUR_MOIS = Calendrier.NB_JOUR_MOIS;
				
				Calendrier_HashRow.NB_JOUR_SEMAINE = Calendrier.NB_JOUR_SEMAINE;
				
				Calendrier_HashRow.NB_SEMAINE_ANNEE = Calendrier.NB_SEMAINE_ANNEE;
				
				Calendrier_HashRow.LB_MOIS = Calendrier.LB_MOIS;
				
				Calendrier_HashRow.LB_JOUR = Calendrier.LB_JOUR;
				
				Calendrier_HashRow.BL_DERNIER_JOUR_MOIS = Calendrier.BL_DERNIER_JOUR_MOIS;
				
				Calendrier_HashRow.BL_BISSEXTILE = Calendrier.BL_BISSEXTILE;
				
				Calendrier_HashRow.BL_WEEK_END = Calendrier.BL_WEEK_END;
				
				Calendrier_HashRow.BL_JOUR_FERIE = Calendrier.BL_JOUR_FERIE;
				
				Calendrier_HashRow.LB_JOUR_FERIE = Calendrier.LB_JOUR_FERIE;
				
			tHash_Lookup_Calendrier.put(Calendrier_HashRow);
			
            




 


	tos_count_tAdvancedHash_Calendrier++;

/**
 * [tAdvancedHash_Calendrier main ] stop
 */
	
	/**
	 * [tAdvancedHash_Calendrier process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Calendrier";

	

 



/**
 * [tAdvancedHash_Calendrier process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Calendrier process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Calendrier";

	

 



/**
 * [tAdvancedHash_Calendrier process_data_end ] stop
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
	 * [tAdvancedHash_Calendrier end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Calendrier";

	

tHash_Lookup_Calendrier.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Calendrier");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_Calendrier", true);
end_Hash.put("tAdvancedHash_Calendrier", System.currentTimeMillis());




/**
 * [tAdvancedHash_Calendrier end ] stop
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
	 * [tAdvancedHash_Calendrier finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Calendrier";

	

 



/**
 * [tAdvancedHash_Calendrier finally ] stop
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
        final jDwhVente jDwhVenteClass = new jDwhVente();

        int exitCode = jDwhVenteClass.runJobInTOS(args);

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
            java.io.InputStream inContext = jDwhVente.class.getClassLoader().getResourceAsStream("icommerce_reporting/jdwhvente_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jDwhVente.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("schema_dwh", "id_String");
                        if(context.getStringValue("schema_dwh") == null) {
                            context.schema_dwh = null;
                        } else {
                            context.schema_dwh=(String) context.getProperty("schema_dwh");
                        }
                        context.setContextType("schema_ods", "id_String");
                        if(context.getStringValue("schema_ods") == null) {
                            context.schema_ods = null;
                        } else {
                            context.schema_ods=(String) context.getProperty("schema_ods");
                        }
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
                        context.setContextType("schema_params", "id_String");
                        if(context.getStringValue("schema_params") == null) {
                            context.schema_params = null;
                        } else {
                            context.schema_params=(String) context.getProperty("schema_params");
                        }
                        context.setContextType("server_name", "id_String");
                        if(context.getStringValue("server_name") == null) {
                            context.server_name = null;
                        } else {
                            context.server_name=(String) context.getProperty("server_name");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("schema_dwh")) {
                context.schema_dwh = (String) parentContextMap.get("schema_dwh");
            }if (parentContextMap.containsKey("schema_ods")) {
                context.schema_ods = (String) parentContextMap.get("schema_ods");
            }if (parentContextMap.containsKey("additinal_params")) {
                context.additinal_params = (String) parentContextMap.get("additinal_params");
            }if (parentContextMap.containsKey("database")) {
                context.database = (String) parentContextMap.get("database");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("postgres_password")) {
                context.postgres_password = (java.lang.String) parentContextMap.get("postgres_password");
            }if (parentContextMap.containsKey("postgres_user")) {
                context.postgres_user = (String) parentContextMap.get("postgres_user");
            }if (parentContextMap.containsKey("schema_params")) {
                context.schema_params = (String) parentContextMap.get("schema_params");
            }if (parentContextMap.containsKey("server_name")) {
                context.server_name = (String) parentContextMap.get("server_name");
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
errorCode = null;tDBInput_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBInput_1) {
globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

e_tDBInput_1.printStackTrace();

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jDwhVente");
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
            obj_conn = globalMap.remove("conn_tDBConnection_2");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
            connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));






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
 *     309514 characters generated by Talend Open Studio for Data Integration 
 *     on the 28 février 2025 à 14:35:20 GMT
 ************************************************************************************************/