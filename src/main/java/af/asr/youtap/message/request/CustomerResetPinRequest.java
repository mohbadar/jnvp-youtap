package af.asr.youtap.message.request;

public class CustomerResetPinRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String customerData;
    private String fingerData;


    public CustomerResetPinRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.terminalId = builder.terminalId;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.customerData = builder.customerData;
        this.fingerData = builder.fingerData;
    }

    public static class Builder {


        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private String customerData;
        private String fingerData;

    }
}
