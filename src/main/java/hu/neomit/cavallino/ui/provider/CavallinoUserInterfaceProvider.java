package hu.neomit.cavallino.ui.provider;

import hu.commit.prodigium.Named;
import hu.commit.prodigium.base.Array;
import hu.commit.prodigium.base.JSCollections;
import hu.commit.prodigium.base.Log;
import hu.commit.prodigium.base.modules.Module;
import hu.commit.prodigium.base.reactivity.ConnectTo;
import hu.commit.prodigium.base.ui.ResourceLinkHandler;
import hu.commit.prodigium.base.ui.UIElements;
import hu.commit.prodigium.base.ui.UserInterfaceTemplate;
import hu.commit.prodigium.base.ui.UserInterfaceTemplateProvider;
import hu.commit.prodigium.base.ui.elements.UserInterfaceElement;
import hu.commit.prodigium.base.ui.link.LinkHandler;
import hu.commit.prodigium.modules.pdsystem.db.mapping.pdsystem_systembase.Pd_modules;
import hu.commit.prodigium.modules.prodigium_sc.base.ui.ProdigiumSmartClientScreen;
import org.jetbrains.annotations.NotNull;
import org.stjs.javascript.Map;

@Named("CavallinoUserInterfaceProvider")
@ConnectTo("cavallino")
public class CavallinoUserInterfaceProvider extends ProdigiumSmartClientScreen {

    private final String cavallinoModuleName;

    @SuppressWarnings("unchecked")
    @NotNull
    @Override
    protected Array<String> getClientModules() {
        return  ((Array<String>) Pd_modules.table.getByKey(cavallinoModuleName).modinfo.$get("dependency"))
                .concat(JSCollections.array(cavallinoModuleName));

    }

    public CavallinoUserInterfaceProvider() {
        cavallinoModuleName = Module.getModuleName(CavallinoUserInterfaceProvider.class);;
    }

    @Override
    protected UserInterfaceElement createPageFooterPart(ResourceLinkHandler resourceHandler, String sc_module, String module, String page, Map<String, Object> parameters) {
        return UIElements.part(resourceHandler, cavallinoModuleName, "templates", "foot.hb");
    }

    @Override
    protected UserInterfaceElement createPageLoadingIndicatorPart(ResourceLinkHandler resourceHandler, String sc_module, String module, String page, Map<String, Object> parameters) {
        return UIElements.part(resourceHandler, cavallinoModuleName, "templates", "load_indicator.hb");

    }


    @Override
    protected UserInterfaceElement createMainCSSLink(ResourceLinkHandler resourceHandler, String sc_module, String module, String page, Map<String, Object> parameters) {
            return UIElements.cssLink(resourceHandler.db(cavallinoModuleName, "stylesheet/main.css"));
    }

    @Override
    public Array<UserInterfaceTemplate> render(LinkHandler linkHandler, ResourceLinkHandler resourceHandler, String module, String page, Map<String, Object> parameters, Map<String, Object> formData, Map<String, Object> authInfo) {
        return super.render(linkHandler, resourceHandler, module, page, parameters, formData, authInfo);
    }
}
