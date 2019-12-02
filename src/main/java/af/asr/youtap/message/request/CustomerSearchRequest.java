package af.asr.youtap.message.request;

public class CustomerSearchRequest {

    private String messageType;
    private String merchantId;
    private String transactionId;
    private String customerSearchData;

    private CustomerSearchRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.customerSearchData = builder.customerSearchData;
    }


    public static class Builder {


        private String messageType;
        private String merchantId;
        private String transactionId;
        private String customerSearchData;


        public static Builder newInstance(){
            return  new Builder();
        }


        public Builder withMessageType(String messageType){
            this.messageType= messageType;
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

        public Builder withCustomerSearchData(String customerSearchData)
        {
            this.customerSearchData = customerSearchData;
            return this;
        }

        public CustomerSearchRequest build()
        {
            return  new CustomerSearchRequest(this);
        }


    }

    /**
     * MessageType=CustomerSearch,TransactionId=0000000114,TerminalId=98944138,MerchantId=
     * 021333333,CustomerSearchData=(MSISDN=6421700700)
     * @return
     */
    public String getMessage ()
    {
        return String.format("MessageType=CustomerSearch,TransactionId=0000000114,TerminalId=98944138,MerchantId=\n" +
                "021333333,CustomerSearchData=(MSISDN=6421700700)");
    }
}
