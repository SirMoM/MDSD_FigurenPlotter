/**
 */
package FigurPlotter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FigurPlotter.Figur#getName <em>Name</em>}</li>
 *   <li>{@link FigurPlotter.Figur#getFarbe <em>Farbe</em>}</li>
 *   <li>{@link FigurPlotter.Figur#isFilled <em>Filled</em>}</li>
 *   <li>{@link FigurPlotter.Figur#getStrokeWeight <em>Stroke Weight</em>}</li>
 *   <li>{@link FigurPlotter.Figur#getDegree <em>Degree</em>}</li>
 *   <li>{@link FigurPlotter.Figur#getCenter <em>Center</em>}</li>
 *   <li>{@link FigurPlotter.Figur#getFigures <em>Figures</em>}</li>
 * </ul>
 *
 * @see FigurPlotter.FigurPlotterPackage#getFigur()
 * @model
 * @generated
 */
public interface Figur extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FigurPlotter.FigurPlotterPackage#getFigur_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FigurPlotter.Figur#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Farbe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farbe</em>' attribute.
	 * @see #setFarbe(String)
	 * @see FigurPlotter.FigurPlotterPackage#getFigur_Farbe()
	 * @model
	 * @generated
	 */
	String getFarbe();

	/**
	 * Sets the value of the '{@link FigurPlotter.Figur#getFarbe <em>Farbe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farbe</em>' attribute.
	 * @see #getFarbe()
	 * @generated
	 */
	void setFarbe(String value);

	/**
	 * Returns the value of the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filled</em>' attribute.
	 * @see #setFilled(boolean)
	 * @see FigurPlotter.FigurPlotterPackage#getFigur_Filled()
	 * @model
	 * @generated
	 */
	boolean isFilled();

	/**
	 * Sets the value of the '{@link FigurPlotter.Figur#isFilled <em>Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filled</em>' attribute.
	 * @see #isFilled()
	 * @generated
	 */
	void setFilled(boolean value);

	/**
	 * Returns the value of the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Weight</em>' attribute.
	 * @see #setStrokeWeight(int)
	 * @see FigurPlotter.FigurPlotterPackage#getFigur_StrokeWeight()
	 * @model
	 * @generated
	 */
	int getStrokeWeight();

	/**
	 * Sets the value of the '{@link FigurPlotter.Figur#getStrokeWeight <em>Stroke Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Weight</em>' attribute.
	 * @see #getStrokeWeight()
	 * @generated
	 */
	void setStrokeWeight(int value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(int)
	 * @see FigurPlotter.FigurPlotterPackage#getFigur_Degree()
	 * @model
	 * @generated
	 */
	int getDegree();

	/**
	 * Sets the value of the '{@link FigurPlotter.Figur#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(int value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(Point)
	 * @see FigurPlotter.FigurPlotterPackage#getFigur_Center()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link FigurPlotter.Figur#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link FigurPlotter.Figur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see FigurPlotter.FigurPlotterPackage#getFigur_Figures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Figur> getFigures();

} // Figur
