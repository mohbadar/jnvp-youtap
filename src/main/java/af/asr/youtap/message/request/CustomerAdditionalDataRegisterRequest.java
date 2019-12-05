package af.asr.youtap.message.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAdditionalDataRegisterRequest {

    private String messageType;
    private String terminalId;
    private String merchantId;
    private String transactionId;
    private String customerData;
    private String subscriberAddress;
    private String app;


    public String getMessage()
    {
        return String.format("MessageType=%s,TransactionId=%s,TerminalId=%s,MerchantId=%s,CustomerData=%s,SubscriberAddress=%s,App=%s", this.messageType, this.transactionId, this.terminalId, this.merchantId, this.customerData, this.subscriberAddress, this.app);
    }
}
