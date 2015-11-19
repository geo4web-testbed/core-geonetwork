/**
 * 
 */
package org.schema;

/**
 * 
 * 
 * https://schema.org/Map
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class Map extends CreativeWork {

    /**
     * Indicates the kind of Map, from the MapCategoryType Enumeration.
     */
    private MapCategoryType mapType;

    public MapCategoryType getMapType() {
        return mapType;
    }

    public void setMapType(MapCategoryType mapType) {
        this.mapType = mapType;
    }
}
