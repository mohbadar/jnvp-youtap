package af.asr.youtap.message.request;

import lombok.Data;

/**
 * Requesting approval from the server to perform a purse transaction with an EPurse card.
 */
@Data
public class EPurseTransactionAuthorizeRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String customerData;
    private String cardType;
    private String context;
    private String cardData;
    private String merchantPin;
    private String paymentType;
    private String workingCurrency;
    private double workingAmount;
    /**
     * EPurse Details
     */
    private String ePurseData;
    /**
     * The EPurseLog raw data to be written on the card
     */
    private String ePurseLog;

    public String getMessage()
    {
        return String.format("");
    }
}
