package af.asr.youtap.message.request;

public class MerchantChangePinRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private int merchantPin;
    private int newPin;


    private MerchantChangePinRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.terminalId = builder.terminalId;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.merchantPin = builder.merchantPin;
        this.newPin = builder.newPin;
    }

    public static class Builder {

        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private int merchantPin;
        private int newPin;

    }
}
