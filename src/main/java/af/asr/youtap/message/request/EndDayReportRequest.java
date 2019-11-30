package af.asr.youtap.message.request;

public class EndDayReportRequest {


    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    /**
     * Merchant numeric PIN. Usually 4 digits but
     * may be more or less. In production
     * systems it is encoded in a pinblock
     */
    private int merchantPin;
    /**
     * Block number requested. For a large number
     * of transaction more than one block may be
     * needed
     *
     * The client request the block number to be
     * sent. The first block is zero. See
     * BlockCount returned from the server
     */
    private int requestBlock;

    private int txnHistoryCount;
    private String customerData;
    /**
     * The format that the data needs to be
     * returned in
     */
    private String prnDspFormat;



    public EndDayReportRequest(Builder builder)
    {
        this.messageType= builder.messageType;
        this.terminalId =builder.terminalId;
        this.merchantId= builder.merchantId;
        this.merchantPin = builder.merchantPin;
        this.requestBlock = builder.requestBlock;
        this.transactionId = builder.transactionId;
        this.txnHistoryCount = builder.txnHistoryCount;
        this.customerData = builder.customerData;
        this.prnDspFormat =builder.prnDspFormat;
    }

    public static class Builder {

        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private int merchantPin;
        private int requestBlock;
        private int txnHistoryCount;
        private String customerData;
        private String prnDspFormat;



        public static Builder newInstance()
        {
            return new Builder();
        }
        

    }


}
