
/**
 * GestoreAccountServRemoteExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.reply.gestoreloginservice;

public class GestoreAccountServRemoteExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1366639380559L;
    
    private com.reply.gestoreloginservice.GestoreAccountServStub.GestoreAccountServRemoteException faultMessage;

    
        public GestoreAccountServRemoteExceptionException() {
            super("GestoreAccountServRemoteExceptionException");
        }

        public GestoreAccountServRemoteExceptionException(java.lang.String s) {
           super(s);
        }

        public GestoreAccountServRemoteExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GestoreAccountServRemoteExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.reply.gestoreloginservice.GestoreAccountServStub.GestoreAccountServRemoteException msg){
       faultMessage = msg;
    }
    
    public com.reply.gestoreloginservice.GestoreAccountServStub.GestoreAccountServRemoteException getFaultMessage(){
       return faultMessage;
    }
}
    