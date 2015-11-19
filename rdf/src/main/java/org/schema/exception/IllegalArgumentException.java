/**
 * 
 */
package org.schema.exception;

/**
 * 
 * https://schema.org
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class IllegalArgumentException
        extends java.lang.IllegalArgumentException {

    private static final long serialVersionUID = 1898682944138525397L;
    private String[] allowedTypes = null;

    public IllegalArgumentException(String[] allowedTypes) {
        this.allowedTypes = allowedTypes;
    }

    /**
     * @see java.lang.Throwable#getMessage()
     * @return
     */
    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder();

        if (this.allowedTypes != null) {
            sb.append("This attribute only accepts the following types: ");
            for (String s : this.allowedTypes) {
                sb.append(s);
                sb.append(" ");
            }
            sb.append(".");
        } else {
            sb.append("This attribute does not allow that type of Thing.");
        }

        return sb.toString();
    }

}
