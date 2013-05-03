
/**
 * GestoreAccountServCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.reply.gestoreloginservice;

    /**
     *  GestoreAccountServCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class GestoreAccountServCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public GestoreAccountServCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public GestoreAccountServCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for inserisciNuovoAccount method
            * override this method for handling normal response from inserisciNuovoAccount operation
            */
           public void receiveResultinserisciNuovoAccount(
                    com.reply.gestoreloginservice.GestoreAccountServStub.InserisciNuovoAccountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inserisciNuovoAccount operation
           */
            public void receiveErrorinserisciNuovoAccount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ottieniAccount method
            * override this method for handling normal response from ottieniAccount operation
            */
           public void receiveResultottieniAccount(
                    com.reply.gestoreloginservice.GestoreAccountServStub.OttieniAccountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ottieniAccount operation
           */
            public void receiveErrorottieniAccount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for numeroAccountRegistrati method
            * override this method for handling normal response from numeroAccountRegistrati operation
            */
           public void receiveResultnumeroAccountRegistrati(
                    com.reply.gestoreloginservice.GestoreAccountServStub.NumeroAccountRegistratiResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from numeroAccountRegistrati operation
           */
            public void receiveErrornumeroAccountRegistrati(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for aggiungiRuoloGiornalista method
            * override this method for handling normal response from aggiungiRuoloGiornalista operation
            */
           public void receiveResultaggiungiRuoloGiornalista(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from aggiungiRuoloGiornalista operation
           */
            public void receiveErroraggiungiRuoloGiornalista(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancellaAccount method
            * override this method for handling normal response from cancellaAccount operation
            */
           public void receiveResultcancellaAccount(
                    com.reply.gestoreloginservice.GestoreAccountServStub.CancellaAccountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancellaAccount operation
           */
            public void receiveErrorcancellaAccount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for visualizzaAccountRegistrati method
            * override this method for handling normal response from visualizzaAccountRegistrati operation
            */
           public void receiveResultvisualizzaAccountRegistrati(
                    com.reply.gestoreloginservice.GestoreAccountServStub.VisualizzaAccountRegistratiResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from visualizzaAccountRegistrati operation
           */
            public void receiveErrorvisualizzaAccountRegistrati(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for rimuoviRuoloGiornalista method
            * override this method for handling normal response from rimuoviRuoloGiornalista operation
            */
           public void receiveResultrimuoviRuoloGiornalista(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from rimuoviRuoloGiornalista operation
           */
            public void receiveErrorrimuoviRuoloGiornalista(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateAccount method
            * override this method for handling normal response from updateAccount operation
            */
           public void receiveResultupdateAccount(
                    com.reply.gestoreloginservice.GestoreAccountServStub.UpdateAccountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateAccount operation
           */
            public void receiveErrorupdateAccount(java.lang.Exception e) {
            }
                


    }
    