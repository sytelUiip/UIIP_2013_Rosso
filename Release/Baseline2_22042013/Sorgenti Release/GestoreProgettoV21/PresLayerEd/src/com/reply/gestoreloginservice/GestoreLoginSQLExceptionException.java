
/**
 * GestoreLoginSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.reply.gestoreloginservice;

import com.reply.gestoreloginservice.GestoreLoginStub.GestoreLoginRemoteException;

public class GestoreLoginSQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1366454573284L;
    
    private GestoreLoginRemoteException faultMessage;

    
        public GestoreLoginSQLExceptionException() {
            super("GestoreLoginSQLExceptionException");
        }

        public GestoreLoginSQLExceptionException(java.lang.String s) {
           super(s);
        }

        public GestoreLoginSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GestoreLoginSQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(GestoreLoginRemoteException msg){
       faultMessage = msg;
    }
    
    public GestoreLoginRemoteException getFaultMessage(){
       return faultMessage;
    }
    
//    public void setFaultMessage(com.reply.gestoreloginservice.GestoreLoginStub.GestoreLoginSQLException msg){
//        faultMessage = msg;
//     }
//     
//     public com.reply.gestoreloginservice.GestoreLoginStub.GestoreLoginSQLException getFaultMessage(){
//        return faultMessage;
//     }
}
    