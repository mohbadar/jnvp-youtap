package af.asr.youtap.message.request;

public class MiniStatementRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    /**
     * Block number requested. For a large number
     * of transaction more than one block may be
     * needed
     */
    private String requestBlock;

    private int txnHistoryCount;
    private String customerData;
    /**
     * The format that the data needs to be
     * returned in
     */
    private String prnDspFormat;


    public MiniStatementRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.terminalId = builder.terminalId;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.requestBlock = builder.requestBlock;
        this.txnHistoryCount = builder.txnHistoryCount;
        this.prnDspFormat = builder.prnDspFormat;
    }

    public static class Builder {

        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private String requestBlock;
        private int txnHistoryCount;
        private String customerData;
        private String prnDspFormat;


        public static Builder newInstance(){
            return new Builder();
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


        public Builder withRequestBlock(String requestBlock)
        {
            this.requestBlock = requestBlock;
            return this;
        }

        public Builder withTxnHistoryCount(int txnHistoryCount)
        {
            this.txnHistoryCount = txnHistoryCount;
            return this;
        }


        public Builder withCustomerData(String customerData)
        {
            this.customerData = customerData;
            return this;
        }


        public Builder withPrnDspFormat(String prnDspFormat)
        {
            this.prnDspFormat = prnDspFormat;
            return this;
        }

        public MiniStatementRequest buid()
        {
            return new MiniStatementRequest(this);
        }
    }

    public String getMessage()
    {
        return String.format("MessageType=%s,TransactionId=%s,TerminalId=%s,MerchantId=%s,TxnHistoryCount=%d,PrnDspFormat=P,RequestBlock=0,CustomerData=(NFCTagId=04E8550ABA2980D0,MobMonPin=655321)");
    }

}
