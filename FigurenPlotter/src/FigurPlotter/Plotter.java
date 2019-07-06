/**
 */
package FigurPlotter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plotter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FigurPlotter.Plotter#getFigures <em>Figures</em>}</li>
 *   <li>{@link FigurPlotter.Plotter#getCanvasLength <em>Canvas Length</em>}</li>
 *   <li>{@link FigurPlotter.Plotter#getCanvasWidth <em>Canvas Width</em>}</li>
 * </ul>
 *
 * @see FigurPlotter.FigurPlotterPackage#getPlotter()
 * @model
 * @generated
 */
public interface Plotter extends EObject {

	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link FigurPlotter.Figur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see FigurPlotter.FigurPlotterPackage#getPlotter_Figures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Figur> getFigures();

	/**
	 * Returns the value of the '<em><b>Canvas Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas Length</em>' attribute.
	 * @see #setCanvasLength(double)
	 * @see FigurPlotter.FigurPlotterPackage#getPlotter_CanvasLength()
	 * @model required="true"
	 * @generated
	 */
	double getCanvasLength();

	/**
	 * Sets the value of the '{@link FigurPlotter.Plotter#getCanvasLength <em>Canvas Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas Length</em>' attribute.
	 * @see #getCanvasLength()
	 * @generated
	 */
	void setCanvasLength(double value);

	/**
	 * Returns the value of the '<em><b>Canvas Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas Width</em>' attribute.
	 * @see #setCanvasWidth(double)
	 * @see FigurPlotter.FigurPlotterPackage#getPlotter_CanvasWidth()
	 * @model required="true"
	 * @generated
	 */
	double getCanvasWidth();

	/**
	 * Sets the value of the '{@link FigurPlotter.Plotter#getCanvasWidth <em>Canvas Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas Width</em>' attribute.
	 * @see #getCanvasWidth()
	 * @generated
	 */
	void setCanvasWidth(double value);
} // Plotter
