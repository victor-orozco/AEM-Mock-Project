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
package org.apache.sling.scripting.sightly.apps.teamRedProject.components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

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
Collection var_collectionvar16_list_coerced$ = null;
Collection var_collectionvar32_list_coerced$ = null;
out.write("\r\n");
_global_model = renderContext.call("use", com.teamRedProject.core.models.FooterModel.class.getName(), obj());
out.write("\r\n");
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_showcomponent = ((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren")) ? renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren") : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "socialLinks"), "listChildren")))) ? ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren")) ? renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren") : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "socialLinks"), "listChildren"))) : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "secondaryLinks"), "listChildren")))) ? ((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren")) ? renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren") : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "socialLinks"), "listChildren")))) ? ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren")) ? renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "primaryLinks"), "listChildren") : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "socialLinks"), "listChildren"))) : renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "secondaryLinks"), "listChildren"))) : renderContext.getObjectModel().resolveProperty(_global_model, "copyright")));
if (renderContext.getObjectModel().toBoolean(_global_showcomponent)) {
    out.write("<footer class=\"cmp-footer\">\r\n    <div class=\"container\">\r\n        <div class=\"cmp-footer__main-nav\">\r\n            <div class=\"row\">\r\n                <div class=\"col-lg-7\">\r\n                    ");
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
                                        out.write("<nav class=\"nav\">");
                                        if (var_collectionvar0_list_coerced$ == null) {
                                            var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                                        }
                                        long var_index8 = 0;
                                        for (Object item : var_collectionvar0_list_coerced$) {
                                            {
                                                boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end5)) && true);
                                                if (var_traversal10) {
                                                    out.write("\r\n                        <a class=\"nav-link p-0\"");
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
                                                    out.write(">");
                                                    {
                                                        Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text");
                                                        out.write(renderContext.getObjectModel().toString(var_15));
                                                    }
                                                    out.write("</a>\r\n                    ");
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
    out.write("\r\n                </div>\r\n                <div class=\"col-lg-5\">\r\n                    ");
    {
        Object var_testvariable23 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "socialLinks"), "listChildren");
        if (renderContext.getObjectModel().toBoolean(var_testvariable23)) {
            {
                Object var_collectionvar16 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "socialLinks"), "listChildren");
                {
                    long var_size17 = ((var_collectionvar16_list_coerced$ == null ? (var_collectionvar16_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar16)) : var_collectionvar16_list_coerced$).size());
                    {
                        boolean var_notempty18 = (var_size17 > 0);
                        if (var_notempty18) {
                            {
                                long var_end21 = var_size17;
                                {
                                    boolean var_validstartstepend22 = (((0 < var_size17) && true) && (var_end21 > 0));
                                    if (var_validstartstepend22) {
                                        out.write("<ul class=\"list-inline d-lg-flex justify-content-end\">");
                                        if (var_collectionvar16_list_coerced$ == null) {
                                            var_collectionvar16_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar16);
                                        }
                                        long var_index24 = 0;
                                        for (Object item : var_collectionvar16_list_coerced$) {
                                            {
                                                boolean var_traversal26 = (((var_index24 >= 0) && (var_index24 <= var_end21)) && true);
                                                if (var_traversal26) {
                                                    out.write("\r\n                        <li class=\"list-inline-item\">\r\n                            <a");
                                                    {
                                                        Object var_attrvalue27 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(item, "url"), obj().with("extension", "html"));
                                                        {
                                                            Object var_attrcontent28 = renderContext.call("xss", var_attrvalue27, "uri");
                                                            {
                                                                boolean var_shoulddisplayattr30 = (((null != var_attrcontent28) && (!"".equals(var_attrcontent28))) && ((!"".equals(var_attrvalue27)) && (!((Object)false).equals(var_attrvalue27))));
                                                                if (var_shoulddisplayattr30) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr29 = (var_attrvalue27.equals(true));
                                                                        if (!var_istrueattr29) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent28));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write(">\r\n                                <span");
                                                    {
                                                        String var_attrcontent31 = ("d-block cmp-footer__icon cmp-footer__icon-" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "icon"), "attribute")));
                                                        out.write(" class=\"");
                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent31));
                                                        out.write("\"");
                                                    }
                                                    out.write("></span>\r\n                            </a>\r\n                        </li>\r\n                    ");
                                                }
                                            }
                                            var_index24++;
                                        }
                                        out.write("</ul>");
                                    }
                                }
                            }
                        }
                    }
                }
                var_collectionvar16_list_coerced$ = null;
            }
        }
    }
    out.write("\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div class=\"cmp-footer__secondary-nav\">\r\n            ");
    {
        Object var_testvariable39 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "secondaryLinks"), "listChildren");
        if (renderContext.getObjectModel().toBoolean(var_testvariable39)) {
            {
                Object var_collectionvar32 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "secondaryLinks"), "listChildren");
                {
                    long var_size33 = ((var_collectionvar32_list_coerced$ == null ? (var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32)) : var_collectionvar32_list_coerced$).size());
                    {
                        boolean var_notempty34 = (var_size33 > 0);
                        if (var_notempty34) {
                            {
                                long var_end37 = var_size33;
                                {
                                    boolean var_validstartstepend38 = (((0 < var_size33) && true) && (var_end37 > 0));
                                    if (var_validstartstepend38) {
                                        out.write("<nav class=\"cmp-navigation__nav nav\">");
                                        if (var_collectionvar32_list_coerced$ == null) {
                                            var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32);
                                        }
                                        long var_index40 = 0;
                                        for (Object item : var_collectionvar32_list_coerced$) {
                                            {
                                                boolean var_traversal42 = (((var_index40 >= 0) && (var_index40 <= var_end37)) && true);
                                                if (var_traversal42) {
                                                    out.write("\r\n                <a class=\"nav-link p-0\"");
                                                    {
                                                        Object var_attrvalue43 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(item, "url"), obj().with("extension", "html"));
                                                        {
                                                            Object var_attrcontent44 = renderContext.call("xss", var_attrvalue43, "uri");
                                                            {
                                                                boolean var_shoulddisplayattr46 = (((null != var_attrcontent44) && (!"".equals(var_attrcontent44))) && ((!"".equals(var_attrvalue43)) && (!((Object)false).equals(var_attrvalue43))));
                                                                if (var_shoulddisplayattr46) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr45 = (var_attrvalue43.equals(true));
                                                                        if (!var_istrueattr45) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent44));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write(">");
                                                    {
                                                        Object var_47 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text");
                                                        out.write(renderContext.getObjectModel().toString(var_47));
                                                    }
                                                    out.write("</a>\r\n            ");
                                                }
                                            }
                                            var_index40++;
                                        }
                                        out.write("</nav>");
                                    }
                                }
                            }
                        }
                    }
                }
                var_collectionvar32_list_coerced$ = null;
            }
        }
    }
    out.write("\r\n        </div>\r\n        <div class=\"cmp-footer__copyright\">");
    {
        Object var_48 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "copyright"), "text");
        out.write(renderContext.getObjectModel().toString(var_48));
    }
    out.write("</div>\r\n    </div>\r\n</footer>");
}
out.write("\r\n");
{
    Object var_templatevar49 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions50_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_showcomponent));
        {
            java.util.Map var_templateoptions50 = obj().with("isEmpty", var_templateoptions50_field$_isempty);
            callUnit(out, renderContext, var_templatevar49, var_templateoptions50);
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

