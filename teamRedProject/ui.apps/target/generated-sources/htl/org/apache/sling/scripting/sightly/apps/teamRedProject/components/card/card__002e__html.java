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
package org.apache.sling.scripting.sightly.apps.teamRedProject.components.card;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class card__002e__html extends RenderUnit {

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
out.write("\n");
_global_commonstemplates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_showcomponent = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "cards"), "listChildren");
if (renderContext.getObjectModel().toBoolean(_global_showcomponent)) {
    out.write("<section class=\"cmp-resources\" id=\"card-list-section\">\n    <div class=\"container\">\n        <div class=\"row\">\n            <div class=\"col-md-8\">\n                <div class=\"row\">\n                    <div class=\"col-md-6\">\n                        ");
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
                                out.write("<div class=\"cmp-resources__card\">");
                                if (var_collectionvar0_list_coerced$ == null) {
                                    var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                                }
                                long var_index7 = 0;
                                for (Object item : var_collectionvar0_list_coerced$) {
                                    {
                                        boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                        if (var_traversal9) {
                                            out.write("\n                            <p class=\"cmp-resources__card-heading\">");
                                            {
                                                Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_10));
                                            }
                                            out.write("</p>\n                            <p class=\"cmp-resources__card-text \">");
                                            {
                                                Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "description"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_11));
                                            }
                                            out.write("</p>\n                            <div><a class=\"btn btn-primary fw-bold cmp-resources__card-btn\"");
                                            {
                                                Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(item, "link");
                                                {
                                                    Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
                                                    {
                                                        boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                                                        if (var_shoulddisplayattr15) {
                                                            out.write(" href");
                                                            {
                                                                boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                                                                if (!var_istrueattr14) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            out.write(">");
                                            {
                                                Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "buttonText"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_16));
                                            }
                                            out.write("</a></div>\n                            <div><a class=\"cmp-resources__card-link\"");
                                            {
                                                Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(item, "url");
                                                {
                                                    Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "uri");
                                                    {
                                                        boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                                                        if (var_shoulddisplayattr20) {
                                                            out.write(" href");
                                                            {
                                                                boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                                                                if (!var_istrueattr19) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            out.write(">");
                                            {
                                                String var_21 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "buttonText2"), "text")) + " >");
                                                out.write(renderContext.getObjectModel().toString(var_21));
                                            }
                                            out.write("</a></div>\n                        ");
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
    out.write("\n                    </div>\n                </div>\n           </div>\n        </div>\n    </div>\n</section>");
}
out.write("\n");
{
    Object var_templatevar22 = renderContext.getObjectModel().resolveProperty(_global_commonstemplates, "placeholder");
    {
        boolean var_templateoptions23_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_showcomponent));
        {
            java.util.Map var_templateoptions23 = obj().with("isEmpty", var_templateoptions23_field$_isempty);
            callUnit(out, renderContext, var_templatevar22, var_templateoptions23);
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

