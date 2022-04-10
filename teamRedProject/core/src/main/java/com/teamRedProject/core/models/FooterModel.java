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
public class FooterModel {
    @Inject
    private Resource primaryLinks;

    @Inject
    private Resource secondaryLinks;

    @Inject
    private Resource socialLinks;

    @ValueMapValue
    private String copyright;

    public Resource getPrimaryLinks() {
        return primaryLinks;
    }

    public Resource getSecondaryLinks() {
        return secondaryLinks;
    }

    public Resource getSocialLinks() {
        return socialLinks;
    }

    public String getCopyright() {
        return copyright;
    }
}
