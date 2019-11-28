package af.asr.youtap.message;

public class BalanceGetRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String merchantPin;
    private String customerData;
    private String balanceType;


    public BalanceGetRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.terminalId = builder.terminalId;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.merchantPin = builder.merchantPin;
        this.customerData = builder.customerData;
        this.balanceType = builder.balanceType;
    }


    public static class Builder {


        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private String merchantPin;
        private String customerData;
        private String balanceType;

        public static Builder newInstance(){
            return  new Builder();
        }


        


    }
}
