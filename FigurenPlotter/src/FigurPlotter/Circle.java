/**
 */
package FigurPlotter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FigurPlotter.Circle#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see FigurPlotter.FigurPlotterPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Figur {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see FigurPlotter.FigurPlotterPackage#getCircle_Radius()
	 * @model required="true"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link FigurPlotter.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // Circle
