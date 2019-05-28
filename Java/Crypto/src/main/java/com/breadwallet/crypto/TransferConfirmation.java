package com.breadwallet.crypto;

import com.breadwallet.crypto.Amount;

public final class TransferConfirmation {

    public final long blockNumber;
    public final long transactionIndex;
    public final long timestamp;
    public final Amount fee;

    public TransferConfirmation(long blockNumber, long transactionIndex, long timestamp, Amount fee) {
        this.blockNumber = blockNumber;
        this.transactionIndex = transactionIndex;
        this.timestamp = timestamp;
        this.fee = fee;
    }
}