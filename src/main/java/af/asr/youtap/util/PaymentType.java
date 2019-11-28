package af.asr.youtap.util;

public interface   PaymentType {
    /**
     * send money or Forex lookup
     */
    public static String DMM  = "DMM";


    /**
     * Topup
     */
    public static String TOPUP  = "TOPUP";



    /**
     * BILL Payment
     */
    public static String BILL  = "BILL";




    /**
     * (payment) money transfer from a
     * customer’s mobile money account to a
     * merchants account
     */
    public static String C2MP  = "C2MP";




    /**
     * (withdrawal) money transfer from
     * a customer’s mobile money account to a
     * merchants account
     */
    public static String C2MW  = "C2MW";




    /**
     * cash deposit from customer to
     * merchant
     */
    public static String C2MD  = "C2MD";



    /**
     * transfer from a customer’s mobile
     * money account to the customers linked
     * bank account
     */
    public static String C2CW  = "C2CW";


    /**
     * transfer from a customer’s linked
     * bank account to a customer’s mobile
     * money account
     */
    public static String C2CD  = "C2CD";


    /**
     * Subscriber uses mobile money
     * account to purchase mobile phone airtime
     * top-up.
     */
    public static String M2CT  = "M2CT";


    /**
     * Subscriber uses mobile money
     * account to purchase mobile phone airtime
     * top-up voucher/PIN.
     */
    public static String PINTOP  = "PINTOP";



    /**
     * Subscriber uses mobile
     * money account to send money to other
     * subscribers or non-subscribers
     */
    public static String SNDMON  = "SNDMON";



    /**
     * Subscriber transfers a cash
     * amount to a non-mobile money subscriber
     */
    public static String CSHTOP  = "CSHTOP";


    /**
     * Subscriber transfers a cash
     * amount to a non-mobile money subscriber
     */
    public static String CSHVOUT  = "CSHVOUT";


    /**
     * Non-mobile money wishes to
     * withdraw from a cash amount previously
     * transferred to him/her
     */
    public static String CSHVOUR  = "CSHVOUR";


    /**
     * Prepaid card purchase
     */
    public static String CP2MP  = "CP2MP";




    /**
     * Mei Tan
     */
    public static String INTXF  = "INTXF";




    /**
     * Mei Tan
     */
    public static String OUTTXF  = "OUTTXF";







}
