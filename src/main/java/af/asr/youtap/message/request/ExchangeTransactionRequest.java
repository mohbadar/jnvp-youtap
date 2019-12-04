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


        public Builder withCustomerId(String customerId)
        {
            this.customerId = customerId;
            return this;
        }

        public Builder withPaymentType(String paymentType)
        {
            this.paymentType = paymentType;
            return this;
        }

        public Builder withSourceCurrency(String sourceCurrency)
        {
            this.sourceCurrency = sourceCurrency;
            return this;
        }

        public Builder withDestinationCurrency(String destinationCurrency)
        {
            this.destinationCurrency = destinationCurrency;
            return this;
        }

        public Builder withWorkingCurrency(String workingCurrency)
        {
            this.workingCurrency = workingCurrency;
            return this;
        }

        public Builder withStaffPin(String staffPin)
        {
            this.staffPin = staffPin;
            return this;
        }

        public Builder withSendingAmountExclFees(double sendingAmountExclFees)
        {
            this.sendingAmountExclFees = sendingAmountExclFees;
            return this;
        }

        public Builder withFxRate(String fxRate)
        {
            this.fxRate = fxRate;
            return  this;
        }

        public Builder withFee(String fee)
        {
            this.fee  = fee;
            return this;
        }

        public Builder withCostToSend(String costToSend)
        {
            this.costToSend = costToSend;
            return this;
        }

        public Builder withReceiveAmount(double receiveAmount)
        {
            this.receiveAmount = receiveAmount;
            return this;
        }

        public Builder withBillPayeeId(String billPayeeId)
        {
            this.billPayeeId = billPayeeId;
            return this;
        }

        public Builder withBillPayeeReference(String billPayeeReference)
        {
            this.billPayeeReference = billPayeeReference;
            return this;
        }

        public Builder withContactMSISDN(String contactMSISDN)
        {
            this.contactMSISDN = contactMSISDN;
            return this;
        }

        public ExchangeTransactionRequest build()
        {
            return new ExchangeTransactionRequest(this);
        }
    }

    public String getMessage()
    {
        return  String.format("");
    }

}
