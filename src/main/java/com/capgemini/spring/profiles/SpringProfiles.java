package com.capgemini.spring.profiles;

/**
 * A class that defines standard spring profiles
 *
 * @author Abbas Attarwala
 * @author Andrew Harmel-Law
 */
public interface SpringProfiles {

    /**
     * The 'default' profile would be expected to use prod-like dependencies for everything
     */
    String DEFAULT_PROFILE_NAME = "default";

    /**
     * The 'stubbed' profile would be expected to use stubbed (i.e. local) service activators
     */
    String STUBBED_PROFILE_NAME = "stubbed";

    /**
     * The 'simulateFailure' profile is used when service activators are expected to simulate backend systems failures.
     */
    String SIMULATE_FAILURE_PROFIL_NAME = "simulateFailure";

    /**
     * The 'embeddedAMQ' profile would be expected to use embedded ActiveMQ but prod-like everything else
     */
    String EMBEDDED_AMQ_PROFILE_NAME = "embeddedAMQ";

    /**
     * The 'noDB' profile would be expected to use stubbed services to save and retrieve all data
     */
    String NO_DB = "noDB";
}
