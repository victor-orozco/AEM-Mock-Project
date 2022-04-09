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
package org.apache.sling.scripting.sightly.apps.teamRedProject.components.multicard;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class multicard__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_commonstemplates = null;
Object _global_showcomponent = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_model = renderContext.call("use", com.teamRedProject.core.models.MultiCardModel.class.getName(), obj());
out.write("\r\n");
_global_commonstemplates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_showcomponent = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "cards"), "listChildren");
if (renderContext.getObjectModel().toBoolean(_global_showcomponent)) {
    {
        Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "cards"), "listChildren");
        {
            long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
            {
                boolean var_notempty2 = (var_size1 > 0);
                if (var_notempty2) {
                    {
                        long var_end5 = var_size1;
                        {
                            boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                            if (var_validstartstepend6) {
                                out.write("<div class=\"row cmp-resources__multicard-container\">");
                                if (var_collectionvar0_list_coerced$ == null) {
                                    var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                                }
                                long var_index7 = 0;
                                for (Object item : var_collectionvar0_list_coerced$) {
                                    {
                                        boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                        if (var_traversal9) {
                                            out.write("\r\n    <div class=\"col-md-6\">\r\n        <div class=\"cmp-resources__card\">\r\n            <p class=\"cmp-resources__card-heading\">");
                                            {
                                                Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_10));
                                            }
                                            out.write("</p>\r\n            <p class=\"cmp-resources__card-text\">");
                                            {
                                                Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "description"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_11));
                                            }
                                            out.write("</p>\r\n            <div>\r\n                <a href=\"#one\" class=\"btn btn-primary fw-bold cmp-resources__card-btn\">");
                                            {
                                                Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "buttonPrimary"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_12));
                                            }
                                            out.write("</a>\r\n            </div>\r\n            <div>\r\n                <a href=\"#two\" class=\"cmp-resources__card-link\">");
                                            {
                                                Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "buttonSecondary"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_13));
                                            }
                                            out.write("</a>\r\n            </div>\r\n        </div>\r\n    </div>\r\n");
                                        }
                                    }
                                    var_index7++;
                                }
                                out.write("</div>");
                            }
                        }
                    }
                }
            }
        }
        var_collectionvar0_list_coerced$ = null;
    }
}
out.write("\r\n");
{
    Object var_templatevar14 = renderContext.getObjectModel().resolveProperty(_global_commonstemplates, "placeholder");
    {
        boolean var_templateoptions15_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_showcomponent));
        {
            java.util.Map var_templateoptions15 = obj().with("isEmpty", var_templateoptions15_field$_isempty);
            callUnit(out, renderContext, var_templatevar14, var_templateoptions15);
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

