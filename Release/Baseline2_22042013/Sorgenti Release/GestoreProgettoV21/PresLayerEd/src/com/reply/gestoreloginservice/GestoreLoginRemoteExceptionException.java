
/**
 * GestoreLoginRemoteExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.reply.gestoreloginservice;

public class GestoreLoginRemoteExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1366624833003L;
    
    private com.reply.gestoreloginservice.GestoreLoginStub.GestoreLoginRemoteException faultMessage;

    
        public GestoreLoginRemoteExceptionException() {
            super("GestoreLoginRemoteExceptionException");
        }

        public GestoreLoginRemoteExceptionException(java.lang.String s) {
           super(s);
        }

        public GestoreLoginRemoteExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GestoreLoginRemoteExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.reply.gestoreloginservice.GestoreLoginStub.GestoreLoginRemoteException msg){
       faultMessage = msg;
    }
    
    public com.reply.gestoreloginservice.GestoreLoginStub.GestoreLoginRemoteException getFaultMessage(){
       return faultMessage;
    }
}
    