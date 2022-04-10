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
package org.apache.sling.scripting.sightly.apps.teamRedProject.components.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_template = null;
Object _global_showcomponent = null;
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar26_list_coerced$ = null;
out.write("\r\n");
_global_model = renderContext.call("use", com.teamRedProject.core.models.HeaderModel.class.getName(), obj());
out.write("\r\n");
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_showcomponent = ((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "logoReference")) ? renderContext.getObjectModel().resolveProperty(_global_model, "logoReference") : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren")))) ? ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "logoReference")) ? renderContext.getObjectModel().resolveProperty(_global_model, "logoReference") : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren"))) : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "secondaryLinks"), "listChildren")));
if (renderContext.getObjectModel().toBoolean(_global_showcomponent)) {
    out.write("<header class=\"cmp-header\">\r\n    <div class=\"cmp-header__main-nav\">\r\n        <div class=\"container\">\r\n            ");
    {
        Object var_testvariable7 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren");
        if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
            {
                Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren");
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
                                        out.write("<nav class=\"nav justify-content-end\">");
                                        if (var_collectionvar0_list_coerced$ == null) {
                                            var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                                        }
                                        long var_index8 = 0;
                                        for (Object item : var_collectionvar0_list_coerced$) {
                                            {
                                                boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end5)) && true);
                                                if (var_traversal10) {
                                                    out.write("\r\n                <a class=\"d-flex nav-link\" aria-current=\"page\"");
                                                    {
                                                        Object var_attrvalue11 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(item, "url"), obj().with("extension", "html"));
                                                        {
                                                            Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "uri");
                                                            {
                                                                boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
                                                                if (var_shoulddisplayattr14) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                                                                        if (!var_istrueattr13) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write(">\r\n                    ");
                                                    {
                                                        Object var_testvariable15 = renderContext.getObjectModel().resolveProperty(item, "icon");
                                                        if (renderContext.getObjectModel().toBoolean(var_testvariable15)) {
                                                            out.write("<span");
                                                            {
                                                                String var_attrcontent16 = ("cmp-header__icon-" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "icon"), "attribute")));
                                                                out.write(" class=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent16));
                                                                out.write("\"");
                                                            }
                                                            out.write("></span>");
                                                        }
                                                    }
                                                    {
                                                        String var_17 = (("\r\n                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text"))) + "\r\n                ");
                                                        out.write(renderContext.getObjectModel().toString(var_17));
                                                    }
                                                    out.write("</a>\r\n            ");
                                                }
                                            }
                                            var_index8++;
                                        }
                                        out.write("</nav>");
                                    }
                                }
                            }
                        }
                    }
                }
                var_collectionvar0_list_coerced$ = null;
            }
        }
    }
    out.write("\r\n        </div>\r\n    </div>\r\n    <div class=\"cmp-header__secondary-nav\">\r\n        <nav class=\"navbar navbar-expand-lg navbar-light p-0\">\r\n            <div class=\"container\">\r\n                <a class=\"navbar-brand\"");
    {
        Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(_global_model, "logoLink");
        {
            Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "uri");
            {
                boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (!((Object)false).equals(var_attrvalue18))));
                if (var_shoulddisplayattr21) {
                    out.write(" href");
                    {
                        boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                        if (!var_istrueattr20) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(">\r\n                    <img");
    {
        Object var_attrvalue22 = renderContext.getObjectModel().resolveProperty(_global_model, "logoReference");
        {
            Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "uri");
            {
                boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (!((Object)false).equals(var_attrvalue22))));
                if (var_shoulddisplayattr25) {
                    out.write(" src");
                    {
                        boolean var_istrueattr24 = (var_attrvalue22.equals(true));
                        if (!var_istrueattr24) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent23));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(" alt=\"Jolt\" class=\"img-fluid cmp-header__logo\"/>\r\n                </a>\r\n                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n                    <span class=\"navbar-toggler-icon\"></span>\r\n                </button>\r\n                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n                    ");
    {
        Object var_testvariable33 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "secondaryLinks"), "listChildren");
        if (renderContext.getObjectModel().toBoolean(var_testvariable33)) {
            {
                Object var_collectionvar26 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "secondaryLinks"), "listChildren");
                {
                    long var_size27 = ((var_collectionvar26_list_coerced$ == null ? (var_collectionvar26_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar26)) : var_collectionvar26_list_coerced$).size());
                    {
                        boolean var_notempty28 = (var_size27 > 0);
                        if (var_notempty28) {
                            {
                                long var_end31 = var_size27;
                                {
                                    boolean var_validstartstepend32 = (((0 < var_size27) && true) && (var_end31 > 0));
                                    if (var_validstartstepend32) {
                                        out.write("<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">");
                                        if (var_collectionvar26_list_coerced$ == null) {
                                            var_collectionvar26_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar26);
                                        }
                                        long var_index34 = 0;
                                        for (Object item : var_collectionvar26_list_coerced$) {
                                            {
                                                boolean var_traversal36 = (((var_index34 >= 0) && (var_index34 <= var_end31)) && true);
                                                if (var_traversal36) {
                                                    out.write("\r\n                        <li class=\"nav-item\">\r\n                            <a class=\"nav-link\" aria-current=\"page\"");
                                                    {
                                                        Object var_attrvalue37 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(item, "url"), obj().with("extension", "html"));
                                                        {
                                                            Object var_attrcontent38 = renderContext.call("xss", var_attrvalue37, "uri");
                                                            {
                                                                boolean var_shoulddisplayattr40 = (((null != var_attrcontent38) && (!"".equals(var_attrcontent38))) && ((!"".equals(var_attrvalue37)) && (!((Object)false).equals(var_attrvalue37))));
                                                                if (var_shoulddisplayattr40) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr39 = (var_attrvalue37.equals(true));
                                                                        if (!var_istrueattr39) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent38));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write(">");
                                                    {
                                                        Object var_41 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text");
                                                        out.write(renderContext.getObjectModel().toString(var_41));
                                                    }
                                                    out.write("</a>\r\n                        </li>\r\n                    ");
                                                }
                                            }
                                            var_index34++;
                                        }
                                        out.write("</ul>");
                                    }
                                }
                            }
                        }
                    }
                }
                var_collectionvar26_list_coerced$ = null;
            }
        }
    }
    out.write("\r\n                </div>\r\n            </div>\r\n        </nav>\r\n    </div>\r\n</header>");
}
out.write("\r\n");
{
    Object var_templatevar42 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions43_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_showcomponent));
        {
            java.util.Map var_templateoptions43 = obj().with("isEmpty", var_templateoptions43_field$_isempty);
            callUnit(out, renderContext, var_templatevar42, var_templateoptions43);
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

