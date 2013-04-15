package com.editoriale.proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.OracleTypes;
public class ListaAccount {
	public static String execute(float price, Connection conn)
	        throws SQLException {
			String stampars = "";
			ArrayList <String> usernames = new ArrayList<String>();
	        String query = "{call LISTA_ACCOUNT(?)}";
	        CallableStatement stmt = conn.prepareCall(query);
	        stmt.registerOutParameter(1, OracleTypes.CURSOR);
	        stmt.execute();
	        ResultSet rs = (ResultSet)stmt.getObject(1);
	        rs.next();
	        usernames.add(rs.getString("USERNAME"));
	        stampars += rs.getMetaData();
            stampars +=
            		rs.getString("USERNAME") + " "
            		+ rs.getString("NOME") + " "
            		+ rs.getString("COGNOME") + " "
            		+ rs.getString("SIGLA_REDAZIONE") + " "
            		+ rs.getString("SIGLA_GIORNALISTA") + " "
            		+ rs.getString("NOME_GRUPPO") + " ";
        
	        while (rs.next()) {    
	        	boolean presente = false;
	        	for (int i = 0; i < usernames.size(); i++){
	        		if (usernames.get(i).equals(rs.getString("USERNAME")))
	        			presente = true;
	        	}
	        		if (presente == true)
	        			stampars += "+ Giornalista";
	        		else
	        		{
	        			usernames.add(rs.getString("USERNAME"));
	    	            stampars +=
	    	            		
	    	            		"\n" + rs.getString("USERNAME") + " "
	    	            		+ rs.getString("NOME") + " "
	    	            		+ rs.getString("COGNOME") + " "
	    	            		+ rs.getString("SIGLA_REDAZIONE") + " "
	    	            		+ rs.getString("SIGLA_GIORNALISTA") + " "
	    	            		+ rs.getString("NOME_GRUPPO") + " ";
	        		}
	        	}
	        stampars+="\n\n";
	        rs.close();
	        stmt.close();
	        return stampars;
	    }
}