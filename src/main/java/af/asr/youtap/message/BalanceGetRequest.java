package af.asr.youtap.message;

public class BalanceGetRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String merchantPin;
    private String customerData;
    private String balanceType;


    public static class Builder {


        private String messageType;
        private String terminalId;
        private String merchantId;
        private String transactionId;
        private String merchantPin;
        private String customerData;
        private String balanceType;

        
    }
}
