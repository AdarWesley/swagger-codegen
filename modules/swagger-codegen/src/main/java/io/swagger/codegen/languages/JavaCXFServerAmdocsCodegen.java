
package io.swagger.codegen.languages;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.codegen.CliOption;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenOperation;
import io.swagger.codegen.CodegenProperty;
import io.swagger.codegen.SupportingFile;
import io.swagger.codegen.languages.features.CXFServerFeatures;
import io.swagger.codegen.languages.features.GzipTestFeatures;
import io.swagger.codegen.languages.features.LoggingTestFeatures;
import io.swagger.codegen.languages.features.UseGenericResponseFeatures;
import io.swagger.models.Operation;

public class JavaCXFServerAmdocsCodegen extends JavaCXFServerCodegen
{
    public JavaCXFServerAmdocsCodegen()
    {
        super();

        apiTemplateFiles.remove("apiServiceImpl.mustache");
        
        embeddedTemplateDir = templateDir = JAXRS_TEMPLATE_DIRECTORY_NAME + File.separator + "amdocs-cxf";
        
        //setUseAnnotatedBasePath(true);
    }

    @Override
    public void processOpts() {
    	super.processOpts();
    	setUseAnnotatedBasePath(true);
    }
    
    @Override
    public String getName()
    {
        return "jaxrs-cxf-amdocs";
    }
}
