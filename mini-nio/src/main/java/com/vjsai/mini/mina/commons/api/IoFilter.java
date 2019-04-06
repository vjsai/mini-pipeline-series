package com.vjsai.mini.mina.commons.api;

import com.vjsai.mini.mina.exceptions.NioBaseWriteException;

import java.io.IOException;

public interface IoFilter {
    /**
     *
     * @param session
     * @param filterBytes
     * @return
     * @throws IOException
     */
    byte[] filterReceive(IoStateSession session, byte[] filterBytes) throws  IOException;

    /**
     * write Filter
     * @param session
     * @param writeBytes
     * @return
     * @throws NioBaseWriteException
     * @throws IOException
     */
    byte[] writeFilter(IoStateSession session, byte[] writeBytes) throws NioBaseWriteException, IOException;

    /**
     * Removes the filter
     */
    void removeFilter();

}
