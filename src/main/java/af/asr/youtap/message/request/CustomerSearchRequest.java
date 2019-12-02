package af.asr.youtap.message.request;

public class CustomerSearchRequest {

    private String messageType;
    private String merchantId;
    private String transactionId;
    private String customerSearchData;

    
    public static class Builder {


        private String messageType;
        private String merchantId;
        private String transactionId;
        private String customerSearchData;

    }
}
