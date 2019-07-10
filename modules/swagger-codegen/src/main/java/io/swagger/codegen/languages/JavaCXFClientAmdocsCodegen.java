
package io.swagger.codegen.languages;

import java.io.File;

public class JavaCXFClientAmdocsCodegen extends JavaCXFClientCodegen {

    public JavaCXFClientAmdocsCodegen()
    {
        super();

        apiTemplateFiles.put("apiConfig.mustache", "Config.java");
        
        embeddedTemplateDir = templateDir = JAXRS_TEMPLATE_DIRECTORY_NAME + File.separator + "amdocs-client-feign";
    }

    @Override
    public String getName()
    {
        return "jaxrs-cxf-client-amdocs";
    }
}
