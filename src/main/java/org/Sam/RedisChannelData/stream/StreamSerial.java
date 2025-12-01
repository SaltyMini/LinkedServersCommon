package org.Sam.RedisChannelData.stream;

import io.lettuce.core.StreamMessage;
import org.Sam.ServerTypes;

import java.util.Map;

public class StreamSerial {

    public static Map<String, String> toStreamMessage(MoveIpStreamPacket packet, String requestId) {
        return Map.of(
                "requestId", requestId,
                "uuid", packet.UUID(),
                "destinationType", packet.destinationType().name()
        );
    }

    public static MoveIpStreamPacket fromStreamMessage(StreamMessage<String, String> msg) {
        Map<String, String> fields = msg.getBody();
        String uuid = fields.get("uuid");
        ServerTypes type = ServerTypes.valueOf(fields.get("destinationType"));
        return new MoveIpStreamPacket(uuid, type);
    }
}
