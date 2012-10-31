package org.jumpmind.symmetric.web.rest;

public class ChannelStatus {

    /**
     * The ID or name of the channel. (e.g., 'employee')
     */
	String channelId;

	/**
	 * Is the channel enabled. Disabling the channel prevents all communication on the channel.
	 */
	boolean enabled;

	/**
	 * An outgoing batch is in error.
	 */
	boolean outgoingError;

	/**
	 * An incoming batch is in error.
	 */
	boolean incomingError;

	/**
	 * The number of batches waiting to be sent.
	 */
	private int batchToSendCount;

	/**
	 * The number of batches in the error state.
	 */
	private int batchInErrorCount;

	/**
	 * @return The ID or name of the channel. (e.g., 'employee')
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId The ID or name of the channel. (e.g., 'employee')
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return Is the channel enabled. Disabling the channel prevents all communication on the channel.
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled Is the channel enabled. Disabling the channel prevents all communication on the channel.
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

    /**
     * @return An outgoing batch is in error.
     */
	public boolean isOutgoingError() {
		return outgoingError;
	}

    /**
     * @param enabled An outgoing batch is in error.
     */
	public void setOutgoingError(boolean outgoingError) {
		this.outgoingError = outgoingError;
	}

    /**
     * @return An incoming batch is in error.
     */
	public boolean isIncomingError() {
		return incomingError;
	}

    /**
     * @param enabled An incoming batch is in error.
     */
	public void setIncomingError(boolean incomingError) {
		this.incomingError = incomingError;
	}

    /**
     * @return The number of batches waiting to be sent.
     */
	public int getBatchToSendCount() {
		return batchToSendCount;
	}

    /**
     * @param enabled The number of batches waiting to be sent.
     */
	public void setBatchToSendCount(int batchToSendCount) {
		this.batchToSendCount = batchToSendCount;
	}

    /**
     * @return The number of batches in the error state.
     */
	public int getBatchInErrorCount() {
		return batchInErrorCount;
	}

    /**
     * @param enabled The number of batches in the error state.
     */
	public void setBatchInErrorCount(int batchInErrorCount) {
		this.batchInErrorCount = batchInErrorCount;
	}

}