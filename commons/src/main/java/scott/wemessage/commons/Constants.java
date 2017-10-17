package scott.wemessage.commons;

public interface Constants {

    String WEMESSAGE_VERSION = "Beta 1.0";
    int WEMESSAGE_BUILD_VERSION = 3;
    int FIREBASE_NOTIFICATION_VERSION = 1;

    int DEFAULT_PORT = 22222;
    int MINIMUM_PASSWORD_LENGTH = 8;
    int MAX_FILE_SIZE = 262144000;
    int NOTIFICATION_MAX_CHAR_SIZE = 100;
    String DEFAULT_PASSWORD = "password";

    String JSON_INIT_CONNECT = "INIT CONNECT - ";
    String JSON_VERIFY_PASSWORD_SECRET = "VERIFY PASSWORD SECRET - ";
    String JSON_SUCCESSFUL_CONNECTION = "SUCCESSFUL CONNECTION - ";
    String JSON_CONNECTION_TERMINATED = "CONNECTION TERMINATED - ";
    String JSON_REGISTRATION_TOKEN = "REGISTRATION TOKEN - ";
    String JSON_NEW_MESSAGE = "NEW MESSAGE - ";
    String JSON_ACTION = "ACTION - ";
    String JSON_MESSAGE_UPDATED = "MESSAGE UPDATED - ";
    String JSON_RETURN_RESULT = "RETURN RESULT - ";

    int HTTP_FIREBASE_GENERIC_ERROR = 500;
    int HTTP_FIREBASE_UNSUPPORTED_NOTIFICATION_VERSION = 501;

    int DISCONNECT_REASON_ALREADY_CONNECTED = 3000;
    int DISCONNECT_REASON_INVALID_LOGIN = 3001;
    int DISCONNECT_REASON_SERVER_CLOSED = 3002;
    int DISCONNECT_REASON_ERROR = 3003;
    int DISCONNECT_REASON_FORCED = 3004;
    int DISCONNECT_REASON_CLIENT_QUIT = 3005;
    int DISCONNECT_REASON_INCORRECT_VERSION = 3006;

    int ACTION_SEND_MESSAGE = 4000;
    int ACTION_SEND_GROUP_MESSAGE = 4001;
    int ACTION_RENAME_GROUP = 4002;
    int ACTION_ADD_PARTICIPANT = 4003;
    int ACTION_REMOVE_PARTICIPANT = 4004;
    int ACTION_LEAVE_GROUP = 4005;
    int ACTION_CREATE_GROUP = 4006;

    int VERSION_MISMATCH = 998;
    int UNKNOWN_ERROR = 999;
    int SENT = 1000;
    int INVALID_NUMBER = 1004;
    int NUMBER_NOT_IMESSAGE = 1005;
    int GROUP_CHAT_NOT_FOUND = 1006;
    int NOT_SENT = 1008;
    int SERVICE_NOT_AVAILABLE = 1009;
    int FILE_NOT_FOUND = 1010;
    int NULL_MESSAGE = 1011;
    int ASSISTIVE_ACCESS_DISABLED = 1012;
    int UI_ERROR = 1013;
    int ACTION_PERFORMED = 1014;
}