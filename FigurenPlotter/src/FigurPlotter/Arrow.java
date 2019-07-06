/**
 */
package FigurPlotter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FigurPlotter.Arrow#isLenghtarrowheadRight <em>Lenghtarrowhead Right</em>}</li>
 *   <li>{@link FigurPlotter.Arrow#isArrowheadLeft <em>Arrowhead Left</em>}</li>
 * </ul>
 *
 * @see FigurPlotter.FigurPlotterPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends Line {
	/**
	 * Returns the value of the '<em><b>Lenghtarrowhead Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenghtarrowhead Right</em>' attribute.
	 * @see #setLenghtarrowheadRight(boolean)
	 * @see FigurPlotter.FigurPlotterPackage#getArrow_LenghtarrowheadRight()
	 * @model required="true"
	 * @generated
	 */
	boolean isLenghtarrowheadRight();

	/**
	 * Sets the value of the '{@link FigurPlotter.Arrow#isLenghtarrowheadRight <em>Lenghtarrowhead Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenghtarrowhead Right</em>' attribute.
	 * @see #isLenghtarrowheadRight()
	 * @generated
	 */
	void setLenghtarrowheadRight(boolean value);

	/**
	 * Returns the value of the '<em><b>Arrowhead Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrowhead Left</em>' attribute.
	 * @see #setArrowheadLeft(boolean)
	 * @see FigurPlotter.FigurPlotterPackage#getArrow_ArrowheadLeft()
	 * @model required="true"
	 * @generated
	 */
	boolean isArrowheadLeft();

	/**
	 * Sets the value of the '{@link FigurPlotter.Arrow#isArrowheadLeft <em>Arrowhead Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrowhead Left</em>' attribute.
	 * @see #isArrowheadLeft()
	 * @generated
	 */
	void setArrowheadLeft(boolean value);

} // Arrow
