package af.asr.youtap.message.request;

public class RegisterTagRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    /**
     * Register this tag as the first tag, or
     * subsequent tags, or replace the
     * primary ta
     */
    private String tagType;

    /**
     * To identify tag owner in SMS
     * messages
     */
    private String tagOwnerName;
    /**
     * Indicates which tag to replace
     */
    private String replacingTagType;
    /**
     * CustomerSearchData
     */
    private String customerSearchData;


    



}
