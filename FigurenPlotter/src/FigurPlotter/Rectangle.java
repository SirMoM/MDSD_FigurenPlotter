/**
 */
package FigurPlotter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FigurPlotter.Rectangle#getSizeA <em>Size A</em>}</li>
 *   <li>{@link FigurPlotter.Rectangle#getSizeB <em>Size B</em>}</li>
 * </ul>
 *
 * @see FigurPlotter.FigurPlotterPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends Figur {
	/**
	 * Returns the value of the '<em><b>Size A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size A</em>' attribute.
	 * @see #setSizeA(double)
	 * @see FigurPlotter.FigurPlotterPackage#getRectangle_SizeA()
	 * @model required="true"
	 * @generated
	 */
	double getSizeA();

	/**
	 * Sets the value of the '{@link FigurPlotter.Rectangle#getSizeA <em>Size A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size A</em>' attribute.
	 * @see #getSizeA()
	 * @generated
	 */
	void setSizeA(double value);

	/**
	 * Returns the value of the '<em><b>Size B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size B</em>' attribute.
	 * @see #setSizeB(double)
	 * @see FigurPlotter.FigurPlotterPackage#getRectangle_SizeB()
	 * @model required="true"
	 * @generated
	 */
	double getSizeB();

	/**
	 * Sets the value of the '{@link FigurPlotter.Rectangle#getSizeB <em>Size B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size B</em>' attribute.
	 * @see #getSizeB()
	 * @generated
	 */
	void setSizeB(double value);

} // Rectangle
