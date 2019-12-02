package af.asr.youtap.network.heartbeat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.ip.tcp.TcpReceivingChannelAdapter;
import org.springframework.integration.ip.tcp.TcpSendingMessageHandler;
import org.springframework.integration.ip.tcp.connection.TcpNetClientConnectionFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;

@Configuration
@EnableIntegration
public class HeartbeatClientConfig {




    @Bean
    public MessageChannel outboudChannel() {
        return new DirectChannel();
    }

    @Bean
    public PollableChannel inboundChannel() {
        return new QueueChannel();
    }

    @Bean
    public TcpNetClientConnectionFactory connectionFactory() {
        TcpNetClientConnectionFactory connectionFactory = new TcpNetClientConnectionFactory("localhost", 7777);
        return connectionFactory;
    }

    @Bean
    public TcpReceivingChannelAdapter heartbeatReceivingMessageAdapter(
            TcpNetClientConnectionFactory connectionFactory,
            MessageChannel inboundChannel) {
        TcpReceivingChannelAdapter heartbeatReceivingMessageAdapter = new TcpReceivingChannelAdapter();
        heartbeatReceivingMessageAdapter.setConnectionFactory(connectionFactory);
        heartbeatReceivingMessageAdapter.setOutputChannel(inboundChannel); // ???
        heartbeatReceivingMessageAdapter.setClientMode(true);
        return heartbeatReceivingMessageAdapter;
    }

    @Bean
    public TcpSendingMessageHandler heartbeatSendingMessageHandler(
            TcpNetClientConnectionFactory connectionFactory) {
        TcpSendingMessageHandler heartbeatSendingMessageHandler = new TcpSendingMessageHandler();
        heartbeatSendingMessageHandler.setConnectionFactory(connectionFactory);
        return heartbeatSendingMessageHandler;
    }

    @Bean
    public IntegrationFlow heartbeatClientFlow(
            TcpNetClientConnectionFactory connectionFactory,
            TcpReceivingChannelAdapter heartbeatReceivingMessageAdapter,
            TcpSendingMessageHandler heartbeatSendingMessageHandler,
            MessageChannel outboudChannel) {
        return IntegrationFlows//
                          .from(outboudChannel)
                // ??????
//                .// adapter ???????????
//                .// gateway ???????????
//                .// handler ???????????
                .get();
    }

    @Bean
    public HeartbeatClient heartbeatClient(
            MessageChannel outboudChannel,
            PollableChannel inboundChannel) {
        return new HeartbeatClient(outboudChannel, inboundChannel);
    }
}