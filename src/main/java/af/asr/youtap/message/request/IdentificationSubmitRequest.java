package af.asr.youtap.message.request;

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

    }

}
