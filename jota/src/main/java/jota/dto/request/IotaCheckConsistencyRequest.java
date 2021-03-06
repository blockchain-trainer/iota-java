package jota.dto.request;

import jota.IotaAPICommands;

/**
 * This class represents the core api request 'checkConsistency'.
 **/
public class IotaCheckConsistencyRequest extends IotaCommandRequest {

    private String[] tails;

    /**
     * Initializes a new instance of the IotaCheckConsistencyRequest class.
     * @param tails
     */
    private IotaCheckConsistencyRequest(final String... tails) {
        super(IotaAPICommands.CHECK_CONSISTENCY);
        this.tails = tails;
    }

    /**
     * Initializes a new instance of the IotaCheckConsistencyRequest class.
     * @param tails
     * @return the instance
     */
    public static IotaCheckConsistencyRequest create(final String... tails) {
        return new IotaCheckConsistencyRequest(tails);
    }

    /**
     * Gets the tails.
     *
     * @return The tails.
     */
    public String[] getTails() {
        return tails;
    }

    /**
     * Sets the tails.
     *
     * @param tails The tails.
     */
    public void setTails(String[] tails) {
        this.tails = tails;
    }
}

