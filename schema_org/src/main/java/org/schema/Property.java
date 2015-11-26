/**
 * 
 */
package org.schema;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * https://schema.org/Property
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class Property extends Intangible {
    /**
     * Relates a property to a class that is (one of) the type(s) the property
     * is expected to be used on.
     */
    private Class domainIncludes;
    /**
     * Relates a property to a class that constitutes (one of) the expected
     * type(s) for values of the property.
     */
    private Class rangeIncludes;
    /**
     * Relates a property to a property that is its inverse. Inverse properties
     * relate the same pairs of items to each other, but in reversed direction.
     * For example, the 'alumni' and 'alumniOf' properties are inverseOf each
     * other. Some properties don't have explicit inverses; in these situations
     * RDFa and JSON-LD syntax for reverse properties can be used.
     */
    private Property inverseOf;

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

    public Class getDomainIncludes() {
        return domainIncludes;
    }

    public void setDomainIncludes(Class domainIncludes) {
        this.domainIncludes = domainIncludes;
    }

    public Class getRangeIncludes() {
        return rangeIncludes;
    }

    public void setRangeIncludes(Class rangeIncludes) {
        this.rangeIncludes = rangeIncludes;
    }

    public Property getInverseOf() {
        return inverseOf;
    }

    public void setInverseOf(Property inverseOf) {
        this.inverseOf = inverseOf;
    }
}
