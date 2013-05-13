
/**
 * GestoreNotiziaSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.reply.gestoreloginservice;

    /**
     *  GestoreNotiziaSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class GestoreNotiziaSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public GestoreNotiziaSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public GestoreNotiziaSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for ricercaNotizieService method
            * override this method for handling normal response from ricercaNotizieService operation
            */
           public void receiveResultricercaNotizieService(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.RicercaNotizieServiceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ricercaNotizieService operation
           */
            public void receiveErrorricercaNotizieService(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for visualizzaNotiziaId method
            * override this method for handling normal response from visualizzaNotiziaId operation
            */
           public void receiveResultvisualizzaNotiziaId(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.VisualizzaNotiziaIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from visualizzaNotiziaId operation
           */
            public void receiveErrorvisualizzaNotiziaId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for annulla method
            * override this method for handling normal response from annulla operation
            */
           public void receiveResultannulla(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.AnnullaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from annulla operation
           */
            public void receiveErrorannulla(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertNewNotizia method
            * override this method for handling normal response from insertNewNotizia operation
            */
           public void receiveResultinsertNewNotizia(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.InsertNewNotiziaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertNewNotizia operation
           */
            public void receiveErrorinsertNewNotizia(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for trasmetti method
            * override this method for handling normal response from trasmetti operation
            */
           public void receiveResulttrasmetti(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.TrasmettiResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from trasmetti operation
           */
            public void receiveErrortrasmetti(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registraNotizia method
            * override this method for handling normal response from registraNotizia operation
            */
           public void receiveResultregistraNotizia(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.RegistraNotiziaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registraNotizia operation
           */
            public void receiveErrorregistraNotizia(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for annullaLista method
            * override this method for handling normal response from annullaLista operation
            */
           public void receiveResultannullaLista(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.AnnullaListaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from annullaLista operation
           */
            public void receiveErrorannullaLista(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancellaNotizia method
            * override this method for handling normal response from cancellaNotizia operation
            */
           public void receiveResultcancellaNotizia(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.CancellaNotiziaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancellaNotizia operation
           */
            public void receiveErrorcancellaNotizia(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for numeroNotizieRicerca method
            * override this method for handling normal response from numeroNotizieRicerca operation
            */
           public void receiveResultnumeroNotizieRicerca(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.NumeroNotizieRicercaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from numeroNotizieRicerca operation
           */
            public void receiveErrornumeroNotizieRicerca(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificaNotizia method
            * override this method for handling normal response from modificaNotizia operation
            */
           public void receiveResultmodificaNotizia(
                    com.reply.gestoreloginservice.GestoreNotiziaSStub.ModificaNotiziaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificaNotizia operation
           */
            public void receiveErrormodificaNotizia(java.lang.Exception e) {
            }
                


    }
    