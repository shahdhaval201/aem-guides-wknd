package com.adobe.aem.guides.wknd.core.models.impl;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.*;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.DistanceTravel;

@Model(
    adaptables = SlingHttpServletRequest.class,
    adapters = DistanceTravel.class,
    resourceType = DistanceTravelImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class DistanceTravelImpl implements DistanceTravel {

    protected static final String RESOURCE_TYPE = "wknd/components/distancetravel";

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String leftImage;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String leftTitle;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String rightImage;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String rightTitle;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String distance;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String travelTime;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String bottomLeftLabel;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String bottomLeftValue;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String bottomRightLabel;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String bottomRightValue;

    @ValueMapValue @Default(values = StringUtils.EMPTY)
    private String hideComponent;

    @PostConstruct
    protected void init() {}

    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getLeftImage() { return leftImage; }
    public String getLeftTitle() { return leftTitle; }
    public String getRightImage() { return rightImage; }
    public String getRightTitle() { return rightTitle; }
    public String getDistance() { return distance; }
    public String getTravelTime() { return travelTime; }
    public String getBottomLeftLabel() { return bottomLeftLabel; }
    public String getBottomLeftValue() { return bottomLeftValue; }
    public String getBottomRightLabel() { return bottomRightLabel; }
    public String getBottomRightValue() { return bottomRightValue; }
    public String getHideComponent() { return hideComponent; }
}