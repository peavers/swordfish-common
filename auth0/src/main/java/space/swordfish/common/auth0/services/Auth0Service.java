package space.swordfish.common.auth0.services;

import com.auth0.json.mgmt.users.User;

import java.util.Map;

public interface Auth0Service {

    String getUserIdFromToken(String token);

    String getUserName(String userId);

    String getUserProfilePicture(String userId);

    String getEncryptedUserMetaByKey(String userId, String key);

    void setEncryptedUserMetaData(String userId, Map<String, Object> data);

    String getUserMetaByKey(String userId, String key);

    void setUserMetaData(String userId, Map<String, Object> data);

    User getUser(String userId);

    Iterable<User> getAllUsers();

    void updateUser(String userId, User data);
}