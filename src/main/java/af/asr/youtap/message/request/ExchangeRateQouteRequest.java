package af.asr.youtap.message.request;

public class ExchangeRateQouteRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String customerId;
    private String paymentType;
    private String sourceCurrency;
    private String destinationCurrency;
    private String workingCurrency;
    private String customerData;
    private double workingAmount;

    private ExchangeRateQouteRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.terminalId = builder.terminalId;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.customerData = builder.customerData;
        this.customerId = builder.customerId;
        this.paymentType = builder.paymentType;
        this.sourceCurrency = builder.sourceCurrency;
        this.destinationCurrency  = builder.destinationCurrency;
        this.workingCurrency = builder.workingCurrency;
        this.workingAmount = builder.workingAmount;
        
    }

    public static class Builder {

        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private String customerId;
        private String paymentType;
        private String sourceCurrency;
        private String destinationCurrency;
        private String workingCurrency;
        private String customerData;
        private double workingAmount;
    }
}
