package hu.neomit.cavallino.security;

import hu.commit.prodigium.Named;
import hu.commit.prodigium.base.rpc.authentication.AuthenticationRealm;
import hu.commit.prodigium.base.rpc.authentication.AuthenticationResult;
import hu.commit.prodigium.base.rpc.authentication.results.ValidAuthenticationUsePassword;

import javax.annotation.Nullable;

/**

 */
@Named("CavallinoAuthenticationRealm")
public class Authenticator implements AuthenticationRealm {
    @Nullable
    @Override
    public AuthenticationResult authenticate(String realm, String userName, String password) {
        if ("CAVALLINO".equals(realm)) {
           if ("postgres".equals(userName)) {
               return new ValidAuthenticationUsePassword(userName, password);
           } else {

           }
        }
        return null;
    }
}
