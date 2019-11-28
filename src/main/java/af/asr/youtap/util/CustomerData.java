package af.asr.youtap.util;

public class CustomerData {

    /**
     * Subscribers bank account number that
     * needs to be linked/unlinked from their
     * mobile money account.
     */
    private String bankAccountNo;

    /**
     * Mobile money account PIN
     */
    private int mobMonPin;

    /**
     * Bank account PIN number. In production
     * systems this is encrypted within a pinblock
     */
    private int bankPin;

    /**
     * Subscriber email address
     */
    private String emailAddress;

    /**
     * Subscriber residential address
     */
    private String residentialAddress;

    /**
     * Subscriber residential state
     */
    private String state;

    /**
     * Subscriber residential city
     */
    private  String city;

    /**
     * Subscriber residential country
     */
    private String country;

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
     * Customer Type
     */
    private CustomerType customerType;
}
