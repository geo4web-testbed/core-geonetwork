/**
 * 
 */
package org.schema;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * https://schema.org/QuantitativeValue
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class QuantitativeValue extends StructuredValue {

    /**
     * A property-value pair representing an additional characteristics of the
     * entitity, e.g. a product feature or another characteristic for which
     * there is no matching property in schema.org.
     * 
     * Note: Publishers should be aware that applications designed to use
     * specific schema.org properties (e.g. http://schema.org/width,
     * http://schema.org/color, http://schema.org/gtin13, ...) will typically
     * expect such data to be provided using those properties, rather than using
     * the generic property/value mechanism.
     * 
     */
    private PropertyValue additionalProperty;

    /**
     * The upper value of some characteristic or property.
     */
    private Number maxValue;

    /**
     * The lower value of some characteristic or property.
     */
    private Number minValue;

    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3
     * characters) or a URL. Other codes than the UN/CEFACT Common Code may be
     * used with a prefix followed by a colon.
     */
    private String unitCode;

    /**
     * A string or text indicating the unit of measurement. Useful if you cannot
     * provide a standard unit code for unitCode.
     */

    private String unitText;
    /**
     * The value of the quantitative value or property value node. For
     * QuantitativeValue, the recommended type for values is 'Number'. For
     * PropertyValue, it can be 'Text;', 'Number', 'Boolean', or
     * 'StructuredValue'.
     */
    private Object value;

    /**
     * A pointer to a secondary value that provides additional information on
     * the original value, e.g. a reference temperature.
     */
    private Thing valueReference;

    public PropertyValue getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(PropertyValue additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public Number getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Number maxValue) {
        this.maxValue = maxValue;
    }

    public Number getMinValue() {
        return minValue;
    }

    public void setMinValue(Number minValue) {
        this.minValue = minValue;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitText() {
        return unitText;
    }

    public void setUnitText(String unitText) {
        this.unitText = unitText;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        if (value instanceof StructuredValue || value instanceof Number
                || value instanceof Boolean) {
            this.value = value;
        } else {
            this.value = value.toString();
        }
    }

    public Thing getValueReference() {
        return valueReference;
    }

    public void setValueReference(Thing valueReference) {
        if (valueReference instanceof PropertyValue
                || valueReference instanceof QuantitativeValue
                || valueReference instanceof Enumeration
                || valueReference instanceof StructuredValue) {
            this.valueReference = valueReference;
        } else {
            throw new IllegalArgumentException(new String[] { "PropertyValue",
                    "QuantitativeValue", "Enumeration", "StructuredValue" });
        }
    }
}
