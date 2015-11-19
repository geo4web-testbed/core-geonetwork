/**
 * 
 */
package org.schema;

import java.util.Date;

/**
 * 
 * https://schema.org/Dataset
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class DataSet extends CreativeWork {
    /**
     * The range of temporal applicability of a dataset, e.g.for a 2011 census
     * dataset, the year 2011( in ISO 8601 time interval format). Supersedes
     * temporal.
     */
    private Date datasetTimeInterval;

    /**
     * A downloadable form of this dataset, at a specific location, in a
     * specific format.
     */
    private DataDownload distribution;
    /**
     * A data catalog contained in the dataset.Supersedes catalog.
     */
    private DataCatalog includedDataCatalog;

    /**
     * 
     * The range of spatial applicability of a dataset, e.g.for a dataset of New
     * York weather, the state of New York.
     */
    private Place spatial;

    public Date getDatasetTimeInterval() {
        return datasetTimeInterval;
    }

    public void setDatasetTimeInterval(Date datasetTimeInterval) {
        this.datasetTimeInterval = datasetTimeInterval;
    }

    public DataDownload getDistribution() {
        return distribution;
    }

    public void setDistribution(DataDownload distribution) {
        this.distribution = distribution;
    }

    public DataCatalog getIncludedDataCatalog() {
        return includedDataCatalog;
    }

    public void setIncludedDataCatalog(DataCatalog includedDataCatalog) {
        this.includedDataCatalog = includedDataCatalog;
    }

    public Place getSpatial() {
        return spatial;
    }

    public void setSpatial(Place spatial) {
        this.spatial = spatial;
    }
}
