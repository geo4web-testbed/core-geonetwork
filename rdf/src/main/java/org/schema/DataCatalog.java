/**
 * 
 */
package org.schema;

import java.util.List;

/**
 * 
 * https://schema.org/DataCatalog
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class DataCatalog extends CreativeWork {

    /**
     * A dataset contained in a catalog.
     */
    private List<DataSet> dataset;

    public List<DataSet> getDataset() {
        return dataset;
    }

    public void setDataset(List<DataSet> dataset) {
        this.dataset = dataset;
    }
}
