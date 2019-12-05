package af.asr.youtap.message.request;

import lombok.Data;

@Data
/**
 * A Subscriber might want to link their bank account with their mobile money account and transfer money in both
 * directions as well as get their bank balance
 */
public class LinkAccountRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String customerData;

    public String getMessage()
    {
        return String.format("");
    }
}
