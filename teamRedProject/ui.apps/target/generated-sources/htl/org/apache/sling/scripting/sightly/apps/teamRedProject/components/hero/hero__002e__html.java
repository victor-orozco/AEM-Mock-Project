/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.teamRedProject.components.hero;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class hero__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_commonstemplates = null;
Object _dynamic_properties = bindings.get("properties");
Object _global_hascontent = null;
out.write("\r\n");
_global_commonstemplates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_hascontent = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title")) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title") : renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description")));
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("<section class=\"cmp-hero\" id=\"header\">\r\n    <div class=\"container\">\r\n        <div class=\"d-flex flex-column justify-content-center cmp-hero__content\"");
    {
        String var_attrcontent0 = (("background-image: url(" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fileReference"), "unsafe"))) + ");");
        out.write(" style=\"");
        out.write(renderContext.getObjectModel().toString(var_attrcontent0));
        out.write("\"");
    }
    out.write(">\r\n            <p>");
    {
        Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "file"), "text");
        out.write(renderContext.getObjectModel().toString(var_1));
    }
    out.write("</p>\r\n            <p class=\"fw-bold cmp-hero__subtitle\">");
    {
        Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "subtitle"), "text");
        out.write(renderContext.getObjectModel().toString(var_2));
    }
    out.write("</p>\r\n            <h1 class=\"fw-bold cmp-hero__heading\">");
    {
        Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
        out.write(renderContext.getObjectModel().toString(var_3));
    }
    out.write("</h1>\r\n            <p class=\"cmp-hero__text\">");
    {
        Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
        out.write(renderContext.getObjectModel().toString(var_4));
    }
    out.write("</p>\r\n            ");
    {
        Object var_testvariable5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "button");
        if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
            out.write("<button type=\"button\" class=\"btn btn-primary cmp-quote__btn\">");
            {
                Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "button"), "text");
                out.write(renderContext.getObjectModel().toString(var_6));
            }
            out.write("</button>");
        }
    }
    out.write("\r\n        </div>\r\n    </div>\r\n</section>");
}
out.write("\r\n");
{
    Object var_templatevar7 = renderContext.getObjectModel().resolveProperty(_global_commonstemplates, "placeholder");
    {
        boolean var_templateoptions8_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_hascontent));
        {
            java.util.Map var_templateoptions8 = obj().with("isEmpty", var_templateoptions8_field$_isempty);
            callUnit(out, renderContext, var_templatevar7, var_templateoptions8);
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

