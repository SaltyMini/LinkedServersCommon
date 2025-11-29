package org.Sam.RedisChannelData.messages;

import org.Sam.ServerTypes;

public record StartupMessage(String serverID, String sessionID, ServerTypes serverType, int serverPort) {
}
