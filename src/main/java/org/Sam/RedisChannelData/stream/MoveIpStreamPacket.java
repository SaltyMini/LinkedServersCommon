package org.Sam.RedisChannelData.stream;

import org.Sam.ServerTypes;

/**
 * Data format to be used for when sending request to get destination IP from main server
 * @param UUID
 * @param destinationType
 */
public record MoveIpStreamPacket(String UUID, ServerTypes destinationType) {


}
