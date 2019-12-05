package af.asr.youtap.message.request;

import lombok.Data;

/**
 * The Customer Login command is used to log the customer to the server. It is the equivalent of MerchantLogin
 * and intended to be used when the terminal is a smart phone and the user is the actual customer. The purpose is
 * to retrieve a profile which will be used by the smart phone application to display a menu. In this case the smart
 * phone application is user centric rather than merchant centric.
 */
@Data
public class CustomerLoginRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String customerSearchData;
}
