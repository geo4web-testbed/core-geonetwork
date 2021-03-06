package org.fao.geonet.services.metadata.format.groovy;

import org.fao.geonet.services.region.GetMap;

/**
 * Encapsulates the map parameters used when making {@link org.fao.geonet.services.region.GetMap} requests.
 *
 * The parameters are read from the setting (background, width and mapproj) and are to be used when displaying geometries and extents.
 *
 * @author Jesse on 12/19/2014.
 */
public class MapConfig {
    private String background, mapproj;
    private int width, thumbnailWidth;

    public MapConfig(String background, String mapproj, int width, int thumbnailWidth) {
        this.background = background;
        this.mapproj = mapproj;
        this.width = width;
        this.thumbnailWidth = thumbnailWidth;
    }

    /**
     * The value to pass as the <em>background</em> parameter when making a request to {@link org.fao.geonet.services.region.GetMap}
     * when rendering extents and geometries.
     */
    public String getBackground() {
        return background.toLowerCase().startsWith("http://") ? GetMap.SETTING_BACKGROUND : background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    /**
     * The projection of the map.
     */
    public String getMapproj() {
        return mapproj;
    }

    public void setMapproj(String mapproj) {
        this.mapproj = mapproj;
    }

    /**
     * The width in pixels of the map image.
     */
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * The width in pixels of the map if the map is to be a small thumbnail.
     */
    public int getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }
}
