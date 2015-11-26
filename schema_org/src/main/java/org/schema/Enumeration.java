/**
 * 
 */
package org.schema;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * 
 * https://schema.org/Enumeration
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class Enumeration extends Intangible {
    private Intangible supersededBy;

    public Intangible getSupersededBy() {
        return supersededBy;
    }

    public void setSupersededBy(Intangible supersededBy) {
        if (supersededBy instanceof Enumeration || supersededBy instanceof Class
                || supersededBy instanceof Property) {
            this.supersededBy = supersededBy;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Enumeration", "Class", "Property" });
        }
    }
}
