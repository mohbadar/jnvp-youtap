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
        return String.format("MessageType=EPurseTransactionAuthorize,TransactionId=0000000030,TerminalId=98378265\n" +
                ",MerchantId=8888888888888,CardType=MIFARECLASSIC,Context=MEePurse,CustomerData=(NFC\n" +
                "TagId=39BD361E),EPurseLog=965BBB40060084000000009487656701DAD313DC01CDBB9AB34955C16\n" +
                "F8E98CA,PaymentType=TOPUP,WorkingAmount=100,Date=03/05/2016,Time=12:29:11,MERCHANTP\n" +
                "IN=****,App=v1.8b73a,WorkingCurrency=IDR,EPurseData=(EPurseId=39BD361E,EPurseCurren\n" +
                "cy=IDR,EPurseBalance=95807,EPurseCounter=7ffffff0)");
    }
}
