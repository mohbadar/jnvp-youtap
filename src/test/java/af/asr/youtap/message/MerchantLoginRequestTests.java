package af.asr.youtap.message;

import af.asr.youtap.message.request.MerchantLoginRequest;
import af.asr.youtap.util.type.YoutapMessageTypes;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MerchantLoginRequestTests {

    private String EXPECTED_MERCHANT_LOGIN_REQUEST = "MessageType=MerchantLogin,TerminalId=21908856,MerchantPin=1234,MerchantId=86637,TransactionId=21908856";

    @Test
    public void generateExpectedMessage_whenTheSameParamsArePassed()
    {
        MerchantLoginRequest request = MerchantLoginRequest.Builder.newInstance()
                .withMerchantId("86637")
                .withMessageType(YoutapMessageTypes.MERCHANT_LOGIN_REQUEST)
                .withMerchantPin("1234")
                .withTerminalId("21908856")
                .withTransactionId("0000000955")
                .build();
        boolean result = request.getMessage().equals(EXPECTED_MERCHANT_LOGIN_REQUEST);
        Assertions.assertThat(result);
    }
}
