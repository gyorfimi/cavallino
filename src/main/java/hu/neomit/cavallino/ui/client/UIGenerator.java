package hu.neomit.cavallino.ui.client;

import hu.commit.prodigium.base.rpc.client.RPCPublicServiceRef;
import hu.commit.prodigium.modules.prodigium_sc.client.Authentication;
import hu.commit.prodigium.modules.prodigium_sc.client.Router;
import hu.commit.prodigium.modules.prodigium_sc.client.rpc.ProdigiumRPCManager;
import hu.commit.prodigium.modules.prodigium_sc.client.rpc.RPC;
import hu.commit.prodigium.modules.prodigium_sc.client.smartclient.stjs.*;
import org.stjs.javascript.Global;

/**
 */
public class UIGenerator {

    public static UIGenerator generator;
    public final VLayout baseLayout;


    public UIGenerator() {
        baseLayout = new VLayout();
        baseLayout.setWidth("100%");
        baseLayout.setHeight("100%");
        Authentication.setAuthenticationRealm("CAVALLINO");
        ProdigiumRPCManager.sendJSON(null, (resp, resholder, req) -> {

            Global.console.debug(resholder.response);

        },Router.prodigium_rpc.controllers.RPCHandler.authInfo().url,null);

    }

    public static void generateUserInterface() {

        UIGenerator generator = new UIGenerator();

/*
        Layout baseLayout = new HLayout();
        baseLayout.setAlign("center");
        baseLayout.setWidth("100%");
        baseLayout.setHeight("100%");
        Layout loginPlace = new VLayout();
        loginPlace.setAlign("top");
        Img logoImage = new Img();
        logoImage.setSrc(Router.prodigium_rpc.controllers.PublicAssets.fsFile("pictures", "logo.png").url);
        logoImage.setImageHeight(200);
        logoImage.setImageWidth(200);
        logoImage.setImageType(ImageStyle.NORMAL);
        loginPlace.addMember(logoImage, null);
        baseLayout.addMember(loginPlace, null);


        baseLayout.draw();
*/
    }
}
