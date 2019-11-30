package af.asr.youtap.util.data;

/**
 * Aggregation of purse information extracted or to be written on the purse card.
 */
public class EPurseData {

    private String ePurseId;
    private String ePurseCurrency;
    private String ePurseBalance;
    private String ePurseCounter;


    public static class Builder{


        private String ePurseId;
        private String ePurseCurrency;
        private String ePurseBalance;
        private String ePurseCounter;


    }
}
