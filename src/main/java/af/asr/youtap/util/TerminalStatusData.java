package af.asr.youtap.util;

public class TerminalStatusData {

    /**
     * Client device’s battery level if appropriate
     * as a percentage of the fully charged level
     */
    private int batteryLevel;

    /**
     * Average number of milliseconds for a client
     * device to send and receive a response
     * between Ping commands
     */
    private double averageMessageRoundTrip;

    /**
     * Maximum round trip in milliseconds during
     * the last ping message period
     */
    private double maxMessageRoundTrip;

    /**
     * Minimun round trip in milliseconds during
     * the last ping message period
     */
    private double minMessageRoundTrip;


    /**
     * The Client device’s radio modem signal
     * strength as a percentage at the time of
     * sending the terminal data
     */
    private int signalStrength;


    /**
     * Another identifier for the customer, used in the context of
     * smart mobile phone application
     */
    private String imsi;

    /**
     * International mobile equipment
     * identity number
     */
    private String imei;


    /**
     * Service provider for the SIM card in the
     * client device
     */
    private String serviceOperator;


    /**
     * SIM card identification number inserted
     * into the client device
     */
    private String simId;


    public static class Builder {

        /**
         * Client device’s battery level if appropriate
         * as a percentage of the fully charged level
         */
        private int batteryLevel;

        /**
         * Average number of milliseconds for a client
         * device to send and receive a response
         * between Ping commands
         */
        private double averageMessageRoundTrip;

        /**
         * Maximum round trip in milliseconds during
         * the last ping message period
         */
        private double maxMessageRoundTrip;

        /**
         * Minimun round trip in milliseconds during
         * the last ping message period
         */
        private double minMessageRoundTrip;


        /**
         * The Client device’s radio modem signal
         * strength as a percentage at the time of
         * sending the terminal data
         */
        private int signalStrength;


        /**
         * Another identifier for the customer, used in the context of
         * smart mobile phone application
         */
        private String imsi;

        /**
         * International mobile equipment
         * identity number
         */
        private String imei;


        /**
         * Service provider for the SIM card in the
         * client device
         */
        private String serviceOperator;


        /**
         * SIM card identification number inserted
         * into the client device
         */
        private String simId;


        public static Builder newInstance()
        {
            return new Builder();
        }

    }

}
