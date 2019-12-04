package af.asr.youtap.message.request;

public class ExchangeTransactionRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String staffPin;
    private String customerId;
    private String paymentType;
    private String sourceCurrency;
    private String destinationCurrency;
    private String workingCurrency;
    private double sendingAmountExclFees;
    private String fxRate;
    private String fee;
    private String costToSend;
    private double receiveAmount;
    private String billPayeeId;
    private String billPayeeReference;
    private String contactMSISDN;


    public ExchangeTransactionRequest(Builder builder)
    {
        this.messageType = builder.messageType;
        this.terminalId = builder.terminalId;
        this.merchantId = builder.merchantId;
        this.transactionId = builder.transactionId;
        this.customerId = builder.customerId;
        this.paymentType = builder.paymentType;
        this.sourceCurrency = builder.sourceCurrency;
        this.destinationCurrency  = builder.destinationCurrency;
        this.workingCurrency = builder.workingCurrency;
        this.staffPin = builder.staffPin;
        this.sendingAmountExclFees = builder.sendingAmountExclFees;
        this.fxRate = builder.fxRate;
        this.fee = builder.fee;
        this.costToSend = builder.costToSend;
        this.receiveAmount = builder.receiveAmount;
        this.billPayeeId = builder.billPayeeId;
        this.billPayeeReference = builder.billPayeeReference;
        this.contactMSISDN = builder.contactMSISDN;
    }


    public static class Builder {

        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private String staffPin;
        private String customerId;
        private String paymentType;
        private String sourceCurrency;
        private String destinationCurrency;
        private String workingCurrency;
        private double sendingAmountExclFees;
        private String fxRate;
        private String fee;
        private String costToSend;
        private double receiveAmount;
        private String billPayeeId;
        private String billPayeeReference;
        private String contactMSISDN;
    }

}
