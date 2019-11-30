package af.asr.youtap.util;

import java.util.HashMap;
import java.util.Map;


public class AuthData {

    /**
     * Threshold amount above which the ID
     * specified in CTALId needs to be requested.
     */
    private Map<String, Double> CTALAmount;
    private Map<String, Double> CTALId;


    public AuthData(Builder builder)
    {
        this.CTALAmount = builder.CTALAmount;
        this.CTALId = builder.CTALId;
    }

    public static class Builder {

        private Map<String, Double> CTALAmount = new HashMap<>();
        private Map<String, Double> CTALId = new HashMap<>();


        public static Builder newInstance()
        {
            return new Builder();
        }
        

    }


}
