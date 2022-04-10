package com.teamRedProject.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeaderModel {

    @Inject
    private Resource primaryLinks;

    @Inject
    private Resource secondaryLinks;

    @ValueMapValue
    private String logoReference;

    @ValueMapValue
    private String logoLink;

    public Resource getPrimaryLinks() {
        return primaryLinks;
    }

    public Resource getSecondaryLinks() {
        return secondaryLinks;
    }

    public String getLogoReference() {
        return logoReference;
    }

    public String getLogoLink() {
        return logoLink;
    }
}
