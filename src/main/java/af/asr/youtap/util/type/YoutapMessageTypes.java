package af.asr.youtap.util.type;

public interface YoutapMessageTypes {

    public static String MERCHANT_LOGIN_REQUEST = "MerchantLogin";
    public static String MERCHANT_LOGIN_RESPONSE = "MerchantLoginResp";
    public static String STAFF_LOGIN_REQUEST = "StaffLogin";
    public static String STAFF_LOGIN_RESPONSE = "StaffLoginResp";
    public static String MINI_STATEMENT_REQUEST = "LastTransactions";
    public static String MINI_STATEMENT_RESPONSE = "LastTransactionResp";
    public static String DAY_END_REPORT_REQUEST = "DayEndReport";
    public static String DAY_END_REPORT_RESPONSE = "DayEndReportResp";
    public static String REGISTER_TAG_REQUEST= "RegisterTag";
    public static String REGISTER_TAG_RESPONSE = "RegisterTagResp";
    public static String MERCHANT_CHANGE_PIN_REQUEST = "ChangeMerchantPin";
    public static String MERCHANT_CHANGE_PIN_RESPONSE = "ChangeMerchantPinResp";
    public static String CUSTOMER_CHANGE_PIN_REQUEST = "ChangeCustomerPin";
    public static String CUSTOMER_CHANGE_PIN_RESPONSE = "ChangeCustomerPinResp";
    public static String CUSTOMER_RESET_PIN_REQUEST  = "ResetPin";
    public static String CUSTOMER_RESET_PIN_RESPONSE  ="ResetPinResp";
}
