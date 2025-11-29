package org.Sam.RedisChannelData.messages.Utils;

public class ServerIdToAuthChannelName {

    public static String serverIdToAuthChannelName(String serverID) {
        return serverID + "_auth_channel";
    }
}
