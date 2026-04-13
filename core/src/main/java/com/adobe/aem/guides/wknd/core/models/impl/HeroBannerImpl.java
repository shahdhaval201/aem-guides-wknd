package com.adobe.aem.guides.wknd.core.models.impl;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.guides.wknd.core.models.HeroBanner;

@Model(adaptables = SlingHttpServletRequest.class, adapters = HeroBanner.class, resourceType = HeroBannerImpl.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeroBannerImpl implements HeroBanner {

    protected static final String RESOURCE_TYPE = "wknd/components/herobanner";

    private static final Logger LOGGER = LoggerFactory.getLogger(HeroBannerImpl.class);

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String subtitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String image;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String foregroundImage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String buttonText1;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String buttonLink1;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String buttonText2;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String buttonLink2;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideComponent;

    @PostConstruct
    protected void init() {
        LOGGER.debug("HeroBanner initialized - title: {}", title);
    }

    // =========================
    // Getters
    // =========================

    @Override
    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
    return subtitle;
}

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public String getForegroundImage() {
        return foregroundImage;
    }

    @Override
    public String getButtonText1() {
        return buttonText1;
    }

    @Override
    public String getButtonLink1() {
        return buttonLink1;
    }

    @Override
    public String getButtonText2() {
        return buttonText2;
    }

    @Override
    public String getButtonLink2() {
        return buttonLink2;
    }

    public String getHideComponent() {
        return hideComponent;
    }

}
