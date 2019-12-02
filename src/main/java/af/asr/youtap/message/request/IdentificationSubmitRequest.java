package af.asr.youtap.message.request;

import com.sun.org.apache.xpath.internal.operations.String;

public class IdentificationSubmitRequest {


    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String customerData;
    private String customerId;
    private String idData;
    private String fingerData;


    private IdentificationSubmitRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.terminalId = builder.terminalId;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.customerData = builder.customerData;
        this.fingerData = builder.fingerData;
        this.customerId = builder.customerId;
        this.idData = builder.idData;
    }

    public static class Builder {

        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private String customerData;
        private String customerId;
        private String idData;
        private String fingerData;


        public static Builder newInstance(){
            return  new Builder();
        }


        public Builder withMessageType(String messageType){
            this.messageType= messageType;
            return this;
        }

        public Builder withTerminalId(String terminalId){
            this.terminalId = terminalId;
            return this;
        }

        public Builder withMerchantId(String merchantId){
            this.merchantId = merchantId;
            return this;
        }

        public Builder withTransactionId(String transactionId)
        {
            this.transactionId = transactionId;
            return this;
        }

        public Builder withCustomerSearchData(String customerData)
        {
            this.customerData = customerData;
            return this;
        }

        public Builder withFingerData(String fingerData)
        {
            this.fingerData = fingerData;
            return this;
        }

        public Builder withPaymentType(String customerId)
        {
            this.customerId = customerId;
            return  this;
        }


        public Builder withIdData(String idData)
        {
            this.idData = idData;
            return  this;
        }


        public IdentificationSubmitRequest build()
        {
            return new IdentificationSubmitRequest(this);
        }

    }
    
}
