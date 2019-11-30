package af.asr.youtap.util;

public class CustomerSearchData {


    /**
     * NFC Card serial number - Hex
     */
    private String NFCTagId;

    /**
     * Subscribers first name
     */
    private String givenName;

    /**
     * Subscribers surname
     */
    private String surename;

    /**
     * Date of birth in YYYYMMDD format
     */
    public String dob;

    /**
     * Subscribers ID number created during
     * registration
     */
    private String customerId;

    /**
     * Mobile phone number
     */
    private String msisdn;

    /**
     * Magnetic card track 2 account number. 16
     * to 19 digits
     */
    private String cardId;

    /**
     * Magnetic card track 2 expiry date
     */
    private String cardExpiry;

    /**
     * Mobile money account PIN
     */
    private int mobMonPin;

    /**
     * Another identifier for the customer, used in the context of
     * smart mobile phone application
     *
     * Subscriber Identity number
     */
    private String imsi;

    private CustomerSearchData (Builder builder)
    {
        this.NFCTagId = builder.NFCTagId;
        this.givenName = builder.givenName;
        this.surename = builder.surename;
        this.dob = builder.dob;
        this.customerId = builder.customerId;
        this.msisdn = builder.msisdn;
        this.cardId = builder.cardId;
        this.cardExpiry = builder.cardExpiry;
        this.mobMonPin = builder.mobMonPin;
        this.imsi = builder.imsi;
    }

    public static class Builder {

        private String NFCTagId;
        private String givenName;
        private String surename;
        public String dob;
        private String customerId;
        private String msisdn;
        private String cardId;
        private String cardExpiry;
        private int mobMonPin;
        private String imsi;


    }

}
