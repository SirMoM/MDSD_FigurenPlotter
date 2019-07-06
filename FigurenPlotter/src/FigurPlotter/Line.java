/**
 */
package FigurPlotter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FigurPlotter.Line#getLenght <em>Lenght</em>}</li>
 * </ul>
 *
 * @see FigurPlotter.FigurPlotterPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends Figur {
	/**
	 * Returns the value of the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenght</em>' attribute.
	 * @see #setLenght(double)
	 * @see FigurPlotter.FigurPlotterPackage#getLine_Lenght()
	 * @model required="true"
	 * @generated
	 */
	double getLenght();

	/**
	 * Sets the value of the '{@link FigurPlotter.Line#getLenght <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenght</em>' attribute.
	 * @see #getLenght()
	 * @generated
	 */
	void setLenght(double value);

} // Line
