package com.dummy.jdbc;

import java.util.Date;

public class Fga {
	 
	int SESSIONID;    
	Date TIMESTAMP;           
	String DBUID,OSUID,OSHST,CLIENTID,EXTID,OBJ$SCHEMA,OBJ$NAME,POLICYNAME;   
	int SCN;         
	String SQLTEXT; 
	java.sql.Clob LSQLTEXT,LSQLBIND;           
	String SQLBIND; 
	String COMMENT$TEXT; 
	long PLHOL;           
	int STMT_TYPE;         
	Date NTIMESTAMP;   
	int PROXY$SID;         
	String USER$GUID;   
	int INSTANCE;         
	String PROCESS;   
	short XID;    
	String AUDITID;   
	int STATEMENT,ENTRYID,DBID;         	           
	String OBJ$EDITION;   
	
	
	
	public int getSESSIONID() {
		return SESSIONID;
	}
	public void setSESSIONID(int sESSIONID) {
		SESSIONID = sESSIONID;
	}
	public Date getTIMESTAMP() {
		return TIMESTAMP;
	}
	public void setTIMESTAMP(Date tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}
	public String getDBUID() {
		return DBUID;
	}
	public void setDBUID(String dBUID) {
		DBUID = dBUID;
	}
	public String getOSUID() {
		return OSUID;
	}
	public void setOSUID(String oSUID) {
		OSUID = oSUID;
	}
	public String getOSHST() {
		return OSHST;
	}
	public void setOSHST(String oSHST) {
		OSHST = oSHST;
	}
	public String getCLIENTID() {
		return CLIENTID;
	}
	public void setCLIENTID(String cLIENTID) {
		CLIENTID = cLIENTID;
	}
	public String getEXTID() {
		return EXTID;
	}
	public void setEXTID(String eXTID) {
		EXTID = eXTID;
	}
	public String getOBJ$SCHEMA() {
		return OBJ$SCHEMA;
	}
	public void setOBJ$SCHEMA(String oBJ$SCHEMA) {
		OBJ$SCHEMA = oBJ$SCHEMA;
	}
	public String getOBJ$NAME() {
		return OBJ$NAME;
	}
	public void setOBJ$NAME(String oBJ$NAME) {
		OBJ$NAME = oBJ$NAME;
	}
	public String getPOLICYNAME() {
		return POLICYNAME;
	}
	public void setPOLICYNAME(String pOLICYNAME) {
		POLICYNAME = pOLICYNAME;
	}
	public int getSCN() {
		return SCN;
	}
	public void setSCN(int sCN) {
		SCN = sCN;
	}
	public String getSQLTEXT() {
		return SQLTEXT;
	}
	public void setSQLTEXT(String sQLTEXT) {
		SQLTEXT = sQLTEXT;
	}
	public java.sql.Clob getLSQLTEXT() {
		return LSQLTEXT;
	}
	public void setLSQLTEXT(java.sql.Clob lSQLTEXT) {
		LSQLTEXT = lSQLTEXT;
	}
	public java.sql.Clob getLSQLBIND() {
		return LSQLBIND;
	}
	public void setLSQLBIND(java.sql.Clob lSQLBIND) {
		LSQLBIND = lSQLBIND;
	}
	public String getSQLBIND() {
		return SQLBIND;
	}
	public void setSQLBIND(String sQLBIND) {
		SQLBIND = sQLBIND;
	}
	public String getCOMMENT$TEXT() {
		return COMMENT$TEXT;
	}
	public void setCOMMENT$TEXT(String cOMMENT$TEXT) {
		COMMENT$TEXT = cOMMENT$TEXT;
	}
	public long getPLHOL() {
		return PLHOL;
	}
	public void setPLHOL(long pLHOL) {
		PLHOL = pLHOL;
	}
	public int getSTMT_TYPE() {
		return STMT_TYPE;
	}
	public void setSTMT_TYPE(int sTMT_TYPE) {
		STMT_TYPE = sTMT_TYPE;
	}
	public Date getNTIMESTAMP() {
		return NTIMESTAMP;
	}
	public void setNTIMESTAMP(Date nTIMESTAMP) {
		NTIMESTAMP = nTIMESTAMP;
	}
	public int getPROXY$SID() {
		return PROXY$SID;
	}
	public void setPROXY$SID(int pROXY$SID) {
		PROXY$SID = pROXY$SID;
	}
	public String getUSER$GUID() {
		return USER$GUID;
	}
	public void setUSER$GUID(String uSER$GUID) {
		USER$GUID = uSER$GUID;
	}
	public int getINSTANCE() {
		return INSTANCE;
	}
	public void setINSTANCE(int iNSTANCE) {
		INSTANCE = iNSTANCE;
	}
	public String getPROCESS() {
		return PROCESS;
	}
	public void setPROCESS(String pROCESS) {
		PROCESS = pROCESS;
	}
	public short getXID() {
		return XID;
	}
	public void setXID(short xID) {
		XID = xID;
	}
	public String getAUDITID() {
		return AUDITID;
	}
	public void setAUDITID(String aUDITID) {
		AUDITID = aUDITID;
	}
	public int getSTATEMENT() {
		return STATEMENT;
	}
	public void setSTATEMENT(int sTATEMENT) {
		STATEMENT = sTATEMENT;
	}
	public int getENTRYID() {
		return ENTRYID;
	}
	public void setENTRYID(int eNTRYID) {
		ENTRYID = eNTRYID;
	}
	public int getDBID() {
		return DBID;
	}
	public void setDBID(int dBID) {
		DBID = dBID;
	}
	public String getOBJ$EDITION() {
		return OBJ$EDITION;
	}
	public void setOBJ$EDITION(String oBJ$EDITION) {
		OBJ$EDITION = oBJ$EDITION;
	}

}
