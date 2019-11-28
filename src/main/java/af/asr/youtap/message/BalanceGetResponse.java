package af.asr.youtap.message;

public class BalanceGetResponse {

    private String messageType;
    private int status;
    private String transactionId;
    private String dspData;
    private Double balance;
    private Double topupBalance;

    public BalanceGetResponse(Builder builder)
    {
        this.messageType = builder.messageType;
        this.status = builder.status;
        this.transactionId = builder.transactionId;
        this.dspData = builder.dspData;
        this.balance = builder.balance;
        this.topupBalance = builder.topupBalance;
    }


    public static  class Builder {

        private String messageType;
        private int status;
        private String transactionId;
        private String dspData;
        private Double balance;
        private Double topupBalance;



        public Builder withMessageType(String messageType)
        {
            this.messageType = messageType;
            return this;
        }

        public Builder withStatus(int status)
        {
            this.status = status;
            return this;
        }

        public Builder withTransactionId(String transactionId)
        {
            this.transactionId =transactionId;
            return this;
        }

        public Builder withDspData(String dspData)
        {
            this.dspData = dspData;
            return this;
        }

        public Builder withBalance(Double balance)
        {
            this.balance = balance;
            return this;
        }

        public Builder withTopUpBalance(Double topupBalance)
        {
            this.topupBalance = topupBalance;
            return this;
        }

        public BalanceGetResponse build()
        {
            return new BalanceGetResponse(this);
        }
    }

    

}
