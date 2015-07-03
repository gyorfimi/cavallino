package hu.neomit.cavallino.ui.client;

import hu.commit.prodigium.modules.prodigium_sc.client.Router;
import hu.commit.prodigium.modules.prodigium_sc.client.smartclient.stjs.*;

/**
 */
public class UIGenerator {

    public static void generateUserInterface() {
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

    }
}
